package ex36;
import java.util.Scanner;

public class Sistema {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		Produto[] listaProdutos = new Produto[5];
		
		char possuiCategoria;
		int id;
		String nome;
		double quantidade;
		double preco;
		Categoria categoria;
		
		for(int i=0; i<=4; i++) {
			Produto p = new Produto();
			System.out.printf("Informe o id do produto: ");
			id=ler.nextInt();
			p.setId(id);
			
			System.out.printf("Informe o nome do produto: ");
			nome=ler.next();
			p.setNome(nome);
			
			System.out.printf("Informe o preço do produto: ");
			preco=ler.nextDouble();
			p.setPreco(preco);
			
			System.out.printf("Informe a quantidade de produtos: ");
			quantidade=ler.nextDouble();
			p.setQuantidade(quantidade);
			
			System.out.printf("O produto possui alguma categoria? (S/N)");
			possuiCategoria=ler.next().charAt(0);
			
			if (possuiCategoria=='S'){
					Categoria cg = new Categoria();
					System.out.printf("Informe o id da categoria: ");
					id=ler.nextInt();
					cg.setId(id);
					
					System.out.printf("Informe o nome da categoria: ");
					cg.setNome(nome);
					categoria=cg;
					
			}else{
					categoria=null;
			}
			Produto p2 = new Produto(id, nome, preco, quantidade, categoria);
			listaProdutos[i]=p2;
		}
		for(int i=0;i<=4;i++) {
			System.out.printf("\n%S", listaProdutos[i].exibirNomePreco());
			System.out.printf("\n%S", listaProdutos[i].exibirNomeQuantidade());
		}
		
	}

}
