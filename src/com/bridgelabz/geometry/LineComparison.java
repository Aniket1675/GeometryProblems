package com.bridgelabz.geometry;

import java.util.Scanner;

public class LineComparison
{
    public static Scanner scanner = new Scanner(System.in);
    public static double x1, y1;
    public static double x2, y2;
    public static double x3, y3;
    public static double x4, y4;
    public void lengthOfLine()
    {
        System.out.println("The Coordinates of the Line are: ");
        System.out.println("x1 = ");
        x1 = scanner.nextInt();
        System.out.println("y1 = ");
        y1 = scanner.nextInt();
        System.out.println("x2 = ");
        x2 = scanner.nextInt();
        System.out.println("y2 = ");
        y2 = scanner.nextInt();

        // Calculate distance between two points
        double length = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("Length of Line is :" + length);
    }
    public static void main(String[] args)
    {
	LineComparison lineComparison = new LineComparison();
    lineComparison.lengthOfLine();
    }
}
