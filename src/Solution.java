import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        //Testing purpose of classes and methods-->

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter station number:");
        String stationNumber = sc.nextLine();
        System.out.println("Enter station name:");
        String stationName = sc.nextLine();
//        System.out.println("Enter compulsory subjects:");
//        Arrays.asList(Subjects.values()).forEach(System.out::println);

        System.out.println("Enter Branch Criterion for the Station:");
        String branch = sc.nextLine();
        ArrayList<Branches> branchAllowed = new ArrayList<>();
        Arrays.asList(branch.strip().split(","))
                .forEach((String sub) -> {
                    branchAllowed.add(Branches.valueOf(sub.strip()));
                });
        System.out.println(branchAllowed);
        System.out.println("Enter student name:");
        String studentName = sc.nextLine();
        System.out.println("Enter student CG:");
        double studentCG = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter student ID:");
        String studentID = sc.nextLine();
        System.out.println("Enter student Branch:");
        String studentBranch = sc.nextLine();
        System.out.println("Enter student's completed subjects:");
        String subjects = sc.nextLine();
        ArrayList<Subjects> subjectsCompleted = new ArrayList<>();
        System.out.println(subjects);
        Arrays.asList(subjects.strip().split(","))
                .forEach((String sub) -> {
                    subjectsCompleted.add(Subjects.valueOf(sub.strip()));
                });
        System.out.println(subjectsCompleted);


//
//        Admin.stations.add(new Station("Station1", "location1", 9, Arrays.stream(new String[]{"CS", "ECE", "EEE"}).toList()));
//        Admin.stations.add(new Station("Station2", "location2", 8, Arrays.stream(new String[]{"Mech", "ECE", "EEE"}).toList()));
//        Admin.stations.add(new Station("Station3", "location3", 7, Arrays.stream(new String[]{"Civil", "ECE", "EEE"}).toList()));
//        Admin.stations.add(new Station("Station4", "location4", 6, Arrays.stream(new String[]{"Chemical", "ECE", "EEE"}).toList()));
//
//
//        Student s1 = new Student("name1", "BITSEmailId1", "id", "ECE", 9.1, "password1");
//        Student s2 = new Student("name2", "BITSEmailId2", "id2", "Mechanical", 7.2, "password2");
//        Student s3 = new Student("name3", "BITSEmailId3", "id3", "Cs", 8.3, "password3");
//

//
//        Admin.students.add(s1);
//        Admin.students.add(s2);
//        Admin.students.add(s3);
//
//
//        StationList.StationName.put("Station1",Admin.getStudents());
//        StationList.StationName.put("Station2",Admin.getStudents());
//        StationList.StationName.put("Station3",Admin.getStudents());
//        StationList.StationName.put("Station4",Admin.getStudents());
//
//        System.out.println("Searching station.."+StationList.getStationName().get("Station1"));
//
//
//
//
//
//


/*********************************************
 Admin.stations.add(new Station("Station1", "location1", 9, Arrays.stream(new String[]{"CS", "ECE", "EEE"}).toList()));
 Admin.stations.add(new Station("Station2", "location2", 8, Arrays.stream(new String[]{"Mech", "ECE", "EEE"}).toList()));
 Admin.stations.add(new Station("Station3", "location3", 7, Arrays.stream(new String[]{"Civil", "ECE", "EEE"}).toList()));
 Admin.stations.add(new Station("Station4", "location4", 6, Arrays.stream(new String[]{"Chemical", "ECE", "EEE"}).toList()));

 Student s1 = new Student("name1", "BITSEmailId1", "id", "ECE", 9.0, "password");
 Student s2 = new Student("name2", "BITSEmailId2", "id", "ECE", 7.5, "password");
 Student s3 = new Student("name3", "BITSEmailId3", "id", "Branch", 6.0, "password");

 ArrayList<Station> preferenceList=new ArrayList<>();


 Admin.students.add(s1);
 Admin.students.add(s2);

 s2.addPreference("Station1");
 s2.addPreference("Station2");
 s2.addPreference("Station3");

 Admin.allocate(s2);
 *************************************************/

//        Station st1=new Station("bitsp","pilani",8.5,Arrays.stream(new String[]{"Chemical", "ECE", "EEE"}).toList());
//        Station st2=new Station("bitsg","goa",8.0,Arrays.stream(new String[]{"Chemical", "ECE", "EEE"}).toList());
//        Station st3=new Station("bitsh","hyd",7.5,Arrays.stream(new String[]{"Chemical", "ECE", "EEE"}).toList());
//        s2.CheckDetails("bitsp");

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