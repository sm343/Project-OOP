import java.util.*;

enum Subjects {OOP, DD, DISCO, LOGIC, M3, HRD, CONMAN}  //Enum of Subjects

enum Branches {CS, ECE, EEE, ENI, MECHANICAL, CIVIL, CHEMICAL}  //Enum of Branches

public class Student extends User implements Comparable<Student> {

    //Variables
    private final String name;
    private final String BITSEmailId;

    final private String Branch;
    final private double CGPA;
    Station station;

    public ArrayList<Subjects> SubjectsCompleted;

    public ArrayList<Station> preferenceList = new ArrayList<>();

    //Getters
    public String getName() {
        return name;
    }


    public String getBITSEmailId() {
        return BITSEmailId;
    }

    public String getBranch() {
        return Branch;
    }

    public double getCGPA() {
        return CGPA;
    }

    public Station getStation() {
        return station;
    }




    public ArrayList<Subjects> getSubjectsCompleted() {
        return SubjectsCompleted;
    }


    public ArrayList<Station> getPreferenceList() {
        return preferenceList;
    }

    //Constructor of Student
    public Student(String name, String BITSEmailId, String id, String Branch, double CGPA, String password) {
        super(id, password);
        this.BITSEmailId = BITSEmailId;
        this.name = name;
        this.Branch = Branch;
        this.CGPA = CGPA;
        this.SubjectsCompleted = new ArrayList<Subjects>();

    }

    //Comparing student's CG by over-riding compareTo of comparable.
    public int compareTo(Student s) {
        if (this.CGPA > s.CGPA) return -1;
        else if (this.CGPA < s.CGPA) return 1;
        else return 0;
    }

    //Printing station method.
    public void printStations() {
        Admin.printStations();
    }

    //Add Preference method.
    public void addPreference(String stationName) {
        //Using input output through .txt file
        Station station = Admin.getStation(stationName);
        if (preferenceList.contains(station)) {
            return;
        }
        preferenceList.add(station);

    }

    //toString Method
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", BITSEmailId='" + BITSEmailId + '\'' +
                ", Branch='" + Branch + '\'' +
                ", CGPA=" + CGPA +
                ", SubjectsCompleted=" + SubjectsCompleted +
                ", preferenceList=" + preferenceList +
                '}';
    }

    //Check details of station method.
    public void CheckDetails(String stationName) {
        //Check details
        Station station = Admin.getStation(stationName);
        if (Admin.stations.contains(station)) {
            assert station != null;
            System.out.println("Location of the station: " + station.getLocation());
            System.out.println("CGPA cutoff of station : " + station.getCgpaCutoff());
            System.out.println("Branches offered by station: " + station.getBranches());
        }


    }


}


