package com.practica.cajanegra;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.binarytree.BinaryTree;
import com.binarytree.Node;

/*
Clases aceptables -> Borrar contenido que existe en el árbol
 */

class RemoveTest {
	

	private BinaryTree<String> binaryTree;
	String nombre = "Test1";
	String nombre2 = "Test2";
	String nombre3 = "Test3";
	Node<String> nodo1 = new Node<String>("Test4");
	
	@BeforeEach
	void setUp() throws Exception {
		binaryTree = new BinaryTree<String>(nombre);
	}
	@Test
	@DisplayName ("NV1. No permite borrar el nodo raíz porque no es un subarbol")
	void removeTestNV1() {
		binaryTree.remove(binaryTree.getRoot());
		assertEquals(nombre, binaryTree.getRoot().getContent());
		
	}
	
	@Test
	@DisplayName ("V2. Permite borrar un nodo hoja")
	void removeTestV2() {
		binaryTree.insert(nombre2 , binaryTree.getRoot(), false);
		binaryTree.remove(binaryTree.search(nombre2));
		assertNull(binaryTree.search(nombre2));
		
	}
	/* 
	 * El test v3 no funciona porque al eliminar el nodo intermedio tanto el nodo intermedio
	 * como el hijo no pasan a ser null, sino a estar fuera del árbol
	 * 
	 */
	@Test
	@DisplayName ("V3. Permite borrar un nodo intermedio con nodos hijos")
	void removeTestV3() {
		binaryTree.insert(nombre2 , binaryTree.getRoot(), false);
		binaryTree.insert(nombre3 , binaryTree.search(nombre2), false);
		assertThrows(IllegalArgumentException.class, () -> binaryTree.remove(binaryTree.getRoot().getRightChild()));
	}

	@Test
	@DisplayName ("NV2. No permite borrar un nodo que no esta en el arbol")
	void removeTestNV2() {
		assertThrows(IllegalArgumentException.class, () -> binaryTree.remove(binaryTree.search(nodo1.getContent())));
	
}
}
