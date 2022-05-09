package lesson.six;

public class Main {
    public static void main(String[] args) {
        // створюємо об'єкт типу Animal
        // new - викликає конструктор для об'єкту та передаємо туди значення для полів speed, name, sound
        Animal dog = new Animal(10.0, "Rex", "Baff");

        dog.printGreeting(); // Hello, I am Rex, I say Baff
    }
}
