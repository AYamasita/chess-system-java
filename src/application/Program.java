package application;

import java.util.Scanner;


import chess.ChessMatch;
import chess.ChessPiece;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPieces());		
		
		
	sc.close();

	}

}
