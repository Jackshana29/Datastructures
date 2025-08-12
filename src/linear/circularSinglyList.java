package linear;

class CNode{
	int data;
	CNode next;
	public CNode(int data) {
		this.data=data;
		next=null;
	}
}
class CMethods{
	static CNode head,tail;
	static int count=0;
	public static void insertAtBeg(int data) {
		CNode node=new CNode(data);
		if(head==null) {
			head=node;
			tail=node;
			node.next=head;
			return;
		}
		else {
			node.next=head;
			head=node;
			tail.next=head;
		}count++;
	}
	public static void insertAtEnd(int data) {
		CNode node=new CNode(data);
		if(head==null) {
			insertAtBeg(data);
		}else {
			tail.next=node;
			node.next=head;
			tail=node;
		}count++;
	}public static void insertAtpos(int data,int pos) {
        CNode newnode=new CNode(data);
        if(pos==0) {
            insertAtBeg(data);
        }else {
            CNode temp=head;
            for(int i=1;i<pos;i++) {
                temp=temp.next;
            }
            newnode.next=temp.next;
            temp.next=newnode;
        }count++;
    }
public static void deleteAtBeg() {
	CNode temp=head;
	if(head==null && tail==null) {
		System.out.println("list is empty");
	}
}

	public static void display() {
		CNode temp=head;
		do {
			System.out.println(temp.data+" ");
			temp=temp.next;
			}
		while(temp!=head);{
			System.out.println();
			System.out.println("the length of the list: "+count);			}
		while(temp!=head);
		
		}
}
public class circularSinglyList extends CMethods {
        public static void main(String[] args) {
           insertAtBeg(5);
           insertAtBeg(6);
           insertAtBeg(9);
           insertAtBeg(7);
           insertAtEnd(10);
           insertAtBeg(2);
           insertAtpos(3,3);
           display();
}
}

