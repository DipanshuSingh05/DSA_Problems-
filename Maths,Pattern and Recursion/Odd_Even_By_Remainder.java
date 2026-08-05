/**Odd_Even_By_Remainder
 * ------------------------------------------------------------------------
   Simple Java practice code for parity checking using division remainders.
   Good baseline for comparing against bitwise alternatives.
 */
class Odd_Even_By_Remainder {
    public static boolean isEven(int n ){
        int rem = n % 2 ;
        if(rem == 0){
            return true ;
        }
        else{
            return false ;
        }

    }
    public static void main(String[] args) {
        int n = 16 ; 
        if(isEven(n) == true){
            System.err.println("Number is even");
        }
        else {
            System.out.println("Number is odd");
        }
    }  
}