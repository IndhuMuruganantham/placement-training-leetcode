class Solution {
    public boolean isSubsequence(String s, String t) {
        int c=0;
        for(int i=0;i<t.length();i++){
            if(c<s.length()&& s.charAt(c)==t.charAt(i)){
                c++;
            }
        }
        return c==s.length();
    }
}
