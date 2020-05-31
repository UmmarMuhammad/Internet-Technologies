/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webapp_umr;

/**
 *
 * @author UMMAR MUHAMMAD
 */
public class Student
{

    int rollNo;
    String name;

    public Student(int rollNo, String name)
    {
        this.rollNo = rollNo;
        this.name = name;
    }

    public int getRollNo()
    {
        return rollNo;
    }

    public void setRollNo(int rollNo)
    {
        this.rollNo = rollNo;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "Student{" + "rollNo=" + rollNo + ", name=" + name + '}';
    }
}