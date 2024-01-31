public class Main {
    public static void main(String[] args) {
        LL list = new LL(); // Creating object of class LL

        list.insertFirst(5); // Calling method of
        list.insertFirst(7);
        // list.insertFirst(3);
        // list.insertFirst(17);
        // list.insertLast(99);
        list.display();
        list.insertLast(3);
        list.display();
        list.insert(1, 1);
        list.display();
        System.err.println("First deleted element -> " + list.deleteFirst());
        list.display();
        list.insertRec(60, 2);
        list.display();

        // DLL list = new DLL();
        // list.insertFirst(3);
        // list.insertFirst(2);
        // list.insertFirst(8);
        // list.insertFirst(17);
        // list.display();
    }
}