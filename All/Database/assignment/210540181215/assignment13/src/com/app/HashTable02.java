package com.app;

// Implement hash table with Bucket size as 1
public class HashTable02 implements HashTableIntf {
	class Bucket {
		int key;
	}

	/*
	 * class Bucket { private int key; public Bucket() {} public boolean Add(int
	 * key) {} // Implement chaining. public boolean Search(int key) {} }
	 */
	Bucket[] ht;
	int size;

	public HashTable02(int size) {
		this.size = size;
		ht = new Bucket[size];
	}

	private int HashFunctionMidSquare(int key) {
		String str = Integer.toString(key * key);
		char mid = str.charAt(str.length() / 2);
		return Integer.parseInt(String.valueOf(mid));
	}

	@Override
	public boolean Add(int key) {
		int bucketId = HashFunctionMidSquare(key);
		System.out.println("For key " + key + ", bucketId is " + bucketId);

		if (ht[bucketId] == null) {
			ht[bucketId] = new Bucket();
			ht[bucketId].key = key;
			System.out.println(key + " added to bucketId " + bucketId);
			return true;
		}
		System.err.println("Bucket not empty !");
		return false;
	}

	@Override
	public boolean Search(int key) {
		// Find the bucket id of the key, using hash function.
		int bucketId = HashFunctionMidSquare(key);
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
