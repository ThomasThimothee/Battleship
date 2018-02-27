/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.battleshipsem4.impl;

import com.battleshipsem4.IBattleshipsBoard;
import com.battleshipsem4.IBattleshipsGameCtrl;
import com.battleshipsem4.IBattleshipsPlayer;
import com.battleshipsem4.IPosition;
import com.battleshipsem4.IShip;

/**
 *
 * @author thomasthimothee
 */
public class BattleshipsGameCtrlImpl implements IBattleshipsGameCtrl {

    @Override
    public int playSingleGame(IBattleshipsPlayer p1, IBattleshipsPlayer p2, IShip[] ships) {
        p1.startNewGame(1);
        p2.startNewGame(2);
        boolean gameOver;
        int winner;

        IBattleshipsBoard b1 = p1.placeShips(ships);
        IBattleshipsBoard b2 = p1.placeShips(ships);

        while (true) {
            IPosition pos = p1.takeTurn();
            p2.incomingShot(pos);
            int result = b2.feedbackShot(pos);
            p1.receiveFeedback(result);
            gameOver = b2.areAllShipsSunk();

            if (gameOver) {
                winner = 1;
                break;
            }

            pos = p2.takeTurn();
            p1.incomingShot(pos);
            result = b1.feedbackShot(pos);
            p2.receiveFeedback(result);
            gameOver = b1.areAllShipsSunk();

            if (gameOver) {
                winner = 2;
                break;
            }
        }
        p1.endGame(winner);
        p2.endGame(winner);
        return winner;

    }

    @Override
    public IBattleshipsPlayer[] playTournament(IBattleshipsPlayer[] players) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
