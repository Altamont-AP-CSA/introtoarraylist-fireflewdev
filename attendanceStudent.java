import java.util.List;
import java.util.ArrayList;

public class attendanceStudent {

    private List<String> studentList;
    private List<Integer> daysMissed;

    public attendanceStudent(){
        studentList = new ArrayList<String>();
        daysMissed = new ArrayList<Integer>();
        initializeList();
        printList();
    }

    public void initializeList(){
        studentList.add("Josiah");
        studentList.add("Josh");
        studentList.add("Braden");
        studentList.add("Deven");
        studentList.add("Jack");
        studentList.add("Reese");
        //Below write a for loop that will assign a random int on the range [0,8). Then add this to the ArrayList daysMissed.

    }

    public void printList(){
        //This method should first call the function removeStudents and then print each student name and their daysMissed on the same line.

    }

    public void removeStudents(){
        //This method should delete ane student from the list that has missed more than 3 days of school.

    }

    public static void main(String[] args){
        attendanceStudent app = new attendanceStudent);
    }
}