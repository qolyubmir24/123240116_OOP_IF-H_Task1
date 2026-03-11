/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package berkendara.exam;
import berkendara.model.Student;

/**
 *
 * @author Mirwan Qolyubi
 */
public class BusExam implements Exam {
    @Override
    public void startExam(Student student) {
        System.out.println("Student: " + student.getName()); 
        System.out.println("Vehicle Exam: Bus"); 
        
        if (student.isEligible()) {
            System.out.println("Status: Allowed to take exam\n");
        } else {
            System.out.println("Status: Not eligible for exam\n");
        }
    }
}
