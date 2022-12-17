package com.practica.cajanegra;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.binarytree.BinaryTree;
import com.binarytree.Node;

	class SearchTest {
	
		private BinaryTree<String> binaryTree;
		String nombre= "test1";
		String nombre1="test2";
		String nombre2="test3";
	
	@BeforeEach
	void setUp() throws Exception {
			
		binaryTree = new BinaryTree<String>(nombre);
	}
		

	@Test
	@DisplayName("V1. Busca un nodo en un árbol con 1 nivel")
	void searchV1() {
	Node <String> nodo= binaryTree.search(nombre);
	assertEquals(nombre,nodo.getContent());
	}
	
	@Test
	@DisplayName("V2. Busca un nodo en un árbol con varios niveles")
	void searchV2() {
	binaryTree.insert(nombre1, binaryTree.getRoot(), false);
	binaryTree.insert(nombre2, binaryTree.search(nombre1), false);
	Node <String> nodo= binaryTree.search(nombre2);
	assertEquals(nombre2, nodo.getContent());
	}
	
	@Test
	@DisplayName("NV1. Busca un nodo/contenido que no existe")
	void searchNV1() {
	Node <String> nodo= binaryTree.search(nombre2);
	assertEquals(null, nodo);
	}
	
	
	
	

}
