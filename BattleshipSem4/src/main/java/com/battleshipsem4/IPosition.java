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
public interface IPosition {
    
    public int getValue(); // 1 for ship, 0 for nothing
    public void setValue(int value); //  
    public int getRow();
    public int getColumn();
    
}
