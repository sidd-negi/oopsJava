import java.util.Scanner;

class Account{
    int balance;
    Account(int balance){
        this.balance = balance;
    }
}

class SavingAccount extends Account{
    int interestRate = 5;
    SavingAccount(int balance, int interestRate){
        super(balance);
        this.interestRate = interestRate;
    }
}

class Vehicle{
    void start(){
        System.out.println("Vehicle is starting");
    }
}

class Car extends Vehicle{
    @Override
    void start(){
        System.out.println("Car is starting");
    }
}

class Bike extends Vehicle{
    @Override
    void start(){
        System.out.println("Bike is starting");
    }
}
public class main {
    public static void main(String[] args) {
        SavingAccount sa = new SavingAccount(1000, 5);
        System.out.println("Balance: " + sa.balance);
        System.out.println("Interest Rate: " + sa.interestRate);

        Vehicle myCar = new Car();
        Vehicle myBike = new Bike();

        myCar.start();
        myBike.start();
    }
}