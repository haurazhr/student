/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manajemeninformatika1b;

/**
 *
 * @author UseR
 */
public class Student {
    private int noBp;
    String nama, nobpjs;
    double indeksPrestasi;
    public final int kodePTN = 001;

    public Student(int x, String n, String s, double g) {
        noBp =x;
        nama = n;
        nobpjs = s;
        indeksPrestasi=g;

    }

    public int getNoBp() {
        return noBp;
    }

    public void setNoBp(int noBp) {
        this.noBp = noBp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNobpjs() {
        return nobpjs;
    }

    public void setNobpjs(String nobpjs) {
        this.nobpjs = nobpjs;
    }

    public double getIndeksPrestasi() {
        return indeksPrestasi;
    }

    public void setIndeksPrestasi(double indeksPrestasi) {
        this.indeksPrestasi = indeksPrestasi;
    }
}

