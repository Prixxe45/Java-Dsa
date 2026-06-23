package Basics;

public class DataType {
  public static void main(String[] args) {

    // v ariable hamesha _ or alphabet or $ se hi start hoga or in do ke alawa koi bhi special character variable name mai kahi use nahi ho sakta number aa sakte hai lekin no se start nahi ho sakta
    
        // byte: 1 byte memory use karta hai
        // Range: -128 to 127
        byte age = 22;

        // short: 2 bytes memory use karta hai
        // Range: -32,768 to 32,767
        short salary = 30000;

        // int: 4 bytes memory use karta hai
        // Integer values store karne ke liye sabse common data type
        int marks = 95;

        // long: 8 bytes memory use karta hai
        // Bahut bade integer numbers store karne ke liye
        // Value ke end me L lagana hota hai
        long population = 1400000000;

        // float: 4 bytes memory use karta hai
        // Decimal values store karta hai
        // Value ke end me f lagana zaruri hai
        float price = 99.99f;

        // double: 8 bytes memory use karta hai
        // float se zyada precise decimal values store karta hai
        double pi = 3.1415926535;

        // char: Single character store karta hai
        // Character ko single quotes (' ') me likhte hain
        char grade = 'A';

        // boolean: Sirf true ya false value store karta hai
        boolean isPassed = true;

        // String: Non-primitive data type
        // Multiple characters (text) store karta hai
        String name = "Prince";

        // Array: Same type ke multiple values store karta hai
        int[] numbers = {10, 20, 30, 40, 50};

        // Values print karna
        System.out.println("Byte Value: " + age);
        System.out.println("Short Value: " + salary);
        System.out.println("Int Value: " + marks);
        System.out.println("Long Value: " + population);
        System.out.println("Float Value: " + price);
        System.out.println("Double Value: " + pi);
        System.out.println("Char Value: " + grade);
        System.out.println("Boolean Value: " + isPassed);
        System.out.println("String Value: " + name);

        // Array ka pehla element print karna
        System.out.println("First Array Element: " + numbers[0]);
  }
}
