package College;

import java.util.Scanner;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        College college = new College();       //the object I'll use to access all the functionality
        int choice, quit = 0;

        while (quit != 1) {     //it user wish to exit then I'll set quit to 1 so that this loop is over and program moves to the file writing part
            System.out.println("\n***************************************************************\n");
            System.out.println("Please Enter your choice as followed:\n");
            System.out.println("1: Add a student's record\n");
            System.out.println("2: Remove a student's record\n");
            System.out.println("3: Add a course to a student's record\n");
            System.out.println("4: Remove a course from a student's record\n");
            System.out.println("5: Display a student's records\n");
            System.out.println("6: Quit\n");
            System.out.println("\n***************************************************************\n");  //this presents choices to the user
            choice  = sc.nextInt();
            sc.nextLine();

            switch(choice){
                case 1:
                    System.out.println("Please Enter Student's name: ");
                    String name = sc.nextLine();
                    college.addStudent(name);   //adds a students to the list in college object
                    break;
                case 2:
                    college.removeStudent();    //removes a student from the list
                    break;
                case 3:
                    college.addRecord();        //adds a record to a student's records
                    break;
                case 4:
                    college.removeRecord();     //removes a record from a student's records
                    break;
                case 5:
                    college.printRecord();      //prints student's records
                    break;
                default:
                    quit = 1;
            }
        }
        FileOutputStream fileOut = null;
        try {
            fileOut = new FileOutputStream("college.txt");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);     //to write to a file
            objectOut.writeObject(college);     //to write a class object
            objectOut.close();      //to close the object
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}