public class BinarySearchTree {

    Node root;

    public BinarySearchTree() {
        root = null;
    }

    public boolean search(Node root, int x) {
        Node current = root;
        while (current != null) {
            if (x < current.element) {
                current = current.left;
            } else if (x > current.element) {
                current = current.right;
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.root = new Node(50);
        tree.root.left = new Node(30);
        tree.root.right = new Node(70);
        tree.root.left.left = new Node(20);
        tree.root.left.right = new Node(40);
        tree.root.right.left = new Node(60);
        tree.root.right.right = new Node(80);

        int searchKey = 40;
        if (tree.search(tree.root, searchKey)) {
            System.out.println("Element " + searchKey + " found in the tree");
        } else {
            System.out.println("Element " + searchKey + " not found in the tree");
        }
    }
}