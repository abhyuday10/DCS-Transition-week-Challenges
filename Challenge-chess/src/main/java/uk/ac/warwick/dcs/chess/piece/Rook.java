package uk.ac.warwick.dcs.chess.piece;

import uk.ac.warwick.dcs.chess.*;

public class Rook extends ChessPiece {
    private static final long serialVersionUID = 1L;

    public Rook(Board board, boolean isWhite, int vertical, int horizontal) {
        super(board, isWhite, (char) ((int) ChessIcons.W_ROOK + (isWhite ? 0 : 6)), vertical, horizontal);
    }

    @Override
    public Move[] getAvailableMoves() {
        availableMoves.clear();

        for (int i = horizontal - 1; i >= 0; --i) {
            ChessPiece piece = (board.pieceAtLocation(vertical, i));

            if (piece == null) {
                availableMoves.add(new Move(this, vertical, i, false));
            }

            else {
                if (piece.isWhite != isWhite) {
                    availableMoves.add(new Move(this, vertical, i, true));
                }

                break;
            }
        }

        for (int i = horizontal + 1; i < 8; ++i) {
            ChessPiece piece = (board.pieceAtLocation(vertical, i));

            if (piece == null) {
                availableMoves.add(new Move(this, vertical, i, false));
            }

            else {
                if (piece.isWhite != isWhite) {
                    availableMoves.add(new Move(this, vertical, i, true));
                }

                break;
            }
        }

        for (int i = vertical - 1; i >= 0; --i) {
            ChessPiece piece = (board.pieceAtLocation(i, horizontal));

            if (piece == null) {
                availableMoves.add(new Move(this, i, horizontal, false));
            }

            else {
                if (piece.isWhite != isWhite) {
                    availableMoves.add(new Move(this, i, horizontal, true));
                }

                break;
            }
        }

        for (int i = vertical + 1; i < 8; ++i) {
            ChessPiece piece = (board.pieceAtLocation(i, horizontal));

            if (piece == null) {
                availableMoves.add(new Move(this, i, horizontal, false));
            }

            else {
                if (piece.isWhite != isWhite) {
                    availableMoves.add(new Move(this, i, horizontal, true));
                }

                break;
            }
        }

        return availableMoves.movesToArray();
    }

}