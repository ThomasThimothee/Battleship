/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.battleshipsem4.impl;

import com.battleshipsem4.IPosition;
import com.battleshipsem4.IShip;

/**
 *
 * @author thomasthimothee
 */
public class ShipImpl implements IShip {

    int len;
    PositionImpl[] positions;

    @Override
    public int getLen() {
        return len;
    }

    @Override
    public IPosition[] getPositions() {
        return positions;
    }

    @Override
    public void sePositions(IPosition[] positions) {
        this.positions = positions;
    }

}
