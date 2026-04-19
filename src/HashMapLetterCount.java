import java.util.Scanner;
import java.util.HashMap;

public class HashMapLetterCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a word: ");
        String word = sc.nextLine();

        HashMap<Character, Integer> count = new HashMap<>();

        for (int i = 0; i < word.length(); i ++){

            char letter = word.charAt(i);

            if(count.containsKey(letter)){
                count.put(letter, count.get(letter) + 1);
            }else{
                count.put(letter, 1);
            }
        }

        System.out.println(count);



    }
}
