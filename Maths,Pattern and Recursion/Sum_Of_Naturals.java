//Using Recursion time O(N) space O(1)

class Sum_Of_Naturals{
    //Using Recursion
    public static int fSum(int n){
        if(n==1)
            return 1;
        return n + fSum(n-1);

    }
    //Using loop time O(n) space O(n)
    public static int fSum_2(int n){
        int sum = 0;
        for(int i = n; i >= 1; i-- ){
            sum = sum + i ;
        }
        return sum;
    }
    //Using N number formula time O(1) space O(1)
    public static int fSum_3(int n){
        return ((n*(n+1))/2);
    }
    public static void main(String[] args) {
        int n = 15;
        System.out.println(fSum(n));
        System.out.println(fSum_2(n));
        System.out.println(fSum_3(n));
    }
}