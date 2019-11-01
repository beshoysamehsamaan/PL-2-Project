/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training.center;
import gui.Login;
import java.io.File;
import java.util.Scanner;
/**
 *
 * @author Andrew
 */
public class TrainingCenter {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String projectPath=System.getProperty("user.dir");
        File currentDir=new File(projectPath);
        checkDirectoryContents(currentDir);
        new Login().setVisible(true);
    }
    public static void checkDirectoryContents(File dir) {
        File[] files = dir.listFiles();
        boolean StudentFile = true;
        boolean TutorFile = true;
        boolean CourseFile = true;
        boolean EmailFile = true;
        boolean AttendanceFile= true;
        boolean FeedbackFile = true;
        boolean GradeFile = true;
        boolean InvoiceFile = true;
        boolean MaterialFile = true;

        for (File file : files) {

            if (file.getName().contains("Students.bin")) {
                StudentFile = false;
            } else if (file.getName().contains("Tutor.bin")) {
                TutorFile = false;
            } else if (file.getName().contains("Courses.bin")) {
                CourseFile = false;
            } else if (file.getName().contains("Email.bin")) {
                EmailFile = false;
            } else if (file.getName().contains("Attendence.bin")) {
                AttendanceFile = false;
            } else if (file.getName().contains("FeedBacks.bin")) {
                FeedbackFile = false;
            } else if (file.getName().contains("Grades.bin")) {
                GradeFile = false;
            } else if (file.getName().contains("Invoices.bin")) {
                InvoiceFile = false;
            } else if (file.getName().contains("Metrail.bin")) {
                MaterialFile = false;
            }
        }
        if (StudentFile) {
            Student x = new Student();
            x.commitToFile();
        }
        
        if (TutorFile) {
            Tutor x = new Tutor();
            x.commitToFile();
        }
        
        if (CourseFile) {
            Course x = new Course();
            x.commitToFile();
        }
        
        if (EmailFile) {
            Email x = new Email();
            x.commitToFile();
        }
        
        if (AttendanceFile) {
            Attendence x = new Attendence();
            x.commitToFile();
        }
        
        if (FeedbackFile) {
            FeedBack x = new FeedBack();
            x.commitToFile();
        }
        
        if (GradeFile) {
            Grade x = new Grade();
            x.commitToFile();
        }
        
        if (InvoiceFile) {
            Invoice x = new Invoice();
            x.commitToFile();
        }
        
        if (MaterialFile) {
            Metrail x = new Metrail();
            x.commitToFile();
        }
        
    }
    
}
