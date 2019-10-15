import java.util.ArrayList;

public class Investment 
{
	ArrayList<Contribution> theContributions;
	
	public Investment()
	{
		this.theContributions = new ArrayList<Contribution>();
	}
	
	void addContribution(Contribution c)
	{
		this.theContributions.add(c);
	}
	
	double getCurrentValue(int afterHowManyMonth)
	{
		//return the current value of this investment taking
		//time and an average 8% yearly or 0.67% monthly return
		//over afterHowManyMonths number of months
		//this.theCon
		double total = 0;
		for(int i = 0; i < afterHowManyMonth; i++)
		{
			total *= 1.0067;
			for(int l = 0; l < theContributions.size(); l++)
			{
				if(theContributions.get(l).monthNumber == i)
				{
					total += theContributions.get(l).amount;
				}
			}
		}
		return total;
	}
	
	double getTotalContributions()
	{
		//return the total amount ever investment not taking into
		//account interest.
		double dollars = 0;
		for(int i = 0; i < theContributions.size(); i++)
		{
			dollars += theContributions.get(i).amount;
		}
		return dollars;
	}
	
}
