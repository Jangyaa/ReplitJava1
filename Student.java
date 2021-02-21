import java.util.Comparator;
import java.util.Random;

public class Student {
    public static final Comparator<Student> BY_NAME = new ByName();
    public static final Comparator<Student> BY_SECTION = new BySection();
    String name;
    int section;

    public Student(String _name, int _section) {
        name = _name;
        section = _section;
    }

    private static class ByName implements Comparator<Student> {
        public int compare(Student v, Student w) {
            return v.name.compareTo(w.name);
        }
    }

    private static class BySection implements Comparator<Student> {
        public int compare(Student v, Student w) {
            return v.section - w.section;
        }
    }

    public void print() { System.out.println(name + "\t" + section); }
}