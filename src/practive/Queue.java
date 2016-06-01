/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practive;

/**
 *
 * @author spencercook
 */
public class Queue {
    private int front;
    private int back;
    private int[] data;

    public Queue() {
        this(15);
    }
    
    public Queue(int length) {
        this.data = new int[length];
        this.front = -1;
        this.back = -1;
    }
    
    public int size() {
        if (this.front == -1 && this.back == -1) {
            return 0;
        } else if (this.front > this.back) {
            
        }
        return this.front;
    }
    
    public int capacity() {
        return this.data.length;
    }
    
    public boolean isEmpty() {
        return false;
    }
    
    public boolean isFull() {
        return false;
    }
    
    public int dequeue() {
        int retrued = 0;
        if (!isEmpty()) {
            retrued = this.data[front];
            this.front++;
            this.front = this.front % capacity();
        }
        return retrued;
    }
    
    public void enqueue(int value) {
        this.back++;
        this.data[this.back] = value;
    }
    
    public String toString() {
        String outputString = "";
        if (this.back > this.front) {
            for (int i = this.back; i <= this.front; i++) {
                outputString += this.data[i] + " ";
            }
        } else if (this.front > this.back) {
            for (int i = this.front; i <= capacity(); i++) {
                outputString += this.data[i] + " ";
            }
            
            for (int i = 0; i <= this.back; i++) {
                outputString += this.data[i] + " ";
            }
        }
        return outputString;
    }
}
