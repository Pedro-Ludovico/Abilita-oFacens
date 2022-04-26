package ex1;

import java.util.Scanner;

public class Estacionamento {

	public static void main(String[]args) {
		
		Scanner ler = new Scanner(System.in); //criando o scaner
		int num;
		
		System.out.println("Digite 1 se você for Idoso ou gestante ou portar alguma deficiencia");
		System.out.println("Digite 2 se você não portar nada citado acima");
		System.out.println("Digite aqui");
		num = ler.nextInt(); //atribuindo valor ao num
		
		if(num == 1) {
			//caso o numero seja 1
			System.out.println("Você pode estacionar nas vagas especiais");
		}else if(num == 2) {
			//caso o numero seja 2
			System.out.println("Você  não pode estacionar nas vagas especiais");
		}else {
			//caso não seja nem 1 nem 2
			System.out.println("Digite um numero valido");
		}
	}
}
