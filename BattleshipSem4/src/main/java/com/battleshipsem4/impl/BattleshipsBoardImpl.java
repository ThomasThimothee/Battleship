/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.battleshipsem4.impl;

import com.battleshipsem4.IBattleshipsBoard;
import com.battleshipsem4.IPosition;
import com.battleshipsem4.IShip;

/**
 *
 * @author thomasthimothee
 */
public class BattleshipsBoardImpl implements IBattleshipsBoard {

    IShip[] ships;

    public BattleshipsBoardImpl(IShip[] ships) {
        this.ships = ships;
    }

    @Override
    public int feedbackShot(IPosition position) {
        int result = 0;
        for (IShip ship : ships) {
            for (IPosition pos : ship.getPositions()) {
                if (pos.getRow() == position.getRow() && pos.getColumn() == position.getRow()) { // ship at the position shot
                    if (pos.getValue() == 0) { //already shot at this position scenario
                        return 0;
                    } else { // hit and maybe sunk scenario
                        pos.setValue(0);
                        if (isShipSunk(ship)) { // sunk
                            return 2; 
                        } else { // just a hit
                            return 1;
                        }
                    }
                }
            }
        }
        return result;
    }

    @Override
    public boolean areAllShipsSunk() {
        int stillAliveShips = 0;
        for (IShip ship : ships) {
            for (IPosition pos : ship.getPositions()) {
                stillAliveShips += pos.getValue();
            }
        }
        return (stillAliveShips == 0);
    }

    private Boolean isShipSunk(IShip ship) {
        int isShipSunk = 0;
        for (IPosition pos : ship.getPositions()) {
            isShipSunk += pos.getValue();
        }
        return (isShipSunk == 0);
    }

    @Override
    public IShip[] getShips() {
        return ships;
    }

}
