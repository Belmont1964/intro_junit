package carrinho;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarrinhoTeste {
	
	@DisplayName("Testa carrinho vazio")
	@Test
	public void carrinhoVazio() {
		Carrinho kart = new Carrinho();
		int tam = kart.getQtdeItems();
		Assertions.assertEquals(0, 0);
		
	}

}
