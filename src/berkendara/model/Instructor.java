/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package berkendara.model;

/**
 *
 * @author Mirwan Qolyubi
 */
public class Instructor {
    private String name;

    public Instructor(String name) {
        this.name = name;
    }

    // Method instruktur untuk memberikan izin khusus kepada siswa
    public void giveExamClearance(Student student) {
        student.setExamClearanceStatus(true);
        System.out.println("Instruktur " + this.name + " memberikan izin ujian kepada " + student.getName() + ".");
    }
}
