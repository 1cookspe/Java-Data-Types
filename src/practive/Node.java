/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practive;

/**
 *
 * @author 1cookspe
 */
public class Node  {
    
    private String data;
    private Node next;

    public Node( String newData ) {
        this.data = newData;
        this.next = null;
    }

    public Node getNext() {
        return this.next;
    }

    public void setNext( Node nextNode ) {
        this.next = nextNode;
    }

    public String getData() {
        return this.data;
    }     

}
