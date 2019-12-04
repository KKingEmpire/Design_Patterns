package creational_design_patterns.abstract_factory_design_pattern;

public abstract class AbstractFactory {
	public abstract Bank getBank(String bank);
	public abstract Loan getLoan(String loan);
}
