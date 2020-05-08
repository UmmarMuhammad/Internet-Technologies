/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp_umr;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author UMMAR MUHAMMAD
 */
public class JavaApp_Umr {

    /**
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("Welcome, enter b for basic, s for static, a for arrays, & j for JDBC!");
        Scanner scan = new Scanner(System.in);
        String choice = scan.next();
        switch (choice) {
            case "b":
                /*
                Class Example, Constructor Overloading 
                 */
                Rectangle rect = new Rectangle();
                rect.length = 10;
                rect.breadth = 7;
                rect.CalculateArea();

                (new Rectangle(9, 8)).CalculateArea();
                break;
            case "s":
                /*
                *Static Variable, Enum, Class Variable
                 */
                System.out.println("today is " + WeekDay.FRIDAY);
                System.out.println("today is " + WeekDay.Day.FRIDAY);
                break;
            case "a":
                /*
                *Arrays in Java
                 */
                Array_Umr arr = new Array_Umr();
                //var arr = new Array_Umr();
                //arr.PopulateArray();
                arr.InputArray();
                arr.Display(arr.DArray);
                //arr.Sort();
                arr.ArraysClass();
                //arr.Display();
                break;
            case "l":
                Array_Umr arrl = new Array_Umr();
                arrl.ArrayListClass();
                break;
            case "i":
                Interface_Umr inter = new Interface_Umr();
                inter.display(0);
                break;
            case "bean":
                Bean_Umr bean = new Bean_Umr();
                bean.setSampleProperty("ummar");
                String str = bean.getSampleProperty();
                System.out.println("" + str);
            case "j":
            case "J":
                try 
                {
                    JDBC_Umr jdbc = new JDBC_Umr();
                    //jdbc.manipulateStmt();
                  
                } 
                catch (Exception e) 
                {
                    System.out.println(e.toString());
                }
                finally 
                {
                    System.out.println("");
                }

            //Bean_Umr.PROP_SAMPLE_PROPERTY="";
        }
    }
}
