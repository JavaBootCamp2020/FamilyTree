
import java.util.Scanner;
/*
Author: Gil Silva
This assignment is to correct an incomplete code
Final result is to display Full name, age and family relation to Cedric.
 */

public class FamilyTree {
    public static void main(String[] args){

        Scanner input= new Scanner(System.in);

        String memberName;
        String relation;
        //Add age variable to original code.
        int age;

        System.out.println("Full Name: ");
        memberName = input.nextLine();

        System.out.println("Relation to Cedric: ");
        relation = input.nextLine();
        //Add age variable to user's input
        System.out.println("Age: ");
        age = input.nextInt(); // allows user to input his/her age

        //Output the user's info provided
        System.out.println(memberName+" is Cedric's "+ relation + " and is " + age + " years old.");
    }
}
