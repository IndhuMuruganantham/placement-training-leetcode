class Solution {
    public String reverseVowels(String s) {
        String v="aeiouAEIOU";
        char[] c=s.toCharArray();
        int i=0,j=s.length()-1;
        while(i<j ){
            while(i<j && v.indexOf(c[i])==-1){
                i++;
            }
            while(i<j && v.indexOf(c[j])==-1){
                j--;
            }
            char t=c[i];
            c[i]=c[j];
            c[j]=t;
            i++;
            j--;
        }
        return new String(c);
    }
}
