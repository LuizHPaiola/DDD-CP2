package ex38;
import java.util.ArrayList;
import java.util.Scanner;

import ex36.Categoria;

import java.io.IOException;

public class Sistema {

	public static void main(String[] args) throws IOException{
		Scanner ler = new Scanner(System.in);
		ArrayList<Produto>listaProdutos = new ArrayList<>();
		int id;
		String nome;
		double preco;
		double quantidade;
		Categoria categoria;
		int opcao;
		int escolha;
		char possuiCategoria;
		
		do {
			System.out.printf("==> Sistema de Cadastro de Produtos <== \n\n");
			System.out.printf("Escolha uma opção: \n");
			System.out.printf("1 - Incluir produto \n"+
							  "2 - Atualizar produto \n"+
					 		  "3 - Excluir produto \n"+
							  "4 - Exibir produto \n" +
					 		  "5 - Sair \n\n");
			System.out.printf("Digite a opção desejada: ");
			opcao=ler.nextInt();
			if(opcao==1) {
				Produto produto = new Produto();
				id=listaProdutos.size()+1;
				produto.setId(id);
				
				System.out.printf("Digite o nome do produto: ");
				nome=ler.next();
				produto.setNome(nome);
				
				System.out.printf("Digite o preço do produto: ");
				preco=ler.nextDouble();
				produto.setPreco(preco);
				
				System.out.printf("Digite a quantidade do produto: ");
				quantidade=ler.nextDouble();
				produto.setQuantidade(quantidade);
				System.out.printf("O produto possui alguma categoria? (S/N)");
				possuiCategoria=ler.next().charAt(0);
				
				if (possuiCategoria=='S'){
						Categoria cg = new Categoria();
						System.out.printf("Informe o id da categoria: ");
						id=ler.nextInt();
						cg.setId(id);
						
						System.out.printf("Informe o nome da categoria: ");
						nome=ler.next();
						cg.setNome(nome);
						
						categoria=cg;
						produto.setCategoria(categoria);
						
				}else{
						categoria=null;
						produto.setCategoria(categoria);
				}
				listaProdutos.add(produto);
				System.out.printf("Produto cadastrado com sucesso!\n");
				System.in.read();
			}else if(opcao==2){
				for(Produto a: listaProdutos) {
					System.out.printf("\nID: %d - Nome: %s - Preço: R$%f - Quantidade: %f\n",a.getId(),a.getNome(),a.getPreco(),a.getQuantidade());
					if(a.getCategoria()!=null) {
						System.out.printf("ID da categoria: %d - Categoria: %s\n",a.getCategoria().getId(),a.getCategoria().getNome());			
					}
				}
				System.out.printf("\nDigite o id do produto que deseja atualizar: ");
				id=ler.nextInt();
				
				System.out.printf("Digite o novo nome do produto: ");
				nome=ler.next();
				
				System.out.printf("Digite o novo preço do produto: ");
				preco=ler.nextDouble();
				
				System.out.printf("Digite a quantidade atual do produto: ");
				quantidade=ler.nextDouble();
				
				Produto produto = listaProdutos.get(id-1);
				produto.setId(id);
				produto.setNome(nome);
				produto.setPreco(preco);
				produto.setQuantidade(quantidade);
				
				System.out.printf("Deseja atualizar a categoria do produto?\n");
				System.out.printf("1 - sim\n"+
								  "2 - não\n");
				escolha=ler.nextInt();
				
				
				if(escolha==1) {
					System.out.printf("Digite o novo nome da categoria: ");
					nome=ler.next();
					
					produto.getCategoria().setNome(nome);
				}
				System.out.printf("Produto atualizado com sucesso!");
				System.in.read();
				
			}else if(opcao==3) {
				for(Produto a: listaProdutos) {
					System.out.printf("\nID: %d - Nome: %s - Preço: R$%d - Quantidade: %d\n",a.getId(),a.getNome(),a.getPreco(),a.getQuantidade());
					if(a.getCategoria()!=null) {
						System.out.printf("ID da categoria: %d - Categoria: %s",a.getCategoria().getId(),a.getCategoria().getNome());			
					}
				System.out.printf("\nDigite o id do produto que deseja excluir: ");
				id=ler.nextInt();
				listaProdutos.remove(id-1);
				System.out.printf("Produto excluído com sucesso!");
				}
				
				System.in.read();
			}else if(opcao==4) {
				for(Produto a: listaProdutos) {
					System.out.printf("\nID: %d - Nome: %s - Preço: R$%d - Quantidade: %d\n",a.getId(),a.getNome(),a.getPreco(),a.getQuantidade());
					if(a.getCategoria()!=null) {
						System.out.printf("ID da categoria: %d - Categoria: %s\n",a.getCategoria().getId(),a.getCategoria().getNome());			
					}
				}
				System.in.read();
			}
		}while(opcao!=5);
	ler.close();
	}
	
}



