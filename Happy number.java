class Solution {
    public boolean isHappy(int n) {
        while(n!=1 && n!=4){
            int su=0;
            while(n>0){
                int d=n%10;
                su+=(d*d);
                n=n/10;
            }
            n=su;
        }
        return n==1;
    }
}
