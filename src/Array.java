import java.util.Scanner;
public class Array {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] arr = new int[n];
        int sum = 0;

        //въвеждане и сума
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(sc.nextLine());
            sum += arr[i];

            if(arr[i] > 2){
                System.out.println(arr[i]);
            }
        }
        //обхождане
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

        //най-голямо число
        int max = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);

        //най-малко число
        int min = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);

    }
}