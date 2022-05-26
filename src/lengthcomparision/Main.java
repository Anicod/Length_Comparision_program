package lengthcomparision;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Enter the coordinate of the First line : ");
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();
        InputCoordinates inputCoordinates = new InputCoordinates(a1, a2, b1, b2);
        Double lengthOfLineOne = inputCoordinates.lengthOfTheLine();
        System.out.println("The length of the First line:" +lengthOfLineOne);

        System.out.println("Enter the coordinate of the  Second line : ");
        int p1 = sc.nextInt();
        int p2 = sc.nextInt();
        int q1 = sc.nextInt();
        int q2 = sc.nextInt();
        InputCoordinates inputCoordinatesSecond = new InputCoordinates(p1, p2, q1, q2);
        Double lengthOfLineTwo = inputCoordinatesSecond.lengthOfTheLine();
        System.out.println("The length of the second line:" +lengthOfLineTwo);
        inputCoordinates.caculationOfLines(lengthOfLineOne, lengthOfLineTwo);
    }
}
