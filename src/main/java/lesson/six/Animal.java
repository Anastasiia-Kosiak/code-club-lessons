package lesson.six;


public class Animal {
    //поля класу
    double speed; // поле speed типу double
    String name; // поле name типу String
    String sound; // поле sound типу String

    public Animal() {
    }

    public Animal(double speed, String name, String sound) {
        this.speed = speed;
        this.name = name;
        this.sound = sound;
    }

    public double getSpeed() { // гетер для поля sound
        return speed; //вертаємо значення speed
    }

    public String getName() {
        return name;
    }

    public String getSound() {
        return sound;
    }

    public void setSpeed(double speed) { //сетер для поля speed
        //this використовується для посилання на почний о'бєкт
        this.speed = speed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public void printGreeting() {
        System.out.println("Hello, I am " + this.name + ", I say " + this.sound);
    }
}
