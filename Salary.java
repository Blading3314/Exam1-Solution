
/**
 * Write a description of class Salary here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Salary {
    private int hours; 
    private int wage; 
  
  /*  public netPay(int hours, int wage){
        int salary = hours * wage; 
        double calculateNetPay = salary * 0.3; 
       
        System.out.println("Your net pay is  "+ calculateNetPay); 
        
     
}*/ 
public double netPay(int hours, int wage){
    var salary = hours * wage;
    var deductions = salary * 0.3; 
    var calculateNetPay = salary - deductions; 
    System.out.println("Your net pay is " + calculateNetPay); 
    return calculateNetPay; 
}
}




