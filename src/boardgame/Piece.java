package boardgame;

public abstract class Piece {

	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	protected Board getBoard() {
		return board;
	}
	
	// Operação de movimentos possíveis
	public abstract boolean[][] possibleMoves();
	
	// Operação de movimentos possíveis para determinada posição
	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];
	}
	
	// Operação que irá dizer se existe pelo menos um movimento possível para uma peça,
	// vai varrer a matriz para verificar se existe pelo menos uma posição verdadeira.
	public boolean isThereAnyPossibleMove() {
		boolean[][] mat = possibleMoves();
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				if (mat[i][j]) {
					return true;
				}
			}
		}
		return false;
	}
	
}
