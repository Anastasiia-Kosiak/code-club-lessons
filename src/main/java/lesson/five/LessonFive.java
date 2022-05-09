package lesson.five;

import java.util.Scanner;

public class LessonFive {
    public static void main(String[] args) {

        int[] bobr=new int[]{
                -2, 4, 5, 7
        };
        //
        Scanner bobr2=new Scanner(System.in);
        int y= bobr2.nextInt();
        boolean isFound = false;
        for(int i=0;i < bobr.length;i++){
            if(y==bobr[i]){
                isFound=true;
                System.out.println(i);
                break;
            }
        }
        if(isFound==false){
            System.out.println(-1);
        }
    }
}
