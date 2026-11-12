package DSALL;
class node{
    int data;
    node next;
    node(int data){
        this.data = data;
        this.next = null;
    }
}
class linkedlist{
    node head;
    node tail;
    int size;

    void display(){
        node temp = head;
        while(temp != null){
            System.out.println(temp.data + "---->");
            temp = temp.next;
        }
    }
    void addatH(int data){
        node temp = new node(data);
        if(head == null){
            tail = head = temp;
        }
        else{
            temp.next = head;
            head = temp;
        }
        size++;
    }
    void addatT(int data){
        node temp = new node(data);
        if(tail == null){
            head = tail = temp;
        }
        else{
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    int get(int idx){
        node temp = head;
        for (int i = 0; i < idx; i++) {
            temp = temp.next;
        }
        return temp.data;
    }
 void deleteatH(){
    if(head==null){
        tail = null;
        System.out.println("the list is empty");
        return;
    }
    else{
        head = head.next;
    }
    size--;
}
void insert(int data , int idx){
    if(idx<0 ||idx>size)System.out.println("invalid idx");
    if(idx==0){addatH(data);}
    if(idx==size){addatT(data);}
    else{
        node temp = head;
        for (int i = 0; i < idx-1; i++) {
            temp = temp.next;
        }
        node t = new node(data);
        t.next = temp.next;
        temp.next = t;
        }
        size++;
    }
    void delete(int idx){
        if(idx<0||idx>size){System.out.println("invalid index");}
        if(idx==0){deleteatH();}
        node temp = head;
        for (int i = 0; i < idx-1; i++) {
            temp = temp.next;
        }temp.next = temp.next.next;
        if(idx==size-1) tail = temp;
        size--;
    }
}
public class LinkedList {
    public static void main(String[] args) {
        
    }
}
