public class Student{
    String surname;
    double mark;
    public Student(String _surname, double _mark){
        this.surname = _surname;
        this.mark = _mark;
    }
    @Override
    public String toString() {
        return surname + " - " + mark;
    }
}


