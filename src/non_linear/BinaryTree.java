package non_linear;
import java.util.LinkedList;
import java.util.Queue;
class TNode{
    int data;
    TNode left,right;
    public TNode(int data) {
        this.data=data;
        left=right=null;
    }
}
public class BinaryTree {
    static TNode root;
    public static void insert(int data) {
        TNode node=new TNode(data);
        if(root==null) {
            root=node;
        }else {
            Queue<TNode> track=new LinkedList<>();
            track.add(root);
            while(!track.isEmpty()) {
                TNode current=track.poll();
                if(current.left==null) {
                current.left=node;
                break;
                }else {
                    track.add(current.left);
                }
        
                if(current.right==null) {
                    current.right=node;
                    break;
                }else {
                    track.add(current.right);
                }
            }}
    }
    public static void preOrder(TNode root) {
        if(root!=null) {
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    public static void Inorder(TNode root) {
        if(root!=null) {
            Inorder(root.left);
            System.out.print(root.data+" ");
            Inorder(root.right);
        }
    }
    public static void postorder(TNode root) {
        if(root!=null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }
    }
    public static boolean search(TNode root,int data){
        if(root!=null) {
            if(root.data==data) {
                return true;
            }
            return search(root.left,data)||search(root.right,data);
        }
        return false;
    }
    public static void main(String[] args) {
        insert(15);
        insert(8);
        insert(20);
        insert(12);
        insert(6);
        insert(4);
        insert(16);
        preOrder(root);
        System.out.println();
        Inorder(root);System.out.println();
        postorder(root);System.out.println();
        System.out.println(search(root,13));
    }

}