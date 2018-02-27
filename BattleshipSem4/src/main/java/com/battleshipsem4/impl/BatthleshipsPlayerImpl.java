/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.battleshipsem4.impl;

import com.battleshipsem4.IBattleshipsBoard;
import com.battleshipsem4.IBattleshipsPlayer;
import com.battleshipsem4.IPosition;
import com.battleshipsem4.IShip;

/**
 *
 * @author thomasthimothee
 */
public class BatthleshipsPlayerImpl implements IBattleshipsPlayer {

    int id;

    @Override
    public void startNewGame(int playerID) {
        this.id = playerID;
    }

    @Override
    public IBattleshipsBoard placeShips(IShip[] ships) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public IPosition takeTurn() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void receiveFeedback(int feedback) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void incomingShot(IPosition pos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void endGame(int result) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
