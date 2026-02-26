import java.util.*;

class Appliance{
    void turnOn(){
        System.out.println("appliance working");
    }
}
class WashingMachine extends Appliance{
    void washClothes(){
        System.out.println("starts whashing");
    }
}
class SmartWashingMachine extends WashingMachine{
    void connectToWiFi(){
        System.out.println("WIFI connected");
    }
}


class Library{
    private String libraryName;
    protected String location;
}

class members extends Library{

}

class employee{
    String name;
    int salary;
    employee(String n, int s){
        name=n;
        salary=s;
    }
}
class manager extends employee{
    String department;
    manager(String i, int b, String d){
        super(i,b);
        department=d;
    }
}

public class assignment6{
    public static void main(String[] args){
        SmartWashingMachine swm = new SmartWashingMachine();
        Appliance ap = new Appliance();
        ap.turnOn();
        swm.connectToWiFi();
    }
}