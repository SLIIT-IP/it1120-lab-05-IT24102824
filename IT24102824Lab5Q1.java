import java.util.Scanner;
public class IT24102824Lab5Q2{
public static void main (String[]args){
Scanner scanner= new Scanner(System.in);

System.out.print("Enter the number of new members introduced:");
int newMembers= scanner.nextInt();

String prize="";
if (newMembers<0){
System.out.println("input must be a number 0 or greater");
}

else{
switch (newMembers){

case 0:prize="No prize ";
break;

case 1:prize="Pen";
break;

case 2:prize="Umbrella";
break;

case 3:prize="Bag";
break;

case 4:prize="Travalling chair";
break;

default:prize="Hedphone";
break;
}
}
  System.out.println("Prize is a:"+prize);
}
    }

