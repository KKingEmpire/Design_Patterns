package creational_design_patterns.abstract_factory_design_pattern;

class HDFC implements Bank{
	private final String BNAME;
	public HDFC() {
		BNAME = "HDFC BANK";
	}
	
	public String getBankName() {
		return BNAME;
	}
	
}
