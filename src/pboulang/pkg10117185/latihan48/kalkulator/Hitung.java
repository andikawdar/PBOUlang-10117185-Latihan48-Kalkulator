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
public class Hitung {
    //Atribute
    private double value1;
    private double value2;

    
    //Function
    public Hitung(){
    }
    
    public double getValue1() {
        return value1;
    }
    
    public void setValue1(double value1) {
        this.value1 = value1;
    }
    
    public double getValue2() {
        return value2;
    }

    public void setValue2(double value2) {
        this.value2 = value2;
    }

    public void setNameProject(){
        System.out.println("Project Calculator");
    }

    public void setNoteProject(){
        System.out.println("This project shown you how to manage method in java");
    }

    

    public double add(double val1, double val2){
        double result;
        result = val1+val2;
        return result;
    }

    public double minus(double val1, double val2){
        double result;
        result = val1-val2;
        return result;
    }

    public double multiplication(double val1, double val2){
        double result;
        result = val1*val2;
        return result;
    }

    public double division(double val1, double val2){
        double result;
        result = val1/val2;
        return result;
    }
    
}
