package ex1;

import java.util.Scanner;

public class Abilitação {

	public static void main(String[]args) {
		Scanner ler = new Scanner(System.in);
		int psi, leg, dir;
		
		System.out.println("Digite 1 para sim e 2 para não");
		System.out.println("Você foi aprovado no exame Psicotecnico:");
		psi = ler.nextInt();
		System.out.println("Você foi aprovado no exame de Legislação:");
		leg = ler.nextInt();
		System.out.println("Você foi aprovado no exame de direção:");
		dir = ler.nextInt();
		
		if(psi == 1 && leg == 1 && dir == 1) 
		{
			System.out.println("Você pode sim guiar um veiculo");
		}else {
			System.out.println("Você não pode guiar um veiculo ainda");
		}
	}
}
