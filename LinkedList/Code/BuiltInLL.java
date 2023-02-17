import java.util.*;

class BuiltInLL {
    public static void main(String args[]){
        LinkedList<String> list = new LinkedList<String>();  // declaration of linked list

        list.addFirst("is");
        list.addFirst("Ahmad");
        System.out.println(list);

        list.addLast("a ");
        list.addLast("Software");
        list.add("engineer");
        System.out.println(list);
        System.out.println("Size : " + list.size());
        
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size()-1) {
                System.out.println(list.get(i));
                continue;
            }
            System.out.print(list.get(i) + " -> ");
        }

        list.removeFirst();
        list.removeLast();
        System.out.println(list);

        list.remove(2);
        System.out.println(list);

    }
}
