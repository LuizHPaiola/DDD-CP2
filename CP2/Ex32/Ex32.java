package classe_atributo;
import java.util.Scanner;

public class Ex32 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		Cliente[] listaCliente = new Cliente[5];
		for(int i=0;i<=4;i++){
		Cliente a = new Cliente();
		
		System.out.printf("Digite o id do cliente: ");
		a.id=ler.nextInt();
		System.out.printf("Digite o nome do cliente: ");
		a.nome=ler.next();
		System.out.printf("Digite a idade do cliente: ");
		a.idade=ler.nextInt();
		System.out.printf("Digite o email do cliente: ");
		a.email=ler.next();
		listaCliente[i]=a;
			if(i==4) {
			for(int j=0;j<=4;j++) {
		    if(listaCliente[j].idade>=18) {
			System.out.printf("\nCliente %s, id %d, email %s, idade %d.\n",listaCliente[j].nome,listaCliente[j].id,listaCliente[j].email,listaCliente[j].idade);
			}
		}
		}
	
		
	}
	}
}
