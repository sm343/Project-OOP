import java.util.*;

enum Subjects {OOP, DD, DISCO, LOGIC, M3, HRD, CONMAN}

public class Student extends User implements Comparable<Student> {

    private final String name;
    private final String BITSEmailId;

    final private String Branch;
    final private double CGPA;
    Station station;


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

    public ArrayList<Subjects> SubjectsCompleted;

    public ArrayList<Subjects> getSubjectsCompleted() {
        return SubjectsCompleted;
    }

    public ArrayList<Station> preferenceList = new ArrayList<>();


    public ArrayList<Station> getPreferenceList() {
        return preferenceList;
    }

    public Student(String name, String BITSEmailId, String id, String Branch, double CGPA, String password) {
        super(id, password);
        this.BITSEmailId = BITSEmailId;
        this.name = name;
        this.Branch = Branch;
        this.CGPA = CGPA;
        this.SubjectsCompleted = new ArrayList<Subjects>();

    }

    public int compareTo(Student s) {
        if (this.CGPA > s.CGPA) return -1;
        else if (this.CGPA < s.CGPA) return 1;
        else return 0;
    }


    public void addPreference(String stationName) {
        //Using input output through .txt file
        Station station = Admin.getStation(stationName);
        if (preferenceList.contains(station)){
            return;
    }
        preferenceList.add(station);

    }

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

    public void CheckDetails() {
        //Check details


    }

    public void updateStatus() {

    }

}


