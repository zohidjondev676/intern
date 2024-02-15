import java.util.Scanner;

public class ATM_project {


    Scanner scanner=new Scanner(System.in);
    double balance=50000;


    private String transactionHis(int balance, String name){
        return name+" -> "+balance;
    }

    private double withdraw( ){
        System.out.println("Enter the value of money: ");
     double sums= scanner.nextDouble();
        return balance-sums; }
    private double deposit( ){
        System.out.println("Enter the value of money: ");
        double sums= scanner.nextDouble();
        return balance+sums; }

    private double transfer( ){
        System.out.println("Enter the value of money: ");
        double sums= scanner.nextDouble();


        return balance+sums; }

    private static void quit( ){

    }











    public static void main(String[] args) {

    }
}
