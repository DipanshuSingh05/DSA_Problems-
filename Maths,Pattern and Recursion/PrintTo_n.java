class PrintTo_n{
    static void nos(int n){
        if(n == 0){
            return;
        }
        nos(n -1);
        System.out.print(n + " ");
    }
    // Reverse order
    static void revNos(int n ){
        if(n == 0){
            return;
        }
        System.out.print(n + " ");
        revNos(n-1);
    }
    public static void main(String[] args) {
        int n = 5;
        nos(n);
        System.out.println();
        revNos(n);
    }
}