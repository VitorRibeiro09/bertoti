package Estoque;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.util.List;

class Teste {

	@Test
	void test() {
		Estoque logistica = new Estoque();
		logistica.adicionarProduto(new Produto("caderno", "39"));
		assertEquals(1, logistica.getProdutos().size());
		
		List<Produto> busca = logistica.buscarProdutoNome("caderno");
		assertEquals(busca.get(0).getId(), "39");
		

	}
}