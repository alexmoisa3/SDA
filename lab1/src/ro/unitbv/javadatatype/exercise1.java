package ro.unitbv.javadatatype;

import java.util.Scanner;

public class exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello world");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introdu nr 1:"); //afiseaza mesajul in consola
		
		int nr1=scanner.nextInt();
		
		System.out.println("numarul citit este:"+nr1); // afisam output-ul
		
		int nr2=scanner.nextInt();
		
		System.out.println("numarul citit este:"+nr2);
		
		int s=nr1+nr2;
		
		System.out.printf("Suma a doua numere:"+s);
		
        System.out.printf("Diferenta dintre 2 numere:%d%n", nr1 - nr2);
        System.out.printf("Produs:%d%n", nr1 * nr2);
        System.out.printf("Media:%.2f%n", (double) (nr1 + nr2) / 2);
        System.out.printf("Distanta:%d%n", Math.abs(nr1 - nr2));
        System.out.printf("Maxim:%d%n", Math.max(nr1, nr2));
        System.out.printf("Minim:%d%n", Math.min(nr1, nr2));
        	
	}

}
