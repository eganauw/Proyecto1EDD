/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1edd;

/**
 *
 * @author rodri
 */
public class AdjList {
    public RelationsList pFirst;
    public RelationsList pLast;
    public int size;
    
    public AdjList(){
        this.pFirst = null;
        this.pLast = null;
        this.size = 0;
    }

    /**
     * @return the pFirst
     */
    public RelationsList getpFirst() {
        return pFirst;
    }

    /**
     * @param pFirst the pFirst to set
     */
    public void setpFirst(RelationsList pFirst) {
        this.pFirst = pFirst;
    }

    /**
     * @return the pLast
     */
    public RelationsList getpLast() {
        return pLast;
    }

    /**
     * @param pLast the pLast to set
     */
    public void setpLast(RelationsList pLast) {
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
        return this.pFirst ==null;
    }
    
    public void insert(RelationsList relationslist){
        if(isEmpty()){
            pFirst = relationslist;
            pLast = relationslist;
        }else{
            RelationsList aux = pLast;
            aux.setPnext(relationslist);
            pLast = relationslist;
        }size +=1;
    }
    
    
    public boolean existeinicial(int idinicial){
        RelationsList aux = pFirst;
        int existe =0;
        while(aux!=null){
            if(aux.inicial.number == idinicial){
                existe =1;
                break;
            }else{
                aux=aux.pnext;
            }
        }
        return existe ==1;
}
    public void print(){
        RelationsList aux = pFirst;
        while(aux!=null){
            aux.print();
            aux = aux.pnext;
        }
    }
}

