package ExerciciosAula17;

import java.util.Scanner;

/*Faça um programa que imprima na tela os números de 1 a 20, um
abaixo do outro. Depois modifique o programa para que ele mostre os
números um ao lado do outro.*/

public class Ex06 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		
			
			for (int num = 1; num <= 20; num ++) {
				//System.out.println(num);
				System.out.print(" " + num);
			}
		
	}

}
