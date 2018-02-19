/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.battleshipsem4.impl;

import com.battleshipsem4.IPosition;

/**
 *
 * @author thomasthimothee
 */
public class PositionImpl implements IPosition {

    int row;
    int column;
    int value;

    public PositionImpl(int row, int column, int value) {
        this.row = row;
        this.column = column;
        this.value = value;
    }

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public int getRow() {
        return row;
    }

    @Override
    public int getColumn() {
        return column;
    }

}
