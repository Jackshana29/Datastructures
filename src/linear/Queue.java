package linear;

class BNode{
        int data;
        BNode left,right;
        public BNode(int data) {
            this.data=data;
            left=right=null;
        }
    }

public class Queue {
    static BNode root;
    public static void insert(int data) {
        BNode node=new BNode(data);
        if(root==null) {
            root=node;
            
        }else {
            BNode current=root;
            while(root!=null) {
            if(data<current.data) {
                if(current.left==null) {
                    current.left=node;
                    break;
                }else {
                    current=current.left;
                }
            }else{
                if(current.right==null) {
                current.right=node;
                break;
            }else {
                current=current.right;
            }
        }    
            }
        }
    }public static void Inorder(BNode root) {
        if(root!=null) {
            Inorder(root.left);
            System.out.print(root.data+" ");
            Inorder(root.right);
        }
    }public static void preOrder(BNode root) {
        if(root!=null) {
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }public static void postorder(BNode root) {
        if(root!=null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }
    }public static BNode search(BNode root,int data) {
        BNode current=root;
        while(current!=null) {
            if(current.data==data) {
                return current;
                }
            else if(current.data<data) {
                current=current.right;
                }
            else {
                    current=current.left;
                }
            }return null;
            
    }
    public static void main(String[] args) {
        insert(26);
        insert(22);
        insert(120);
        insert(70);
        insert(7);
        insert(11);insert(6);
        Inorder(root);System.out.println();
        preOrder(root);System.out.println();
        postorder(root);System.out.println();
        if(search(root,6)!=null) {
            System.out.println("data is found");
        }else {
            System.out.println("data is not found");
        }
        
    }

}