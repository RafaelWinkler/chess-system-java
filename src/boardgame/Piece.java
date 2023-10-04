package boardgame;

public class Piece {

    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
        position = null;
        // Por padrão o Java ja coloca null,
        // porém e só para deixar mais claro para leitura
    }

    protected Board getBoard() {
        return board;
    }


}
