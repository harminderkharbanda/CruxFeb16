package lecture13Trees;

import java.util.ArrayList;

public class ArrayListUse {

	public static void main(String[] args) {
		
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(1,30); //it shifts 20 ahead to and add 30
		arrayList.add(0, 40); //shifts all 3 elements ahead and add 40 at 0th position
		arrayList.add(10, 100); //throws exception

		arrayList.set(0, 100);  //replaces the element at 0th position
		arrayList.get(0);
		arrayList.get(10); //will throw exception
	}

}
