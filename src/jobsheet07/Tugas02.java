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
    private static int Input()  {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Berat Barang: ");
        int berat = scan.nextInt();
        
        return berat;
    }
     private static void Proses(int berat, int[] Berat, int[] Harga) {
        int jumlah = 0;
            for (int i = 0; i < Berat.length; i++) {
            int n = 0;
            while(berat >= Berat[i])    {
                berat = berat - Berat[i];
                n++;
        }
        int total = n * Harga[i];
        System.out.println(Berat[i] + " Sebanyak " + n + " dengan harga Rp" + total);
        jumlah = jumlah + total;
                
    }
        System.out.println("\nTotal Bayaran : Rp " + jumlah);
        
    
        
    
}
}

