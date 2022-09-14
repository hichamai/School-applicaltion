/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hicham
 */
public class Teacher  extends Person{
    float salary;
    
 //consctructeur par defaut 
    public Teacher (){}
  //conscturcteur avec des parametre   
    public Teacher(float salary,String nom, String prenom){
        super(nom);
        this.salary=salary;
    }
    //methode get
    public float getsalary(){
    return salary;}
    //methode set
    public void setsalary(float salary){
    this.salary=salary;}

    @Override
    public String getData() {
        return this.getnom()+" "+this.getage()+" "+this.salary;
    }
    
    
    
}
