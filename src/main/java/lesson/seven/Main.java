package lesson.seven;

public class Main {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in); // оголошення сканера
//        int choice = sc.nextInt(); // зчитуємо з клавіатури число типу int
//        if (choice == 1) {
//            game1.displayInfo();
//        } else if (choice == 2) {
//            game2.displayInfo();
//        } else {
//            System.out.println("Choose 1 or 2");
//        }
//

        Bird bird = new Bird();
        Penguin penguin = new Penguin();
        penguin.setFly(false);
        Parrot parrot = new Parrot();
        parrot.setFly(true);
        parrot.setName("parrot");
        penguin.setName("penguin");
        System.out.println(penguin.getName() + " says ");
        penguin.fly();
        System.out.println(parrot.getName() + " says ");
        parrot.fly();
    }
}
//---------------------------------------------------
