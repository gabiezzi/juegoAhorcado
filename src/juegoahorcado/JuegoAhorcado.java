/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegoahorcado;

import juegoahorcado.entities.Ahorcado;
import juegoahorcado.services.ServicioAhorcado;

/**
 *
 * @author ati
 */
public class JuegoAhorcado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ServicioAhorcado newService = new ServicioAhorcado();
        
        Ahorcado newAhorcado = newService.comenzarJuego();

        newService.juego(newAhorcado);
    }
    
}
