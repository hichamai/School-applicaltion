/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hicham
 */
import java.util.ArrayList;
public class Grade {
    String code ;
    String nom;
    
    //intantiation
    Teacher teacher;
    ArrayList<Student> students;
    //constructeur avec parametres 
    public Grade(String code,String nom){
    this.code=code;
    this.nom=nom;}
    
    //get methode 
    public String getcode(){
    return code;}
   //set methode
    public void setcode(String code){
    this.code=code;}
    
    public String getnom(){
    return nom;}
    public void setnom(String nom){
    this.nom=nom;}
    
    public void addStudent(Student student){
    this.students.add(student);}
     
    public void removeStudent(Student student){
    this.students.remove(student);};
    
    
    
    
    
    
    
    
}
