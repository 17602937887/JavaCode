package code.February26th.Demo01;

public class ThreadTest extends Thread {
    private String StudentName = "";


    public ThreadTest(String studentName) {
        StudentName = studentName;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    @Override
    public void run() {
        for(int i = 0; i < 10; i++){
            System.out.println(getStudentName() + " -> " + i);
        }
    }
}
