package exercicios;

import java.util.Scanner;

public class Ex25W {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int num;
		
		while (true) {
		System.out.printf("Digite um número positivo: ");
		num=ler.nextInt();
		int i=1;
		if(num>0) {
		System.out.printf("Tabuada do %d: \n",num);
		while(i<=10) {
			int mult = num*i;
			System.out.printf("%d x %d = %d\n",num,i,mult);
			i++;
		}

		}else{
			System.out.printf("Por favor, digite um número positivo!");
		}
		break;
		}
		ler.close();
	}
}