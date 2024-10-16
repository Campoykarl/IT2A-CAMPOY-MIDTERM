

package payment;

import java.util.Scanner;


public class Payment {

   
    public static void main(String[] args) {
       public void addPayment(){
          
       
           Scanner sc = new Scanner(System.in);
           config con = new config();
           System.out.println("Enter payment: ");
           int paym = sc.nextInt();
           System.out.println("Enter student id: ");
           int id = sc.nextInt();
           System.out.println("Enter amount: ");
           int am = sc.nextInt();
           System.out.println("Enter payment date: ");
           String pdate = sc.next();
           System.out.println("Enter payment method: ");
           int pmethod = sc.nextInt();
           System.out.println("Enter status");
           String stats = sc.next();
           String sql = "INSERT INTO Student (Payment_id,Student_id, amount, payment_date,payment_method, status) VALUES (?, ?, ?, ?,?,?)";
           
           con.addPayment(sql, paym, id, am, pdate, pmethod,stats);
           
       }
       public void viewPayment(){
          config con = new config();
        String votersQuery = "SELECT * FROM Payment";
        String[] votersHeaders = {"ID", "Name", "Birthdate", "Email", "Status"};
        String[] votersColumns = {"id", "name", "birthdate", "email", "status"};

        con.viewPayment(votersQuery, votersHeaders, votersColumns);
    }
           
          
       }
    

