package practice.recursion;

public class rec_calculate_power {
    public static int power (int x, int n){
        if (n <= 0){
            return 1;
        }
        return x * power(x, n-1);
    }
    public static void main(String[] args) {
        System.out.println(power(3, 4));
    }
}
