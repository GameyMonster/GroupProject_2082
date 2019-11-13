package College;

import java.io.Serializable;

public class Course implements Serializable{
    private String name;        //to store name
    private int units;          //to store units
    private char grade;         //to store grade

        public Course(String name, int units, char grade){      //constructor
            this.name = name;
            this.units = units;
            this.grade = grade;
        }

        public String getName(){        //getter for name
            return this.name;
        }
        public int getUnits(){      //getter for units
            return this.units;
        }
        public char getGrade(){     //getter for grade
            return this.grade;
        }
        public float getGradeScore(){       //to retrieve grade score
            switch(this.grade){
                case 'A' : return 10.0f;
                case 'B' : return 9.0f;
                case 'C' : return 8.0f;
                case 'D' : return 7.0f;
                case 'F' : return 0.0f;
                default : return 0.0f;
            }
        }
}