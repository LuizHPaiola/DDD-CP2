package exercicios;

import java.util.Scanner;

public class Ex26D {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int intb=0;
		int inta=0;
		while (true) {
			System.out.printf("Digite o número que deseja gerar a tabuada: ");
			int num=ler.nextInt();
			
			while(true){
			System.out.printf("Digite o menor número do intervalo: ");
			inta=ler.nextInt();
			System.out.printf("Digite o maior numero do intervalo: ");
			intb=ler.nextInt();
			if(inta<intb) {
				break;
			}else {
				System.out.printf("O maior segundo valor deve ser maior que o primeiro!");
			}
		}
		System.out.printf("Tabuada do %d: \n",num);
		int i=inta;
		do{
			int mult = num*i;
			System.out.printf("%d x %d = %d\n",num,i,mult);
			i++;
		}while(i<=intb);
		break;
		}
		ler.close();
	}
}