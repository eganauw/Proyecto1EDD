/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1edd;

/**
 *
 * @author rodri
 */
public class RelationsList {
    public User inicial;
    public Destino destino;
    public RelationsList pnext;
    public int size;
    
    public RelationsList(User inicial, Destino destino){
        this.inicial = inicial;
        this.destino = destino;
        this.size = 0;
    }


    public boolean isEmpty(){
        return this.getInicial() == null;
    }
    
    public void insertdestino (Destino nuevodestino){
          Destino aux = destino;
          while(aux.pnext!=null){
              aux = aux.pnext;
          
          }aux.setPnext(nuevodestino);
    }
    public void print(){
        Destino aux = destino;
        String idinicial = Integer.toString(this.inicial.number);
         String datos = idinicial +",";
         while(aux!=null){
        String iddestino = Integer.toString(aux.usuariodestino.number);
        String peso = Integer.toString(aux.peso);
        datos += "Destino:"+ iddestino+", "+"Peso:"+peso+",";
        aux = aux.pnext;
         }
        System.out.println(datos);
        }
    
    public void eliminardestino(String usuarioaeliminar){
        
    }

   
    public User getInicial() {
        return inicial;
    }

    /**
     * @param inicial the inicial to set
     */
    public void setInicial(User inicial) {
        this.inicial = inicial;
    }
    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * @return the pnext
     */
    public RelationsList getPnext() {
        return pnext;
    }

    /**
     * @param pnext the pnext to set
     */
    public void setPnext(RelationsList pnext) {
        this.pnext = pnext;
    }

    /**
     * @return the destino
     */
    public Destino getDestino() {
        return destino;
    }

    /**
     * @param destino the destino to set
     */
    public void setDestino(Destino destino) {
        this.destino = destino;
    }
}
