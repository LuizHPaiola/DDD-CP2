package Aula3103;
import java.util.Scanner;

public class Ex21W {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int num;
		
		System.out.printf("Digite um n�mero positivo: ");
		num=ler.nextInt();
		
		while(num<=0) {
			System.out.printf("Este n�mero � negativo, por favor digite um"
				+ " n�mero positivo: ");
			num=ler.nextInt();
		}
		System.out.printf("Fim");
ler.close();
	}

}
