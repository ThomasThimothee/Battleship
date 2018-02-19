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
public interface IBattleshipsBoard {
    
    public int feedbackShot(IPosition pos); // return 0 for miss, 1 for hit, 2 for sunk
    public boolean areAllShipsSunk(); // return true if all the ships have been sunk
    public IShip[] getShips();
}
