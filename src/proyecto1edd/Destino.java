/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1edd;

/**
 *
 * @author rodri
 */
public class Destino {
    public User usuariodestino;
    public Destino pnext;
    public int peso;
    
    public Destino(User destino,int peso){
        this.usuariodestino = destino;
        this.peso = peso;
    }

    /**
     * @return the destino
     */
    public User getDestino() {
        return usuariodestino;
    }

    /**
     * @param destino the destino to set
     */
    public void setDestino(User destino) {
        this.usuariodestino = destino;
    }

    /**
     * @return the peso
     */
    public int getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(int peso) {
        this.peso = peso;
    }

    /**
     * @return the pnext
     */
    public Destino getPnext() {
        return pnext;
    }

    /**
     * @param pnext the pnext to set
     */
    public void setPnext(Destino pnext) {
        this.pnext = pnext;
    }
    
}
