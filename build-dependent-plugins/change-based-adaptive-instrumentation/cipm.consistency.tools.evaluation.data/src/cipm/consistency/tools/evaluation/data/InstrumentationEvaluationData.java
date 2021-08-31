package cipm.consistency.tools.evaluation.data;

import java.util.ArrayList;
import java.util.List;

public class InstrumentationEvaluationData {
	private int expectedLowerStatementDifferenceCount;
	private int expectedUpperStatementDifferenceCount;
	private int statementDifferenceCount;
	private int reloadedStatementDifferenceCount;
	private boolean compiles;
	private int numberChangedMethods;
	private List<String> unmatchedChangedMethods = new ArrayList<>();
	private List<String> unmatchedIPs = new ArrayList<>();
	
	public int getExpectedLowerStatementDifferenceCount() {
		return expectedLowerStatementDifferenceCount;
	}
	
	public void setExpectedLowerStatementDifferenceCount(int expectedStatementDifferenceCount) {
		this.expectedLowerStatementDifferenceCount = expectedStatementDifferenceCount;
	}
	
	public int getExpectedUpperStatementDifferenceCount() {
		return expectedUpperStatementDifferenceCount;
	}
	
	public void setExpectedUpperStatementDifferenceCount(int expectedStatementDifferenceCount) {
		this.expectedUpperStatementDifferenceCount = expectedStatementDifferenceCount;
	}
	
	public int getStatementDifferenceCount() {
		return statementDifferenceCount;
	}
	
	public void setStatementDifferenceCount(int statementDifferenceCount) {
		this.statementDifferenceCount = statementDifferenceCount;
	}
	
	public int getReloadedStatementDifferenceCount() {
		return reloadedStatementDifferenceCount;
	}
	
	public void setReloadedStatementDifferenceCount(int reloadedStatementDifferenceCount) {
		this.reloadedStatementDifferenceCount = reloadedStatementDifferenceCount;
	}
	
	public boolean isCompiles() {
		return compiles;
	}
	
	public void setCompiles(boolean compiles) {
		this.compiles = compiles;
	}
	
	public int getNumberChangedMethods() {
		return numberChangedMethods;
	}
	
	public void setNumberChangedMethods(int numberChangedMethods) {
		this.numberChangedMethods = numberChangedMethods;
	}
	
	public List<String> getUnmatchedChangedMethods() {
		return unmatchedChangedMethods;
	}
	
	public List<String> getUnmatchedIPs() {
		return unmatchedIPs;
	}
}
