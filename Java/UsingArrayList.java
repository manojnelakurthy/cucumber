package jan22;

import java.util.ArrayList;

public class UsingArrayList {

	public static void main(String[] args) {
		ArrayList<Object>str=new ArrayList<Object>();
		str.add("mon");
		str.add("tue");
		str.add("wed");
		str.add("thu");
		str.add("fri");
		str.add(123);
		str.add('c');
		System.out.println(str.get(4));
		for(Object each:str)
		{
			System.out.println(each);
		}
	}

}
