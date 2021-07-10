class Solution {
    public static void preOrder(Node node, int low, int high, List<Integer> output){
        if (node != null) {
            if (node.val <= high && low <= node.val)
                output.add(node.val);
            if (low <= node.val)
                preOrder(node.leftChild, low, high, output);
            if (node.val <= high)
                preOrder(node.rightChild, low, high, output);
        }
    }
    public static List<Integer> productsInRange(Node root, int low, int high){
        List<Integer> output = new ArrayList<Integer>();
        preOrder(root, low, high, output);
        return output;
    }
    public static void main( String args[] ) {
        // Driver code
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(9);
        bst.insert(6);
        bst.insert(14);
        bst.insert(20);
        bst.insert(1);
        bst.insert(30);
        bst.insert(8);
        bst.insert(17);
        bst.insert(5);

        System.out.println(productsInRange(bst.root, 7, 20));
    }
}
