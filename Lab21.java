public class Lab21 {
    public static void main(String[] args) {
        Student s1 = new Student(4, "Artur","Hopkins");
        Aspirant a1 = new Aspirant(5, "Billy", "Fisher");

        s1.getScholarship();
        a1.getScholarship();
        Student[] students = new Student[2];
        students[0]=s1;
        students[1]=a1;
        for(int i =0; i<students.length;i++){
            students[i].getScholarship();
        }
    }
}
class Student {
    double avgMark;
    String firstName, lastName;

    public Student (double mark, String firstName, String lastName){
        this.avgMark = mark;
        this.firstName = firstName;
        this.lastName = lastName;

    }

    public void getScholarship(){
        if(avgMark==5){
            System.out.println(100);
        } else {
            System.out.println(80);
        }
    }
}

class Aspirant extends Student {

    public Aspirant (double avgMark, String firstName, String lastName){
        super(avgMark, firstName, lastName);
    }
    @Override
    public void getScholarship(){
        if(avgMark==5){
            System.out.println(200);
        } else {
            System.out.println(180);
        }
    }

}