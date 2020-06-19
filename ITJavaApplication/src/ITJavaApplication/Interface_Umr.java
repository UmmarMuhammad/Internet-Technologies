/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ITJavaApplication;

/**
 *
 * @author UMMAR MUHAMMAD
 */
interface I_Student {
     int ROLLNO = 10;
     
     void display(int rn);   
}

interface I_Sports {
     float SWEIGHT = 0.4f;
     
     void display(int sw);   
}

public class Interface_Umr implements I_Student, I_Sports
{
    @Override
    public void display(int r)
    {
        System.out.println("roll no.= "+ROLLNO+" s weight = "+SWEIGHT);
    }
}
