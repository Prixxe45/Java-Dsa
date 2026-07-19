package Pattern;

import java.util.Scanner;

//change the value of j 
// for same nuber in a line print the value of i under second loop
public class AlphabetSquare {
  public static void main(String[] args) {
    Scanner sc  = new Scanner(System.in);
    System.out.print("Enter NUmber ");
    int n = sc.nextInt();
    for(int i=65;i<=65+n;i++){
for(int j=1;j<=n;j++){
    System.out.print((char)i+ " ");
    }
    System.out.println();
    }
  }
}
