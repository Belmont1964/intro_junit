package jokempo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
	
	private Main jogada;
	private int jogador1;
    private int jogador2;
	
	@BeforeEach
    void setUp() {
		// Inicializa a jogada antes de cada teste
        jogada = new Main();        
	}
	
	@Test
	@DisplayName ("teste papel x pedra")
	void testePapelxPedra() {
		jogador1 = 1;
		jogador2 = 2;
		assertEquals(1, jogada.jogar(jogador1, jogador2));
	}
	
	@Test
	@DisplayName ("teste pedra x tesoura")
	void testePedraxTesoura() {
		jogador1 = 2;
		jogador2 = 3;
		assertEquals(1, jogada.jogar(jogador1, jogador2));
	}
	
	@Test
	@DisplayName ("teste tesoura x papel")
	void testeTesouraxPapel() {
		jogador1 = 3;
		jogador2 = 1;
		assertEquals(1, jogada.jogar(jogador1, jogador2));
	}
	
	@Test
	@DisplayName ("teste tesoura x pedra")
	void testeTesouraxPedra() {
		jogador1 = 3;
		jogador2 = 2;
		assertEquals(2, jogada.jogar(jogador1, jogador2));
	}
	
	@Test
	@DisplayName ("teste pedra x papel")
	void testePedraxPapel() {
		jogador1 = 2;
		jogador2 = 1;
		assertEquals(2, jogada.jogar(jogador1, jogador2));
	}
	
	@Test
	@DisplayName ("teste papel x tesoura")
	void testePapelxTesoura() {
		jogador1 = 1;
		jogador2 = 3;
		assertEquals(2, jogada.jogar(jogador1, jogador2));
	}
	
	@Test
	@DisplayName ("teste empate")
	void testeEmpate() {
		jogador1 = 1;
		jogador2 = 1;
		assertEquals(0, jogada.jogar(jogador1, jogador2));
		jogador1 = 2;
		jogador2 = 2;
		assertEquals(0, jogada.jogar(jogador1, jogador2));
		jogador1 = 3;
		jogador2 = 3;
		assertEquals(0, jogada.jogar(jogador1, jogador2));
		
	}
	
	@Test
	@DisplayName ("jogada inválida")
	void testeEscolhaInválida() {
		jogador1 = 0;
		jogador2 = 3;
		assertEquals(-1, jogada.jogar(jogador1, jogador2));
		jogador1 = -1;
		jogador2 = 3;
		assertEquals(-1, jogada.jogar(jogador1, jogador2));
		jogador1 = 0;
		jogador2 = 4;
		assertEquals(-1, jogada.jogar(jogador1, jogador2));
		jogador1 = 1;
		jogador2 = 0;
		assertEquals(-1, jogada.jogar(jogador1, jogador2));
	}

}
