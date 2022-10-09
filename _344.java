public class _344 {
    public static double myPow(double x, int n) {
        double ans=1.0;
        Long power = new Long(n);
        if(power<0){
            x=1/x;
            power = Math.abs(power);
        }
        while(power>0){
            if((power & 1)==1){
                ans *= x;
            }
            x *= x;
            power = power >> 1;
        }
        return ans;

    }

    public static void main(String[] args) {
        int x=4 ;
        int n = 2;
        System.out.println( myPow(x , n));

    }
}
