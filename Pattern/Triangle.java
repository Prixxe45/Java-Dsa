package Pattern;

import java.util.Scanner;

// public class Triangle {
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter Number:");
//     int n = sc.nextInt();
//     for(int i = 1; i<=n; i++){
//       for(int j = 1; j<=i; j++){
//       System.out.print("* ");
//     }
//     System.out.println();
//     }
//   }
// }

// public class Triangle {
//   public static void main(String[] args) {
//     //Number Triange i for same nuber in a row and j for diffrent number
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter Number:");
//     int n = sc.nextInt();
//     for(int i = 1; i<=n; i++){
//       for(int j = 1; j<=i; j++){
//         if(i%2 != 0){
//  System.out.print(j + " ");
//         }else{
//           System.out.print((char)('A' + j - 1));
//         }
     
      
//     }
//     System.out.println();
//     }
//   }
// }


public class Triangle {
  public static void main(String[] args) {
    //Flipped triangle
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Number:");
    int n = sc.nextInt();
    // for(int i = 1; i<=n; i++){
    //   for(int j = n; j>=i; j--){
    //   System.out.print("* ");
    // }
    for(int i = 1; i<=n; i++){
      for(int j = 1; j<=n+1-i; j++){
      System.out.print((char)('a'+j-1));
    }
    System.out.println();
    }
  }
}
