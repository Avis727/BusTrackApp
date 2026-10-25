package bustracker;

public class Bus{
    private String busNumber = "500";
    private Driver driver;

    public Bus(String busNumber, Driver driver){
        this.busNumber = busNumber;
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

    public String toString(){
        return busNumber + "(" + driver.getName() + ")";
    }
}

