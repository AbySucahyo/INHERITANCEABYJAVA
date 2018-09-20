/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan03;

/**
 *
 * @author Aby
 */
public class Gajah extends Hewan{
    public static void testClassMethod(){
        System.out.println("The classs method in Hewan...");
    }
    //meng-overide method pada class Animal
    public void testInstancceMethod(){
        System.out.println("The instance method in Gajah..");
    }
    public static void main(String[] args) {
        Gajah myGajah = new Gajah();
        Hewan myHewan = myGajah;
        Hewan.testClassMethod();
        myHewan.testInstanceMethod();
    }
}
