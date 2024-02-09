import ch.qos.logback.classic.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    public static void main(String[] args) {
        Logger logger = (Logger) LoggerFactory.getLogger(DigitsFibonacci.class);
        DigitsFibonacci digit = new DigitsFibonacci();

        long startTime = System.currentTimeMillis();
        int fib1= digit.fibonachiIteration(20);
        System.out.println("Digit fibonachi = "+ fib1);
        long endTime = System.currentTimeMillis();
        logger.info("Время выполнения " +  (endTime-startTime) + " milisec");



        long  startTimeRec = System.currentTimeMillis();
        System.out.println("Digit fibonachi = "+ digit.fibonachiRecursion(20));
        long endTimeRec = System.currentTimeMillis();
        logger.info("Время выполнения " +  (endTimeRec-startTimeRec) + " milisec");


        long startTimeDP = System.currentTimeMillis();
        System.out.println("Digit fibonachi = "+ digit.fibonachiDP(20));
        long endTimeDP = System.currentTimeMillis();
        logger.info("Время выполнения " +  (endTimeDP-startTimeDP ) + " milisec");


    }
}