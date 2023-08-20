package DataStructure.ch42_priority_queue;


import java.util.*;
/*
 * Create the Student and Priorities classes here.
 */

class Priorities{
    List<Student> students;
    PriorityQueue<Student> PQ_Student;
    List<Student> getStudents(List<String> events){

        students = new  ArrayList<>();
        PQ_Student = new PriorityQueue<>();

        for (String event: events){
           if (event.equals("SERVED")){
               //remove one student
                //removingElements();
               PQ_Student.poll();
               //System.out.println(PQ_Student.poll().getName());
           }
           else {
               String[] element = event.split(" ");
               //students.add(new Student(Integer.parseInt(element[3]),element[1],Double.parseDouble(element[2])));
               PQ_Student.add(new Student(Integer.parseInt(element[3]),element[1],Double.parseDouble(element[2])));
           }
        }

        Iterator<Student> iterator = PQ_Student.iterator();
        while (iterator.hasNext()){
            students.add(PQ_Student.poll());
        }

        //System.out.println("\n");


        return  students;
    }


}

class Student implements Comparable<Student>{
    int id;
    String name;
    double cgpa;

    Student(int id, String name, double cgpa){
        this.id = id;
        this.cgpa = cgpa;
        this.name = name;
    }

    int getID(){
        return this.id;
    }


    String getName(){
        return this.name;
    }

    double getCGPA(){
        return this.cgpa;
    }

    boolean equals(Student other){
        return this.getCGPA() == other.getCGPA();
    }

    public int compareTo(Student other){
        /*
        if (this.equals(other)){
            return 0;
        } else

         */
        if(this.getCGPA() < other.getCGPA() ) {
            return 1;
        }else if ( this.getCGPA() == other.getCGPA() && this.getName().compareTo( other.getName())>0 ){
            return 1;
        } else if ( this.getCGPA() == other.getCGPA() && this.getName().compareTo( other.getName())==0 && this.getID()>other.getID() ){
            return 1;
        } else {
            return -1;
        }
    }
}


public class Main {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}

/*
    Sample Input 0

12
ENTER John 3.75 50
ENTER Mark 3.8 24
ENTER Shafaet 3.7 35
SERVED
SERVED
ENTER Samiha 3.85 36
SERVED
ENTER Ashley 3.9 42
ENTER Maria 3.6 46
ENTER Anik 3.95 49
ENTER Dan 3.95 50
SERVED

        Sample Output 0

        Dan
        Ashley
        Shafaet
        Maria
 */