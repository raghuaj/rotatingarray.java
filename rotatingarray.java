import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array =new int[5];
        int n=4;
        System.out.println("enter array elements");
        for(int i=0;i<=n;i++) {
            array[i] = input.nextInt();
        }
        for(int i=0;i<=n;i++) {
            System.out.print(array[i]);
        }
        int last =array[n];
        for(int i=n-1;i>0;i--) {
            array[i] = array[i - 1];
        }
        array[0]=last;
        for(int i=0;i<=n;i++) {
            System.out.print(array[i]);
        }
        }

    }
