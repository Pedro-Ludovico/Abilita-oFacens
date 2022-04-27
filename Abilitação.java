package ex1;

import java.util.Scanner;

public class Abilitação {

	public static void main(String[]args) {
		Scanner ler = new Scanner(System.in); //Metodo scanner
		int psi, leg, dir;
		
		System.out.println("Digite 1 para sim e 2 para não");
		System.out.println("Você foi aprovado no exame Psicotecnico:");
		psi = ler.nextInt(); //pegando resposta 1
		System.out.println("Você foi aprovado no exame de Legislação:");
		leg = ler.nextInt(); //pegando resposta 2
		System.out.println("Você foi aprovado no exame de direção:");
		dir = ler.nextInt(); //pegando resposta 3
		
		if(psi == 1 && leg == 1 && dir == 1) 
		{
			//caso todas as alternativas estejam marcadas como sim executar
			System.out.println("Você pode sim guiar um veiculo");
		}else {
			//caso alguma das alternativas estiver marcada como não
			System.out.println("Você não pode guiar um veiculo ainda");
		}
	}
}
