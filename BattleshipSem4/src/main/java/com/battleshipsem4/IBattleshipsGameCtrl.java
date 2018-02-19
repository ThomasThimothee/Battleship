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
public interface IBattleshipsGameCtrl {
    
    public int playGame(IBattleshipsPlayer p1, IBattleshipsPlayer p2, IShip[] ships);

}
