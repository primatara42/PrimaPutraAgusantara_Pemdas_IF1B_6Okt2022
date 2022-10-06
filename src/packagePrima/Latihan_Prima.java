package packagePrima;

import java.util.Scanner;

public class Latihan_Prima 
{
	public static void main(String[] args)
	{
		//DEKLARASI
		Scanner input = new Scanner(System.in);
		
		int angka;
		
		System.out.print("Masukkan Nilai Variabel angka = ");
		angka = input.nextInt();
		
		if(angka > 0)
		{
			System.out.println("angka bernilai positif");
		}
		
		else if(angka < 0)
		{
			System.out.println("angka bernilai negatif");
		}
	}
}
