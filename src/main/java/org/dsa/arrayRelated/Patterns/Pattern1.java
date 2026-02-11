package org.dsa.arrayRelated.Patterns;


public class Pattern1 {

    public static void main(String[] args) {
        pattern1(5);

        System.out.println("\n");
        pattern2(5);

        System.out.println("\n");
        pattern3(5);

        System.out.println("\n");
        pattern4(5);

        System.out.println("\n");
        pattern5(5);

        System.out.println("\n");
        pattern6(5);

        System.out.println("\n");
        pattern7(5);

        System.out.println("\n");
        pattern8(5);

    }

    /**
     * Pattern 1
     *  *****
     *  *****
     *  *****
     *  *****
     *  *****
     * 
    */
    static void pattern1(int number){
        for(int i = 0; i < number; i++){
            for(int j = 0; j < number; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    /**
     * Pattern 2
     *  *
     *  **
     *  ***
     *  ****
     *  *****
    */

    static void pattern2(int number){
        for (int i = 0; i < number; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    /**
     * Pattern 3
     *  1
     *  12
     *  123
     *  1234
     *  12345
    */

    static void pattern3(int number){
        for (int i = 0; i < number; i++) {
            for (int j = 1; j <= i+1; j++) {
                System.out.print(j);
            }
            System.out.print("\n");
        }
    }

    /**
     * Pattern 4
     *  1
     *  22
     *  333
     *  4444
     *  55555
    */

    static void pattern4(int number){
        for (int i = 0; i < number; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(i+1);
            }
            System.out.print("\n");
        }
    }

    /**
     * Pattern 5
     *  *****
     *  ****
     *  ***
     *  **
     *  *
    */

    static void pattern5(int number){
        for (int i = number; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    /**
     * Pattern 6
     *  12345
     *  1234
     *  123
     *  12
     *  1
    */

    static void pattern6(int number){
        for (int i = number; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.print("\n");
        }
    }

    /**
     * Pattern 7
          *
         ***
        *****
       *******
      *********
    */

    static void pattern7(int number){
        for(int i = 0; i < number; i++){
            for(int k = 0; k < number - i - 1; k++){
                System.out.print(" ");
            }
            for(int j = 0; j < i * 2 + 1; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    /**
     * Pattern 8
      *********
       *******
        *****
         ***
          *
    */

    static void pattern8(int number){
        for(int i = 0; i < number; i++){
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            for(int k = 0; k < (number * 2 - (i*2+1));k++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
