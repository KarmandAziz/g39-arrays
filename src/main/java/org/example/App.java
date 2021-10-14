package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class App 
{

    public static void main( String[] args) {

       int [][] numbers = new int [5][5];
       numbers [0][0] = 1;
         for (int[] array : numbers) {
             int index = 0;
             for(int number : array) {
                 System.out.println(number);
                 if(index ==array.length -1) {
                     System.out.println();
                 }
                 index++;
             }
         }




    }

    public static void arrayConcatExample(){
        String[] source = {"Foo", "Bar", "Baz"};
        String[] toAdd = {"Boo", "Baa"};

        String[] result = addToStringArray(source, toAdd);
        System.out.println(arrayToString(result));
    }

    public static String[] addToStringArray(final String[] source, String...strings) {
        String[] newArray = Arrays.copyOf(source, source.length + strings.length);
        for (int iWrite = source.length, iRead = 0; iRead<strings.length; iWrite++, iRead++){
            newArray[iWrite] = strings[iRead];
        }

        return newArray;
    }

    public static void nullExample(){

        String[] tasks = {"buy diapers"};
        String task = findTask("Cook dinner", tasks);
        if(task == null){
            System.out.println("Could not find the task.");
        }else {
            System.out.println(task);
        }
    }

    public static void dynamicArrayExample(){
        Scanner scanner = new Scanner(System.in);

        boolean running = true;
        String[] todos = {};
        while(running){
            System.out.println("Write a task: ");
            String task = scanner.nextLine();
            todos = addToStringArray(to dos, task);
            System.out.println(arrayToString(todos));
            System.out.println("Do you want to continue? (y / n)");
            switch (scanner.nextLine()){
                case "n":
                    running = false;
                    break;
            }
        }
    }

    public static String[] addToStringArray(final String[] source, final String string) {
        String[] newArray = Arrays.copyOf(source, source.length + 1);
        newArray[newArray.length -1] = string;

            return newArray;
    }

    public static String findTask(String task, String[] array) {
        Arrays.sort(array);
        int index = Arrays.binarySearch(array, task);
        if (index < 0){
            return null;
    }
       return array[index];
    }

    public static String arrayToString(String[] strings) {
        String message = "[";
        for (int i = 0; i < strings.length; i++) {
            message = message + strings[i];
            if (i != strings.length - 1) {
                message = message +", ";
            }
        }
        message += "]";
        return message;
    }

    public static String preferredFindTask(String task, String[] array) {
        for(String string : array) {
            if(task.equals(string)){
                return task;
            }
        }
        return null;
    }

}



