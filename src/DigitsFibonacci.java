import java.util.HashMap;
import java.util.Map;

public class DigitsFibonacci {
    private Map<Integer, Long> hesh = new HashMap<>();
    public int fibonachiIteration(int n){
        int [] digits = new int[n];
        if(n<=0) throw  new IllegalArgumentException("Введите положительное число");
        else if(n==1) {
            return 0;
        }
        else if(n==2||n==3){
            return 1;
        } else{
            digits[1]=1;
            digits[2] =1;
            int i=3;
            while (i<n){
                digits[i]=digits[i-1]+digits[i-2];
                i++;
            }
            return digits[i-1];
        }
    }
    public  int fibonachiRecursion(int n){
        if(n<=0) throw  new IllegalArgumentException("Введите положительное число");
        if(n==1) return 0;
        if(n<=3) {
            return 1;
        }
        return fibonachiRecursion(n-1)+fibonachiRecursion(n-2);
    }
    public  long fibonachiDP(int n){
        if(n<=0) throw  new IllegalArgumentException("Введите положительное число");
        if(n==1) return 0;
        if (n <= 3) {
            return 1;
        }
        if (hesh.containsKey(n)) {
            return hesh.get(n);
        }
        long fib = fibonachiDP(n - 1) + fibonachiDP(n - 2);
        hesh.put(n, fib);
        return fib;
    }
}
