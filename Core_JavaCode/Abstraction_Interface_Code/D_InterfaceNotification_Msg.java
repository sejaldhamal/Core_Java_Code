import java.util.*;
interface Notifiable
{
 void sendNotification();
}
class EmailNotification implements Notifiable
{
  String message;
   void setMessage(String message)
   {
      this.message=message;
     }
public void sendNotification()
{
  System.out.println("Sending Email:"+message);
 }
}
class SMSNotification implements Notifiable
{
  String message;
   void setMessage(String message)
   {
      this.message=message;
     }
public void sendNotification()
{
  System.out.println("Sending SMS:"+message);
}
}

public class D_InterfaceNotification_Msg
{
  public static void main(String x[])
  {
   Scanner xyz=new Scanner(System.in);
  System.out.println("Enter the Email:");
  String email=xyz.nextLine(); 

   System.out.println("Enter the SMS:");
   String sms=xyz.nextLine(); 

   EmailNotification e1=new EmailNotification();
   e1.setMessage(email);
   e1.sendNotification();
   
    SMSNotification e2=new SMSNotification();
    e2.setMessage(sms);
    e2.sendNotification();
  }
}

   
 
   
   