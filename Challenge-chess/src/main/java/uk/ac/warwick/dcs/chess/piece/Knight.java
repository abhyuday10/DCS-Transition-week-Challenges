package uk.ac.warwick.dcs.chess.piece;

import uk.ac.warwick.dcs.chess.*;

public class Knight extends ChessPiece {
    private static final long serialVersionUID = 1L;

    public Knight(Board board, boolean isWhite, int vertical, int horizontal) {
        super(board, isWhite, (char) ((int) ChessIcons.W_KNIGHT + (isWhite ? 0 : 6)), vertical, horizontal);
    }

    @Override
    public Move[] getAvailableMoves() {
        availableMoves.clear();

        if (vertical + 2 < 8) {
            int j = vertical + 2;

            if (horizontal - 1 >= 0) {
                int i = horizontal - 1;
                ChessPiece piece = board.pieceAtLocation(j, i);

                if (piece == null) {
                    availableMoves.add(new Move(this, j, i, false));
                }

                else if (piece.isWhite != isWhite) {
                    availableMoves.add(new Move(this, j, i, true));
                }
            }

            if (horizontal + 1 < 8) {
                int i = horizontal + 1;
                ChessPiece piece = board.pieceAtLocation(j, i);

                if (piece == null) {
                    availableMoves.add(new Move(this, j, i, false));
                }

                else if (piece.isWhite != isWhite) {
                    availableMoves.add(new Move(this, j, i, true));
                }
            }
        }

        if (vertical - 2 >= 0) {
            int j = vertical - 2;

            if (horizontal - 1 >= 0) {
                int i = horizontal - 1;
                ChessPiece piece = board.pieceAtLocation(j, i);

                if (piece == null) {
                    availableMoves.add(new Move(this, j, i, false));
                }

                else if (piece.isWhite != isWhite) {
                    availableMoves.add(new Move(this, j, i, true));
                }
            }

            if (horizontal + 1 < 8) {
                int i = horizontal + 1;
                ChessPiece piece = board.pieceAtLocation(j, i);

                if (piece == null) {
                    availableMoves.add(new Move(this, j, i, false));
                }

                else if (piece.isWhite != isWhite) {
                    availableMoves.add(new Move(this, j, i, true));
                }
            }
        }

        if (horizontal + 2 < 8) {
            int i = horizontal + 2;

            if (vertical - 1 >= 0) {
                int j = vertical - 1;
                ChessPiece piece = board.pieceAtLocation(j, i);

                if (piece == null) {
                    availableMoves.add(new Move(this, j, i, false));
                }

                else if (piece.isWhite != isWhite) {
                    availableMoves.add(new Move(this, j, i, true));
                }
            }

            if (vertical + 1 < 8) {
                int j = vertical + 1;
                ChessPiece piece = board.pieceAtLocation(j, i);

                if (piece == null) {
                    availableMoves.add(new Move(this, j, i, false));
                }

                else if (piece.isWhite != isWhite) {
                    availableMoves.add(new Move(this, j, i, true));
                }
            }
        }

        if (horizontal - 2 >= 0) {
            int i = horizontal - 2;

            if (vertical - 1 >= 0) {
                int j = vertical - 1;
                ChessPiece piece = board.pieceAtLocation(j, i);

                if (piece == null) {
                    availableMoves.add(new Move(this, j, i, false));
                }

                else if (piece.isWhite != isWhite) {
                    availableMoves.add(new Move(this, j, i, true));
                }
            }

            if (vertical + 1 < 8) {
                int j = vertical + 1;
                ChessPiece piece = board.pieceAtLocation(j, i);

                if (piece == null) {
                    availableMoves.add(new Move(this, j, i, false));
                }

                else if (piece.isWhite != isWhite) {
                    availableMoves.add(new Move(this, j, i, true));
                }
            }
        }

        return availableMoves.movesToArray();
    }

}