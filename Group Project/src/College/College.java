package College;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.Scanner;

public class College implements Serializable {
	 //list of students
    private LinkedList<Student> students;      
    //constructor
    public College(){      
        this.students = new LinkedList<>();
    }
    //to add a student
    public void addStudent(String name){        
        this.students.add(new Student(name));
    }
    //to remove a student
    public void removeStudent(){        
        int index = displayStudents();
        this.students.remove(this.students.get(index));
    }
   //to print a student's records
    public void printRecord(){      
        int index = displayStudents();
        this.students.get(index).displayRecord();
    }
    //to add a new record to a student's records list
    public void addRecord(){        
        int index = displayStudents();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Course Name: ");
        String name = sc.nextLine();
        System.out.println("Please Enter Course Units: ");
        int units = sc.nextInt();
        sc.nextLine();
        System.out.println("Please Enter Course Grade: ");
        char grade = sc.next().charAt(0);
        this.students.get(index).addRecord(name,units,grade);
    }
    // to remove a record from a student's record list
    public void removeRecord(){    
        int index = displayStudents();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Course Name: ");
        String name = sc.nextLine();
        this.students.get(index).removeRecord(name);
    }

     //to display student's records
    private int displayStudents(){    
        System.out.println("Please Enter Student Number: ");
        for(int i=0;i<this.students.size();i++){
            System.out.println((i+1)+" -> "+this.students.get(i).getName());
        }
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt()-1;
        sc.nextLine();
        return index;
    }

}