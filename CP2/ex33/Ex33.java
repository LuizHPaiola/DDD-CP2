package classe_atributo;
import java.util.Scanner;

public class Ex33 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		Produto[] listaProduto=new Produto[10];
		
		for(int i=0;i<=9;i++) {
			Produto a=new Produto();
			System.out.printf("Digite o id do produto: ");
			a.id=ler.nextInt();
			System.out.printf("Digite o descrição do produto: ");
			a.descricao=ler.next();
			System.out.printf("Digite valor do produto: ");
			a.valor=ler.nextDouble();
			System.out.printf("Digite a quantidade de produtos: ");
			a.quantidade=ler.nextDouble();
			listaProduto[i]= a;
				
			}
		for(int j=0;j<=9;j++) {
			if(listaProduto[j].valor<100) {
				System.out.printf("\n%s, produto id %d, custa R$%f, e contém %f em estoque",listaProduto[j].descricao,listaProduto[j].id,listaProduto[j].valor,listaProduto[j].quantidade);
			}
		}
	ler.close();
	}
}


