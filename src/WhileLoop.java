import java.util.Random;
import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        double initialBalance = 0.0;
        double monthlyDeposit = 0.0;
        double annualPercentageRate = 0.0;

        int months = 0;

        while(true){
            System.out.print("Въведете начален баланс: ");
            initialBalance = Double.parseDouble(sc.nextLine());

            if(initialBalance < 0){
                System.out.print("Невалидна стойност. Опитайте отново.");
                continue;
            }else{
                break;
            }
        }

        while(true){
            System.out.print("Въведете месечна вноска: ");
            monthlyDeposit = Double.parseDouble(sc.nextLine());

            if(monthlyDeposit < 0){
                System.out.print("Невалидна стойност. Опитайте отново.");
                continue;
            }else{
                break;
            }
        }

        while(true){
            System.out.print("Въведете годишна лихва (%): ");
            annualPercentageRate = Double.parseDouble(sc.nextLine());

            if(annualPercentageRate <= 0 || annualPercentageRate > 100){
                System.out.print("Невалидна стойност. Опитайте отново.");
                continue;
            }else{
                break;
            }
        }

        while(true){
            System.out.print("Въведете брой месеци: ");
            months = Integer.parseInt(sc.nextLine());

            if(months <= 0){
                System.out.print("Невалидна стойност. Опитайте отново.");
                continue;
            }else{
                break;
            }
        }

        double monthlyPercentageRate = annualPercentageRate / 12 / 100;
        double sum = initialBalance;
        int game = 0;
        int bonus = 100;

        for (int i = 0;  i < months; i++){

            sum += monthlyDeposit;
            sum += sum * monthlyPercentageRate;

            game = random.nextInt(100) + 1;

            if(game <= 10){
                sum += bonus;
            }

        }

        if(sum > 10000){
            System.out.println("Целта е постигната!");
        }else{
            System.out.println("Целта не е постигната!");

        }

    }
}
