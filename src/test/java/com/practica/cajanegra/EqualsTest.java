package com.practica.cajanegra;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import com.binarytree.*;

/*
Clases aceptables -> Comparar árbol con árbol con solo raiz
					 Comparar árbol con árbol con hijos
					 Comparar árbol con otro con distinta profundidad/tamanio (subarbol)
Clases no aceptables ->	Comparar árbol con otro con nodos de distinto contenido
 */

class EqualsTest {
	
	private BinaryTree<String> binaryTree;

	@BeforeEach
	void setUp() throws Exception {
		
		binaryTree = new BinaryTree<String>("1");
	}

	@Test
	@DisplayName ("V1. Compara un arbol con otro con solo raiz")
	void equalstestV1() {
		
		BinaryTree<String> binaryTree2 = new BinaryTree<String>("1");
		
		assertTrue(binaryTree.equals(binaryTree2));
	}
	
	@Test
	@DisplayName ("V2. Compara un arbol con otro con hijos")
	void equalstestV2() {
		
		BinaryTree<String> binaryTree2 = new BinaryTree<String>("1");
		
		binaryTree.insert("2", binaryTree.getRoot(), false);
		binaryTree.insert("3", binaryTree.getRoot(), true);
		
		binaryTree.insert("2", binaryTree2.getRoot(), false);
		binaryTree.insert("3", binaryTree2.getRoot(), true);
		
		assertTrue(binaryTree.equals(binaryTree2));
	}
	
	@Test
	@DisplayName ("V3. Compara un arbol con otro con distinta profundidad/tamanio (subarbol)")
	void equalstestV3() {
		
		BinaryTree<String> binaryTree2 = new BinaryTree<String>("1");
		
		binaryTree.insert("2", binaryTree.getRoot(), false);
		binaryTree.insert("3", binaryTree.getRoot(), true);
		
		binaryTree.insert("2", binaryTree2.getRoot(), false);
			
		assertTrue(binaryTree.equals(binaryTree2));
	}
	
/*
 * java.lang.IllegalArgumentException: Node out of this tree
	
	@Test
	@DisplayName ("NV1. Comparar árbol con otro con nodos de distinto contenido")
	void equalstestNV1() {
		BinaryTree<String> binaryTree2 = new BinaryTree<String>("6");
		
		binaryTree.insert("2", binaryTree.getRoot(), false);
		binaryTree.insert("3", binaryTree.getRoot(), true);
		
		binaryTree.insert("4", binaryTree2.getRoot(), false);
		binaryTree.insert("6", binaryTree2.getRoot(), true);
		
		assertTrue(binaryTree.equals(binaryTree2));
	}
*/
	
}
