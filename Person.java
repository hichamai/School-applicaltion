/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hicham
 */
public abstract class Person {
    String nom; 
    int age; 
    
     
     public Person(String nom){
     this.nom=nom;
    
     };
     

    public Person(){};

    public String getnom(){
    return nom;
    };
    
     public void setnom(String nom){
     this.nom=nom;
     };
     
     public int getage(){
         return age;
     }
     public void setAge(int age){
     this.age=age;
     };
     public abstract String getData();

   };

  