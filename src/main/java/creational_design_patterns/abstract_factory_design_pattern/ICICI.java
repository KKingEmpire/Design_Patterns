package creational_design_patterns.abstract_factory_design_pattern;

class ICICI implements Bank{
	private final String BNAME;
	public ICICI() {
		BNAME = "ICICI BANK";
	}
	
	public String getBankName() {
		return BNAME;
	}
	
}
