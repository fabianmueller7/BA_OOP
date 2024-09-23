import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MainClass {
    public static void main(String[] args){
        System.out.println("Start des Programmes");
        
        Student tstStudent = new Student("Fabian","S01");
        System.out.println(tstStudent.getName());
        
        LabClass tstLabClass = new LabClass(10);
        tstLabClass.enrollStudent(tstStudent);
        System.out.println("Number of Students: " + tstLabClass.numberOfStudents());
        
        Fahrrad tstfahrrad = new Fahrrad(Sizes.Medium, "Blue");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd LLLL yyyy");
        String formattedString = tstfahrrad.getProductiondate().format(formatter);
        System.out.println(formattedString);
        
;    }
}
