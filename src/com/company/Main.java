package com.company;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final double pi = 3.14159;
        final int decimalPlaces = 4;
        final double radio = scanner.nextDouble();
        final double area = pi * Math.pow(radio, 2);
        final double roundedArea = new BigDecimal(area).setScale(decimalPlaces, RoundingMode.HALF_UP).doubleValue();
        System.out.println("A=" + String.format("%.4f", roundedArea));
    }
}
