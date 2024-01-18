package br.com.cod3er.cm.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.cod3er.cm.modelo.Tabuleiro;
import br.com.cod3er.cm.visao.TabuleiroConsole;

public class TabuleiroConsoleTest {

    public static void main(String[] args) {
        testarExecutarJogo();
        // Adicione mais testes conforme necessário
    }

    private static void testarExecutarJogo() {
        // Teste 1: Criar um jogo e ganhá-lo imediatamente
        Tabuleiro tabuleiro1 = new Tabuleiro(3, 3, 1);
        TabuleiroConsole tabuleiroConsole1 = new TabuleiroConsole(tabuleiro1);

        // Saída esperada: "Você ganhou"
        // Certifique-se de que o programa termina corretamente após a vitória
        // Insira as coordenadas de uma célula sem bomba quando solicitado

        // Teste 2: Criar um jogo e perder imediatamente
        Tabuleiro tabuleiro2 = new Tabuleiro(3, 3, 1);
        TabuleiroConsole tabuleiroConsole2 = new TabuleiroConsole(tabuleiro2);

        // Saída esperada: "Você perdeu"
        // Certifique-se de que o programa termina corretamente após a perda
        // Insira as coordenadas de uma célula com bomba quando solicitado

        // Teste 3: Criar um jogo e sair imediatamente
        Tabuleiro tabuleiro3 = new Tabuleiro(3, 3, 1);
        TabuleiroConsole tabuleiroConsole3 = new TabuleiroConsole(tabuleiro3);

        // Saída esperada: "Tchau"
        // Insira "Sair" quando solicitado

        // Teste 4: Criar um jogo e interagir normalmente até escolher sair
        Tabuleiro tabuleiro4 = new Tabuleiro(3, 3, 1);
        TabuleiroConsole tabuleiroConsole4 = new TabuleiroConsole(tabuleiro4);

        // Saída esperada: "Tchau"
        // Insira jogadas normais e, em seguida, insira "Sair" quando solicitado
    }
    
    // Adicione mais métodos de teste conforme necessário
}
