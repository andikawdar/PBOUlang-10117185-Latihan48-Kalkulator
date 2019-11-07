/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang.pkg10117185.latihan48.kalkulator;

/**
 *
 * @author user
 * Nama  : Andhyka Widariyanto
 * NIM   : 10117185
 * Kelas : PBO-Ulang
 * Tugas : Latihan 48 - Kalkulator
 */
public class PBOUlang10117185Latihan48Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Hitung masuk = new Hitung();
        masuk.setValue1(7);
        masuk.setValue2(5);

        double val1 = masuk.getValue1();
        double val2 = masuk.getValue2();

        System.out.println("VALUE 1 = "+masuk.getValue1());
        System.out.println("VALUE 1 = "+masuk.getValue2());
        masuk.setNameProject();
        masuk.setNoteProject();
        System.out.println("Result Add is = "+masuk.add(val1, val2));
        System.out.println("Result Minus is = "+masuk.minus(val1, val2));
        System.out.println("Result Multiple is = "+masuk.multiplication(val1, val2));
        System.out.println("Result Division is = "+masuk.division(val1, val2));   
    }
    
}
