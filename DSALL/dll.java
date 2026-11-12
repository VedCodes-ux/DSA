package DSALL;
class ListNode{
    int val;
    ListNode next;
    ListNode prev;
    public ListNode(int val) {
        this.val = val;
        this.next = null;
        this.prev = null;
    }
}

class DLL{
    ListNode head;
    ListNode tail;
    int size;

    void addatH(int data){
        ListNode temp = new ListNode(data);
        if(head==null) {
            tail = head = temp;
            size++;
        } else {
            temp.next = head;
            head.prev = temp;
            head = temp;
            size++;
        }
    }
    void addatT(int val){
        ListNode temp = new ListNode(val);
        if(tail==null){
            tail = head = temp;
            size++;
        }
        else {
            tail.next = temp;
            temp.prev = tail;
            tail = tail.next;
            size++;
        }
    }
    void deleteatH(){
        if(head==null){
            System.out.println("Can't Delete");
        }
        head = head.next;
        head.prev = null;
        size--;
    }
    void deleteatT(){
        if(tail==null){
            System.out.println("Can't Delete");
        }else{
           tail = tail.prev;
           tail.next = null; 
           size--;
        }
        
    }
    void insert(int idx,int val){
        if(idx<0 || idx>size) System.out.println("cant insert");
        if(idx==0) addatH(val);
        if(idx==size) addatT(val);
        else{
            ListNode temp = head;
            for (int i = 0; i < idx-1; i++) {
                temp = temp.next;
            }
            ListNode t = new ListNode(val);
            t.prev = temp;
            t.next = temp.next;
            temp.next = t;
            t.next.prev = t;
            size++;
            
        }
    }
    void display(){
        ListNode temp = head;

        while(temp!=null){
            System.out.print(temp.val + "---->");
            temp = temp.next;
        }
    }
}
public class dll {
    public static void main(String[] args) {
        DLL doll = new DLL();
        doll.addatH(23);
        doll.addatH(43);
        doll.addatH(53);
        doll.addatH(63);
        doll.addatH(13);

        doll.display();
    }
    
}

