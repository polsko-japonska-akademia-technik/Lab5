/*
Autorzy: Aleksander Mojzych, Adrian Matyszczak 25.05.2019
 */
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class GradesStatistics
{
public static double calculateSD(int grades[])
{
    double sum = 0.0, standardDeviation = 0.0;
    int length = grades.length;

    for (double num : grades)
    {
        sum += num;
    }
    double mean = sum/length;
    for (double nume:grades)
    {
        standardDeviation += Math.pow(num-mean, 2);
    }
    return Math.sqrt(standardDeviation/length);
}
private final int LOWEST_GRADE = 0;
private final int HIGHEST_GRADE = 100;
private int[] grades;
private Scanner in;
public static void main (String[] args)
{
   GradesStatistics aGradesAverage = new GradesStatistics();
   aGradesAverage.in = new Scanner(System.in);
   System.out.print("Wpisz liczbe studentow: ");
   int numStudent = aGradesAverage.in.nextInt();

    aGradesAverage.run(numStudents);
}
private void run(int numStudents)
{
    if (numStudents <=0)
    {
        System.out.println("Nieprawidlowa liczba studentow");
        return;
    }
    grades = new int[numStudents];
    double sum = 0;
    int i = 0;
    while (i < numStudents)
    {
        System.out.print("Wpisz stopnie dla studentow %1$d: ", (i+1));
        int grade = in.nextInt();
        if ((grade >= LOWEST_GRADE) && (grade <= HIGHEST_GRADE))
        {
            grades[i] = grade;
            sum += grade;
            i++;
            continue;
        }
    System.out.print("Invalid grade, try again..");
    }

    Arrays.sort(grades);
    double median;
    if (grades.length % 2 == 0)
        median = ((double)grades[grades.length/2]+ (double)grades[grades.length/2-1])/2;
    else
        median = (double) grades[grades.length/2];
    double max=grades[numStudents-1];
    double min=grades[0];
    System.out.println("The grades are:");
    i=0;
    while(i<=(numStudents-1))
    {
        System.out.printf("["+grades[i]+"]");
    }
    System.out.printf("\nThe average is: %1$.2f\n", (sum / numStudents));
    System.out.printf("The median is: %1$.2f\n", median);
    System.out.printf("The minimum is: %1$.2f\n", min);
    System.out.printf("The maximum is: %1$.2f\n", max);
    System.out.printf("The standard dedviation is: %1$.2f\n", calculateSD(grades));


}
}
