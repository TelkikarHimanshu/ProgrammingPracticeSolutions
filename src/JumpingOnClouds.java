import java.util.Scanner;

/**
 * @author Himanshu Telkikar
 */
public class JumpingOnClouds {
    
    /*
     * Approach: if possible, take two steps -> To minimize the number of steps, else take one step
     */
    static int solution(int[] c) {
        
        int count = 0, i = 0;
        
        while (i < c.length - 1) {
            if (c[i] == 0) {
                if (i + 2 < c.length && c[i + 2] == 0) {
                    count++;
                    i = i + 2;
                } else if (c[i + 1] == 0) {
                    count++;
                    i = i + 1;
                }
            }
        }
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)  {
        System.out.println("Enter the number of clouds");
        int n = scanner.nextInt();
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = scanner.nextInt();
        }
        System.out.println("Enter the number which represents the cloud");
        int result = solution(c);
        System.out.println("The minimum number of steps are: " + result);
    }
}
