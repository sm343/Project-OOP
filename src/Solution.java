import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        //Testing purpose of classes and methods-->

        //Sorting students according to cgpa by overriding comparable.

        Student s1 = new Student("name1",7.2,20210001,"CS",Arrays.stream(new String[]{"OOP", "DSA", "M3"}).toList());
        Student s2 = new Student("name2",8.4,20210002,"EEE",Arrays.stream(new String[]{"M1", "HRD", "DISCO"}).toList());
        Student s3 = new Student("name3",6.5,20210003,"ENI",Arrays.stream(new String[]{"M2", "MEOW", "BIO"}).toList());



        Admin.students.add(s1);
        Admin.students.add(s2);
        Admin.students.add(s3);

//        Collections.sort(Admin.students);

//        for (Student s : Admin.students) {
//            System.out.println(s);
//        }

        Station st1=new Station("Station1","Jio",10,7.5,Arrays.stream(new String[]{"CS", "EEE", "ECE"}).toList());
        Station st2=new Station("Station2","DLF",20,9.2,Arrays.stream(new String[]{"MECHANICAL", "ENI", "ECE"}).toList());
        Station st3=new Station("Station3","Reliance",30,6.3,Arrays.stream(new String[]{"CHEMICAL", "CIVIL", "CS"}).toList());

        Admin.stations.add(st1);
        Admin.stations.add(st2);
        Admin.stations.add(st3);

        s1.preferenceList.add(st2);
        s1.addPreference("DLF");
        s1.addPreference("Reliance");
//        s1.addPreference("Reliance");

        System.out.println(s1.getPreferenceList());
        System.out.println(Admin.getStudents());
        s1.printStations();

        st1.setLocation("Delhi");
        st2.setLocation("Kolkata");
        st3.setLocation("Agra");

        s1.checkDetails("Jio");

        System.out.println(Admin.getStations());


        //Admin.addStation("SAIL");

        System.out.println(Admin.getStations());
        s1.checkDetails("Jio");

        //Admin.allocate(s1);





























        /************************************************************************************************************************
         Scanner sc = new Scanner(System.in);

         System.out.println("Choose stations from these available stations");

         Admin.stations.add(new Station("Station 1", "Jio", "Bengaluru",20,9, Arrays.stream(new String[]{"CS", "ECE", "EEE"}).toList()));
         Admin.stations.add(new Station("Station 2", "Reliance", "Mumbai",35,8, Arrays.stream(new String[]{"MECHANICAL", "CIVIL", "EEE"}).toList()));
         Admin.stations.add(new Station("Station 3", "DLF", "Gurgaon",24,7, Arrays.stream(new String[]{"CS", "ECE", "EEE"}).toList()));
         Admin.stations.add(new Station("Station 4", "SAIL", "Durgapur",56,7.5, Arrays.stream(new String[]{"EEE", "ECE", "CS"}).toList()));
         Admin.stations.add(new Station("Station 5", "GAIL", "Bhopal",75,8.2, Arrays.stream(new String[]{"CHEMICAL", "CS", "MECHANICAL"}).toList()));
         Admin.stations.add(new Station("Station 6", "BITS", "Goa",38,6.95, Arrays.stream(new String[]{"CS", "ECE", "EEE"}).toList()));
         Admin.stations.add(new Station("Station 7", "NIT", "Warangal",84,6.5, Arrays.stream(new String[]{"ENI", "ECE", "EEE"}).toList()));
         Admin.stations.add(new Station("Station 8", "IIT", "Bombay",48,8.7, Arrays.stream(new String[]{"CS", "ECE", "ENI"}).toList()));
         Admin.stations.add(new Station("Station 9", "HONDA", "Delhi",12,7.6, Arrays.stream(new String[]{"CS", "ENI", "EEE"}).toList()));
         Admin.stations.add(new Station("Station 10", "AUDI", "Ahmedabad",41,8.4, Arrays.stream(new String[]{"ENI", "ECE", "EEE"}).toList()));

         System.out.println(Admin.printStations());


         System.out.println("Enter station number");
         String stationNumber=sc.nextLine();

         System.out.println("Enter station name");
         String stationName=sc.nextLine();

         System.out.println("Enter station capacity");
         int stationCapacity=sc.nextInt();
         sc.nextLine();

         System.out.println("Enter Branches allowed");
         String branch = sc.nextLine();
         ArrayList<Branches> branchAllowed = new ArrayList<>();
         Arrays.asList(branch.strip().split(","))
         .forEach((String sub) -> {
         branchAllowed.add(Branches.valueOf(sub.strip()));
         });
         System.out.println(branchAllowed);



         System.out.println("Enter student name:");
         String studentName = sc.nextLine();
         sc.nextLine();

         System.out.println("Enter student CGPA:");
         double studentCGPA = sc.nextDouble();


         System.out.println("Enter student ID:");
         int studentID = sc.nextInt();
         sc.nextLine();

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

         Student s1=new Student(studentName,studentCGPA,studentID,studentBranch,subjectsCompleted);
         Admin.students.add(s1);
         Student s2=new Student(studentName,studentCGPA,studentID,studentBranch,subjectsCompleted);
         Admin.students.add(s2);
         Station st1=new Station(stationNumber,stationName,stationCapacity,Arrays.asList(branch.strip().split(",")));
         Admin.stations.add(st1);
         Station st2=new Station(stationNumber,stationName,stationCapacity,Arrays.asList(branch.strip().split(",")));
         Admin.stations.add(st2);
         Station st3=new Station(stationNumber,stationName,stationCapacity,Arrays.asList(branch.strip().split(",")));
         Admin.stations.add(st3);

         s1.printStations();*/

