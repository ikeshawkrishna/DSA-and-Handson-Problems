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
}
