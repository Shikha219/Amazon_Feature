public class BinarySearchTree{
    public Node root;
    public BinarySearchTree(){
        this.root = null;
    }

    public void insert(int val){
        if (this.root == null)
            this.root = new Node(val);
        else
            this.root.insert(val);
    }
}

class Node{
    public int val;
    public Node leftChild;
    public Node rightChild;

    public Node(int val){
        this.val = val;
        this.leftChild = null;
        this.rightChild = null;
    }

    public void insert(int val){
        Node current = this;
        Node parent = current;
        while (current != null){
            parent = current;
            if (val < current.val)
                current = current.leftChild;
            else
                current = current.rightChild;
        }
        if(val < parent.val)
            parent.leftChild = new Node(val);
        else
            parent.rightChild = new Node(val);
    }
}
