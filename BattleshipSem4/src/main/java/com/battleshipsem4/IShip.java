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
public interface IShip {
    
    public int getLen(); // Ship len = len of the positions[]
    public IPosition[] getPositions();
    public void sePositions(IPosition[] positions);
    
}
