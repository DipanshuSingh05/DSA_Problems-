//closest to n and devisible by M
public class Closest_To_n {
    //Usinng itretor time O(n) space O(1)
    static int fclosest(int n, int m){
        int closest = 0;
        int minDiff = Integer.MAX_VALUE;
        for( int i = n - m; i<=n + m; i++){
            if(i % m == 0){
                int diff = n-i;
                if(diff < minDiff ||(diff == minDiff && i> closest)){
                    closest = i;
                    minDiff = diff;
                }
            }
        }
        return closest;
    }
    //BY quetient time O(1) space O(1)
    static int fclosest_1(int n, int m){
        int q = n/m;
        int n1= m * q;
        int n2 = (n*m) > 0 ?(m *(q + 1)) : (m * (q - 1));
        if((n - n1) < (n + n2))
            return n1;
        return n2;

    }
    public static void main(String[] args) {
        int n = 17, m = 4;
        System.out.println(fclosest(n, m));
        System.out.println(fclosest_1(n, m));
    }
}
