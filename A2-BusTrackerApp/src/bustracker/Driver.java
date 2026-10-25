package bustracker;
import java.util.*;

public class Driver{
    private String name = "";
    public static final int MAX_BUSES = 3;
    private ArrayList<Bus> buses;

    public Driver(String n){
        this.name = n;
        this.buses = new ArrayList<Bus>();
    }


    public boolean canAssign(){return buses.size() < MAX_BUSES;}

    public String getName(){return name;}

    public ArrayList<Bus> getBuses(){return buses;}

    public void allocate(Bus b){buses.add(b);}

    public String toString(){
        return "Driver:" + name + "\n" + buses.toString();
    }
}
