package exercicios;
import java.util.Scanner;
public class Ex31W {

	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	
		int n;
		int i=0;
		int imp=3;
		int num=2;
		System.out.printf("Digite o valor positivo de N: ");
		n=ler.nextInt();
		while(n<0) {
			System.out.printf("Número inválido, digite novamente: ");
			n=ler.nextInt();
		}
		while(i<n) {
				System.out.println(num);
				num=num+imp;
				imp=imp+2;
				i++;
			
		}
		ler.close();
	}
}