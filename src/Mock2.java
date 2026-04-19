import java.util.HashMap;

public class Mock2 {
    public static void main(String[] args) {

        //first task
        int[] arr = {2, 4, 6, 8, 3, 5};

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                break;
            }
            System.out.println(arr[i]);
        }

        //second task
        String text = "programming";

            HashMap<Character, Integer> map = new HashMap<>();

            for (int i = 0; i < text.length(); i++){
                char c = text.charAt(i);
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
            for (int i = 0; i < text.length(); i++) {
                if (map.get(text.charAt(i)) == 1) {
                    System.out.println(text.charAt(i));
                    break;
                }
            }

        //task 3
        int[] array = {1, 2, 2, 3, 3, 4};

        HashMap < Integer, Integer> count = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            count.put(array[i], count.getOrDefault(array[i], 0) + 1);
        }

        for (int key : count.keySet()) {
            if (count.get(key) == 1) {
                System.out.print(key + " ");
            }
        }

        //fourth task
        String word = "aabbbcc";

        HashMap<Character, Integer> freq = new HashMap<>();


        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        int max = 0;
        char result = ' ';

        for (char key : freq.keySet()) {
            if (freq.get(key) > max) {
                max = freq.get(key);
                result = key;
            }
        }

        System.out.println(result + " -> " + max);



    }
}
