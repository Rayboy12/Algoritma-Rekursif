
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ALEXIS
 */
public class NilaiFaktorial {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Masukan Nilai :");
        int nilai = userInput.nextInt();
        
        
        printNilai(nilai);
        int jumlah = jumlahNilai(nilai);
        System.out.println("Nilai Akhir = " + jumlah);
}
public static void printNilai(int n){
    System.out.print(n + " X ");
if(n == 1){
return;
}
n--;
printNilai(n) ;
 System.out.println("\n");
}
 public static int jumlahNilai(int n){
        if (n == 1){
            return n;
        }
        return n * jumlahNilai(n-1);
    }
}
