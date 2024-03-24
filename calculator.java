import java.util.Scanner;
public class calculator{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int totalmarks=0;
        
        System.out.println("enter num of sub:");
        int numofsub=sc.nextInt();
        for(int i=1;i<=numofsub;i++){
            System.out.println("num of marks obtained in sub"+i+":");
            int marks=sc.nextInt();
            totalmarks+=marks;



        }
        double percentage=(double)totalmarks/numofsub;
        char grade;
        if(percentage>=90){
            grade = 'A';
        }
        else if(percentage>=80){
            grade = 'B';
         }
         else if(percentage>=70){
            grade = 'C';
         }
         else if(percentage>=60){
            grade = 'D';
         }
         else{
            grade = 'f';

         }
         System.out.println("totalmarks:"+totalmarks);
         System.out.println("percentage:"+percentage);
         System.out.println("grade:"+grade);
         sc.close();




    }
}
