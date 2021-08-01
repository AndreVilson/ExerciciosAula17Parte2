package ExerciciosAula17;

/*Faça um programa que receba dois números inteiros e gere os
números inteiros que estão no intervalo compreendido por eles.
sem o primeiro e últimos números*/

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o numero minimo, maximo :");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();

		
		for (int numero = num1; numero < num2; numero++) {

			if (numero > num1) {
				System.out.println(numero);
			}

		}

	}

}
