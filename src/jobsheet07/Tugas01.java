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
public class Tugas01 {
    public static void main(String[] args)   {
        System.out.println("Neta Minkhatul Maula / X RPL 3 / 31");
        
        int[] nominal = {5000, 2000, 1000, 500, 100};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Uang: ");
        int uang = scanner.nextInt();
        
         for(int i = 0; i < 5; i++)
        {
            int jumlah = uang / nominal[i];
            uang = uang - (nominal[i] * jumlah);
            
            System.out.println("lembar" + nominal[i] + " = " + jumlah);
        }
        
    }
}
