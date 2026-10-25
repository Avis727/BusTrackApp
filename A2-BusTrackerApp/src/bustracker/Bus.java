package bustracker;
import java.util.*;

public class Bus{
    private String busNumber = "500";
    private Driver driver;
    private ArrayList<BusStop> stops;

    public Bus(String busNumber, Driver driver){
        this.busNumber = busNumber;
        this.stops = new ArrayList<BusStop>();
        if(driver.canAssign() == true){
            assignDriver(driver);
        }else{
            throw new IllegalArgumentException("Cannot assign more than 3 buses.");
        }
    }

    public void assignDriver(Driver driver){
        driver.allocate(this);
        this.driver = driver;
    }

    public String getBusNumber(){return busNumber;}

    public Driver getDriver(){return driver;}

    public void addStop(BusStop stop) {stops.add(stop);}

    public List<BusStop> getStops() {return stops;}

    public void setStops(List<BusStop> stops) {
        this.stops = new ArrayList<>(stops);
    }

    public String toString(){
        return busNumber + "(" + driver.getName() + ")";
    }
}

