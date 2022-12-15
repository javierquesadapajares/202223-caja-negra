package com.practica.cajanegra;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.binarytree.*;

/*
Clases aceptables -> Insertar nodo a la izquierda de uno que no tenga hijo a la derecha,
                     insertar nodo a la derecha de uno que no tenga hijo a la izquierda,
                     insertar nodo a la izquierda de uno que tiene hijo en esa posición.
 */

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
	@DisplayName ("V1. Permite insertar nodo a la derecha")
	void InsertTestV1() {
		binaryTree.insert(nombre2, binaryTree.getRoot(), false);
		assertEquals(nombre2, binaryTree.search(nombre2).getContent());
	}
	
	@Test
	@DisplayName ("V2. Permite insertar nodo a la izquierda")
	void InsertTestV2() {
		binaryTree.insert(nombre3, binaryTree.getRoot(), true);
		assertEquals(nombre3, binaryTree.search(nombre3).getContent());
	}
	
	@Test
	@DisplayName ("V3. Permite insertar nodo de profundidad 2")
	void InsertTestV3() {
		binaryTree.insert(nombre2, binaryTree.getRoot(), true);
		binaryTree.insert(nombre3, binaryTree.search(nombre2), true);
		assertEquals(nombre3, binaryTree.search(nombre3).getContent());
	}

}



