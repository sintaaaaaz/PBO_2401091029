/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sinta_100425;

/**
 *
 * @author user
 */
public class Person {
    protected String name;
    protected String address;
    
    /**
     * Default Constructor
     */
    
    public Person(){
        System.out.println("Inside Person : Constructor");
        name = "Sinta";
        address = "Guo";
    }
    
    /**
     * Constructor dengan dua parameter
     */
    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }
    
    /**
     * Method accessor
     */
    
    public String getName(){
        System.out.println("Person: getName");
        return name;
    }
    
    public String getAddress(){
        System.out.println("Person: geAddress");
        return address;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
}