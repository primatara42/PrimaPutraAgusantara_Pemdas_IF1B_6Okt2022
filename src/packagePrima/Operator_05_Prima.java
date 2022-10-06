package packagePrima;

import java.util.Scanner;

public class Operator_05_Prima 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		//DEKLARASI
		boolean a;
		boolean b;
		boolean contoh1, contoh2;
		
		System.out.print("Masukkan nilai kebenaran a = ");
		a = input.nextBoolean();
		
		System.out.print("Masukkan nilai kebenaran b = ");
		b = input.nextBoolean();
		
		
		//PROSES + OUTPUT
		System.out.println("a && b akan menghasilkan " + (a && b));
		System.out.println("a || b akan menghasilkan " + (a || b));
		System.out.println("a == b akan menghasilkan " + (a == b));
		System.out.println("a != b akan menghasilkan " + (a != b));
		
		if((a == true) && (b == true))
		{
			System.out.println("KEDUA NILAI TRUE");
		}
		
		else
		{
			System.out.println("TIDAK RELEVAN");
		}
				
	}
}
