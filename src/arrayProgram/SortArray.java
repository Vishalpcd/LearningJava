package arrayProgram;
import java.util.*;

public class SortArray {
	public static void main(String args[])
	{
		int swap,swap1;
		int length;
		int[] numberArray=new int[]{10,23,9,8,7,6,5,4,2,1};
		ArrayList<Integer> srtlist=new ArrayList<>();
		length=numberArray.length;
		int dup;
		
			for(int i=0;i<length;i++)
			{
				for(int j=0;j<length;j++)
				{
					if(i==j)
					{
						continue;
					}
					if(numberArray[i]>numberArray[j])
					{
						swap=numberArray[i];
						numberArray[i]=numberArray[j];
						numberArray[j]=swap;
					}
					
				}
			}
		for(int k=0;k<length;k++)
		{
			System.out.println(numberArray[k]);
		}
		for(int z=0;z<length;z++)
		{
			dup=numberArray[z];
			while(dup >0)
			{
				srtlist.add(dup%10);
				dup=dup/10;
			}
		}
		System.out.println(srtlist);
		
		for(int index=0;index<srtlist.size();index++)
		{
			for(int jindex=0;jindex<srtlist.size();jindex++)
			{
				if(index==jindex)
				{
					continue;
				}
				if(srtlist.get(index)>srtlist.get(jindex))
				{
					swap=srtlist.get(index);
					srtlist.add(index, srtlist.get(jindex));
					srtlist.add(jindex, swap);
				}
			}
		}
		System.out.println(srtlist);
	}

}
