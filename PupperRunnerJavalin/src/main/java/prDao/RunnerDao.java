package prDao;

import pr.pojos.Runner;

public interface RunnerDao {
	
	public void createRunner(Runner runner);
	
	public Runner readRunner(String runnerId);
	
	public Runner readAllRunners();
	
	public Runner updateRunner(String runnerId, Runner runner);
	
	public void deleteRunner(Runner runner);

}
