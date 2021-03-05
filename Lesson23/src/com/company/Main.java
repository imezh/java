package com.company;

public class Main {

    public static void main(String[] args) {

        String string1 = "he";
        String string2 = "ll";
        String string3 = "o";

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string1).append(string2).append(string3);

        System.out.printf("This is string, %s \n",stringBuilder);

        System.out.printf("This is string, %d \n",100);

        System.out.printf("%f This is string, %10d \n",10.5, 100);

        System.out.printf("%f This is string, %10d \n",10.5, 10000);

        System.out.printf("This is string, %.2f \n",34.2379);

    }
}
