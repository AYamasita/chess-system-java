package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

public abstract class ChessPiece extends Piece{

	private Color color;
	private int moveCount;

	public ChessPiece()
	{
		super();
	}

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}
	
	public ChessPosition getChessPosition()
	{
		return ChessPosition.FromPosition(position);
	}
	
	protected boolean isThereOpponentPiece(Position position)
	{
		//downcasting de Piece -> ChessPiece
		ChessPiece p =  (ChessPiece) getBoard().piece(position);
		return p!= null && p.getColor() != color;		
	}	

	public Color getColor() {
		return color;
	}
	
	public int getMoveCount() {
		return moveCount;
	}
	
	public void increaseMoveCount()
	{
		moveCount++;
	}
	
	public void decreaseMoveCount()
	{
		moveCount--;
	}	
}
