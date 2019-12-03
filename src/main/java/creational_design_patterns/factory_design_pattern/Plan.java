package creational_design_patterns.factory_design_pattern;

abstract class Plan {
	protected double rate=0;
	abstract void getRate();  
	   
    public void calculateBill(int units){  
         System.out.println(units*rate);  
     }  
}
