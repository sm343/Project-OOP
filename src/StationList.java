//Interface Search and it's methods
interface Search {

    void ByName(String s);

    void ByLocation(String s);

}

public class StationList implements Search {

    //Overriding interface methods

    //Overriding by name
    @Override
    public void ByName(String stationName) {
        for (Station station : Admin.stations) {
            if (station.getName().equals(stationName)) {
                System.out.println("Station name:" + station.getName() + ", Station Location:" + station.getLocation() + ", Students:" + station.getAcceptedStudent());
            }
        }
    }

    //Overriding by Location
    @Override
    public void ByLocation(String stationLocation) {
        for (Station station : Admin.stations) {
            if (station.getLocation().equals(stationLocation)) {
                System.out.println("Station name:" + station.getName() + ", Station Location:" + station.getLocation() + ", Students:" + station.getAcceptedStudent());
            }
        }
    }


}
