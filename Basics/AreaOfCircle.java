package Basics;

import java.util.Scanner;

public class AreaOfCircle{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double r = sc.nextDouble();
     double pi = 3.1415926535;
     double area = pi*r*r;
     System.out.println(area);
  }
}