public class dequyjava {
    public static void main(String[] args) {
        System.out.println(  tinhLuyThua(1,3));
    }

    public static long tinhLuyThua(int x, int n) {

        if(n==1){
            return x;
        }
        return (x*tinhLuyThua(x,n - 1));

    }
}
