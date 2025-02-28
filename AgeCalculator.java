
/**
 * Write a description of class AgeCalculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AgeCalculator{ 
   /* private int currentyear = 2025; 
    public int ageCalculator(int yearOfBirth){
        int age = 2025 - yearOfBirth; 
        if (age >= 16){
            System.out.prinln("Eligible to drive"); 
        } else{
            System.out.println("Must wait" + 16 - age +"years to drive"); 
        }
        return AgeCalculator;
    }
    */

    private int currentyear = 2025; 
    public int ageCalculator(int yearOfBirth){
        int age = 2025 - yearOfBirth; 
        int mustWait = 16 - age; 
        if (age >= 16){
            System.out.println("Eligible to drive"); 
        } else{
            System.out.println("Must wait " + mustWait +" years to drive"); 
        }
        return age;
    } 
     
}
