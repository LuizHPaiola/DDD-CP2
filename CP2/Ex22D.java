package Aula3103;
import java.util.Scanner;

public class Ex22D {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int num1, num2;
		
		System.out.printf("Digite um número: ");
		num1=ler.nextInt();
		do {
			
			System.out.printf("Digite um número maior que primeiro: ");
			num2=ler.nextInt();
			if(num2>num1)
				break;
			System.out.printf("O segundo número deve ser maior!\n");
		}
		while(num2<num1);
		
		System.out.printf("Obrigado!");
		ler.close();
	}

}
