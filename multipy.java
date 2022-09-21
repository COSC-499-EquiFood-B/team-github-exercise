import java.util.Random;

public class call {
    public static void main( String args[] ) {
        Random random = new Random();

        int a = random.nextInt(10);
        int b = random.nextInt(10);

        int c = a*b;

        System.out.printf("Multiple of %d and %d is %d", a, b, c);


    }
      
}
