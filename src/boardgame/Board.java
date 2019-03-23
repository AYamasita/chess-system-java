package boardgame;

public class Board {

	private int rows;
	private int columns;

	private Piece[][] pieces;

	public Board() {
	}

	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;

		pieces = new Piece[rows][columns]; // initialize board
	}

	public int getRows() {
		return rows;
	}
	
	public Piece piece(Integer row, Integer column) {
		return pieces[row][column];
	}
	
	public Piece piece(Position position) {
		return pieces[position.getRow()][position.getColumn()];
	}
	

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}
	
	//coloca peça no tabuleiro
	public void placePiece(Piece piece, Position position)
	{
		//matriz de pecas
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position; //retira a peça da posição nula
		
	}

}
