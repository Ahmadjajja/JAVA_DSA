class LL {
    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    //add - last
    public void addFirst(String data) {
        Node newNode = new Node(data);   //creating new node
        if( head == null ){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;

        //add - last

        
    }
    //add - last
    public void addlast(String data) {
        Node newNode = new Node(data);   //creating new node
        if( head == null ){
            head = newNode;
            return;
        }

        Node currNode = head;
        while(currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    public void printList() {
        if(head == null){
            System.out.println("list is empty");
            return;
        }

        Node currNode = head;
        while(currNode != null) {
            if (currNode.next == null) {
                System.out.println(currNode.data );
            } else {
                System.out.print(currNode.data + " -> ");
            }
            currNode = currNode.next;
        }

        // System.out.println("NULL");
    }

    public void deleteFirst() {
        if( head == null ){
            System.out.println("The list is empty");
            return;
        }

        head = head.next;

    }
    public void deleteLast() {
        if( head == null ){
            System.out.println("The list is empty");
            return;
        }

        head = head.next;

    }

    public static void  main(String args[]) {
        LL list = new LL(); //initializes list
        // Four basic operations
        // 01) Insert/Add
        // 02) Print
        // 03) Delete
        // 04) Checking size

        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("Ahmad");
        
        list.printList();
        
        list.addlast("software engineer");
        list.printList();
        // list.deleteFirst();
        // list.printList();
    }
}