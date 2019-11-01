/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training.center;
import java.io.Serializable;
import java.util.*;
/**
 *
 * @author Andrew
 */
public class Student extends User implements Serializable ,option{ 
    
    
    public static ArrayList<Student> Students = new ArrayList<Student>();
    private final String studentFileName = "Students.bin";
    private  ArrayList<String> Actived = new ArrayList<String>();
    private  ArrayList<String> DeActived = new ArrayList<String>();
  //  String [] Actived={"@","@","@","@","@"};
   // String [] DeActived={"@","@","@","@","@"};
    
    
    public Student (){
}
    public Student (String username , String password ,int id ,String fname , String lname ,int age , String email ){
             super ( username , password , id ,fname , lname , age , email);
    }
  /*  
    public void setlearnC (ArrayList<String> learnCourses){
       this.learnC = learnCourses ;
    }

    public ArrayList<String> getlearnC (){
        return this.learnC ;
    }
    */
    
    public void Book (String Cname){
       // if not exist
        DeActived.add(Cname);
    }
    
    public boolean Active (String Cname){
        Actived.add(Cname);
        for(int i=0 ; i< DeActived.size() ;i++){
        if(DeActived.get(i).equals(Cname)){
            DeActived.remove(i);
            return true;
        }
        }
        return false;
    }
    public boolean Drop (String Cname){
        for(int i=0 ; i< Actived.size() ;i++){
        if(Actived.get(i).equals(Cname)){
            Actived.remove(i);
            return true;
        }
        }
        return false;
    }
    /*
    void book(String cname)
    {
        for(int i=0;i<5;i++)
        {
            if(this.DeActived[i].equals("@")){
                this.DeActived[i]=cname;
                break;
            }
        }
    }
    
    void Activate(String cname)
    {
        for(int i=0;i<5;i++)
        {
            if(this.DeActived[i].equals("cname")){
                this.DeActived[i]="@";
                break;
            }
        }
        for(int i=0;i<5;i++)
        {
            if(this.Actived[i].equals("@")){
                this.Actived[i]=cname;
                break;
            }
        }
    
    }*/
    @Override
    public boolean commitToFile() {
        return FManager.Write(studentFileName, Students);
    }
    
    @Override
    public void loadFromFile() {
        Students = (ArrayList<Student>) FManager.Read(studentFileName);
    }
    public ArrayList<String> listActive ()
           
    {
        return this.Actived;
    }
    
    @Override
    public boolean Add() {
        loadFromFile();
        Students.add(this);
        return commitToFile();
    }
    
    private int getStudentIndex(int id) {
        for (int i = 0; i < Students.size(); i++) {
            if (Students.get(i).getID() == id) {
                return i;
            }
        }

        return -1;
     } 
    private int getstudentIndex(String username) {
        for (int i = 0; i < Students.size(); i++) {
            if (Students.get(i).getuserName() ==username) {
                return i;
            }
        }

        return -1;
     } 
    
     
    
     public ArrayList<String> listDeActive ()
    {
        return this.DeActived;
    }
            
    
    public ArrayList<Student> List() {
        loadFromFile();
        return Students;
    }
            
    public Student Search (int id)
    {
        Student temp = new Student();
        loadFromFile();
        int index = getStudentIndex(id);
        if (index != -1) {
            return Students.get(index);
        } else {
            return temp;
        }
    }
    

   
    @Override
    public  boolean Update() {
        loadFromFile();
        int index = getStudentIndex(this.getID());
        int index1 = getstudentIndex(this.getuserName());
        if (index != -1) {
            Students.set(index, this);
            return commitToFile();
        }
        if (index1 != -1) {
            Students.set(index, this);
            return commitToFile();
        }
        return false;
    }
    
    @Override
    public boolean Delete(int id) {
        loadFromFile();
        int index = getStudentIndex(id);

        if (index != -1) {
            Students.remove(index);

            return commitToFile();
        }

        return false;
    }
    @Override
      public String toString() {
        return "\nI'm  : " + fname + " " + lname + "\n" + "ID : " + id + " Age : " + age + "\n"
                 + "\nUserName: " + userName + "\t Password: " + password + "\n";
    }
      
      @Override
    public boolean login(String userName, String Pass) {
        loadFromFile();
        for (Student x : Students) {
            if (userName.equals(x.userName) && Pass.equals(x.password)) {
                return true;
            }
        }
        return false;
    }

      
      
}
