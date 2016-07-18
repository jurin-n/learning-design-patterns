package Iterator_pattern;

import java.util.ArrayList;

public class NewStudentList {
    protected ArrayList<Student> students;
    public void add(Student student){
        students.add(student);
    }
    public Student getStudentAd(int index){
        return students.get(index);
    }
}
