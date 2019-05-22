package day44;
import java.util.*;
public class Dice {
public static void main(String[] args) {
	Job job1 = new Job();
	Job job2 = new Job("Java Developer");
	Job job3 = new Job("SDET", "Amazon", 130_000.0);

	System.out.println(job1.toString());
	System.out.println(job2.toString());
	System.out.println(job3.toString());
	
// Create a list of Jobs
	//and add different jobs, with company, salary, title
	
	
	ArrayList<Job> jobList = new ArrayList<>();
	jobList.add(job3);
	jobList.add(new Job("Scrum Master", "Google", 123000));
	jobList.add(new Job("SDET", "FreddieMac", 115000));
	jobList.add(new Job("BA", "Leidos", 98000));
	jobList.add(new Job("Senior QA Tester", "DELTA", 150000));
	
	System.out.println(jobList.toString());
	
	double maxSalary = 0;
	int highestIndex = -1;
	for(int i = 0; i < jobList.size(); i ++) {
		if(jobList.get(i).getAnnualSalary() > maxSalary) {
			maxSalary = jobList.get(i).getAnnualSalary();
			highestIndex = i;
		}
	}
	
	System.out.println("Highest salary: " + jobList.get(highestIndex));	// 1
	Job bestJob = jobList.get(highestIndex);
	System.out.println("Highest salary: " + bestJob.toString());		// 2
	
}
}
