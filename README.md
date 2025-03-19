Campo Minado - Projeto Java

Este é um projeto em Java que simula o clássico jogo Campo Minado. O objetivo do jogo é revelar todas as células de uma grade sem tocar em uma mina. O jogador deve usar as dicas fornecidas pelas células reveladas para evitar minas e revelar o restante do campo com sucesso.

Funcionalidades
O jogo Campo Minado apresenta as seguintes funcionalidades principais:

Criação de Tabuleiro
O tabuleiro do jogo é composto por uma grade de células, onde algumas células contêm minas e outras fornecem dicas numéricas. As dicas indicam quantas minas estão nas células adjacentes.

Jogo Interativo
O jogador pode clicar em células para revelá-las. Caso o jogador revele uma mina, o jogo acaba. Caso o jogador revele todas as células seguras, ele vence.

Marcação de Minas
O jogador pode marcar células com bandeiras, caso ache que elas contêm minas. Essa funcionalidade ajuda a evitar toques acidentais nas minas.

Vencer ou Perder
O jogador vence ao revelar todas as células seguras. O jogo termina em derrota se uma célula com mina for revelada.

Estrutura do Projeto
O projeto consiste em várias classes para organizar o funcionamento do jogo:

CampoMinado: Classe principal que gerencia o tabuleiro e as interações do jogador.
Tabuleiro: Representa o campo de jogo, contendo as células, minas e lógica para cálculo das células adjacentes.
Célula: Representa uma célula do campo minado, que pode estar oculta, revelada ou marcada como bandeira.
Jogo: Lógica que gerencia o estado do jogo, incluindo verificação de vitória e derrota.
Como Jogar
O jogo é baseado em texto, onde o jogador interage através do terminal ou console. O objetivo é revelar todas as células sem tocar nas minas. Quando o jogo começa, o tabuleiro é gerado com um número fixo de minas espalhadas aleatoriamente.

Jogar no Console
Iniciar o Jogo:
O jogo começa com a criação de um campo minado com uma quantidade específica de minas e células vazias. O jogador escolhe uma célula para revelar e pode marcar células suspeitas como minas.

Revelar Células:
O jogador escolhe coordenadas (linha e coluna) para revelar uma célula. Se a célula contiver uma mina, o jogo termina com derrota. Caso contrário, o número de minas ao redor será mostrado na célula.

Marcar Células com Bandeira:
O jogador pode marcar uma célula com uma bandeira para indicar que acredita que a célula contém uma mina. Isso ajuda a evitar erros ao clicar.

Vencer:
O jogo é vencido quando todas as células seguras são reveladas sem que uma mina tenha sido tocada.

Exemplo de Jogo no Console
java
Copiar
Sistema de Tabuleiro:
- '1' representa uma célula com 1 mina ao redor.
- '0' representa uma célula segura sem minas ao redor.
- '*' representa uma mina.

1 1 * 0
0 * 1 0
1 1 0 *
O jogador pode interagir com esse campo e o jogo irá fornecer as opções de escolha para revelar e marcar células.
