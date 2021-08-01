package ExerciciosAula17;

import java.util.Scanner;

/*Faça um programa que imprima na tela apenas os números ímpares
entre 1 e 50*/

public class Ex09 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o numero minimo, maximo para verificação de impares:");
		int minimo = scan.nextInt();
		int maximo = scan.nextInt();
		
		int numero;
		System.out.println("Numeros Impares: ");
		for (numero = minimo;numero <= maximo; numero++) {
			//System.out.println(numero);
			
			if(numero % 2 != 0) {
				
				System.out.println(numero);
			}
		}
		
		
		
		
	}

}
