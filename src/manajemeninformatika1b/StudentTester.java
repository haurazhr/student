/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manajemeninformatika1b;

/**
 *
 * @author UseR
 */
public class StudentTester {
    public static void main(String[] args) {
        
        Student s1 = new Student(1005, "Desfanni Zulya", "999-99-9999", 3.5);
        System.out.println("NoBp: " + s1.getNoBp());
        System.out.println("Nama: " + s1.getNama());
        System.out.println("No BPJS: " + s1.getNobpjs());
        System.out.println("IPK : " + s1.getIndeksPrestasi());
        System.out.println("---------------------------------------------------");
        
        StudentDua s2 = new StudentDua();
        s2.setNoBp(1091006);
        s2.setNama("Fadil");
        s2.setNobpjs("999-99-9999");
        s2.setIndeksPrestasi(3.83);
        
        
        System.out.println("NoBp: " + s2.getNoBp());
        System.out.println("Nama: " + s2.getNama());
        System.out.println("No BPJS: " + s2.getNobpjs());
        System.out.println("IPK : " + s2.getIndeksPrestasi());
        System.out.println("------------------------------------------------");
        
        StudentDua s3 = new StudentDua();
        s3.setNoBp(1091007);
        s3.setNama("Fanni Illahi");
        s3.setNobpjs("999-99-9999");
        s3.setIndeksPrestasi(3.65);
        
        System.out.println("------------------------------------------------");
        System.out.println("NoBp: " + s3.getNoBp());
        System.out.println("Nama: " + s3.getNama());
        System.out.println("No BPJS: " + s3.getNobpjs());
        System.out.println("IPK : " + s3.getIndeksPrestasi());
        System.out.println("------------------------------------------------");
        
        
        
    }
    
    
}
