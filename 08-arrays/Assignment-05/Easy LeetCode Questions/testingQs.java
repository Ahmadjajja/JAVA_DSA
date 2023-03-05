

import java.math.BigInteger;
import java.util.*;

public class testingQs {
    static public List<Integer> addToArrayForm(int[] num, int k) {
        String concatNums = "";
        String sum;
        ArrayList<Integer> targetArrayList = new ArrayList<Integer>();
        for(int i = 0, count = 0; i < num.length; i++){
            if(count == 0 && num[i] == 0){
                
            } else {
                concatNums += Integer.toString(num[i]);
                count++;
            }
        }
        // sum = Integer.toString(Integer.parseInt(concatNums) + k);
        sum = new BigInteger((concatNums.toString().length() < 1 ? "0": concatNums.toString())).add(BigInteger.valueOf(k)).toString();
        for(int i = 0; i< sum.length(); i++){
            targetArrayList.add(Character.getNumericValue(sum.charAt(i)));
        }
        return targetArrayList;
    }

    public static void main(String[] args) {
        int[] arr = {0};
        System.out.println(addToArrayForm(arr, 3));
    }
}
