/**
 * 
 */
package com.accolite.assignment2.chess;

/**
 * @author Shrema Singh
 *
 */
public class chessPosition {
	int x;
	int y;
	ChessPiece piece;
// to check if empty position
	public boolean isPositionEmpty(chessPosition p)
	{
		if(p.piece==null)
			return true;
		else
			return false;
	}
	//to move to a position
	public void occupyPosition(ChessPiece piece,int xPositionToBeOccupied,int yPositionToBeOccupied)
	{
		/*if(isPositionEmpty)
		piece.x=xPositionToBeOccupied;
		piece.y=yPositionToBeOccupied;
		piece.statusOfPiece=true;
		chessPosition poss=new chessPosition();
		poss.piece=piece;
		poss.x=xPositionToBeOccupied;
		poss.y=yPositionToBeOccupied;
		*/
	}
}
