package cipm.consistency.tools.evaluation.data;

public class ExecutionTimeData {
	private long changePropagationTime;
	private long instrumentationTime;
	private long overallTime;
	
	public long getChangePropagationTime() {
		return changePropagationTime;
	}
	
	public void setChangePropagationTime(long changePropagationTime) {
		this.changePropagationTime = changePropagationTime;
	}
	
	public long getInstrumentationTime() {
		return instrumentationTime;
	}
	
	public void setInstrumentationTime(long instrumentationTime) {
		this.instrumentationTime = instrumentationTime;
	}
	
	public long getOverallTime() {
		return overallTime;
	}
	
	public void setOverallTime(long overallTime) {
		this.overallTime = overallTime;
	}
}
