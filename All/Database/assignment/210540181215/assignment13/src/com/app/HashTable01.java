package com.app;

// Implement hash table with Bucket size as 1
public class HashTable01 implements HashTableIntf {
	class Bucket {
		int key;
	}

	/*
	 * class Bucket { private int key; public Bucket() {} public boolean Add(int
	 * key) {} // Implement chaining. public boolean Search(int key) {} }
	 */
	Bucket[] ht;
	int size;

	public HashTable01(int size) {
		this.size = size;
		ht = new Bucket[size];
	}

	private int HashFunctionModN(int key) {
		return key % size;
	}

	@Override
	public boolean Add(int key) {
		int i;
		for (i = 0; i < size; i++) {
			int bucketId = (HashFunctionModN(key) + i) % size;
//			System.out.println("For key " + key + ", bucketId is " + bucketId);

			if (ht[bucketId] == null) {
				ht[bucketId]=new Bucket();
				ht[bucketId].key = key;
				System.out.println(key + " added to bucketId " + bucketId);
				break;
			}
		}
		if(i==size)
		{
			System.err.println("Unable to add. Buckets full !");
			return false;
		}
		return true;
	}

	@Override
	public boolean Search(int key) {
		// Find the bucket id of the key, using hash function.
		int bucketId = HashFunctionModN(key);
		System.out.println("For key " + key + ", bucketId is " + bucketId);

		if (ht[bucketId] != null) {
			if (ht[bucketId].key == key) {
				System.out.println("Found key " + key);
				return true;
			}
			System.out.println("Not found key " + key);
			return false;
		}

		System.out.println("Bucket empty");
		return false;
	}

	@Override
	public boolean Delete(int key) {
		// TODO Auto-generated method stub
		return false;
	}

}
