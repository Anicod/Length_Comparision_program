package lengthcomparision;

import java.util.Scanner;

public class LengthComparison {
    public static void main(String[] args) {
        System.out.println("welcome to line comparision computation");
        System.out.println("enter the coordinate of the first line");
        inputCoordinats firstLinecoordinats = new inputCoordinats();
        Scanner sc = new Scanner(System.in);
        firstLinecoordinats.x1 = sc.nextInt();
        firstLinecoordinats.y1 = sc.nextInt();
        firstLinecoordinats.x2 = sc.nextInt();
        firstLinecoordinats.y2 = sc.nextInt();
        System.out.println("length of the first line");
        firstLinecoordinats.lineLength();
        System.out.println("enter the coordinates of the second line");
        inputCoordinats secondLinecoordinats = new inputCoordinats();
        secondLinecoordinats.x1 = sc.nextInt();
        secondLinecoordinats.y1 = sc.nextInt();
        secondLinecoordinats.x2 = sc.nextInt();
        secondLinecoordinats.y2 = sc.nextInt();
        System.out.println("length of the second line is" );
        secondLinecoordinats.lineLength();




    }
}

