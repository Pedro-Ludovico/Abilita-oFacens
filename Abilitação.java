package ex1;

import java.util.Scanner;

public class Abilita��o {

	public static void main(String[]args) {
		Scanner ler = new Scanner(System.in);
		int psi, leg, dir;
		
		System.out.println("Digite 1 para sim e 2 para n�o");
		System.out.println("Voc� foi aprovado no exame Psicotecnico:");
		psi = ler.nextInt();
		System.out.println("Voc� foi aprovado no exame de Legisla��o:");
		leg = ler.nextInt();
		System.out.println("Voc� foi aprovado no exame de dire��o:");
		dir = ler.nextInt();
		
		if(psi == 1 && leg == 1 && dir == 1) 
		{
			System.out.println("Voc� pode sim guiar um veiculo");
		}else {
			System.out.println("Voc� n�o pode guiar um veiculo ainda");
		}
	}
}
