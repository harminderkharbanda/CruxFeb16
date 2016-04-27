package hashMaps;

import java.util.ArrayList;

public class Map<K, V> {

	private ArrayList<HashNode<K, V>> bucketArray;
	private int numBuckets;
	private int size;
	
	public Map()
	{
		bucketArray = new ArrayList<>();
		numBuckets = 10;
		size = 0;
		
		for(int i=0; i<numBuckets; i++)
		{
			bucketArray.add(null);
		}
	}
	
	public int size()
	{
		return size;
	}
	
	public boolean isEmpty()
	{
		return size() == 0;
	}
	
	public int getBucketIndex(K key)
	{
		int hashcode = key.hashCode();
		int index = hashcode % numBuckets;
		return index;
	}
	
	public V remove(K key)
	{
		int bucketIndex = getBucketIndex(key);
		HashNode<K, V> head = bucketArray.get(bucketIndex);
		HashNode<K, V> prev = null;
		while(head != null)
		{
			if(head.key.equals(key))
			{
				break;
			}
			prev = head;
			head = head.next;
		}
		if(head==null)
		{
			return null;
		}
		size--;
		if(prev!=null)
		{
			prev.next = head.next;
		}else{
			bucketArray.set(bucketIndex, head.next);	
		}
		return head.value;
	}
	
	public void put(K key, V value)
	{
		int bucketIndex = getBucketIndex(key);
		HashNode<K, V> head = bucketArray.get(bucketIndex);
		while(head != null)
		{
			if(head.key.equals(key))
			{
				head.value = value;
				return;
			}
			head = head.next;
		}
		
		size++;
		HashNode<K, V> newNode = new HashNode<K, V>(key, value);
		head = bucketArray.get(bucketIndex);
		newNode.next = head;
		bucketArray.set(bucketIndex, newNode);
		
		if((1.0)*size/numBuckets >= 0.7)
		{
			ArrayList<HashNode<K, V>> temp = bucketArray;
			bucketArray = new ArrayList<>();
			numBuckets = 2 * numBuckets;
			
			for(int i = 0; i< numBuckets; i++)
			{
				bucketArray.add(null);
			}
			
			for(HashNode<K, V> headNode: temp)
			{
				while(headNode != null)
				{
				put(headNode.key, headNode.value);
				headNode = headNode.next;
				}
			}
			
		}
		
	}
	
	public V get(K key)
	{
		int bucketIndex = getBucketIndex(key);
		HashNode<K, V> head = bucketArray.get(bucketIndex);
		while(head != null)
		{
			if(head.key.equals(key))
			{
				return head.value;
			}
			head = head.next;
		}
		return null;
	}
	
	
}
