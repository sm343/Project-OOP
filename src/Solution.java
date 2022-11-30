import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Admin.stations.add(new Station("Station1", "location1", 9, Arrays.stream(new String[]{"CS", "ECE", "EEE"}).toList()));
        Admin.stations.add(new Station("Station2", "location2", 8, Arrays.stream(new String[]{"Mech", "ECE", "EEE"}).toList()));
        Admin.stations.add(new Station("Station3", "location3", 7, Arrays.stream(new String[]{"Civil", "ECE", "EEE"}).toList()));
        Admin.stations.add(new Station("Station4", "location4", 6, Arrays.stream(new String[]{"Chemical", "ECE", "EEE"}).toList()));

        Student s1 = new Student("name1", "BITSEmailId1", "id", "ECE", 9.0, "password");
        Student s2 = new Student("name2", "BITSEmailId2", "id", "ECE", 8.5, "password");
        Student s3 = new Student("name3", "BITSEmailId3", "id", "Branch", 6.0, "password");

        ArrayList<Station> preferenceList=new ArrayList<>();


        Admin.students.add(s1);
        Admin.students.add(s2);

        s2.addPreference("Station1");
        s2.addPreference("Station2");
        s2.addPreference("Station3");

        Admin.allocate(s2);

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