//Gerardo Enriquez
//CSC 123
//Assignment 3

public class Executive extends Manager
{
	
	public Executive()
	{
		super();
		bonusRate = 0.10;
	}

	public Executive(String Nname, String NidNum, int Nage, double Nsalary, String Ntitle, String NdepName,double Nbonus)
	{
		super( Nname,  NidNum,  Nage,  Nsalary,  Ntitle,  NdepName);
		bonusRate = Nbonus;
	
	}
	
	public void setBonusRate(double Nbonus)
	{
		bonusRate = Nbonus;
		
	}
	
	public double getBonus()
	{
		return bonusRate;
		
	}

	public double getSalary()
	{
		double ExecSalary = super.getSalary()*(1+bonusRate);
		return ExecSalary;
		
	}

	private double bonusRate;


}