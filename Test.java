public class Test {
    public static void main(String[] args) {
        MyHashTable<Integer, String> ht = new MyHashTable<>();
        ht.put(1, "A");
        ht.put(12, "B"); // коллизия
        ht.put(23, "C");
        System.out.println("HashTable:");
        System.out.println(ht.get(1));
        System.out.println(ht.get(12));
        System.out.println(ht.remove(12));
        System.out.println(ht.get(12));
        BST<Integer, String> tree = new BST<>();
        tree.put(5, "A");
        tree.put(3, "B");
        tree.put(7, "C");
        tree.put(6, "D");
        System.out.println("\nBST (inorder):");
        for (BST<Integer, String>.Node n : tree) {
            System.out.println(n.getKey() + " -> " + n.getValue());
        }
        tree.delete(5);
        System.out.println("\nAfter delete:");
        for (BST<Integer, String>.Node n : tree) {
            System.out.println(n.getKey() + " -> " + n.getValue());
        }
    }
}
