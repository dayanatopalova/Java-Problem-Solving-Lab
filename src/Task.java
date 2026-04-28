public class Task {
    //napishete programa koqto otpechatva chislata ot edno do sto
    //kato vsqko treto chislo , kratno na tri se zamenq sas stringa fire
    //vsqko kratno na pet chislo se zamenq sas stringa bus
    //vsqko 15 chisli sus firebus

    public static void main(String[] args) {

        String word1 = "fire";
        String word2 = "bus";
        String word3 = "firebus";

        for (int i = 1; i <= 100; i++){

            if(i % 15 == 0){
                System.out.println(word3);
            } else if(i % 3 == 0){
                System.out.println(word1);;
            } else if(i % 5 == 0){
                System.out.println(word2);
            } else {
                System.out.println(i);
            }

        }
    }
}
