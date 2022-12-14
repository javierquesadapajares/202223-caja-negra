package com.practica.cajanegra;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.binarytree.*;

class InsertTest {
	private BinaryTree<String> binaryTree;
	String nombre = "Test1";
	String nombre2 = "Test2";
	String nombre3 = "Test3";
	
	@BeforeEach
	void setUp() throws Exception {
		binaryTree = new BinaryTree<String>(nombre);
	}
	
	@Test
	void InsertTestV1() {
		binaryTree.insert(nombre2, binaryTree.getRoot(), false);
		assertEquals(nombre2, binaryTree.search(nombre2).getContent());
	}
	
	@Test
	void InsertTestV2() {
		binaryTree.insert(nombre3, binaryTree.getRoot(), true);
		assertEquals(nombre3, binaryTree.search(nombre3).getContent());
	}
	
	@Test
	void InsertTestV3() {
		binaryTree.insert(nombre3, binaryTree.getRoot(), true);
		assertEquals(nombre3, binaryTree.search(nombre3).getContent());
	}




}



