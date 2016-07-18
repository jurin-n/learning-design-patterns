package Iterator_pattern;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyTeacherTest {

	@Test
	public void test() {
        Teacher you = new MyTeacher();
        you.createStudentList();
        you.callStudents();
	}

}
