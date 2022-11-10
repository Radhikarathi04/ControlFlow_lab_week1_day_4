import java.util.Scanner;

public class WhatShouldIWear {
    public static void main(String[] args) {

        // prompt the user for input about the weather
        System.out.println("What's the weather and temperature like today?");

        // collect user input about the weather and temperature that day
        Scanner reader = new Scanner(System.in);

        int temperature = reader.nextInt();
        String weather = reader.nextLine();


        System.out.println("The weather today is" + weather + " and " + temperature);


        // logical AND &&
        if (temperature > 0 && temperature < 10 || weather == "rainy") {
            System.out.println("Wear a waterproof winter jacket!");
        }
        else if (temperature > 10 || weather == "sunny"){
            System.out.println("Wear lighter clothes and don't forget to wear your sunscreen!");
        }
        else if (temperature < 0 || weather == "snowy") {
            System.out.println("Stay Cozy!");
        }


    }
}
