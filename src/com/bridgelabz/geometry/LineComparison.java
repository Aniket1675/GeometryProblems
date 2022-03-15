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
    //UC2: Checking the Equality of Two Lines based on End Points
    public void equalityOfLines()
    {
        System.out.println("The Coordinates of 1st line are:");
        System.out.print("x1 = ");
        x1 = scanner.nextInt();
        System.out.print("y1 = ");
        y1 = scanner.nextInt();
        System.out.print("x2 = ");
        x2 = scanner.nextInt();
        System.out.print("y2 = ");
        y2 = scanner.nextInt();

        System.out.println("The Coordinates of 2nd line are:");
        System.out.print("x3 = ");
        x3 = scanner.nextInt();
        System.out.print("y3 = ");
        y3 = scanner.nextInt();
        System.out.print("x4 = ");
        x4 = scanner.nextInt();
        System.out.print("y4 = ");
        y4 = scanner.nextInt();

        Double length1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("The length of the 1st line is = " + length1);

        Double length2 = Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2));
        System.out.println("The length of the 2nd line is = " + length2);

        if (length1.equals(length2))
            System.out.println("The lines are equal");
        else
            System.out.println("The lines are not equal");
        System.out.println(" ");
    }
    //UC3: Comparison of Two Lines based on End Points
    public void comparisonOfLines()
    {
        Double length1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("The length of the 1st line is = " + length1);

        Double length2 = Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2));
        System.out.println("The length of the 2nd line is = " + length2);

        double size = length1.compareTo(length2);

        if (size > 0)
        {
            System.out.println("The line1 is longer than line2");
        }
        else if (size < 0)
        {
            System.out.println("The line2 is longer than line1");
        }
        else
            System.out.println("Both lines equal");
        System.out.println(" ");
    }
    //UC4: Compare to Method used with Oops
    public void comparison()
    {
        boolean a = false;
        boolean b = false;
        boolean EQUAL = (a == b);
        System.out.println("Lines are Equal : " + EQUAL);
        double line = compare(a, b);
        if (line == 1)
        {
            System.out.println("line1 is greater than line 2");
        }
        else
            System.out.println("line1 is lesser than line 2");
            System.out.println(" ");
    }
    private static double compare(boolean a, boolean b)
    {
        return 0;
    }
    public static void main(String[] args)
    {
	LineComparison lineComparison = new LineComparison();
    lineComparison.lengthOfLine();
    lineComparison.equalityOfLines();
    lineComparison.comparisonOfLines();
    lineComparison.comparison();
    }
}
