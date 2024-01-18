package br.com.cod3er.cm.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.cod3er.cm.excecao.ExplosaoException;

public class CampoTest {
	private Campo campo;
	
	@BeforeEach
	void iniciarCampo() {
		campo = new Campo(3, 3);
	}
	@Test
	void testeVizinhoDistancia1Esquerda() {
		Campo vizinho = new Campo(3, 2);
		 boolean resultado  = campo.adicionarVizinho(vizinho);
		 assertTrue(resultado);
		
	}
	@Test
	void testeVizinhoDistancia1Direita() {
		Campo vizinho = new Campo(3, 4);
		 boolean resultado  = campo.adicionarVizinho(vizinho);
		 assertTrue(resultado);
		
	}
	@Test
	void testeVizinhoDistancia1EmCima() {
		Campo vizinho = new Campo(2, 3);
		 boolean resultado  = campo.adicionarVizinho(vizinho);
		 assertTrue(resultado);
		
	}
	@Test
	void testeVizinhoDistancia1EmBaixo() {
		Campo vizinho = new Campo(4, 3);
		 boolean resultado  = campo.adicionarVizinho(vizinho);
		 assertTrue(resultado);
		
	}
	@Test
	void testeVizinhoDistancia2() {
		Campo vizinho = new Campo(2, 2);
		 boolean resultado  = campo.adicionarVizinho(vizinho);
		 assertTrue(resultado);
		
	}
	
	@Test
	void testeNaoVizinho() {
		Campo vizinho = new Campo(1, 1);
		 boolean resultado  = campo.adicionarVizinho(vizinho);
		 assertFalse(resultado);
		
	}
	@Test
	void testeValorPadraoAtributoMarcado() {
		assertFalse(campo.isMarcado());
	}
	
	@Test
	void testeAlternarMarcacao() {
		campo.alternarMarcacao();
		assertTrue(campo.isMarcado());
	}
	
	@Test
	void testeAlternarMarcacaoDuaschamadas() {
		campo.alternarMarcacao();
		campo.alternarMarcacao();
		assertFalse(campo.isMarcado());
	}
	
	@Test
	void testeAbrirNaoMinadoNaoMarcado() {
		
		assertTrue(campo.abrir());
	}
	
	@Test
	void testeAbrirNaoMinadoMarcado() {
		campo.alternarMarcacao();
		assertFalse(campo.abrir());
	}
	
	@Test
	void testeAbrirMinadoMarcado() {
		campo.alternarMarcacao();
		campo.minar();
		assertFalse(campo.abrir());
	}
	
	@Test
	void testeAbrirMinadoNaoMarcado() {
		campo.minar();
		assertThrows(ExplosaoException.class, () -> {
			campo.abrir();
		});
	}
	
	@Test
	void testeAbrirComVizinhos() {
		Campo campo11 = new Campo (1, 1);
		
		Campo campo22 = new Campo(2, 2);
		campo22.adicionarVizinho(campo11);
		
		campo.adicionarVizinho(campo22);
		
		campo.abrir();
		assertTrue(campo22.isAberto() && campo11.isAberto());
	}
	
	@Test
	void testeAbrirComVizinhos2() {
		Campo campo11 = new Campo (1, 1);
		
		Campo campo12 = new Campo(1, 1);
		campo12.minar();
		
		Campo campo22 = new Campo(2, 2);
		campo22.adicionarVizinho(campo11);
		campo22.adicionarVizinho(campo12);
		
		campo.adicionarVizinho(campo22);
		
		campo.abrir();
		assertTrue(campo22.isAberto() && campo11.isFechado());
	}
	
	@Test
    void testObjetivoAlcancadoDesvendado() {
        campo.abrir();
        assertTrue(campo.objetivoAlcancado());
    }

    @Test
    void testObjetivoAlcancadoProtegido() {
        campo.alternarMarcacao();
        assertTrue(campo.objetivoAlcancado());
    }

    @Test
    void testObjetivoAlcancadoNaoAlcancado() {
        assertFalse(campo.objetivoAlcancado());
    }

    // Teste para minasNaVizinhanca
    @Test
    void testMinasNaVizinhancaSemMinas() {
        assertEquals(0, campo.minasNaVizinhanca());
    }

    @Test
    void testMinasNaVizinhancaComMinas() {
        Campo vizinho1 = new Campo(3, 2);
        Campo vizinho2 = new Campo(2, 3);
        vizinho1.minar();
        vizinho2.minar();
        campo.adicionarVizinho(vizinho1);
        campo.adicionarVizinho(vizinho2);
        assertEquals(2, campo.minasNaVizinhanca());
    }

    // Teste para toString
    @Test
    void testToStringMarcado() {
        campo.alternarMarcacao();
        assertEquals("X", campo.toString());
    }

    @Test
    void testToStringAbertoMinado() {
        campo.abrir();
        campo.minar();
        assertEquals("*", campo.toString());
    }

    @Test
    void testToStringAbertoComMinasNaVizinhanca() {
        Campo vizinho1 = new Campo(3, 2);
        Campo vizinho2 = new Campo(2, 3);
        vizinho1.minar();
        vizinho2.minar();
        campo.adicionarVizinho(vizinho1);
        campo.adicionarVizinho(vizinho2);
        campo.abrir();
        assertEquals("2", campo.toString());
    }

    @Test
    void testToStringAbertoSemMinasNaVizinhanca() {
        campo.abrir();
        assertEquals(" ", campo.toString());
    }

    @Test
    void testToStringFechado() {
        assertEquals(" ? ", campo.toString());
    }
	

}
