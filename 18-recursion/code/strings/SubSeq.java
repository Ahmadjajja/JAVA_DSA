import java.util.ArrayList;

public class SubSeq {
    public static void main(String[] args) {
        // subSeq("", "abc");
        // System.out.println(subSeqRet("", "abc"));
        subSeqAscii("", "abc");
        System.out.println(subSeqAsciiRet("", "abc"));
    }
    static void subSeq(String p, String up){
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subSeq(p + ch, up.substring(1));
        subSeq(p , up.substring(1));
        // subSeq(p , up.substring(1)); // Opposite stuff
        // subSeq(p + ch, up.substring(1));
    }
    static ArrayList<String> subSeqRet(String p, String up){
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subSeqRet(p + ch, up.substring(1));
        ArrayList<String> right = subSeqRet(p , up.substring(1));
        // ArrayList<Integer> right = subSeqRet(p , up.substring(1)); // Opposite stuff
        // ArrayList<Integer> left = subSeqRet(p + ch, up.substring(1));

        left.addAll(right);
        return left;
    }

    static void subSeqAscii(String p, String up){
        if (up.isEmpty()) {
            System.out.println(p); 
            return;
        }
        char ch = up.charAt(0);
        subSeqAscii(p + ch, up.substring(1));
        subSeqAscii(p , up.substring(1));
        subSeqAscii(p + (ch + 0), up.substring(1));
    }

    static ArrayList<String> subSeqAsciiRet(String p, String up){
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> first = subSeqAsciiRet(p + ch, up.substring(1));
        ArrayList<String> second = subSeqAsciiRet(p , up.substring(1));
        ArrayList<String> third = subSeqAsciiRet(p + (ch + 0) , up.substring(1));

        first.addAll(second);
        first.addAll(third);
        return first;
    }
}
