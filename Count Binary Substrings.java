class Solution {
    public int countBinarySubstrings(String s) {
        int p=0;
        int c=1;
        int count=0;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                c++;
            }else{
                count+=Math.min(p,c);
                p=c;
                c=1;
            }
        }
        count+=Math.min(p,c);
        return count;
    }
}
