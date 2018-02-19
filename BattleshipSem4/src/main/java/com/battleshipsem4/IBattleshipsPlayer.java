/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.battleshipsem4;

/**
 *
 * @author thomasthimothee
 */
public interface IBattleshipsPlayer {
    
    public void startNewGame(int playerID);
    
    // ships passed down as argument have only length, player needs to fill up 
    // IPosition[] with value of 1 for each
    // plus need to check that ships are not off limit
    public IBattleshipsBoard placeShips(IShip[] ships); 

    public IPosition takeTurn(); //returns shot
    public void receiveFeedback(int feedback); // get feedback on previous shot 0 miss 1 hit 2 sunk
    public void endGame(int result);
    
}
