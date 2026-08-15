public class Check_n_is_SumOfConsecutive_numbers {
    //Checking All Consecutive Sums time O(n2) space O(n)
static boolean isSumOfConsecutive(int n){
    for (int i= 1; i <=(n/2); i++) {
        int sum = 0;
        for(int j = i; j<=(n/2); j++){
            sum += j;
            if(sum == n && j>i){
                return true;
            }
            if(sum > n){
                break;
            }
        }
    }
    return false;
}
//Using Power of 2 Property - Time O(1) Space O(1) 
static boolean isSumOfConsecutive_1(int n){
    if(n == 1){
        return false;
    }
    if((n & (n-1) )== 0){
        return false;
    }
    return true;
}
public static void main(String[] args) {
    int n = 24; int n1=16; int n2 = 8;
    System.out.println(isSumOfConsecutive(n));
    System.out.println(isSumOfConsecutive_1(n1));
    System.out.println(isSumOfConsecutive_1(n2));
}
}
