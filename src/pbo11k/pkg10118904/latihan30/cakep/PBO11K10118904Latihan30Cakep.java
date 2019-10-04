/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118904.latihan30.cakep;
import java.util.*;
/**
 *
 * @author ACER
 * Nama     : Firman Alfinas
 * Kelas    : IF 11-K
 * Nim      : 10118904
 * Deskripsi Program : Program ini berisi menggubah warna kalimat
 */
    public class PBO11K10118904Latihan30Cakep {
    public static final String NORMAL = "\u001b[0m";
    public static final String MERAH = "\u001b[31m";
    public static final String HIJAU = "\u001b[32m";
    public static final String KUNING = "\u001b[33m";
    public static final String BIRU = "\u001b[34m";
    public static final String UNGU = "\u001b[35m";
    public static final String BIRUMUDA = "\u001B[36m";
    public static final String PUTIH = "\u001B[37m";
    public static Scanner input = new Scanner(System.in);
    public static void tc(String warna,String teks) {
        System.out.print(warna+teks+ NORMAL);
    }
    public static void tcln(String warna,String teks) {
        System.out.println(warna+teks+ NORMAL);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        tc(MERAH,"Kamu");
        tc(HIJAU," ngerjain sendiri");
        tc(KUNING," Latihan 17 sampai");
        tcln(BIRU," latihan 30 ini ?");
        tc(BIRU,"Jawab  ");
        tc(UNGU,"(Yoi/Enggak) : ");
        Scanner scanner = new Scanner(System.in);
        String cek = scanner.next();
        
        if(cek.equals("Yoi")){
            tc(MERAH,"Cakep bener. ");
            tcln(UNGU,"Good Job");
        }else{
            tcln(MERAH,"Tetep cakep sih");
            tcln(BIRUMUDA,"Sing penting paham konsep nya yee");
            System.out.println("Keep The code work dude ");
    }
    
}
}
