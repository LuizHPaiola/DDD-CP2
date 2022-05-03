package exercicios;

import java.util.Scanner;

public class Ex27W {

	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		
		int i=1;
		int num=1;
		
		while(i<=20) {
			while(num<=10) {
				int mult = num*i;
				System.out.printf("%d x %d = %d\n",i,num,mult);
				num++;
			}
			num=1;
			i++;
			System.out.printf("\n-> Aperte uma tecla <-\n");
			ler.nextLine();
	}
ler.close();
}
}