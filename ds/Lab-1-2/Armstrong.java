public class Armstrong {
    public static void main(String[] args) {
        System.out.print("Armstrong numbers : ");
        int len=1, n;
        for (int i = 1; i <= 1000; i++) {
            len = length(i);
            n=i;
            int sum = 0;
            while (n>0) {
                sum += Math.pow(n%10, len);
                n/=10;
            }
            if (sum==i) {
                System.out.print(i+" ");
            }
        }        
    }
    public static int length(int n) {
        int len=0;
        while (n>0) {
            len++;
            n/=10;
        }
        return len;
    }
}
