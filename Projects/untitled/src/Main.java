import java.sql.Date;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

public class Main {
    Hashtable<Integer,User> UserDb = new Hashtable<Integer,User>();
    Hashtable<Integer,Transactions> TransactionDb = new Hashtable<Integer,Transactions>();
    Hashtable<Integer,Account> AccountDb = new Hashtable<Integer,Account>();

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Account account = new Account();
        User user = new User();
        user.setName(scn.nextLine());
        user.setAddress(scn.nextLine());
        user.setAge(Integer.parseInt(scn.nextLine()));
        user.setBirthdate(Date.valueOf(scn.nextLine()));
        user.setEmail(scn.nextLine());
        Login(user,account);

        String sam = "Sas";



    }

    public void Login(User userProfile, Account account){

    }
    public void Register(){

    }

    public void GetCredit(){

    }

    public void MakeTransaction(){

    }

    public void PayCredit(){

    }
}