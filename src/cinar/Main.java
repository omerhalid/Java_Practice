package cinar;

import java.time.LocalDate;
import java.util.Arrays;

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
    }
    static class Person {
        String name;

        Person(String name){
            this.name=name;
        }
    }
}

