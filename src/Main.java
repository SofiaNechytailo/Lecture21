import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        list.add(new Student("Yarovyi", 4.5));
        list.add(new Student("Kuznetcov", 4.2));
        list.add(new Student("Zalushnyi", 3.5));
        list.add(new Student("Valhalla", 2.5));
        System.out.println("Without sort");
        for(Student s: list){
            System.out.println(s);
        }
        MarkComparator markComparator = new MarkComparator();
        list.sort(markComparator);
        System.out.println("Sort by mark");
        for(Student s: list){
            System.out.println(s);
        }
        SurnameComparator surnameComparator = new SurnameComparator();
        list.sort(surnameComparator);
        System.out.println("Sort by surname");
        for(Student s: list){
            System.out.println(s);
        }
    }
}