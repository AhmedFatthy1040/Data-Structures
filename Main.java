public class Main {
    public static void main(String[] args) {
        HashTable ht = new HashTable();
        ht.set("first", 5);
        ht.set("second", 7);
        ht.set("third", 1);
        ht.printTable();
        System.out.println("\n" + ht.get("first"));
    }
}
