/**
 *  This class request int number and output factorial of this number. Use WHILE cycle.
 *
 * @author  Kurlovich Alexander
 * @param intNumber  - int number.
 *
 * checkScannerIntNumber(sc, intNumber) - method from Utils class. Request number in console.
 *
 * @return  number factorial
 *
 */
package com.myproject;

import java.util.Scanner;

import static com.myproject.Utils.checkScannerIntNumber;

public class Lection03Task07a {

    public static void main(String[] args) {
        int intNumber = 1;

        Scanner sc = new Scanner(System.in);

        intNumber = checkScannerIntNumber(sc, intNumber);

        int tmpIntNumber = intNumber;

        int tmpJ = 1;
        int i = 1;
        while (i <= intNumber) {
            tmpJ = tmpJ * i;
            i++;
        }
        System.out.println("Factorial of " + tmpIntNumber + "! is :" + tmpJ);
    }
}