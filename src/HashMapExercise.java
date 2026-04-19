import java.util.HashMap;
import java.util.Scanner;

public class HashMapExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = Integer.parseInt(sc.nextLine());
        int[] array = new int[n];

        for(int i = 0; i < n; i++){
            System.out.print("Enter value: ");
            array[i] = Integer.parseInt(sc.nextLine());
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++){

            int num = array[i];

            if(map.containsKey(num)){
                map.put(num, map.get(num) + 1);
            }else{
                map.put(num, 1);
            }
        }
        System.out.println(map);
    }
}
