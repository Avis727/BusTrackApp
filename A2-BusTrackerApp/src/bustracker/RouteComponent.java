package bustracker;

abstract class RouteComponent{
    protected String name;
    protected int dwellMinutes;

    public RouteComponent(String name, int dwellMinutes){
        this.name = name;
        this.dwellMinutes = dwellMinutes;
    }

    public String getName(){return name;}

    @Override
    public String toString(){
        return "%s(%dmin)".formatted(name, dwellMinutes);
    }

    public abstract int getTotalDwellMinutes();
}



