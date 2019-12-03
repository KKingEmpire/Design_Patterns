package creational_design_patterns.factory_design_pattern;

public class GetPlanFactory {
	public Plan getPlan(String planType) {
		if(planType == null)
			return null;
		else if(planType.equalsIgnoreCase("DOMESTIC"))
			return new DomesticPlan();
		else if(planType.equalsIgnoreCase("COMMERCIAL"))
			return new CommercialPlan();
		else if(planType.equalsIgnoreCase("INSTITUTIONAL"))
			return new InstitutionalPlan();
		else
			return new OtherPlan();		
	}

}
