package compareToAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListDemo {
	public static void main(String args[])
	{
	
	List<Mobile> mob=new ArrayList<>();
	mob.add(new Mobile("Nokia",7000,16));
	mob.add(new Mobile("Samsung",9000,32));
	mob.add(new Mobile("OnePlusOne",8000,16));
	//Comparator is an interface which has anonymous listener method which iis compare which contains two objects Mobile class
	Comparator<Mobile> mobCom=new Comparator<Mobile>() {
		
		@Override
		public int compare(Mobile o1, Mobile o2) {
			if(o1.getPrice()>o2.getPrice())
			{
				return 1;
			}
			else
			{
			return -1;
			}
		}
	};
	Collections.sort(mob,mobCom);//Collections is the class which will sort the list
	//It will throw an error to implement the Comparable interface to our class after that we can 
	//write logic for sorting the list by our own 
	
	for(Mobile m:mob)
	{
		System.out.println(m);
	}
	}

}
