import java.util.ArrayList;

public class Digits
{

	private ArrayList<Integer> digitList;

	public Digits(int num)
	{ 
		for(int n=0;n<num.length();n++){
			digitList.set(n,num.substring(n,n+1));
		}
	}

	public boolean isStrictlyIncreasing()
	{ 
		for(int n=0;n<digitList.size();n++){
			if(digitList.get(n)<=digitList.get(n-1)) return false;
		}
		return true;
	}
	
	public String toString()
	{
		return digitList.toString();
	}
}
