package sec01.exam01;

public class StudentExam {
    public static void main(String[] args) {
        // 선언과 초기화를 동시에
        Student s1 = new Student();

        // 선언과 초기화를 따로
        Student s2;
        s2 = new Student();

        // s1 == s2 : false

        Student s3 = null;
        s3 = s1;

        // s1 == s3 : true



    }
}
