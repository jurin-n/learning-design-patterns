package Iterator_pattern;

public abstract class Teacher {
    protected StudentList studentList;
    
    public abstract void createStudentList();
    public abstract void callStudents();
}
