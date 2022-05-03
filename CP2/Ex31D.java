package exercicios;

import java.util.Scanner;

public class Ex31D {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n;
		int i=0;
		int imp=3;
		int num=2;
		do{
			System.out.printf("Digite um valor positivo para N:");
			n=ler.nextInt();
			if(n<0) {
				System.out.printf("Erro! Valor negativo!\n");
			}
		}while(n<0);
		do {
				System.out.println(num);
				num=num+imp;
				imp=imp+2;
				i++;
			
		}while(i<n);
		ler.close();
	}
}