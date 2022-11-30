import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Student s1 = new Student("name1", "BITSEmailId1", "id", "Branch", 9.0, "password");
        Student s2 = new Student("name2", "BITSEmailId2", "id", "Branch", 7.0, "password");
        Student s3 = new Student("name3", "BITSEmailId3", "id", "Branch", 6.0, "password");


        Station station1=new Station("bits","pilani");
        Station station2=new Station("iit","bombay");
        Station station3=new Station("nit","warangal");


         ArrayList<Station> preferenceList=new ArrayList<>();
         ArrayList<Station> stationsSelected = new ArrayList<>();

        Admin.students.add(s1);
        Admin.students.add(s2);


        Admin.stations.add(station1);
        Admin.stations.add(station2);

        s1.stationsSelected.add(station2);
        s1.stationsSelected.add(station3);



        s1.addPreference();


        if(station2.getCgpaCutoff()>=7.5) {
            Admin.allocate(s1);

        }




//        StationList.StationName.put("bits",Admin.students);


//        for(Map.Entry<String, ArrayList<Student>> m:StationList.StationName.entrySet()){
//            System.out.println("Station " + m.getKey() + " allocated to: ");
//            for (Student student: m.getValue()) {
//                System.out.println(student.getName());
//            }
//        }


//        for (Student s: Admin.students) {
//            System.out.println(s.getCGPA());
//        }
//
//        Collections.sort(Admin.students);
//        for (Student s: Admin.students) {
//            System.out.println(s.getBITSEmailId());
//        }

//        Admin.addStudent(s3);
//        //Testing only
//        Collections.sort(Admin.students);
//        for (Student s: Admin.students) {
//            System.out.println(s.getBITSEmailId());
//        }





//        System.out.println(s3.getBITSEmailId());
//        s2.SubjectsCompleted.add(Subjects.OOP);
//        System.out.println(s2.getSubjectsCompleted());

//        Admin.students.put(s1.getBITSEmailId(), s1);
//        Admin.students.put(s2.getBITSEmailId(), s2);
//        Admin.students.put(s3.getBITSEmailId(), s3);
//        System.out.println(Admin.students.get("BITSEmailId1").getName());
//        System.out.println(Admin.students.getBITSEmailId().getName());

//
//        List<Student> StudentArray = new ArrayList<Student>();
//
//        Student s4 = new Student("name1", "BITSEmailId1", "id", "Branch", 9.0, "password");
//        Student s5 = new Student("name2", "BITSEmailId2", "id", "Branch", 8.0, "password");
//        Student s6 = new Student("name3", "BITSEmailId3", "id", "Branch", 0.0, "password");
//
//
//        Collections.sort(StudentArray);



    }
}