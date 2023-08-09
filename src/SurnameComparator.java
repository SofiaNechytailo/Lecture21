import java.util.Comparator;

public class SurnameComparator implements Comparator<Student> {
    public int compare (Student s1, Student s2){
        return s1.surname.compareTo(s2.surname);
    }
}
