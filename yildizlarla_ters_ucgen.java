package yildizlarla_ters_ucgen;

import java.util.Scanner;

public class yildizlarla_ters_ucgen {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Basamak sayısı giriniz: ");
		int sayi = scan.nextInt();

		for (int i = sayi; i >=0; i--) {

			for (int c = sayi - i; c >= 1; c--) {
				System.out.print(" ");
			}

			for (int a = 2 * i + 1; a> 0; a--) {
				System.out.print("*");
			}

			System.out.println(" ");
		}

	}

}
