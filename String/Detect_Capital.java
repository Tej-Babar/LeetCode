public class Detect_Capital {
    public static void main(String[] args) {
        String word="leetcode";
        System.out.println(detectCapitalUse(word));
    }
    public static boolean detectCapitalUse(String word) {
        int len=word.length();
        if(len==1) return true;
        char u,l;
        if (word.charAt(1)-'A'==0) {
            u='A';
            l='Z';
        } else {
            u='a';
            l='z';
        }
        if(word.charAt(0)-26>=u) return false;
        for (int i = 2; i < len; i++) {
            char c=word.charAt(i);
            if(!(c>=u && c<=l)) return false;
        }

        return true;
    }
}