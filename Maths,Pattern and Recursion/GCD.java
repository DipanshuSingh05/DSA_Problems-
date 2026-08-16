
public class GCD {
    static int findGCD(int a, int b){
        if(a==0 || b==0)return Math.max(a, b);
        int result;
        for(result = Math.min(a, b); result > 0 ; result--){
            if (a % result == 0 && b % result == 0  ) {
                break;
            }
        }
        return result;

    }
    static int findGCD1(int a, int b){
        if(a == 0 || b == 0 || a == b){
            return Math.max(a, b);
        }
        if(a > b){
            return findGCD1(a-b, b);
        }
        return findGCD1(a, b-a);
    }
        public static void main(String[] args) {
            int a = 16, b = 56, c = 48, d = 16;
            System.out.println(findGCD(a, b));
            System.out.println(findGCD1(c, d));
            System.out.println(findGCD1(a, d));
        }
}
