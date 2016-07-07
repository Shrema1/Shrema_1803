/**
 * 
 */
package com.accolite.assignment2.chess;

/**
 * @author Shrema Singh
 *
 */
public abstract class ChessPiece {
	public boolean statusOfPiece;
	public int x;
	public int y;
	public boolean isPieceActive() {
		return statusOfPiece;
	}
	public void setStatusOfPiece(boolean statusOfPiece) {
		this.statusOfPiece = statusOfPiece;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public boolean isValidPosition(int initXPosition,int initYPosition,int finalXPosition,int finalYPosition)
	{
		boolean x=false;
		//we have to check if the position is valid or not by giving conditions
		return x;
		
	}
	//define movement for each piece here
 public abstract chessPosition nextMovement(int x,int y);
 
}
