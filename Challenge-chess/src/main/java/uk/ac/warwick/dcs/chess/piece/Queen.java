package uk.ac.warwick.dcs.chess.piece;

import uk.ac.warwick.dcs.chess.*;

public class Queen extends ChessPiece {
    private static final long serialVersionUID = 1L;

    public Queen(Board board, boolean isWhite, int vertical, int horizontal) {
        super(board, isWhite, (char) ((int) ChessIcons.W_QUEEN + (isWhite ? 0 : 6)), vertical, horizontal);
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

        for (int i = horizontal - 1, j = vertical - 1; i >= 0 && j >= 0; --i, --j) {
            ChessPiece piece = (board.pieceAtLocation(j, i));

            if (piece == null) {
                availableMoves.add(new Move(this, j, i, false));
            }

            else {
                if (piece.isWhite != isWhite) {
                    availableMoves.add(new Move(this, j, i, true));
                }

                break;
            }
        }

        for (int i = horizontal + 1, j = vertical - 1; i < 8 && j >= 0; ++i, --j) {
            ChessPiece piece = (board.pieceAtLocation(j, i));

            if (piece == null) {
                availableMoves.add(new Move(this, j, i, false));
            }

            else {
                if (piece.isWhite != isWhite) {
                    availableMoves.add(new Move(this, j, i, true));
                }

                break;
            }
        }

        for (int i = horizontal + 1, j = vertical + 1; i < 8 && j < 8; ++i, ++j) {
            ChessPiece piece = (board.pieceAtLocation(j, i));

            if (piece == null) {
                availableMoves.add(new Move(this, j, i, false));
            }

            else {
                if (piece.isWhite != isWhite) {
                    availableMoves.add(new Move(this, j, i, true));
                }

                break;
            }
        }

        for (int i = horizontal - 1, j = vertical + 1; i >= 0 && j < 8; --i, ++j) {
            ChessPiece piece = (board.pieceAtLocation(j, i));

            if (piece == null) {
                availableMoves.add(new Move(this, j, i, false));
            }

            else {
                if (piece.isWhite != isWhite) {
                    availableMoves.add(new Move(this, j, i, true));
                }

                break;
            }
        }

        return availableMoves.movesToArray();
    }
}