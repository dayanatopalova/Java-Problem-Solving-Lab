public class ClassesExercise {
    public static void main(String[] args) {

        class Person {
            String name;
            int age;

            void sayHello() {
                System.out.println("Hello " + name + "." + " You are " + age + " years old");
            }

        }

        Person p = new Person();
        p.name = "Tuta";
        p.age = 23;

        System.out.println(p.name);
        p.sayHello();

    }
}
