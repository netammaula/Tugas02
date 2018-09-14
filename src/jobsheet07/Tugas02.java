/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jobsheet07;
import java.util.Scanner;
/**
 *
 * @author netammaula
 */
public class Tugas02 {
    public static void main(String[] args)   {
         System.out.println("Neta Minkhatul Maula / X RPL 3 / 31");
         
         int[] Berat = new int[] {7, 5, 4, 3, 2};
        int[] Harga = new int[] {10000, 7000, 5000, 3000, 2000};
        
        int berat = Input();
        
        Proses(berat, Berat, Harga);
    }
        
    
}

