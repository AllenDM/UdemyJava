package com.allenmoody;

public class Main {

    public static void main(String[] args) {
//        int value =3;
//        if(value == 1) {
//            System.out.println("Value was 1");
//        }
//        else if(value == 2) {
//            System.out.println("Value was 2");
//        }
//        else {
//            System.out.println("Was not 1 or 2");
//        }

        int switchValue = 1;

        switch(switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3:case 4:case 5:
                System.out.println("was a 3 , or a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;

            default:
                System.out.println("Was not 1 or 2");
                break;
        }

        char charValue = 'y';

        switch (charValue) {
            case 'A':
                System.out.println("This is the letter A");
                break;
            case 'B':
                System.out.println("This is the letter B");
                break;
            case 'C':
                System.out.println("This is the letter C");
                break;
            case 'D':
                System.out.println("This is the letter D");
                break;
            case 'E':
                System.out.println("This is the letter E");
                break;
            default:
                System.out.println("A-E not found");
                break;



        }
    }
}