//**************************************************************************************************************************

//
//        System.out.println("Enter number of stations");
//        int num=sc.nextInt();
//
//        for(int i=0;i<num;i++) {
//
//            System.out.println("Enter station number:");
//            String stationNumber = sc.nextLine();
//            sc.nextLine();
//            System.out.println("Enter station name:");
//            String stationName = sc.nextLine();
//
//            System.out.println("Enter station location:");
//            String stationLocation = sc.nextLine();
//
//            System.out.println("Enter station CGPA cutoff:");
//            double stationCG = sc.nextDouble();
//            sc.nextLine();
//
//            System.out.println("Enter Branches allowed");
//            String branch = sc.nextLine();
//            ArrayList<Branches> branchAllowed = new ArrayList<>();
//            Arrays.asList(branch.strip().split(","))
//                    .forEach((String sub) -> {
//                        branchAllowed.add(Branches.valueOf(sub.strip()));
//                    });
//            System.out.println(branchAllowed);
//
//            //Station st1 = new Station(stationNumber, stationName, stationLocation, stationCG, Arrays.asList(branch.strip().split(",")));
//
//
//        }
//        System.out.println("Enter student details :");
//
//
//
//            System.out.println("Enter student name:");
//            String studentName = sc.nextLine();
//
//            System.out.println("Enter student CG:");
//            double studentCGPA = sc.nextDouble();
//            sc.nextLine();
//
//            System.out.println("Enter student ID:");
//            String studentID = sc.nextLine();
//
//            System.out.println("Enter student Branch:");
//            String studentBranch = sc.nextLine();
//
//            System.out.println("Enter student Bits Mail:");
//            String studentMail = sc.nextLine();
//
//            System.out.println("Enter student password:");
//            String studentPassword = sc.nextLine();
//
//            // Choose Subjects from these only {OOP, DD, DISCO, LOGIC, M3, HRD, CONMAN}.If more than one subjects provide with comma.
//
//            System.out.println("Enter student's completed subjects:");
//            String subjects = sc.nextLine();
//            ArrayList<Subjects> subjectsCompleted = new ArrayList<>();
//            System.out.println(subjects);
//            Arrays.asList(subjects.strip().split(","))
//                    .forEach((String sub) -> {
//                        subjectsCompleted.add(Subjects.valueOf(sub.strip()));
//                    });
//            System.out.println(subjectsCompleted);
//
//            Student s1 = new Student(studentName, studentMail, studentID, studentBranch, studentCGPA, studentPassword);
//            Admin.students.add(s1);
//            Student s2 = new Student(studentName, studentMail, studentID, studentBranch, studentCGPA, studentPassword);
//            Admin.students.add(s2);
//
//
//


//        Station st2 = new Station(stationNumber, stationName, stationLocation, stationCG, Arrays.asList(branch.strip().split(",")));
//        Station st3 = new Station(stationNumber, stationName, stationLocation, stationCG, Arrays.asList(branch.strip().split(",")));
//        Station st4 = new Station(stationNumber, stationName, stationLocation, stationCG, Arrays.asList(branch.strip().split(",")));


        //  Admin.students.add(s3);

//        Admin.stations.add(st2);
//        Admin.stations.add(st3);
//        Admin.stations.add(st4);

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