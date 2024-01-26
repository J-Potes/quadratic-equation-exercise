package com.epam.rd.autotasks;

import java.util.Locale;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double x1 = 0;
        double x2 = 0;
        
        double in_root = (b*b) - (4*a*c);
        
        if(in_root < 0) {
        	System.out.println("no roots");
        }
        else {
        	x1 = ((-1*b) + sqrt(in_root))/(2*a);
        	x2 = ((-1*b) - sqrt(in_root))/(2*a);
        	
        	if(x1 == x2) {
        		System.out.println(x1);
        	}
        	else {
        		System.out.println(x1 + " " + x2);
        	}
        }

    }

}