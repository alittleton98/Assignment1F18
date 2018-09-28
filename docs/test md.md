Andrew Littleton/Tyler Nguyen
9/19/
COMP 330-Software Engineering
TicTacToe Documentation [VERSION 1. 5 ]

GitHub Repository

Introduction
1.1. Purpose
The purpose of this document is to provide necessary information between developers
and product coordinators that may happen to work on this software
Description
2.1. Product
The intended product is a computer simulated Tic Tac Toe board game. It will remain a
simple 3x3 playing grid that the user will either place an X or an O on depending on who
began the game. The game will declare a winner and reset the playing space, so the user
does not have to reopen the program for every game.
2.2. Intended Users
The intended user of the game will be those who enjoy tic tac toe but would like to play it
on the computer and not have to find a disposable playing surface
2.3. Operating Environment
The game will operate on any computer capable of opening programs with the “.java”
extension. The system must have the Java Runtime Environment version 7 or higher to
adequately run the game. The program will not demand any more memory than normal
system functions, so the hardware demands are negligible as the computer should be able
to run the game so long as the computer functions normally
Features
3.1. Current
3.1.1. 2 Player mode
3.1.2. Automatic reset
3.2. Planned
3.2.1. AI opponent with varying difficulty
3.2.2. Graceful exit from within Game
Requirements
4.1. User Interfaces
The user must be able to click on the game board using a mouse to select where the game
piece will be placed
4.2. Computer Interfaces
The computer must be connected to a monitor or visual output device, so the player can
view the game and proceed to interact with it
4.3. Development Requirements
4.3.1. Game must open a 3x3 board with clickable buttons for each game piece
4.3.2. Game must declare either player a winner or declare a tie
4.3.3. Game must announce the current player’s turn
4.3.4. Game should be able to gracefully reset the playing space
Andrew Littleton/Tyler Nguyen
9/19/
COMP 330-Software Engineering

Nonfunctional Requirements
5.1. Performance
5.1.1. AI Response: The response time for the AI should be rather immediate after the
players action
5.1.2. Victory Checks: The victory should not have to be declared once the board is full
but once the victor has already met the winning conditions
