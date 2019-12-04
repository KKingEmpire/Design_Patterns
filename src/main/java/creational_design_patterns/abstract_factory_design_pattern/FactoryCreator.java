package creational_design_patterns.abstract_factory_design_pattern;

public class FactoryCreator {
	public static AbstractFactory getFactory(String choice){  
	      if(choice.equalsIgnoreCase("Bank")){  
	         return new BankFactory();  
	      } else if(choice.equalsIgnoreCase("Loan")){  
	         return new LoanFactory();  
	      }  
	      return null;  
	}
}
