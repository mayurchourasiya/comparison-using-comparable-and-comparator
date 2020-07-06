package sorting.collections;

import sorting.collections.Comparator.NameComparator;

import javax.swing.text.html.Option;
import java.time.LocalDateTime;
import java.time.Year;
import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Implementation {

    public static void main(String[] args) {

     /*   List<Student> students = new ArrayList<Student>();
        students.add(new Student("Mayur",101));
        students.add(new Student("Rahul",103));
        students.add(new Student("Hari",101));
        students.add(new Student("Asnshul",102));


        Collections.sort(students, (a,b)-> a.getRollNumber()-b.getRollNumber()*//*new RollNoComparator()*//*);
        ListIterator i = students.listIterator();
        System.out.println("Comparator : Ascending order sorted with roll no");
        while(i.hasNext()) {
            Student s = (Student) i.next();
            System.out.println("Name : " + s.getName() + "  Roll : " + s.rollNumber);
        }

        Collections.sort(students, new NameComparator());
        ListIterator i2 = students.listIterator();
        System.out.println("Comparator : Ascending order sorted with name");
        while(i2.hasNext()) {
            Student s = (Student) i2.next();
            LocalDateTime dt = LocalDateTime.now();
            System.out.println("Name : " + s.getName() + "  Roll : " + s.rollNumber+"  at  "+dt);
        }


        System.out.println(Byte.MAX_VALUE);*/

        ArrayList<Object> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add("Raja");
        arrayList.add(null);
        arrayList.add("");

        System.out.println(arrayList.size()+"\r\n Before filter");

        arrayList.stream().filter(k->(Optional.of(k).isPresent()));

        arrayList.forEach(System.out::println);

        System.out.println(arrayList.size()+"\n After filter");


        //Optional<Object> optional = Optional.ofNullable()
    }





}
