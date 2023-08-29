public class Main {
    public static void main(String[] args) {
        HashTable ht = new HashTable();
        ht.set("first", 5);
        ht.set("second", 7);
        ht.set("third", 1);
        ht.set("fourth", 3);
        ht.set("fifth", 9);
        ht.set("sixth", 4);
        ht.printTable();
        System.out.println("\n" + ht.get("first"));
        System.out.println(ht.keys());
    }
}
