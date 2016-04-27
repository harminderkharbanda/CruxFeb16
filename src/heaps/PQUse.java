package heaps;

import java.util.PriorityQueue;

public class PQUse {

	public static PriorityQueue<Integer> compare(PriorityQueue<Integer> p, int element)
	{
		if(p.peek()<element)
		{
			p.remove();
			p.add(element);
		}
		
		return p;
	}
	
	public static void main(String[] args) {
		
		int a [] = {10,8,7,9,11,6,3,0};
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		for(int i=0;i<3;i++)
		{
			pq.add(a[i]);
		}
		
		PriorityQueue<Integer> newpq=null;
		
		for(int i=3; i<a.length;i++)
		{
			newpq = compare(pq,a[i]);
		}
		
		int b[]=new int[3];
		for(int i=0;i<3;i++)
		{
			b[i] = newpq.remove();
			System.out.println(b[i]);
		}
		
		

	}

}
