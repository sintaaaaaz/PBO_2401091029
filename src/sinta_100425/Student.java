/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sinta_100425;

/**
 *
 * @author user
 */
public class Student extends Person{
    public Student(){
//        super("Budi","Jayakarta");
        super.name = "Faris";
        super.address = "Guo Siayung";
        System.out.println("Inside Student: Constructor");
        
    }
    
    public String getName(){
        System.out.println("Student: getName");
        return name;
    }
}