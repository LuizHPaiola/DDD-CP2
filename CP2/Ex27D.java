package exercicios;

import java.util.Scanner;

public class Ex27D {

	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		int i=1;
		int num=1;
		
		do{
			do{
				int mult = num*i;
				System.out.printf("%d x %d = %d\n",i,num,mult);
				num++;
			}while(num<=10);
			num=1;
			i++;
			System.out.printf("\n-> Aperte uma tecla <-\n");
			ler.nextLine();
		}while(i<=20);
	ler.close();
	}
}