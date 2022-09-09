import javax.swing.*;

public class bank {

    public static void main(String[] args) {

    double LoanValue = 15000000;
    double NumberofSections = 36;
    double InterstRate = 0.15;
    

    String ans1= JOptionPane.showInputDialog("Enter Loan Value");
    String ans2= JOptionPane.showInputDialog("Enter number of periods");
    String ans3= JOptionPane.showInputDialog("Enter Interest rate value");
    
    LoanValue = Double.parseDouble(ans1);
    NumberofSections = Double.parseDouble(ans2);
    InterstRate = Double.parseDouble(ans3);
    double MonthlyInterstRate= InterstRate/12;
    
    Double PriceSection = LoanValue * (MonthlyInterstRate)/(1- Math.pow(1+MonthlyInterstRate,-NumberofSections));
    Double TotalPrice= PriceSection* NumberofSections;
    Double TotalInterest= TotalPrice - LoanValue;
    
    
    System.out.format("The price section for each period is: %,f\n", PriceSection);
    System.out.format("The total price is: %,f\n", TotalPrice);
    System.out.format("The total paid interest  %,f\n", TotalInterest);
    
    }
    
}
