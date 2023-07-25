import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {
        // dice("", 5);
        System.out.println(diceList("", 4));
        // diceFace("", 7, 7);
        // System.out.println(diceListFace("", 7, 8));
    }
    static void dice(String p, int target){
        if (target == 0) {
            System.out.println(p);
            return;
        }
        for (int i = 1; i <= 6 && i <= target; i++) {
            dice(p + i, target - i);
        }
    }
    static ArrayList<String> diceList(String p, int target){
        if (target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <= 6 && i <= target; i++) {
            list.addAll(diceList(p + i, target - i));
        }
        return list;
    }
    static void diceFace(String p, int target, int face){
        if (target == 0) {
            System.out.println(p);
            return;
        }
        for (int i = 1; i <= face && i <= target; i++) {
            diceFace(p + i, target - i, face);
        }
    }
    static ArrayList<String> diceListFace(String p, int target, int face){
        if (target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <= face && i <= target; i++) {
            list.addAll(diceListFace(p + i, target - i, face));
        }
        return list;
    }
}
