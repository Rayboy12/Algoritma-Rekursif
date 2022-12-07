
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ALEXIS
 */
public class DeretFibonancci {
    public static void main(String[] args) {
          Scanner inputUser = new Scanner(System.in);
          System.out.println("Masukan Nilai =");
          int n = inputUser.nextInt();
          
for (int i = 0; i < n; i++) {
int hasil = fiboRekursif(i);
System.out.print(hasil + ", ");
}
}
public static Integer fiboRekursif(int n) {
if (n == 0) {
return 0;
}
if (n == 1) {
return 1;
}
return fiboRekursif(n - 1) + fiboRekursif(n - 2);
}
}

 