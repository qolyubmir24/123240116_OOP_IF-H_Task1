/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package berkendara.main;

import berkendara.model.Student;
import berkendara.model.Instructor;
import berkendara.exam.Exam;
import berkendara.exam.MotorcycleExam;
import berkendara.exam.CarExam;
import berkendara.exam.BusExam;

/**
 *
 * @author Mirwan Qolyubi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Instructor priaSolo = new Instructor("Owi");
        
        System.out.println("=== SCENARIO 1 ===");
        // Skenario 1: Siswa menyelesaikan 3 sesi latihan dan mencoba ujian
        Student wowok = new Student("Wowok", "123456");
        wowok.addTrainingSession();
        wowok.addTrainingSession();
        wowok.addTrainingSession();
        
        // Polimorfisme: Menggunakan referensi Exam untuk memanggil MotorcycleExam
        Exam motoExam = new MotorcycleExam(); 
        motoExam.startExam(wowok);

        System.out.println("=== SCENARIO 2 ===");
        // Skenario 2: Siswa mencoba ujian dengan sesi yang tidak mencukupi
        Student rina = new Student("Rina", "654321");
        rina.addTrainingSession();
        
        Exam carExam = new CarExam();
        carExam.startExam(rina);

        System.out.println("=== SCENARIO 3 ===");
        // Skenario 3: Siswa menerima izin dari instruktur lalu mencoba ujian
        Student dodi = new Student("Dodi", "112233");
        // Dodi tidak ikut latihan sama sekali (0 sesi), tapi diberi izin oleh instruktur
        priaSolo.giveExamClearance(dodi); 
        
        Exam busExam = new BusExam();
        busExam.startExam(dodi);
    }
    
}
