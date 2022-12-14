import java.util.HashSet;

public class Buddy_Strings {
    public static void main(String[] args) {
        
    }

    public boolean buddyStrings(String s, String goal) {
        int l1=s.length();
        int l2=goal.length();
        if(l1!=l2 || l1==1) return false;
        char c1=' ',c2=' ';
        int sw=0;
        int i=0;
        for (i = 0; i < l1 && sw!=2; i++) {
            if (s.charAt(i)!=goal.charAt(i)) {
                if(sw==0){
                    sw++;
                    c1=s.charAt(i);
                    c2=goal.charAt(i);
                }
                else{
                    sw++;
                    if(goal.charAt(i)!=c1 || s.charAt(i)!=c2) return false;
                }

            }
        }
        if(sw==0){
            HashSet<Character> hs=new HashSet<>();
            for(int j=0;j<l1;j++){
                hs.add(s.charAt(j));
            }
            if(hs.size()==l1) return false;
        }
        else if(sw==1) return false;
        else{
            while (i<l1) {
                if(s.charAt(i)!=goal.charAt(i)) return false;
                i++;
            }
        }

        return true;
    }
}

