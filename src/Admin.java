import java.util.ArrayList;

public class Admin {

    //Variables
    private final String name;

    private final String id;

    public static ArrayList<Station> stations = new ArrayList<>();

    public static ArrayList<Student> students = new ArrayList<>();


    //Getters

    public String getName() {
        return name;
    }

    public static ArrayList<Student> getStudents() {
        return students;
    }

    public static ArrayList<Station> getStations() {
        return stations;
    }


    //Constructor of Admin
    public Admin(String name, String id) {
        this.name = name;
        this.id = id;
    }

    //Method to add student in student array list "students"
    public static void addStudent(String name) {
        for (Student student : students) {

            students.add(student);

        }
    }

    //Method to add station in student array list "stations"

    public static void addStation(String name) {
        for (Station station : stations) {

            stations.add(station);

        }
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
                ", id='" + id + '\'' +
                '}';
    }

    //Method to allocate station to a student on basis of cgpa and branch
    public static void allocate() {
        for (Student student : students) {
            for (Station station : student.preferenceList) {
                if (station.branches.contains(student.getBranch()) && station.getCgpaCutoff() <= student.getCGPA()) {
                    System.out.println("Congratulations!," + station.getName() + " Allotted  to " + student.getName());

                    try {
                        station.getAcceptedStudent().add(student);
                        station.setCapacity(station.getCapacity() - 1);
                        if(station.getCapacity()<=0){
                            System.out.println("No more allotments possible.All seats are reserved.");
                        }
                        System.out.println("Present capacity of station :" + station.getCapacity());
                    } catch (NullPointerException e) {
                          System.out.println(e.getMessage());
                    }
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
