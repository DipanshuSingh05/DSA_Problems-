/**
 * Odd_Even_Using_Bitwise
 ----------------------------------------------------------------------------------
 Just a quick Java example showing how to check if a number is odd or even using 
 bitwise AND instead of the usual modulo operator.
 */
class Odd_Even_Using_Bitwise {
    public static void main(String[] args) {
        int n = 19 ; 
        if((n & 1) == 0){
            System.out.println("Number is even");
        }
        else{
            System.out.println("Number is odd");
        }
    }
}
