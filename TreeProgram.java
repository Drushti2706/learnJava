import java.util.Scanner;

// Node class for trees
class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}

// Binary Tree with Traversals
class BinaryTree {
    Node root;

    BinaryTree() {
        root = null;
    }

    // Inorder Traversal (Left - Root - Right)
    void inorder(Node node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.key + " ");
            inorder(node.right);
        }
    }

    // Preorder Traversal (Root - Left - Right)
    void preorder(Node node) {
        if (node != null) {
            System.out.print(node.key + " ");
            preorder(node.left);
            preorder(node.right);
        }
    }

    // Postorder Traversal (Left - Right - Root)
    void postorder(Node node) {
        if (node != null) {
            postorder(node.left);
            postorder(node.right);
            System.out.print(node.key + " ");
        }
    }
}

// Binary Search Tree (BST)
class BST {
    Node root;

    BST() {
        root = null;
    }

    // Insert into BST
    Node insert(Node root, int key) {
        if (root == null) {
            return new Node(key);
        }
        if (key < root.key) {
            root.left = insert(root.left, key);
        } else if (key > root.key) {
            root.right = insert(root.right, key);
        }
        return root;
    }

    // Search in BST
    boolean search(Node root, int key) {
        if (root == null) return false;
        if (root.key == key) return true;
        return key < root.key ? search(root.left, key) : search(root.right, key);
    }
}

// AVL Tree (Self-balancing BST)
class AVLTree {
    Node root;

    // Get height of node
    int height(Node node) {
        return (node == null) ? 0 : 1 + Math.max(height(node.left), height(node.right));
    }

    // Get balance factor
    int getBalance(Node node) {
        return (node == null) ? 0 : height(node.left) - height(node.right);
    }

    // Right rotate
    Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;
        x.right = y;
        y.left = T2;
        return x;
    }

    // Left rotate
    Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;
        y.left = x;
        x.right = T2;
        return y;
    }

    // Insert into AVL Tree
    Node insert(Node node, int key) {
        if (node == null) return new Node(key);

        if (key < node.key) node.left = insert(node.left, key);
        else if (key > node.key) node.right = insert(node.right, key);
        else return node; // Duplicates not allowed

        int balance = getBalance(node);

        // Left Heavy
        if (balance > 1 && key < node.left.key) return rightRotate(node);
        // Right Heavy
        if (balance < -1 && key > node.right.key) return leftRotate(node);
        // Left-Right Case
        if (balance > 1 && key > node.left.key) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }
        // Right-Left Case
        if (balance < -1 && key < node.right.key) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    // Inorder Traversal of AVL Tree
    void inorder(Node node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.key + " ");
            inorder(node.right);
        }
    }
}

// Main Class
public class TreeProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Binary Tree Example
        BinaryTree bt = new BinaryTree();
        bt.root = new Node(1);
        bt.root.left = new Node(2);
        bt.root.right = new Node(3);
        bt.root.left.left = new Node(4);
        bt.root.left.right = new Node(5);

        System.out.println("\nBinary Tree Traversals:");
        System.out.print("Inorder: "); bt.inorder(bt.root);
        System.out.print("\nPreorder: "); bt.preorder(bt.root);
        System.out.print("\nPostorder: "); bt.postorder(bt.root);
        System.out.println();

        // Binary Search Tree Example
        BST bst = new BST();
        bst.root = bst.insert(bst.root, 50);
        bst.insert(bst.root, 30);
        bst.insert(bst.root, 20);
        bst.insert(bst.root, 40);
        bst.insert(bst.root, 70);
        bst.insert(bst.root, 60);
        bst.insert(bst.root, 80);

        System.out.println("\nSearch in BST:");
        System.out.print("Enter a number to search in BST: ");
        int searchKey = scanner.nextInt();
        if (bst.search(bst.root, searchKey)) {
            System.out.println("Found " + searchKey + " in BST.");
        } else {
            System.out.println(searchKey + " not found in BST.");
        }

        // AVL Tree Example
        AVLTree avl = new AVLTree();
        avl.root = avl.insert(avl.root, 10);
        avl.root = avl.insert(avl.root, 20);
        avl.root = avl.insert(avl.root, 30);
        avl.root = avl.insert(avl.root, 40);
        avl.root = avl.insert(avl.root, 50);
        avl.root = avl.insert(avl.root, 25);

        System.out.println("\nAVL Tree Inorder Traversal:");
        avl.inorder(avl.root);
        
        scanner.close();
    }
}
