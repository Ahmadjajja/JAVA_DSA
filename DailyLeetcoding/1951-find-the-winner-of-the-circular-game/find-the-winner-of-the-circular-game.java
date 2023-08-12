class Solution {
    public int findTheWinner(int n, int k) {
        ArrayList<Integer> circle = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            circle.add(i);
        }
        return winner(circle, 0, k);
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
        if(removedPosition >= circle.size()){
            removedPosition -= circle.size();
        }
        return winner(circle, removedPosition, k);
    }
}



















