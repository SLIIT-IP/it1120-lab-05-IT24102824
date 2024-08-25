import java.util.Scanner;
public class IT24102824Lab5Q3 {
public static void main(String[] args){
Scanner scanner=new Scanner(System.in);

double charge=48000.0;
double amount;
int days;

System.out.print("Enter start Date (1-31):");
int sDate = scanner.nextInt();
System.out.print("Enter End Date (1-31):");
int eDate= scanner.nextInt();

if(sDate>0 && sDate<31 && eDate>0 && eDate<31) {
if(sDate<eDate){
days=eDate=sDate;

if(days>=5){

amount=(48000*days)*80/100;
}

if((days<=4)&&(days>3)){
amount=(48000*days)*90/100;
}

else{
amount=48000*days;
}

System.out.println("Room charge per Day:Rs."+charge+"/=");
System.out.println("Number of Days Reseverd:"+days);
System.out.println("Total Amount to be paid:"+amount);

}else{

System.out.print("Erorr:Start Date must be less than End Date");
}
  }
else{
System.out.print("Error:Days must be between 1 and 31");
}
}
   }