package Aula3103;
import java.util.Scanner;

public class Ex23W {

	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		char s1;

		System.out.printf("Informe seu sexo: ");
		s1=ler.next().charAt(0);
		
		//while(s1.equals("F") || s1.equals("M")){
		while ( (s1 != 'F') && (s1 != 'M') ){
			System.out.printf("Resposta inválida, informe seu sexo: ");
			s1=ler.next().charAt(0);
		}
		System.out.printf("Obrigado!");
		ler.close();
	}
	

}
