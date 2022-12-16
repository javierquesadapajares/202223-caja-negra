package com.practica.cajanegra;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import com.binarytree.*;

/*
Clases aceptables -> árbol con un nodo,
                     árbol con nodos hijos,
                     árbol con nodos hijos, borrando uno de los nodos hijos,
                     árbol con nodos hijos de dos nieveles,
*/

class ToListTest {
	private BinaryTree<String> binaryTree;

	@BeforeEach
	void setUp() throws Exception {
		binaryTree = new BinaryTree<String>("1");
	}

	@Test
	@DisplayName ("V1. Listar arbol con nodo raiz")
	void ToListTestV1() {
		
		assertEquals ("[1]", binaryTree.toList().toString());
	}
	
	@Test
	@DisplayName ("V2. Listar arbol con nodos hijos")
	void ToListTestV2() {
		
		binaryTree.insert("2", binaryTree.getRoot(), true);
		binaryTree.insert("3", binaryTree.getRoot(), false);
		
		assertEquals ("[1, 2, 3]", binaryTree.toList().toString());
	}
	
	@Test
	@DisplayName ("V3. Listar arbol con nodos hijos. Posteriormente se borra un nodo hoja")
	void ToListTestV3() {
		
		binaryTree.insert("2", binaryTree.getRoot(), true);
		binaryTree.insert("3", binaryTree.getRoot(), false);
		
		binaryTree.remove(binaryTree.getRoot().getLeftChild());
		
		assertEquals ("[1, 3]", binaryTree.toList().toString());
	}
	
	@Test
	@DisplayName ("V4. Listar arbol con profundidad dos. Primero recorre una rama completa (siempre izquierda)")
	void ToListTestV4() {
		
		binaryTree.insert("2", binaryTree.getRoot(), true);
		binaryTree.insert("3", binaryTree.getRoot(), false);
		binaryTree.insert("4", binaryTree.search("2"), true);
		
		assertEquals ("[1, 2, 4, 3]", binaryTree.toList().toString());
	}
	
}
