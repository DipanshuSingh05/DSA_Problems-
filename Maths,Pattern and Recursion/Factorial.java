public class Factorial {
    // Iterative 
    static int fact(int n){
        int result = 1;
        for(int i = 1; i <= n; i++){
            result *= i;
        }
        return result;
    }
    // recursive 
    static int fact_2(int n){
        if(( n == 0 )|| (n == 1) ){
            return 1;
        }
        return n*fact_2(n-1);
    }
    public static void main(String[] args) {
        int n = 14, m = 5 ; 
        System.out.println(fact(n));
        System.out.println(fact_2(m));
    }
}
