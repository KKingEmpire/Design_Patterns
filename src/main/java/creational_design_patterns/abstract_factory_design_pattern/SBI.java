package creational_design_patterns.abstract_factory_design_pattern;

class SBI implements Bank{
	private final String BNAME;
	public SBI() {
		BNAME = "SBI BANK";
	}
	
	public String getBankName() {
		return BNAME;
	}
	
}
