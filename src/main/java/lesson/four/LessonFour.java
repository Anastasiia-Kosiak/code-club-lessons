package lesson.four;

public class LessonFour {
    //switch - світлофор

    // for

    // while


    // do while


    // масиви

    // функції ==метод
    // void - пустота
    public static void main(String[] args) {
        // switch - перебирати

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter color: ");
//        String color = scanner.nextLine();
//        // case - випадок
//        switch (color) {
//            case "red":
//                System.out.println("STOP!!!");
//                break;
//            case "orange":
//            case "yellow":
//                System.out.println("WAIT!!!");
//                break;
//            case "green":
//                System.out.println("GO!!!");
//                break;
//            default:
//                System.out.println("Wrong color");
//        }
//        //
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter limit:");
//        int limit = sc.nextInt();

        // 5
        //

        // sum = 1 + 2 + 3 + 4 + 5
//        for (int c = limit; c >0;) {
//            System.out.print(c + " ");
//        }

        // while - поки
//
//        while(limit >=0) {
//            System.out.println(limit);
//            limit++; // limit = limit - 1
//        }
//

        //do while - роби, поки

//        do {
//            System.out.println(limit);
//            limit--;
//        } while (limit >=0);


        //масиви -
        int[] array = new int[]{3, 5, 7, -2, 10, 23};

//        System.out.println(array[0]); //3
//        System.out.println(array[1]); //5
//        System.out.println(array[2]); //7
//        System.out.println(array[3]); //-2
//        System.out.println(array[4]); //10
//        System.out.println(array[5]); // 23

        array[4] = 5;
//        System.out.println(array[4]);

//        for (int i=0; i< array.length; i++) {
//            System.out.print(array[i] + " ");
//        }

//        String stringArray[] = new String[]{"A", "B", "C"};
//        System.out.println(stringArray[1]);

        // 5 + 2;
//        int c = sum(0, 5);
//        System.out.println(c);
        ///

//        String result = printHello("Nastya");
//        System.out.println(result);

        int x = 1000;
        int y = 993;
        while (x > 0 && y > 0) {
            System.out.println(x + " - 7 = " + y);
            x -= 7;
            y -= 7;
        }
    }

    public static int sum(int a,int b) {
        int sum = a + b;
        return sum;
        //return - повернути

    }

    public  static String printHello(String name) { //
        String greeting = "Hello, " + name;
        return greeting;
    }

    public static void printName(String name) {
        System.out.println(name);
    }


    // return

    //void


    // switch
    // for
    // while
    // do..while
    //масиви
    //функції

    //
}
