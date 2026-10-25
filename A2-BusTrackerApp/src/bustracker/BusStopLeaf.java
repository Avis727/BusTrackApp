package bustracker;

public class BusStopLeaf extends RouteComponent{
    public BusStopLeaf(String name, int dwellMinutes){
        super(name, dwellMinutes);
    }

    @Override
    public int getTotalDwellMinutes(){
        return dwellMinutes;
    }
}
