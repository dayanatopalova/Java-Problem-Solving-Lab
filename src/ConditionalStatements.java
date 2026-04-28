import java.util.Scanner;

public class ConditionalStatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));

        String answer = "";

        System.out.print("Пали ли колата, когато завъртиш ключа? ");
        answer = sc.nextLine();
        if (answer.equals("Да")) {
            System.out.print("\nКорозирали ли са клемите н акумулатора? ");
            answer = sc.nextLine();
            if (answer.equals("Да")) {
                System.out.print("\nПочистете клемите.");
            } else {
                System.out.print("\nАкумулаторните кабели може да са повредени. Сменете ги.");
            }
        } else {
            System.out.print("\nЧува ли се щракащ звук? ");
            answer = sc.nextLine();
            if (answer.equals("Да")) {
                System.out.print("\nСменете акумулатора.");
            } else {
                System.out.print("\nЗавърта ли двигателят? ");
                answer = sc.nextLine();
                if (answer.equals("Да")) {
                    System.out.print("\nПроверете свещите.");
                } else {
                    System.out.print("\nДвигателят запалва, но веднага изгасва? ");
                    answer = sc.nextLine();
                    if (answer.equals("Да")) {
                        System.out.print("\nКолата има ли впръскване на гориво? ");
                        answer = sc.nextLine();
                        if (answer.equals("Да")) {
                            System.out.print("\nКолата има нужда от сервиз.");

                        } else {
                            System.out.print("\nПроверете, дали дроселът се отваря и затваря правилно.");

                        }
                    }

                }

            }

        }
    }
}
