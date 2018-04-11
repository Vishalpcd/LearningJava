package collectionDemo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Collection_and_iterator_for_fetching_the_data {
	public static void main(String args[])
	{
		Collection cl=new ArrayList();
		for(int i=0;i<10;i++)
		{
			cl.add(i);
			System.out.println("Record "+i+" is added in the collection object");
		}
		Iterator it=cl.iterator();
		while(it.hasNext())
		{
			System.out.println(" "+it.next()+" ");
		}
	}

}
