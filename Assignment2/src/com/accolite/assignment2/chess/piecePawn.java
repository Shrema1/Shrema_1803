/**
 * 
 */
package com.accolite.assignment2.chess;

/**
 * @author Shrema Singh
 *
 */
public class piecePawn extends ChessPiece {
	public piecePawn(int x,int y,boolean b)
	{
		this.x=x;
		this.y=y;
		this.statusOfPiece=b;
	}
	public chessPosition nextMovement(int x,int y)
	{
		chessPosition Pos=new chessPosition();
		//compute next movement for pawn here
		return Pos;
		
	}
}
