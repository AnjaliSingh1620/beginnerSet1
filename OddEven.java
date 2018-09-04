import java.util.Scanner;
public class OddEven {
 public static void main(String args[]) {
	 Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 if(n<0){
		 System.out.println("Invalid");
	 }
	  if(n%2==0) {
		 System.out.println("Even");
	 }
 }
}
