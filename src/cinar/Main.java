package cinar;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    //first comment
    public static void main(String[] args) {
        System.out.println("Hello World!");
        //Non-primitive data types AKA reference data types
        String name = new String("Omer");
        System.out.println(name.toUpperCase());
        LocalDate date = LocalDate.now();
        System.out.println(date.getDayOfWeek());

        Person omer = new Person("Omer");
        System.out.println(omer.name.toUpperCase());

        String gender = "male";

        switch(gender){
            case "male":
                System.out.println("The gender is male");
                break;
            case "female":
                System.out.println("The gender is female");
                break;
        }

        //arrays

        int [] array = new int [2];
        System.out.println(Arrays.toString(array));
        int number = 21;
        array[0] = number;
        System.out.println(Arrays.toString(array));

        for (int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }

        int [] newArray = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(newArray));
        int lengthArray = newArray.length;
        System.out.println(lengthArray);

        String [] names = {"omer","ali","fatma","halenur"};

        boolean doesContain = false;
        String searchedName = "omer";
        //you can make enhanced for loop here for(int name: names)
        for(int i=0; i< names.length; i++){
            if (names[i] == searchedName){
                doesContain = true;
            }
            else{
                continue;
            }

            if (doesContain) {
                System.out.println("Found!");
            }
            else if (!(doesContain)) {
                System.out.println("Not Found!");
            }
        }

        //reverse cinar.array printing
        for(int i = names.length-1; i>=0; i--){
            System.out.println(names[i]);
        }
        //advanced looping through
        Arrays.stream(names).forEach(System.out::println);

        boolean isEven = false;
        while (!isEven){
            for (int x : newArray){
                if(x%2 == 0){
                    System.out.println("This number is the first even number: "+x);
                    isEven = true;
                }
            }
        }

        //user input
        System.out.println("What is your name? ");
        Scanner userInput = new Scanner(System.in);
        String userName = userInput.nextLine();
        System.out.println("Your name is "+userName);

    }
    static class Person {
        String name;

        Person(String name){
            this.name=name;
        }
    }

    static class Array {

        public static void main(String[] args) {

            char[] letters = {'A', 'A', 'B', 'C', 'D'};

            System.out.println("Which letter do you want to look for in the letters array? ");
            Scanner scanner = new Scanner(System.in);
            String letter = (scanner.nextLine()).toUpperCase();

            for (int i = 0; i < letters.length; i++) {
                if (letter.equals(String.valueOf(letters[i]))) {
                    System.out.println("Found! the index number: " + i);
                } else if (letter.equalsIgnoreCase(String.valueOf(letters[i]))) {
                    System.out.println("Not found!");
                }
            }

            countLetters(letters, 'A');

        }

        public static void countLetters(char [] letters, char searchedLetter){
            int counter = 0;

            for (int i = 0; i <letters.length ; i++) {
                if(searchedLetter == letters[i]){
                        counter ++;
                }
            }
            System.out.println("The number of "+ searchedLetter+ " has accured is: "+ counter);
        }
    }




    }

