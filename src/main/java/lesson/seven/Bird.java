package lesson.seven;

public class Bird  implements Fly { // Bird імплементує (реалізовує) інтерфейс Fly
    private boolean isFly;
    private String name;

    public void setFly(boolean isFly) {
        this.isFly = isFly;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean getFly() {
        return isFly;
    }

    // override - перевизначити, переписати
    // @ - анотація
    @Override
    public void fly() {
        if (this.getFly()) {
            System.out.println("I can fly!!!!!!");
        } else {
            System.out.println("I can't fly!!!! I can slide on my stomach");
        }
    }

    @Override
    public void printName() {
        System.out.println(getName());
    }
}

// Animal -> Bird
///           |
///          /\
//     Parrot Penguin