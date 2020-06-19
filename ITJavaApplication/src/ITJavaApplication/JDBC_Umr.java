/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * for the students of BCA 5th semester GDC Anantnag Batch: 2017
 * created on 17-04-2020
 * Last Modified on 23-04-2020
    *
    *you need to have a mysql server running at the url specified below
    *therefore install the mysql-installer-web-community-8.0.19.0.msi
    *along with the java connector and other dependencies among other things
    *then create a database named college and a table named student using the workbench 
    * 
    
    run the following queries
    
    use college; -- database name -- 
    insert into student values('1', 'ummar', 'killora', '9419044700');/*inserts a tuple with the given values
    insert into student values('2', 'aamir', 'imamsahib', '9906001090');
    insert into student values('3', 'imran', 'shopian', '9596041000');
    insert into student values('4', 'rafi', 'anantnag', '7001234567');
    insert into student values('5', 'shahid', 'bijbehara', '8888888888');
    insert into student values('6', 'mudasir', 'srinagar', '9999999999');

    select * from student; -- selects all the rows of student relation --student 
   
 */
package ITJavaApplication;

//1. import the package
import java.sql.*;
import java.util.Scanner;
import javax.print.DocFlavor;

/**
 *
 * @author UMMAR MUHAMMAD
 */
public class JDBC_Umr {

    //now run this code to 
    public JDBC_Umr() throws Exception //handles the exception
    {
        DAO dao = new studentDAO();
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("enter 1 for fetching whole table, 2 for fetching name of a given roll no, 3 for adding new record!");

            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    dao.getStudent();
                    break;
                case 2:
                    System.out.println("enter roll no for fetching the name!");
                    int rollno = scan.nextInt();
                    String name = dao.getStudent(rollno);
                    System.out.println("Name = " + name);
                    break;
                case 3:
                    System.out.println("enter new record: roll no, name, address, mobile no\n");
                    student.rollno = scan.nextInt();
                    student.name = scan.next();
                    student.address = scan.next();
                    student.mob = scan.nextLong();

                    dao.addStudent(student.rollno, student.name, student.address, student.mob);
                    break;
                default:

            }
            System.out.println("\nenter 0 to exit, 1 to continue...");
        } while (scan.nextInt() != 0);
    }
}

//
class student {

    static int rollno;
    static String name;
    static String address;
    static long mob;

    student() {

    }
}

interface DAO {

    String getStudent(int rollno) throws Exception;

    void addStudent(student std);

    public void addStudent(int rollno, String name, String address, long mob) throws Exception;

    public void getStudent() throws Exception;
}

class studentDAO implements DAO {

    Connection con = null;

    studentDAO() throws Exception {

        String connector = "com.mysql.cj.jdbc.Driver";
        //url of the database server along with the port no. & database name
        String url = "jdbc:mysql://localhost:3306/college";
        //username of the mysql server 
        String user = "root";
        //password of the server set during start of the service
        String pwd = "ummarmuhammad";

        connect(connector, url, user, pwd);

        System.out.println("connection successfull ");
    }

    void connect(String connector, String url, String uid, String pwd) throws Exception {
        //2.2 
        //register the mysql driver for java  
        Class.forName(connector);

        //3
        //establish the connection using url, username & password
        con = DriverManager.getConnection(url, uid, pwd);
    }

    @Override
    public void finalize() throws Throwable {
        try {
            con.close();
        } finally {
            System.out.println("Object is destroyed by the Garbage Collector");
            super.finalize();
        }
    }

    @Override
    public String getStudent(int rollno) throws Exception {

        //4
        //create the statement
        Statement stmt = con.createStatement();

        //5
        //query the database using a valid query
        String query = "Select Name from student where RollNo=" + rollno;
        //execute the query specified above, & get the results in resultset
        ResultSet rs = stmt.executeQuery(query);

        //6
        //process results
        rs.next();
        String name = rs.getString("Name");

        //7
        //close connection
        //System.out.println(" "+name);
        stmt.close();
        return name;
    }

    @Override
    public void addStudent(student std) {

    }

    void manipulateStmt(int rollno, String name, String address, long mob) throws Exception {

        //4
        //create the statement
        Statement stmt = con.createStatement();

        //5
        //query the database using a valid query
        String query = "insert into student values(" + rollno + ", '" + name + "', '" + address + "'," + mob + ")";
        //execute the query specified above, & get the results in resultset
        int count = stmt.executeUpdate(query);

        System.out.println(count + " rows inserted");
        //7
        //close connection
        stmt.close();

        System.out.println("");
    }

    void manipulatePrepStmt(int rollno, String name, String address, long mob) throws Exception {

        //query the database using a valid query
        String query = "insert into student values(?,?,?,?)";
        //4
        //create the statement
        PreparedStatement prepStmt = con.prepareStatement(query);
        prepStmt.setInt(1, rollno);
        prepStmt.setString(2, name);
        prepStmt.setString(3, address);
        prepStmt.setLong(4, mob);

        //5
        //execute the query specified above, & get the results in resultset
        int count = prepStmt.executeUpdate();

        System.out.println(count + " rows inserted");
        //7
        //close connection
        prepStmt.close();

        System.out.println("");
    }

    @Override
    public void addStudent(int rollno, String name, String address, long mob) throws Exception {
        //manipulateStmt(rollno, name, address, mob);
        manipulatePrepStmt(rollno, name, address, mob);
    }

    @Override
    public void getStudent() throws Exception {

        //4
        //create the statement
        Statement stmt = con.createStatement();

        //5
        //query the database using a valid query
        String query = "Select * from student";
        //execute the query specified above, & get the results in resultset
        ResultSet rs = stmt.executeQuery(query);

        //6
        //process results
        ResultSetMetaData metadata = rs.getMetaData();
        int cols = metadata.getColumnCount();
        int i = 1;
        while (i <= cols) {
            System.out.print(metadata.getColumnName(i) + ", ");
            i++;
        }
        System.out.println();
        while (rs.next()) {
            String record = "";
            for (i = 1; i <= cols; i++) {
                record += rs.getString(i) + ", ";
            }
            System.out.println(record);
        }

        //7
        //close connection
        //System.out.println(" "+name);
        stmt.close();
    }
}