class Solution {
    public int[] shortestToChar(String s, char c) {
        int n=s.length();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            int min=n;
            for(int j=0;j<n;j++){
                if(s.charAt(j)==c){
                    int d=Math.abs(i-j);
                    if(d<min){
                        min=d;
                    }
                }
            }
            a[i]=min;
        }
        return a;
    }
}
