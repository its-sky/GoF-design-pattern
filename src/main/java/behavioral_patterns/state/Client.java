package behavioral_patterns.state;

public class Client {

    public static void main(String[] args) {
        OnlineCourse onlineCourse = new OnlineCourse();
        Student student = new Student("smc");
        Student newStudent = new Student("new smc");
        newStudent.addPrivate(onlineCourse);

        onlineCourse.addStudent(student);
//        onlineCourse.addReview("hello", student);

        onlineCourse.changeState(new Private(onlineCourse));

//        onlineCourse.addReview("hello", student);
        onlineCourse.addStudent(newStudent);

        System.out.println(onlineCourse.getReviews());
        System.out.println(onlineCourse.getState());
        System.out.println(onlineCourse.getStudents());
    }

}
