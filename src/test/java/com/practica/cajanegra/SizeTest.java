package com.practica.cajanegra;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import com.binarytree.BinaryTree;

class SizeTest {
	private BinaryTree<String> binaryTree;
	String nombre = "Test1";
	String nombre2 = "Test2";
	String nombre3 = "Test3";
	
	

	@BeforeEach
	void setUp() throws Exception {
		binaryTree = new BinaryTree<String>(nombre);
	}
	
	
	@Test
	@DisplayName("V1. Comprueba que el tamaño es 1 cuando solo tiene un elemento")
	void getSizeV1() {
		assertEquals(1, binaryTree.size());
	}
	

	@Test
	@DisplayName("V2. Comprueba que el tamaño es 2 cuando tiene dos elementos, el raíz y "
			+ "el insertado")
	void getSizeV2() {
		binaryTree.insert(nombre2, binaryTree.getRoot(), true);
		assertEquals(2, binaryTree.size());
	}
	
	@Test
	@DisplayName("V3. Comprueba que el tamaño es 3 cuando tiene tres elementos tras ser "
			+ "insertados(uno a cada lado)")
	void getSizeV3() {
		binaryTree.insert(nombre3, binaryTree.getRoot(), false);
		binaryTree.insert(nombre3, binaryTree.getRoot(), true);
		assertEquals(3, binaryTree.size());
	}

	
}
