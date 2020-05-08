/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp_umr;

/**
 *
 * @author UMMAR MUHAMMAD
 */
public class Rectangle {

    int length;
    int breadth;

    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    Rectangle() {
        length = 0;
        breadth = 0;
    }

    void CalculateArea() {
        int area = length * breadth;
        System.out.println("area=" + area);
    }
}
