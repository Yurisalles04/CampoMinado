package br.com.cod3er.cm.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class aaa {
	private Tabuleiro tabuleiro;

	@BeforeEach
	void setUp() {
		tabuleiro = new Tabuleiro(5, 5, 5); // Exemplo com tabuleiro 5x5 e 5 minas
	}

	@Test
	void testAbrirCampo() {
		// Abre um campo específico
		tabuleiro.abrir(0, 0);
		// Verifica se o campo foi aberto
		assertTrue(tabuleiro.objetivoAlcancado());
	}

	@Test
	void testAlternarMarcacao() {
		// Alterna a marcação de um campo específico
		tabuleiro.alternarMarcacao(0, 0);
		// Verifica se o campo está marcado
		assertTrue(tabuleiro.toString().contains("X"));
	}

	@Test
	void testObjetivoAlcancadoComMinas() {
		// Abre todos os campos, incluindo os minados
		for (int l = 0; l < 5; l++) {
			for (int c = 0; c < 5; c++) {
				tabuleiro.abrir(l, c);
			}
		}
		// Verifica se o objetivo não foi alcançado devido às minas
		assertFalse(tabuleiro.objetivoAlcancado());
	}

	@Test
	void testReiniciar() {
		// Realiza alguma ação (marcação, abertura, etc.)
		tabuleiro.alternarMarcacao(0, 0);
		// Reinicia o tabuleiro
		tabuleiro.reiniciar();
		// Verifica se o tabuleiro foi reiniciado corretamente (campos fechados e sem
		// marcações)
		assertTrue(tabuleiro.toString().contains(" ? "));
	}
}
// Adicione mais testes conforme necessário
