package com.practica.cajanegra;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Iterator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import com.binarytree.*;

/*
Clases aceptables -> árbol con nodo raiz,
                     árbol con nodos hijos,
                     árbol con nodos hijos de dos nieveles,
                     
*/

class IteratorTest {
	private BinaryTree<String> binaryTree;

	@BeforeEach
	void setUp() throws Exception {
		
		binaryTree = new BinaryTree<String>("1");
	}

	@Test
	@DisplayName ("V1. Crea un iterador de un arbol con solo un nodo raíz")
	void IteratorTestV1() {
		
		Iterator it = binaryTree.iterator();
		Integer valorActual = 1;
		
		while (it.hasNext()) {
			assertEquals (valorActual.toString(),it.next());
			valorActual++;
		}
	}
	
	@Test
	@DisplayName ("V2. Crea un iterador de un arbol con dos nodos hijos")
	void IteratorTestV2() {
		
		binaryTree.insert("2", binaryTree.getRoot(), true);
		binaryTree.insert("3", binaryTree.getRoot(), false);
		
		Iterator it = binaryTree.iterator();
		Integer valorActual = 1;
		
		while (it.hasNext()) {
			assertEquals (valorActual.toString(),it.next());
			valorActual++;
		}
	}
	
	@Test
	@DisplayName ("V3. Crea un iterador de un arbol con dos de profundidad."
			+ "Primero guarda el valor de la primera rama en la que entra.")
	void IteratorTestV3() {
		
		binaryTree.insert("2", binaryTree.getRoot(), true);
		binaryTree.insert("4", binaryTree.getRoot(), false);
		
		binaryTree.insert("3", binaryTree.search("2"), true);
		
		Iterator it = binaryTree.iterator();
		Integer valorActual = 1;
		
		while (it.hasNext()) {
			assertEquals (valorActual.toString(),it.next());
			valorActual++;
		}
	}
	

}
