package com.company;
import java.util.Scanner;

public class Main {
    private static Scanner keyboard = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = keyboard.nextInt();
            keyboard.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }
        public static void printInstructions() {
            System.out.println("Press ");
            System.out.println("0 - to print instructions");
            System.out.println("1 - to print the list of grocery items");
            System.out.println("2 - to add an item to the list");
            System.out.println("3 - to modify an item in the list");
            System.out.println("4 - to remove an item from the list");
            System.out.println("5 - to search for an item in the list");
            System.out.println("6 - to quit the application");
        }


        public static void addItem() {
            System.out.print("Please enter the grocery item: ");
            groceryList.addGroceryItem(keyboard.nextLine());
        }

        public static void modifyItem() {
            System.out.print("Enter item number: ");
            int itemNumber = keyboard.nextInt();
            keyboard.nextLine();
            System.out.print("Enter replacement item: ");
            String newItem = keyboard.nextLine();
            groceryList.modifyGroceryItem(itemNumber-1,newItem);
        }

        public static  void removeItem() {
            System.out.print("Enter item number: ");
            int itemNumber = keyboard.nextInt();
            keyboard.nextLine();
            groceryList.removeGroceryItem(itemNumber);
        }

        public static void searchForItem() {
            System.out.print("Enter item to search for: ");
            String searchItem = keyboard.nextLine();
            if (groceryList.findItem(searchItem) != null) {
                System.out.println("Found " + searchItem + " in the grocery list!");
            } else {
                System.out.println(searchItem + " is not in the grocery list!");
            }
        }
}
