import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Admin extends User {

    //Variables
    private String name;
    final private String BITSEmailId;



    public static ArrayList<Station> stations = new ArrayList<>();

    public static ArrayList<Student> students = new ArrayList<>();

    //Getters
    public static ArrayList<Student> getStudents() {
        return students;
    }


    public String getBITSEmailId() {
        return BITSEmailId;
    }

    public static ArrayList<Station> getStations() {
        return stations;
    }

    public String getName() {
        return name;
    }

    //Constructor of Admin
    public Admin(String name, String BITSEmailId, String id, String password) {
        super(id, password);
        this.BITSEmailId = BITSEmailId;
    }

    //Method to add student in student array list "students"
    public static void addStudent(Student student) {
        students.add(student);
    }

    //Method to add station in student array list "stations"

    public static void addStation(Station station) {
        stations.add(station);


    }

    //Method to remove station in student array list "stations"
    public static void removeStation(Station station) {

        stations.remove(station);

    }

    //Method to edit station.
    public static void editStation(String name, String location) {
        for (Station station : stations) {
            if (station.getName().equals(name)) {
                station.setLocation(location);
            }
        }
    }

    //toString override method
    @Override
    public String toString() {
        return "Admin{" +
                "name='" + name + '\'' +
                ", BITSEmailId='" + BITSEmailId + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    //Method to allocate station to a student on basis of cgpa and branch
    public static void allocate(Student s) {
        for (Student student : students) {
            for (Station station : student.preferenceList) {
                if (station.branches.contains(student.getBranch()) && station.getCgpaCutoff() <= student.getCGPA()) {
                    System.out.println("Congratulations!," + station.getName() + " Allotted  to " + student.getName());
                    station.getAcceptedStudent().add(student);
                    return;

                } else {
                    continue;
                }
            }
        }
    }

    //Method to get Station.
    public static Station getStation(String stationName) {
        for (Station station : stations) {
            if (station.getName().equals(stationName)) {
                return station;
            }
        }
        return null;
    }

    //Method to print stations.
    public static void printStations() {
        for (int i = 0; i < stations.size(); i++) {
            System.out.println(stations.get(i));
        }
    }

}
