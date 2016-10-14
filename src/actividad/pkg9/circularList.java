/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad.pkg9;

/**
 *
 * @author Daniel Salinas
 */
public class circularList <T> {
    //atributos
    NodeClass pivot;
    
    //constructor
    public circularList(){
        pivot=null;
    
    }
    
    //metodos
    
    public void insert(T data){
        NodeClass node = new NodeClass(data);
        if(!isEmpty()){ //si no esta vacia
            //insertamos el nodo al inicio y recorremos los nodos
            node.next = pivot;
            findLast().next= node; //lo que sigue del ultimo nodo, va a ser ahora el nuevo nodo que creamos
            pivot = node; 
        }else{
            pivot = node;
            node.next = node;
        }
        
    }
    private NodeClass findLast(){ //metodo de apuntador que a la vez sirve como metodo
        NodeClass aux = pivot;  
        do{
            aux=aux.next;
        }while (aux.next!=pivot);
        return aux; //esto te devuelve el ultimo nodo de la lista
    }
    
    public boolean isEmpty(){
        return pivot == null;
    }
    public void showList(){
        NodeClass aux;
        aux=pivot;
        if(isEmpty()){
            System.out.println("la lista esta vacia :(");
        } else {
            do{
                System.out.println("[" + aux.getData() + "]->");
                aux = aux.next;
            } while(aux.next!=pivot);
        
        }
    
    }
}
