import java.util.ArrayList;

public class Digits
{

	private ArrayList<Integer> digitList;

	public Digits(int num)
	{ 
		digitList=new ArrayList<Integer>();
		String str=""+num;
		for(int n=0;n<str.length();n++){
			digitList.add(str.charAt(n)-'0');
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
