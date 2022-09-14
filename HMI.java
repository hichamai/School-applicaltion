import java.util.Scanner;
public class HMI {
    //la creation d'une classe pour eviter la repetiton d'objet schoolServices
    public static SchoolServices schoolService;
    public static void start(){
    String action;//declaration 
    Scanner sc = new Scanner(System.in);
    School school=HMI.creatshcool();//l'appelle de methode creatschool pour afficher les premiers sortie 
   
    System.out.println("welcome to "+school.getnom()  +"  "+school.getadress()+"  "+school.getnumeroTelephone());
     
   
    //la boubles do .. while  pour choissez votre choix;
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
                HMI.findPersonByName(Action.STUDENT);
             break;
             case"findTeacherByName":
                HMI.findPersonByName(Action.TEACHER);
        }
       
     }while(!action.equals("exit"));
    };
    
    //methode pour afficher les premiers  messages
    private static School creatshcool(){
       School  school=new School();
       school.setnom("Hichem tech");
       school.setadress(" in Morocco");
       school.setnumeroTelephone("0607638212");
       HMI.schoolService=new SchoolServices(school);
       return school;
       
    };
   //mehode pour ajouter des nouvels etudiants 
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

     private static void findPersonByName( Action action){
            
       Scanner reader=new Scanner(System.in);
       System.out.println("please enter the name ");
       String name=reader.next();
       Person p;
       if(action==Action.STUDENT ){
        p=HMI.schoolService.getStudentByName(name);
       }else{
           p=HMI.schoolService.getTeacherByName(name);
       }
        if(p ==null){
        System.out.println("not found");
        }else{ System.out.println(p.getData());}
     };
    }
  

        
        
   
    
    
    