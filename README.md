Minesweeper - Java Project

This is a Java project that simulates the classic Minesweeper game. The goal of the game is to reveal all the cells of a grid without touching a mine. The player must use the hints provided by the revealed cells to avoid mines and successfully reveal the rest of the field.

Features

The Minesweeper game includes the following main features:

Board Creation
The game board consists of a grid of cells, some containing mines and others providing numeric hints. The hints indicate how many mines are in the adjacent cells.

Interactive Gameplay
The player can click on cells to reveal them. If a mine is revealed, the game ends. If the player reveals all the safe cells, they win.

Mine Flagging
The player can mark cells with flags if they believe they contain mines. This functionality helps prevent accidental touches on mines.

Win or Lose
The player wins by revealing all the safe cells. The game ends in defeat if a cell with a mine is revealed.

Project Structure

The project consists of several classes to organize the game’s functionality:

CampoMinado: Main class that manages the board and player interactions.
Tabuleiro: Represents the game field, containing the cells, mines, and logic for calculating adjacent cells.
Célula: Represents a cell in the Minesweeper field, which can be hidden, revealed, or flagged.
Jogo: Logic that manages the game state, including victory and defeat checks.
How to Play

The game is text-based, where the player interacts through the terminal or console. The objective is to reveal all the cells without touching any mines. When the game starts, the board is generated with a fixed number of mines randomly spread out.

Playing in the Console

Start the Game
The game begins by creating a Minesweeper field with a specific number of mines and empty cells. The player chooses a cell to reveal and can mark suspicious cells as containing mines.

Reveal Cells
The player chooses coordinates (row and column) to reveal a cell. If the cell contains a mine, the game ends with a loss. Otherwise, the number of adjacent mines is shown in the cell.

Flagging Cells
The player can mark a cell with a flag to indicate that they believe the cell contains a mine. This helps avoid mistakes when clicking.

Win the Game
The game is won when all safe cells are revealed without touching a mine.

Example of a Game in the Console

java
Copiar
// Board System:
- '1' represents a cell with 1 mine around it.
- '0' represents a safe cell with no mines around it.
- '*' represents a mine.

1 1 * 0  
0 * 1 0  
1 1 0 *  
The player can interact with this field, and the game will provide options to choose cells to reveal and flag.
