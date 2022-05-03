package exercicios;
import java.util.Scanner;
public class Ex25F {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int num;
		
		while (true) {
		System.out.printf("Digite um número positivo: ");
		num=ler.nextInt();
		
		if(num>0) {
		System.out.printf("Tabuada do %d: \n",num);
		for(int i=1;i<=10;i++) {
			int mult = num*i;
			System.out.printf("%d x %d = %d\n",num,i,mult);
		}

		}else{
			System.out.printf("Por favor, digite um número positivo!");
		}
		break;
		}
		ler.close();
	}
}
