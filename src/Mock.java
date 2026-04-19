import java.util.HashMap;

public class Mock {

    static class Person{
        String name;
        int age;

        void output(){
            System.out.println("\n" + name);
            System.out.println(age);
        }
    }
    public static void main(String[] args) {

        //first task
        int[] arr = {3, 7, 2, 9, 5, 7};

        int max = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("The maximum element is: " + max);

        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println("The sum of the elements is: " + sum);

        System.out.print("Elements greater than 5: ");
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > 5){
                System.out.print( arr[i] + ", ");
            }
        }

        //second task
        String text = "banana";

        int counter = 0;
        for (int i = 0; i < text.length(); i++){
            if(text.charAt(i) == 'a'){
                counter++;
            }
        }
        System.out.println("\nHow many times is the letter a in the word banana: " + counter);

        System.out.print("Word banana reversed: ");
        for(int i = text.length() - 1; i >= 0; i--){
            System.out.print(text.charAt(i));
        }

        System.out.print("\nLetters different than a: ");
        for (int i = 0; i < text.length(); i++){
            if(text.charAt(i) != 'a'){
                System.out.print(text.charAt(i));
            }
        }

        //third task
        int[] array = {1, 2, 2, 3, 3, 3};

        HashMap<Integer, Integer> count = new HashMap<>();

        int maxCount = 0;
        int mostFrequent = 0;
        for(int i = 0; i < array.length; i ++){
            if(count.containsKey(array[i])){
                count.put(array[i], count.get(array[i]) + 1);

                if (count.get(array[i]) > maxCount){
                    maxCount = count.get(array[i]);
                    mostFrequent = array[i];
                }
            }else{
                count.put(array[i], 1);
            }
        }
        System.out.println("\n" + mostFrequent);


        //fourth task

        Person p = new Person();

        p.name = "Dayana";
        p.age = 23;

        p.output();



    }
}
