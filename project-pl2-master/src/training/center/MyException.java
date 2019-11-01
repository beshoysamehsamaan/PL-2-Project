package training.center;

import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.plaf.RootPaneUI;

/**
 *
 * @author Tamer
 */
public class MyException extends Exception implements Serializable {

        public MyException() {
        super();
    }

    public MyException(String s) {
        super(s);
    }

    @Override
    public String toString() {
        return "My Exception";
    }

   public String checkEmail(String x) {
        String email=x;
            if (!email.contains("@") || !email.contains(".")) {
                JOptionPane.showMessageDialog(null, "Not valid Input for Email Try Again :(");
                return "";
            }
            else{
        return email;
            }
    }

  public  String checkPassLength(String x) {
        String pass;
            pass =x;
            if (pass.length() < 8) {
                JOptionPane.showMessageDialog(null, "Not valid Password length Try Again :(");
                return "";
            }
            else{
        return pass;
    }
}
 FileManagerBinary FManger= new FileManagerBinary();
 Student stu= new Student();
 Tutor tut= new Tutor();
 Course cor= new Course();
 public String checkFoundIdStudent(String x){
        int y=Integer.parseInt(x);
        ArrayList<Student> Students = new ArrayList<Student>();
        Students=stu.List();
        for(int i=0;i<Students.size();i++){
            if(Students.get(i).getID()==y){
                JOptionPane.showMessageDialog(null, "Not valid StudentID Taked Try Again :(");
                return "";
            }
        }
                return x;
 }
 public String checkFoundITutor(String x){
        int y=Integer.parseInt(x);
        ArrayList<Tutor> tutors = new ArrayList<Tutor>();
        tutors=tut.List();
        for(int i=0;i<tutors.size();i++){
            if(tutors.get(i).getID()==y){
                JOptionPane.showMessageDialog(null, "Not valid tutorID Taked Try Again :(");
                return "";
            }
        }
                return x;
 }
 public String checkFoundIdCours(String x){
        int y=Integer.parseInt(x);
        ArrayList<Course> courses = new ArrayList<Course>();
        courses=cor.List();
        for(int i=0;i<courses.size();i++){
            if(courses.get(i).getID()==y){
                JOptionPane.showMessageDialog(null, "Not valid CourseId Taked Try Again :(");
                return "";
            }
        }
                return x;
 }
 public String checkFoundNameCours(String x){
        ArrayList<Course> courses = new ArrayList<Course>();
        courses=cor.List();
        for(int i=0;i<courses.size();i++){
            if(courses.get(i).getName().equals(x)){
                JOptionPane.showMessageDialog(null, "Not valid CourseName Taked Try Again :(");
                return "";
            }
        }
                return x;
 }
    public String checkFoundUserName(String x){
       ArrayList<Student> Students = new ArrayList<Student>();
       ArrayList<Tutor> tutors = new ArrayList<Tutor>();
       Students=stu.List();
       tutors=tut.List();
       int i;
       if(!"Admin".equals(x)){
           for(i=0;i<Students.size();i++){
               if(Students.get(i).getuserName().equals(x)){
                   JOptionPane.showMessageDialog(null, "Not valid UserName Taked Try Again :(");
                   return "";
               }
               else{
                   for(i=0;i<tutors.size();i++){
                       if(tutors.get(i).getuserName().equals(x)){
                         JOptionPane.showMessageDialog(null, "Not valid UserName Taked Try Again :(");
                         return "";   
                       }
                   }
               }
           }
           return x;
       }
       else{
           JOptionPane.showMessageDialog(null, "Not valid UserName Taked Try Again :(");
           return "";
       }
    }

public String CheckPositive(String x){
 int i;
 for(i=0;i<x.length();i++){
     if(x.charAt(i)=='9'||x.charAt(i)=='8'||x.charAt(i)=='7'||x.charAt(i)=='6'||x.charAt(i)=='5'||x.charAt(i)=='4'||x.charAt(i)=='3'||x.charAt(i)=='2'||x.charAt(i)=='1'||x.charAt(i)=='0'){
                }
            
            else{
                 JOptionPane.showMessageDialog(null, "Not valid"+ x +"Try Again :(");
                 return "";
            }
 }
 return x;
}
}
