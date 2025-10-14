import java.util.Arrays;
import java.util.Random;

public class Loteria {
    public static void main(String[] args) {
        int[] sorteo = new int[6];
        Random random = new Random();
        for (int i = 0; i < sorteo.length; i++) {
            sorteo[i] = random.nextInt(49);
        }
        Arrays.sort(sorteo);
        for (int i = 0; i < sorteo.length; i++) {
            System.out.print(sorteo[i] + " ");
        }
    }
}



