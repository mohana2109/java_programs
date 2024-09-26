// create class name
public class Bankcustomer{
 // variable
   int accountno,amount;
   String accounttype;
 // passing parameter in constructor
 Bankcustomer(int acno, int amt , String atype)
{
this.accountno = acno;
this.amount = amt;
this.accounttype =atype;
}
void display()//method to display 
{
System.out.println("AccountNo: "+accountno +" "+ "Amount: "+ amount +" " +"Accounttype: "+accounttype);
}
public static void main(String args[])
{
Bankcustomer obj1 = new Bankcustomer(123489876,30000,"saving account");
Bankcustomer obj2 = new Bankcustomer(234567890,70000,"current account");
obj1.display();
obj2.display();
}
}