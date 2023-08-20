package DataStructure.ch39_Sort_ArrayList_Collections_Comparator;


import java.util.*;

class Student{
    private int id;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
}

//Complete the code
public class Main
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.getCgpa() == o2.getCgpa()){
                    if (o1.getFname().equals(o2.getFname())){
                        return o1.getId() - o2.getId();
                    }
                    return o1.getFname().compareTo(o2.getFname());
                }
                return  Double.compare(o2.getCgpa(),o1.getCgpa());
            }
        });

        for(Student st: studentList){
            System.out.println(st.getFname());
        }
    }
}

/*
5
33 Rumpa 3.68
85 Ashis 3.85
56 Samiha 3.75
19 Samara 3.75
22 Fahim 3.76


Ashis
Fahim
Samara
Samiha
Rumpa
 */



