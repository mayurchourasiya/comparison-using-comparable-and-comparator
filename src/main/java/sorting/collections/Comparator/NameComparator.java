package sorting.collections.Comparator;

import sorting.collections.Student;
import java.util.Comparator;

public class NameComparator implements Comparator<Student> {

    public int compare(Student s1, Student s2) {
        // Ascending
        return s1.getName().compareTo(s2.getName());

        // Descending
        //return s2.getName().compareTo(s1.getName());
    }


}


