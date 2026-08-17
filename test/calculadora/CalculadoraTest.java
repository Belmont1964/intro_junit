/*

package calculadora;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Classe para teste da calculadora")
public class CalculadoraTest {
	
	private Calculadora calc;
	
	@BeforeEach
	public void inicializa() {
		calc = new Calculadora();
	}
	
	@DisplayName("Testa a soma de dois n�meros")
	@Test
	public void testSomaDoisNumeros() {
		int soma = calc.soma(4, 5);		
		Assertions.assertEquals(9, soma);		
	}
	
	@Test
	public void testDivisaoDoisNumeros() {
		int divisao = calc.divisao(8, 4);
		assertTrue(divisao == 2);
	}
	
	@Test
	public void testDivisaoPorZero() {
		try {
			int divisao = calc.divisao(8, 0);
			fail("Exce��o n�o lan�ada");
		}catch (ArithmeticException e) {
			assertEquals("/ by zero", e.getMessage());
		}		
	}
	
	@Test
	public void testDivisaoPorZeroComAssertThrows() {
		assertThrows(ArithmeticException.class,
				() -> calc.divisao(8, 0));
	}
	
	@Test
	public void testePositivoNegativo() {
		calc = new Calculadora();
		int check = calc.compara(4, 5);
		Assertions.assertEquals(check, -1);	
	}
	
	@Test
	public void testeSomatoria() {
		int check = calc.somatoria(5);
		Assertions.assertEquals(15, check);
	}

}
*/

/*  GERADO POR IA */

 package calculadora;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    private Calculadora calculadora;

    @BeforeEach
    void setUp() {
        // Inicializa a calculadora antes de cada teste
        calculadora = new Calculadora();
    }

    @Test
    @DisplayName("Deve somar dois números corretamente")
    void testSoma() {
        assertEquals(5, calculadora.soma(2, 3), "2 + 3 deve ser 5");
        assertEquals(-1, calculadora.soma(2, -3), "2 + (-3) deve ser -1");
        assertEquals(0, calculadora.soma(0, 0), "0 + 0 deve ser 0");
    }

    @Test
    @DisplayName("Deve subtrair dois números corretamente")
    void testSubtracao() {
        assertEquals(2, calculadora.subtracao(5, 3), "5 - 3 deve ser 2");
        assertEquals(5, calculadora.subtracao(2, -3), "2 - (-3) deve ser 5");
        assertEquals(-2, calculadora.subtracao(3, 5), "3 - 5 deve ser -2");
    }

    @Test
    @DisplayName("Deve multiplicar dois números corretamente")
    void testMultiplicacao() {
        assertEquals(15, calculadora.multiplicacao(3, 5), "3 * 5 deve ser 15");
        assertEquals(-15, calculadora.multiplicacao(3, -5), "3 * (-5) deve ser -15");
        assertEquals(0, calculadora.multiplicacao(3, 0), "Qualquer número multiplicado por 0 deve ser 0");
    }

    @Test
    @DisplayName("Deve dividir dois números corretamente")
    void testDivisao() {
        assertEquals(2, calculadora.divisao(6, 3), "6 / 3 deve ser 2");
        assertEquals(-2, calculadora.divisao(6, -3), "6 / -3 deve ser -2");
    }

    @Test
    @DisplayName("Deve lançar ArithmeticException ao tentar dividir por zero")
    void testDivisaoPorZero() {
        assertThrows(ArithmeticException.class, () -> calculadora.divisao(5, 0), "Divisão por zero deve lançar exceção");
    }

    @Test
    @DisplayName("Deve calcular a somatória de 0 até n corretamente")
    void testSomatoria() {
        assertEquals(15, calculadora.somatoria(5), "A somatória de 0 a 5 deve ser 15 (5+4+3+2+1+0)");
        assertEquals(0, calculadora.somatoria(0), "A somatória de 0 deve ser 0");
        assertEquals(0, calculadora.somatoria(-5), "Para números negativos, a condição do while falha e deve retornar 0");
    }

    @Test
    @DisplayName("Deve verificar se um número é positivo corretamente")
    void testEhPositivo() {
        assertTrue(calculadora.ehPositivo(5), "5 é positivo (>= 0)");
        assertTrue(calculadora.ehPositivo(0), "0 é considerado positivo (>= 0) segundo a lógica do método");
        assertFalse(calculadora.ehPositivo(-1), "-1 não é positivo");
    }

    @Test
    @DisplayName("Deve comparar dois números corretamente")
    void testCompara() {
        assertEquals(0, calculadora.compara(5, 5), "Deve retornar 0 quando a == b");
        assertEquals(1, calculadora.compara(6, 5), "Deve retornar 1 quando a > b");
        assertEquals(-1, calculadora.compara(4, 5), "Deve retornar -1 quando a < b");
    }
}


