/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet7;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class TugasPraktikum {
    public static void main(String[] args) {
    String identitas = "ellok ananda madya pratiwi / x rpl 5 / 13";
    System.out.print("Identitas : "+ identitas);
    
    Scanner baca = new Scanner(System.in);
    String k , l ;
    int harga1,harga2;
    harga1 = 500000;
    harga2 = 750000;
    
    System.out.println("Masukkan jenin tiket konser");
        System.out.println("k : vvip");
        System.out.println("l : vip");
        k = baca.nextLine();
        
        switch (k) {
            case "k" :
                System.out.println(harga1);
                 break;
            case "l":
                System.out.println(harga2);
                break;
            default:
                System.out.println ("tidak ditemukan");
                break;
                
        }    }     
           
}
               

