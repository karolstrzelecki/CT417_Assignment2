import static org.junit.jupiter.api.Assertions.*;

class StudentTest {





    @org.junit.jupiter.api.Test
    void userNameCheck() {
        Student student = new Student("John","Doe",1995, 5, 5);

        String var = student.getUserName();
        assertEquals("JohnDoe24",var);
    }
}