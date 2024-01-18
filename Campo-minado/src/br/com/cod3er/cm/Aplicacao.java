package br.com.cod3er.cm;

import br.com.cod3er.cm.modelo.Tabuleiro;
import br.com.cod3er.cm.visao.TabuleiroConsole;

public class Aplicacao {

	public static void main(String[] args) {
		Tabuleiro tabuleiro = new Tabuleiro(5, 5, 3);
		new TabuleiroConsole(tabuleiro);
		
	}

}
