/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegoahorcado.entities;

/**
 *
 * @author ati
 */
public class Ahorcado {
    
    String buscar [] ;
    
    private int cantLetras;
    
    private int letrasEncontradas;
    
    private int jugadasMax;
    
    private String a = "";

    public Ahorcado() {
        this.letrasEncontradas = 0;
         this.buscar = buscar = new String[this.cantLetras];
    }

    
    public Ahorcado(String[] buscar, int cantLetras, int jugadasMax) {
        this.buscar = buscar = new String[cantLetras];
        this.cantLetras = cantLetras;
        this.letrasEncontradas = 0;
        this.jugadasMax = jugadasMax;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public String[] getBuscar() {
        return buscar;
    }

    public void setBuscar(String[] buscar ) {
        this.buscar = buscar ;
    }

    public int getCantLetras() {
        return cantLetras;
    }

    public void setCantLetras(int cantLetras) {
        this.cantLetras = cantLetras;
    }

    public int getJugadasMax() {
        return jugadasMax;
    }

    public void setJugadasMax(int jugadasMax) {
        this.jugadasMax = jugadasMax;
    }

    @Override
    public String toString() {
        return "Ahorcado{" + "buscar=" + buscar + ", cantLetras=" + cantLetras + ", jugadasMax=" + jugadasMax + '}';
    }
    
    
    
    
}
