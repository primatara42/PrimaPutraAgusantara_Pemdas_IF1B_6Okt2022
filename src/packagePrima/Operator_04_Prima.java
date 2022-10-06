package packagePrima;

import java.util.Scanner;

public class Operator_04_Prima 
{
	public static void main(String[] args)
	{
		
		Scanner input = new Scanner(System.in);
		int nilai1, nilai2;
		boolean hasil;
		
		System.out.println("Membuat Program Perbandingan dua bilangan atau lebih");
		System.out.print("Masukkan Nilai1 = ");
		nilai1 = input.nextInt();
		
		System.out.print("Masukkan Nilai2 = ");
		nilai2 = input.nextInt();
		
		//PROSES + OUTPUT
		
		hasil = nilai1 > nilai2;
		System.out.println("Apakah nilai1 > nilai2 = " + hasil);
		
		hasil = nilai1 < nilai2;
		System.out.println("Apakah nilai1 < nilai2 = " + hasil);
		
		hasil = nilai1 == nilai2;
		System.out.println("Apakah nilai1 == nilai2 = " + hasil);
		
		System.out.println("Apakah nilai1 <= nilai2 = " + (nilai1 <= nilai2));
		
		System.out.println("Apakah nilai1 != nilai2 = " + (nilai1 != nilai2));
		
	
		
				
	}
}
