package Estoque;

import java.util.List;
import java.util.LinkedList;
 
public class Estoque {
	private List<Produto> produtos = new LinkedList<Produto>();
	
	public void adicionarProduto(Produto produto){
	produtos.add(produto);
	}
	
	public List<Produto> getProdutos(){
		return produtos;
	}
	public List<Produto> buscarProdutoNome(String nome){
		List<Produto> encontrados = new LinkedList<Produto>();
		for(Produto produto:produtos) {
			if(produto.getNome().equals(nome))
				encontrados.add(produto);
		}
		return encontrados;
	}
}