/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hicham
 */
import java.util.ArrayList;
public class School {
    String name;
    String adress;
    String numeroTelephone;
    
    ArrayList<Student> students;    
    ArrayList<Teacher> teachers;
    ArrayList<Grade> grade;
     
  
    public School(){
    this.initObject();
            }
      public School(String name){
        this.name=name;
        this.initObject();
    }
 
    public void initObject(){
    this.students=new ArrayList<Student>();
    this.teachers=new ArrayList<Teacher>();
    this.grade=new ArrayList<Grade>();
    }
    
    
    public String getnom(){
    return name;}
    public void setnom(String name){
    this.name=name;}
    
    public String getadress(){
    return adress;}
    
    public void setadress(String adress){
    this.adress=adress;}
    
    public String getnumeroTelephone(){
    return numeroTelephone;
    }
    public void setnumeroTelephone(String numeroTelephone){
    this.numeroTelephone=numeroTelephone;}
    

    
}
