/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package berkendara.model;

/**
 *
 * @author Mirwan Qolyubi
 */
public class Student {
    // Penerapan Encapsulation
    private String name;
    private String nik;
    private int trainingSessions;
    private boolean examClearanceStatus;

    // Constructor untuk inisialisasi
    public Student(String name, String nik) {
        this.name = name;
        this.nik = nik;
        this.trainingSessions = 0;
        this.examClearanceStatus = false; 
    }

    // Method untuk menambah sesi latihan
    public void addTrainingSession() {
        this.trainingSessions++;
    }

    // Method untuk mengecek kelayakan ujian
    public boolean isEligible() {
        return this.trainingSessions >= 3 || this.examClearanceStatus;
    }

    // Getter untuk mengambil nama
    public String getName() {
        return this.name;
    }

    // Setter untuk mengubah status izin
    public void setExamClearanceStatus(boolean status) {
        this.examClearanceStatus = status;
    }
}
