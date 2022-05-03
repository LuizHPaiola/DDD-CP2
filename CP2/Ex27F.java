package exercicios;
import java.util.Scanner;
public class Ex27F {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		for(int i=1;i<=20;i++) {
			for(int num=1;num<=10;num++) {
				int mult = num*i;
				System.out.printf("%d x %d = %d\n",i,num,mult);
				
			}
			System.out.printf("\n-> Aperte uma tecla <-\n");
			ler.nextLine();
		}
ler.close();
}

}
