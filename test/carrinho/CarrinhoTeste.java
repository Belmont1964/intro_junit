/*

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
*/

//  GERADO POR IA (GEMINI)

package carrinho;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import produto.Produto;
import produto.ProdutoNaoEncontradoException;

import static org.junit.jupiter.api.Assertions.*;

public class CarrinhoTeste {

    private Carrinho carrinho;
    private Produto produto1;
    private Produto produto2;

    @BeforeEach
    void setUp() {
        // Inicializa o carrinho antes de cada teste
        carrinho = new Carrinho();
        
        // Instancia produtos fictícios para os testes. 
        // Adapte os parâmetros do construtor conforme a implementação real da sua classe Produto.
        produto1 = new Produto("Notebook", 3500.00);
        produto2 = new Produto("Mouse", 150.00);
    }

    @Test
    @DisplayName("Deve iniciar um carrinho vazio e com valor total zerado")
    void testCarrinhoVazio() {
        assertEquals(0, carrinho.getQtdeItems(), "A quantidade inicial de itens deve ser 0");
        assertEquals(0.0, carrinho.getValorTotal(), "O valor total inicial deve ser 0.0");
    }

    @Test
    @DisplayName("Deve adicionar itens ao carrinho corretamente")
    void testAddItem() {
        carrinho.addItem(produto1);
        assertEquals(1, carrinho.getQtdeItems(), "O carrinho deve ter 1 item após a adição");

        carrinho.addItem(produto2);
        assertEquals(2, carrinho.getQtdeItems(), "O carrinho deve ter 2 itens após adicionar mais um produto");
    }

    @Test
    @DisplayName("Deve calcular o valor total dos itens no carrinho")
    void testGetValorTotal() {
        carrinho.addItem(produto1); // 3500.00
        carrinho.addItem(produto2); // 150.00
        
        assertEquals(3650.00, carrinho.getValorTotal(), "O valor total deve ser a soma do preço dos produtos (3650.00)");
    }

    @Test
    @DisplayName("Deve remover um item do carrinho com sucesso")
    void testRemoveItemSucesso() throws ProdutoNaoEncontradoException {
        carrinho.addItem(produto1);
        carrinho.addItem(produto2);
        
        carrinho.removeItem(produto1);
        
        assertEquals(1, carrinho.getQtdeItems(), "O tamanho do carrinho deve diminuir para 1 após a remoção");
        assertEquals(150.00, carrinho.getValorTotal(), "O valor total deve refletir apenas o item restante");
    }

    @Test
    @DisplayName("Deve lançar ProdutoNaoEncontradoException ao tentar remover um item que não está no carrinho")
    void testRemoveItemNaoEncontrado() {
        carrinho.addItem(produto1);
        
        // Tenta remover o produto2, que não foi adicionado ao carrinho
        assertThrows(ProdutoNaoEncontradoException.class, () -> carrinho.removeItem(produto2), 
            "Deve lançar ProdutoNaoEncontradoException quando o item não existir no carrinho");
    }

    @Test
    @DisplayName("Deve esvaziar o carrinho corretamente")
    void testEsvazia() {
        carrinho.addItem(produto1);
        carrinho.addItem(produto2);
        
        carrinho.esvazia();
        
        assertEquals(0, carrinho.getQtdeItems(), "A quantidade de itens deve ser 0 após esvaziar o carrinho");
        assertEquals(0.0, carrinho.getValorTotal(), "O valor total deve ser 0.0 após esvaziar o carrinho");
    }
}
