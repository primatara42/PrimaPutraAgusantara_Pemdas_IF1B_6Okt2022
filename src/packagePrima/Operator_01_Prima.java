package packagePrima;

import java.util.Scanner;

public class Operator_01_Prima 
{
	public static void main(String[] args)
	{
		//DEKLARASI
		int nilai1, nilai2;
		nilai1 = 1;
		nilai2 = 5;
		
		Scanner input = new Scanner(System.in);
		
		//INCREAMENT (++)
		System.out.println("INCREAMENT");
		System.out.println(nilai1++);	//TAMPILKAN NILAI VARIABEL NILAI1 LALU TAMBAHKAN 1
		System.out.println(nilai1);		//VARIABEL NILAI1 SEKARANG DITAMBAH 1
		System.out.println(++nilai1);	//TAMBAHKAN DULU NILAI1 LALU TAMPILKAN
		
		System.out.println("");
		
		//DECREAMENT (--)
		System.out.println("DECREAMENT");
		System.out.println(nilai2--); 	//TAMPILKAN NILAI VARIABEL NILAI1 LALU KURANGI 1
		System.out.println(nilai2);		//VARIABEL NILAI2 SEKARANG DIKURANGI 1
		System.out.println(--nilai2);	//KURANGI DULU NILAI2 LALU TAMPILKAN
		
		
		
		
	}
}
