package tugas_plus;

import java.util.Scanner;

public class Tugas_Plus {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int masuk, baris, kolom;
        
        do
        {
            System.out.print("Masukkan Jumlah Perulangan (Ganjil dan Min 3) = ");
            masuk = input.nextInt();
        }
        while(masuk % 2 == 0 || masuk < 3);
        
        System.out.println("");
        System.out.println("+-------Tugas Plus--------+");
        System.out.println("+-------------------------+");
        System.out.println("");
        
        for (baris = 1; baris <= masuk; baris++) 
        {
            for (kolom = 1; kolom <= masuk; kolom++) 
            {
                if(baris == (masuk + 1) / 2 || kolom == (masuk + 1) / 2)
                {
                    System.out.print(" $ ");
                }
                else
                {
                    System.out.print(" . ");
                }
            }
            System.out.println(" ");
        }
        System.out.println("");
        System.out.println("+------- 025314020 -------+");
        System.out.println("+-------Program Java------+");
    }
    
}
