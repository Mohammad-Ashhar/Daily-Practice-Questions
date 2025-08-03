import java.util.*;
public class CreateTreeUsingLevelOrder {
    class Node{
        int val;
        Node left;
        Node right;
        public Node(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
    private Node root;
    public CreateTreeUsingLevelOrder()
    {
        CreateTree();
    }    
    private void CreateTree()
    {
        Scanner sc=new Scanner(System.in);
        int e=sc.nextInt();
        Node node=new Node(e);
        root=node;
        Queue<Node> q=new LinkedList<>();
        q.add(node);
        while(!q.isEmpty())
        {
            Node rv=q.poll();
            int l=sc.nextInt();
            int r=sc.nextInt();
            if(l!=-1)
            {
                Node nn=new Node(l);
                rv.left=nn;
                q.add(nn);
            }
            if(r!=-1)
            {
                Node nn=new Node(r);
                rv.right=nn;
                q.add(nn);
            }
        }
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
public static void main(String[] args) {
        CreateTreeUsingLevelOrder tree = new CreateTreeUsingLevelOrder();
        tree.Display();
    }
}