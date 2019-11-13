package College;
import java.io.Serializable;
import java.util.LinkedList;

public class Student implements Serializable{
	//to store student's name
	private String name;        
    //to store student's courses
    private LinkedList<Course> courses;   
    	//constructor
        public Student(String name){     
            this.name = name;
            this.courses = new LinkedList<>();
        }
        //to display a student's records
        public void displayRecord(){       
            System.out.println("\n***************************************************************\n");
            System.out.println("Student's details are :\n");
            System.out.println("Name : " + this.name + "\n");
            displayCourses();
            System.out.println("GPA : " + calculateGPA());
            System.out.println("\n***************************************************************\n");
        }
        //getter for name
        public String getName(){        
            return this.name;
        }
        // to add a new record to student's records list
        public void addRecord(String name, int units, char grade){ 
            this.courses.add(new Course(name,units,grade));
        }
        // to remove a record from a student's record list
        public void removeRecord(String name){      
            if(findCourse(name)!=null)
            this.courses.remove(findCourse(name));
            else
            System.out.println("Record not found!");
        }
        // to find a record from a student's record list
        private Course findCourse(String name){  
            for(int i=0; i<this.courses.size();i++){
                Course checkedCourse = this.courses.get(i);
                if(checkedCourse.getName().equalsIgnoreCase(name)){
                    return checkedCourse;
                }
            }
            return null;
        }
     // Display a student's courses
    private void displayCourses() {
        System.out.println("Courses are:\n");
        for (int i = 0; i < this.courses.size(); i++) {
            System.out.println((i + 1) + " -> " + this.courses.get(i).getName());
        }
    }
    //to calculate GPA
    private float calculateGPA(){ 
            float score = 0, gpa, units = 0;
        for (int i = 0; i < this.courses.size(); i++) {
            score += this.courses.get(i).getGradeScore()*this.courses.get(i).getUnits();
            units += this.courses.get(i).getUnits();
        }
        gpa = (score/units);
        return gpa;
    }
}