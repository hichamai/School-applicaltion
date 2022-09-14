/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hicham
 */
public class Student  extends Person {
   String numberPhoneParent;
   
   //constructeur par defaut 
   public Student(){};
   
   public Student(String numberPhoneParent,String nom ,String prenom){
   super(nom);
   this.numberPhoneParent=numberPhoneParent;
   }
   ///methode get 
   public String getNPP(){
   return numberPhoneParent;
   }
   //methode set
   public void setNPP(String NumberPhoneParent){
    this.numberPhoneParent=NumberPhoneParent;
   }

    @Override
    public String getData() {
        
        return this.getnom()+" "+this.getage()+" "+this.numberPhoneParent;
        
    }
    
}
