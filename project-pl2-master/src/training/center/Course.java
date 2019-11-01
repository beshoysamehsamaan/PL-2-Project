/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training.center;
import java.util.*;
import java.io.*;
/**
 *
 * @author pola adolf
 */
public class Course implements Serializable{
    private int lecnum,hours,id;
    private String name;
    private double price;
    final private String CourseFileName="Courses.bin";
    FileManagerBinary FManger=new FileManagerBinary();
    Exam finalexam;
    public static ArrayList<Course> Courses=new ArrayList<Course>();
  public Course(){
      
  }
  public Course(int ID,String NameCourse,int LecNumber,int Hours,double Price){
   this.id=ID;
   this.name=NameCourse;
   this.price=Price;
   this.lecnum=LecNumber;
   this.hours=Hours;
  // finalexam=new Exam(NameCourse+"Final Exam",ID +"01",100);
   System.out.println(finalexam.toString()+"Added ....$");
  }
  public void setID(int ID){
      this.id=ID;
  } 
  public void setName(String NameCourse){
      this.name=NameCourse;
  }
  public void setPrice(double Price){
      this.price=Price;
  }
  public void setLecNum(int LecNumber){
      this.lecnum=LecNumber;
  }
  public void setHours(int Hours){
      this.hours=Hours;
  }
  public int getID(){
      return this.id;
  } 
  public String getName(){
      return this.name;
  }
  public double getPrice(){
      return this.price;
  }
  public int getLecNum(){
      return this.lecnum;
  }
  public int getHours(){
      return this.hours;
  }
  public boolean commitToFile(){
      return FManger.Write(CourseFileName,Courses);
  }
  public void loadFromFile(){
      Courses=(ArrayList<Course>)FManger.Read(CourseFileName);
  }
  public boolean Add(){
      loadFromFile();
      Courses.add(this);
      return commitToFile();
  }
  private int getindex(int ID) {
        for (int i = 0; i < Courses.size(); i++) {
            if (Courses.get(i).getID()== ID) {
                return i;
            }
        }

        return -1;
    }
    public ArrayList<Course> List() {
        loadFromFile();
        return Courses;
    } 
  
    public Course Search(int id) {
        Course temp = new Course();
        loadFromFile();
        int index = getindex(id);
        if (index != -1) {
            return Courses.get(index);
        } else {
            return temp;
        }
    }
    public boolean Update() {
        loadFromFile();
        int index = getindex(this.getID());

        if (index != -1) {
            Courses.set(index, this);

            return commitToFile();
        }
        return false;
    }
        
        
    public boolean Delete(int id) {
        loadFromFile();
        int index = getindex(id);

        if (index != -1) {
            Courses.remove(index);

            return commitToFile();
        }

        return false;
    }
    @Override
    public String toString() {
        return "\nCourse Name : " + name + "\t" + "Course ID : " + id + "\n"+"LecNumbers :"+lecnum+"\n" + "Course Credit Hours : " + hours + "\n";
    }
    }
     
