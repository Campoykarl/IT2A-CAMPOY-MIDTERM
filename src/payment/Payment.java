

package payment;

import static java.lang.System.exit;
import java.util.Scanner;


public class Payment {

     public void addPayment(){
          
       
           Scanner sc = new Scanner(System.in);
           config con = new config();
           System.out.print("Enter payment: ");
           int paym = sc.nextInt();
           System.out.print("Enter student id: ");
           int id = sc.nextInt();
           System.out.print("Enter amount: ");
           int am = sc.nextInt();
           System.out.print("Enter payment date: ");
           String pdate = sc.next();
           System.out.print("Enter payment method: ");
           int pmethod = sc.nextInt();
           System.out.print("Enter status");
           String stats = sc.next();
           String sql = "INSERT INTO Student (Payment_id,Student_id, amount, payment_date,payment_method, status) VALUES (?, ?, ?, ?,?,?)";
           
           con.addPayment(sql, paym, id, am, pdate, pmethod,stats);
     
     }
     public void viewPayment(){
          config con = new config();
        String votersQuery = "SELECT * FROM Payment";
        String[] votersHeaders = {"payment", "student id", "amount", "payment date", "payment method, status"};
        String[] votersColumns = {"Payment_id", "Student_id", "amount", "payment_date", "payment_method,status"};

        con.viewPayment(votersQuery, votersHeaders, votersColumns);
    } 
   public static void main(String[] args) {
    Payment pm = new Payment();
      Scanner sc = new Scanner(System.in);
       config con = new config();
       String res;
       
       System.out.println("1. Add Paymennt");
       System.out.println("2. View Payment");
       System.out.println("3. Update Payment");
       System.out.println("4. Delete Payment");
       System.out.println("5. Exit");
       int choice;
       
       System.out.print("Enter choice: ");
       choice = sc.nextInt();
       sc.nextLine();
       switch (choice){
           case 1:
               pm.addPayment();
           break;
           case 2:
               pm.viewPayment();
               break;
           case 3:
              pm.viewPayment();
              String sqlUpdate = "UPDATE Payment SET Payment_id = ?,Student_id = ?, amount = ?, payment_date = ?, payment_method = ?, status = ? WHERE Payment_id = ?";
              
              
               System.out.println("Enter Payment id to update: ");
               int newpaym = sc.nextInt();
               System.out.println("Enter Student id: ");
               int newid = sc.nextInt();      
               System.out.println("Enter new amount: ");
               int newam = sc.nextInt();
               System.out.print("Enter new payment date: ");
               String newpdate = sc.next();
               System.out.print("Enter new payment method: ");
               int newpmethod = sc.nextInt();
               System.out.print("Enter newstatus");       
               String newstats = sc.next();
           
           con.updatePayment(sqlUpdate, newpaym, newid,newam,newpdate,newpmethod);
           break;
           
           case 4: 
           pm.viewPayment();
           
          String sqlDelete = "DELETE FROM Payment WHERE Payment_id = ? ";
               System.out.println("Enter id to delete: ");
              break;
              
   }
       }
       }

  



    

