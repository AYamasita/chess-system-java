package boardgame;

public abstract class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece()
	{		
	}

	public Piece(Board board) {	
		this.board = board;
		position = null;
	}

	protected Board getBoard() {
		return board;
	}
	
	public abstract boolean[][] possibleMoves();
	
	
	public boolean possibleMove(Position position)
	{
		
		//Realizando um hook metodos.. uma metodo concreto utilizando um metodo abstrato.-> Padrão de Projeto -> Template Method
		return possibleMoves()[position.getRow()][position.getColumn()];
	}
	
	//verifica se existe movimento possivel em relação a peça
	public boolean isThereAnyPossibleMove()
	{
		boolean[][] mat = possibleMoves();
		for(int i=0; i < mat.length;i++)
		{
			for(int j=0; j < mat[i].length;j++)
			{
				if(mat[i][j] )
				{return true;}
					
			}
		}
		return false;
	}
		
	
	
	
}
