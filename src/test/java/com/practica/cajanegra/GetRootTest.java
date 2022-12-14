package com.practica.cajanegra;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import com.binarytree.*;

public class GetRootTest {
	private BinaryTree binaryTree;
	String nombre = "Test1";
	private BinaryTree binaryTree2;
	int array[] = {1};
	

	@BeforeEach
	void setUp() throws Exception {
		binaryTree = new BinaryTree<>(nombre);
	}

	@Test
	@DisplayName ("V1. Nombre = Nodo raiz")
	public void getRoottestV1() {
		assertEquals(nombre, binaryTree.getRoot().getContent());
	}
	
	@Test
	@DisplayName ("NV1. Nombre != Nodo raiz")
	public void getRoottestNV1() {
		assertNotEquals ("a", binaryTree.getRoot().getContent());     
	}
	
	@Test
	@DisplayName ("NV2. Nodo raiz = Nulo")
	public void getRoottestNV2() {
		    
	}

}
