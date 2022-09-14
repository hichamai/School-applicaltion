/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class SchoolServices{
    School school;
    public SchoolServices(School school){
    this.school=school;
    }
    public  School getschool(){
    return school;}
    //method for adding 
    public void addStudent(Student student){
    this.school.students.add(student) ; }

    public void addTeacher(Teacher teacher){
    this.school.teachers.add(teacher);}
    
    public void addGrade(Grade grade){
    this.school.grade.add(grade);}
    
    ///methode for removing 
    public void removeStudent(Student student){
    this.school.students.remove(student);}
    
    public void removeTeacher(Teacher teacher){
    this.school.teachers.remove(teacher);}
    
    public void removeGrade(Grade grade){
    this.school.grade.remove(grade);}
    
    
    //mehodes for searching 
    public Student getStudentByName(String nom){
//    for(int i=0;i<this.school.students.size();i++){   
//    };
        //thises loops are equivalents
        Student a=null;
     for(Student student :this.school.students){
         if(student.nom.toUpperCase().equals(nom.toUpperCase())){
          a=student;
          break;} 
     }return a;
    }
    
    
    public Teacher getTeacherByName(String nom){
      
   for(Teacher teacher:this.school.teachers){
   if(teacher.nom.equals(nom)){
     return teacher;
   }
   }return null;
   }
    
    
    public Grade getGradeBycode(String code){
   for(Grade  grade:this.school.grade){
   if(grade.code.equals(code)){
     return grade;
   }
   }return null;
   }
    
    
    
    
    
    

};