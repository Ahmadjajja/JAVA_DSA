import java.util.ArrayList;

public class WinnerGame{
    public static void main(String[] args) {
        int n = 6, k = 5;
        ArrayList<Integer> circle = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            circle.add(i);
        }
        System.out.println(winner(circle, 0, k));
    }
    private static int winner(ArrayList<Integer> circle, int s, int k){
        if(circle.size() == 1){
            return circle.get(0);
        }
        int removedPosition = (s + k - 1);
        while(removedPosition >= circle.size()){
            removedPosition -= circle.size();
        }
        circle.remove(removedPosition);
        while(removedPosition >= circle.size()){
            removedPosition -= circle.size();
        }
        return winner(circle, removedPosition, k);
    }
}