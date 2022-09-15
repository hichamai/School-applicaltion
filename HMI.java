import java.util.Scanner;
public class HMI {
   
    public static SchoolServices schoolService;
    public static void start(){
    String action;//declaration 
    Scanner sc = new Scanner(System.in);
    School school=HMI.creatshcool();
   
    System.out.println("welcome to "+school.getnom()  +"  "+school.getadress()+"  "+school.getnumeroTelephone());
     
   
   
    do{
        System.out.println("what do you want to do ? ");
        action=sc.next();
        switch(action){
            case "addStudent":
                HMI.addStudent();
             break;
            case "addTeacher":
                HMI.addTeacher();
              break;
            case "printAllStudents":
                HMI.printAllStudents();
            break;
             case "printAllTeachers":
                HMI.printAllTeachers();
            break;
             case "findStudentByName":
                HMI.printDataPersonByName(Action.STUDENT);
             break;
             case"findTeacherByName":
                HMI.printDataPersonByName(Action.TEACHER);
             break;
             case"removStudent":
                 HMI.removePerson(Action.STUDENT);
              break;
             case "removeTeacher":
                 HMI.removePerson(Action.TEACHER);
              break;
        }
       
     }while(!action.equals("exit"));
    };
    
    
    private static School creatshcool(){
       School  school=new School();
       school.setnom("Hichem tech");
       school.setadress(" in Morocco");
       school.setnumeroTelephone("0607638212");
       HMI.schoolService=new SchoolServices(school);
       return school;
       
    };
  
    private  static void addStudent(){
    Student student =new Student();
    HMI.setDAtaPerson(student);
    HMI.schoolService.addStudent(student);}
    
    public static void printAllStudents(){
        for(Student student :HMI.schoolService.school.students){
                System.out.println(student.getData());
            }
    }
    
    private static void addTeacher(){
    Teacher teacher=new Teacher();
    HMI.setDAtaPerson(teacher);
    HMI.schoolService.addTeacher(teacher);
    };
    
    public static void printAllTeachers(){
        for(Teacher teacher :HMI.schoolService.school.teachers){
                System.out.println(teacher.getData());
            }
    }
    
    private static void setDAtaPerson(Person p){
    Scanner read=new Scanner(System.in);
   
    System.out.println("pleas enter the name ");
    p.setnom(read.next());
    System.out.println("pleas enter the age ");
    p.setAge(read.nextInt());
    
    if(p instanceof Teacher){
    System.out.println("pleas enter  your salary ");
    ((Teacher) p).setsalary(read.nextFloat());
    }else if(p instanceof Student){
       System.out.println("pleas enter  the phone number ");
     ((Student) p).setNPP(read.next()); 
    }
    }

     private static Person findPersonByName( Action action){
            
       Scanner reader=new Scanner(System.in);
       System.out.println("please enter the name ");
       String name=reader.next();
       Person p;
       if(action==Action.STUDENT ){
        p=HMI.schoolService.getStudentByName(name);
       }else{
           p=HMI.schoolService.getTeacherByName(name);
       }
       return p;
     };
    
     private static void removePerson(Action action){
      Person p=HMI.findPersonByName(action);   
      if( p instanceof Student){
          HMI.schoolService.removeStudent((Student) p);
      }else  {
        HMI.schoolService.removeTeacher((Teacher) p);
      }
     }
     private static void printDataPerson(Person person){
         if(person ==null){
        System.out.println("not found");
        }else{ System.out.println(person.getData());}}
     private static void printDataPersonByName(Action action){
         Person p=HMI.findPersonByName(action);
         HMI.printDataPerson(p);
     }
     
    }
  

        
        
   
    
    
    
