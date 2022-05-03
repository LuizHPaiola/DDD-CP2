package exercicios;

public class Ex28D {

	public static void main(String[] args) {
		int i=1;
		int conta=0;
		do{
			conta=conta+i;
			i++;
		}while(i<=100);
		System.out.printf("A soma dos números de 1 a 100 da %d",conta);
	}

}
