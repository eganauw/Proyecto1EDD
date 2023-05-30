/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1edd;

/**
 *
 * @author rodri
 */
public class UsersList {
    public User pFirst;
    public User pLast;
    public int size;
    
    public UsersList(){
        this.pFirst = null;
        this.pLast = null;
        this.size = 0;
    }

    /**
     * @return the pFirst
     */
    public User getpFirst() {
        return pFirst;
    }

    /**
     * @param pFirst the pFirst to set
     */
    public void setpFirst(User pFirst) {
        this.pFirst = pFirst;
    }

    /**
     * @return the pLast
     */
    public User getpLast() {
        return pLast;
    }

    /**
     * @param pLast the pLast to set
     */
    public void setpLast(User pLast) {
        this.pLast = pLast;
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
    
    public boolean isEmpty(){
        return this.pFirst == null;
    }
    
    public void insert(int number, String name){
        User nuevo = new User(number,name);
        if(isEmpty()){
            pFirst = nuevo;
            pLast = nuevo;
        }else{
            User aux = pLast;
            aux.setPnext(nuevo);
            pLast = nuevo;
        } size += 1;
        
    }
    
    public void print(){
        if(isEmpty()){
            System.out.println("La lista esta vacia");
        }else{
            User pAux;
            pAux = pFirst;
            for(int i =0;i<this.size;i++){
                String elements = pAux.getNumber()+" "+pAux.getName();
                System.out.println(elements);
                pAux = pAux.pnext;
            }
        }
    }
    
    public boolean isUser(int usuarioaeliminar){
        User pAux = pFirst;
        int existe = 0;
        while(pAux!=null){
            if(pAux.number == usuarioaeliminar){
                existe = 1;
                break;
            }else{
                pAux = pAux.pnext;
            }
        }return existe ==1;
    }
    
}
