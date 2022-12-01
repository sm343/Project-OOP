import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;


interface Search {

    void ByName(String s);

    void ByLocation(String s);

}

public class StationList implements Search {

    static Map<String, ArrayList<Student>> StationName=new HashMap<>();
    static Map<String, ArrayList<Student>> StationLocation=new HashMap<>();

    @Override
    public String toString() {
        return "StationList{" +
                "StationName=" + StationName +
                ", StationLocation=" + StationLocation +
                '}';
    }

    public static Map<String, ArrayList<Student>> getStationName() {
        return StationName;
    }

    public static Map<String, ArrayList<Student>> getStationLocation() {
        return StationLocation;
    }

    @Override
    public void ByName(String stationName) {
        for (Station station:Admin.stations) {
            if(StationName.containsKey(Objects.requireNonNull(Admin.getStation(stationName)).getName())){
                System.out.println("Station Location:"+station.getLocation()+"Students in this Station :"+Admin.getStudents());
            }
        }
    }

    @Override
    public void ByLocation(String stationLocation) {
        for (Station station:Admin.stations) {
            if(StationLocation.containsKey(Objects.requireNonNull(Admin.getStation(stationLocation)).getLocation())){  //check
                System.out.println("Station Name:"+station.getName()+"Students in this Station :"+Admin.getStudents());
            }
        }
    }


}
