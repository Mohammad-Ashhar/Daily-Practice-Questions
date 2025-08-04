import java.util.*;
public class CreateBinarySearchTree{
    class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val=val;
        }
    }
    private Node root;
    private CreateBinarySearchTree(int[] arr)
    {
        root=CreateTree(arr,0,arr.length-1);
    }
    private Node CreateTree(int[] arr,int si,int ei)
    {
        if(si>ei)
        {
            return null;
        }
        int mid=(si+ei)/2;
        Node nn=new Node(arr[mid]);
        nn.left=CreateTree(arr,si,mid-1);
        nn.right=CreateTree(arr,mid+1,ei);
        return nn;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array in sorted order:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        CreateBinarySearchTree bst = new CreateBinarySearchTree(arr);
        System.out.println("Binary Search Tree created from the sorted array:");
        System.out.println("Displaying the Binary Search Tree:");

        bst.Display();
    }
    public void Display()
    {
        Display(root);
    }
    private void Display(Node node)
    {
        if(node==null)
        {
            return;
        }
        String str="";
        if(node.left!=null)
        {
            str+=node.left.val+" => ";
        }
        else
        {
            str+="null => ";
        }
        str+=node.val;
        if(node.right!=null)
        {
            str+=" <= "+node.right.val;
        }
        else
        {
            str+=" <= null";
        }
        System.out.println(str);
        Display(node.left);
        Display(node.right);
    }


}