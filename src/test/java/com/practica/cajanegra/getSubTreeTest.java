package com.practica.cajanegra;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import com.binarytree.*;

/*
Clases aceptables -> árbol con un nodo,
                     árbol con nodos hijos a partir de raíz,
                     árbol con nodos hijos de dos nieveles a partir de raíz,
                     árbol a partir de nodos intermedios.
                     árbol a partir de nodo hoja.
                     
Clases no aceptables -> valor nulo,
						arbol creado a partir de nodo que no está en el arbol.
 */

class getSubTreeTest {
	
	private BinaryTree<String> binaryTree;
	
	
	@BeforeEach
	void setUp() throws Exception {
		
		binaryTree = new BinaryTree<String>("1");
		
	}

	@Test
	@DisplayName ("V1. Subarbol creado a partir de la raíz un arbol con nodo raíz")
	void getSubTreeTestV1() {
		
		BinaryTree<String> subTree = binaryTree.getSubTree(binaryTree.getRoot());
		
		assertEquals ("1", subTree.getRoot().getContent().toString());
	}
	
	@Test
	@DisplayName ("V2. Subarbol creado a partir de la raíz un arbol con nodo hijos")
	void getSubTreeTestV2() {
		
		binaryTree.insert("2", binaryTree.getRoot(), true);
		binaryTree.insert("3", binaryTree.getRoot(), false);
		
		BinaryTree<String> subTree = binaryTree.getSubTree(binaryTree.getRoot());
		
		assertEquals ("[1, 2, 3]", subTree.toList().toString());
	}
	
	@Test
	@DisplayName ("V3. Subarbol creado a partir de la raíz un arbol con nodo hijos de dos niveles")
	void getSubTreeTestV3() {
		
		binaryTree.insert("2", binaryTree.getRoot(), true);
		binaryTree.insert("3", binaryTree.search("2"), false);
		
		BinaryTree<String> subTree = binaryTree.getSubTree(binaryTree.getRoot());
		
		assertEquals ("[1, 2, 3]", subTree.toList().toString());
	}
	
	@Test
	@DisplayName ("V4. Subarbol creado a partir de nodos intermedios")
	void getSubTreeTestV4() {
		
		binaryTree.insert("2", binaryTree.getRoot(), true);
		binaryTree.insert("3", binaryTree.search("2"), false);
		
		BinaryTree<String> subTree = binaryTree.getSubTree(binaryTree.search("2"));
		
		assertEquals ("[2, 3]", subTree.toList().toString());
	}
	
	@Test
	@DisplayName ("V5. Subarbol creado a partir de nodos hoja (nodo 4 se crea como hijo de nodo 3)")
	void getSubTreeTestV5() {
		
		binaryTree.insert("2", binaryTree.getRoot(), true);
		binaryTree.insert("3", binaryTree.getRoot(), false);
		binaryTree.insert("4", binaryTree.search("3"), false);
		
		BinaryTree<String> subTree = binaryTree.getSubTree(binaryTree.search("2"));
		
		assertEquals ("2", subTree.getRoot().getContent().toString());
	}

}
