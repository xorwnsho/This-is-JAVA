package generic.sec04;

public class GenericMain {
    public static void main(String[] args) {
        Course.registerCourse3(new Applicant<Person>(new Person()));
        Course.registerCourse3(new Applicant<Worker>(new Worker()));
        //Course.registerCourse3(new Applicant<Student>(new Student()));
        //Course.registerCourse3(new Applicant<HigherStudent>(new HigherStudent()));
        //Course.registerCourse3(new Applicant<MiddleStudent>(new MiddleStudent()));
    }
}
