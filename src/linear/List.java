
package linear;
class DubNode{
    int data;
    DubNode next;
    DubNode prev;
    public DubNode(int data) {
        this.data=data;
        next=null;
        prev=null;
    }}
class DubMethods{
    static DubNode head,tail;
    static int count=0;
    public static void insertAtBeg(int data) {
        DubNode newnode=new DubNode(data);
        if(head==null && tail==null) {
            head=newnode;
            tail=newnode;
        }else {
            newnode.next=head;
            head.prev=newnode;
            head=newnode;
        }count++;
    }
    public static void insertAtEnd(int data) {
    DubNode newnode=new DubNode(data);
    if(head==null && tail==null) {
        insertAtBeg(data);
    }else {
        newnode.prev=tail;
        tail.next=newnode;
        tail=newnode;
    }count++;
}public static void insertAtpos(int data,int pos) {
    DubNode newnode=new DubNode(data);
    if(pos==0) {
        insertAtBeg(data);
    }
   else {    
        DubNode temp=head;
        for(int i=1;i<pos;i++) {
            temp=temp.next;
        }
        newnode.next=temp.next;
        temp.next.prev=newnode;
        temp.next=newnode;
        count++;
    }
}public static void deletionAtBeg() {
    if(head==null && tail==null) {
        return;
    }else {
        head=head.next;
    }count--;
}public static void deletionAtEnd() {
    if(head==null && tail==null) {
        return;
    }else {
        DubNode temp=head;
        while(temp.next.next!=null) {
            temp=temp.next;
        }temp.next=null;
    }
    count--;
}public static void deletionAtpos(int pos) {
    if(pos==0) {
        deletionAtBeg();
    }else{
        DubNode temp=head;
        for(int i=1;i<pos;i++) {
            temp=temp.next;
        }temp.next=temp.next.next;
        count--;
    }
}public static void display() {
    DubNode temp=head;
    while(temp!=null) {
        System.out.print(temp.data+" ");
        temp=temp.next;
    }System.out.println();
    System.out.printf("the length of the List: "+count);
}}
public class List extends DubMethods {
    public static void main(String[] args) {
        insertAtBeg(0);
        insertAtEnd(1);
        insertAtpos(2,1);
        insertAtpos(3,2);
        insertAtBeg(4);
        insertAtEnd(1);
        deletionAtBeg();
        deletionAtEnd();
        deletionAtpos(0);
        display();
    }

}
