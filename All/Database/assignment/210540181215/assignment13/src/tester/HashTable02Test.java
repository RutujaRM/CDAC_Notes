package tester;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.app.HashTable02;

class HashTable02Test {
	@Test
	void test01Add() {
		HashTable02 ht = new HashTable02(10);
		assertTrue(ht.Add(5));
	}
	@Test
	void test02AddDuplicate() {
		HashTable02 ht = new HashTable02(10);
		assertTrue(ht.Add(5));
		assertFalse(ht.Add(5));
	}
	@Test
	void test03AddCollision() {
		HashTable02 ht = new HashTable02(10);
		assertTrue(ht.Add(5));
		assertTrue(ht.Add(25));
		assertFalse(ht.Add(35));
		assertFalse(ht.Add(15));
	}
	@Test
	void test04SearchNotFound() {
		HashTable02 ht = new HashTable02(10);
		assertTrue(ht.Add(5));
		assertFalse(ht.Search(25));
	}
	@Test
	void test05SearchFound() {
		HashTable02 ht = new HashTable02(10);
		assertTrue(ht.Add(5));
		assertTrue(ht.Search(5));
	}
	@Test
	void test06SearchNotFoundInEmptyBucket() {
		HashTable02 ht = new HashTable02(10);
		assertTrue(ht.Add(5));
		assertFalse(ht.Search(7));
	}
}
