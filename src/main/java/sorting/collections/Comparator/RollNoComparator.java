package sorting.collections.Comparator;

import sorting.collections.Student;

import java.util.Comparator;

public class RollNoComparator implements Comparator<Student> {

    public int compare(Student s1,Student s2){
        // Ascending
        return s1.getRollNumber() - s2.getRollNumber();

        //Descending
        //return s2.getRollNumber() - s1.getRollNumber();
    }
}
