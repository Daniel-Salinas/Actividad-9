/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad.pkg9;

/**
 *
 * @author Daniel Salinas
 * @param <T>
 */
public class NodeClass <T> {
    public NodeClass next;
    private T data;
    
    //metodos
    //contructor
  public NodeClass (T data){
        this.data = data;
        this.next = null;
    
    }
  public T getData(){
      return this.data;
  }
  public void setData(T data){
      this.data=data;
  }
}
