package com.practica.cajanegra;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import com.binarytree.*;


/*
Clases aceptables -> Árbol con una o más capas.
Clases no aceptables -> Árbol sin capas (imposible probar ya que no se puede instanciar un arbol sin nodo).
						No compara bien el nodo raíz con el atributo tipo Nodo.
 */

public class GetRootTest {
	private BinaryTree<String> binaryTree;
	String nombre = "Test1";
	
		
	@Test
	@DisplayName ("V1. Permite nombre alfanumerico sin hijos")
	public void getRoottestV1() {
		binaryTree = new BinaryTree<String>(nombre);
		assertEquals(nombre, binaryTree.getRoot().getContent());
	}
	
	@Test
	@DisplayName ("V2. Permite nombre alfanumerico con hijos")
	public void getRoottestV2() {
		binaryTree = new BinaryTree<String>(nombre);
		
		Node<String> nodo1 = new Node<String>("2");
		Node<String> nodo2 = new Node<String>("3");
		
		binaryTree.insert(nodo1.getContent().toString(), binaryTree.getRoot(),false);
		binaryTree.insert(nodo2.getContent().toString(), binaryTree.getRoot(),true);
		
		assertEquals(nombre, binaryTree.getRoot().getContent());
	}
	

	
}
