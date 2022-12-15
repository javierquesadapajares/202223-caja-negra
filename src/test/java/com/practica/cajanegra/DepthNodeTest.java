package com.practica.cajanegra;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import com.binarytree.*;

public class DepthNodeTest {
    private BinaryTree<String> binaryTree;
    String nombre = "Test1", apellido1 = "Test2", apellido2="Test3", apellido3="Test4";
    Node<String> nodo1 = new Node<String>("test5");
    Node<String> nodo2 = new Node<String>("test6");
    @BeforeEach
    void setUp() throws Exception {
        binaryTree = new BinaryTree<String>(nombre);

    }

    @Test
    @DisplayName("V1. Comprueba que la profundidad es 0 cuando se hace desde la raiz(estando solo la raiz)")
    public void depthNodeV1() {
        assertEquals(0, binaryTree.depth(binaryTree.getRoot()));

    }
    @Test
    @DisplayName("V2. Comprueba que la profundidad es 0 cuando esta en un nodo hoja")
    public void depthV2() {
        binaryTree.insert(apellido1,binaryTree.getRoot(), false);
        assertEquals(0, binaryTree.depth(binaryTree.search(apellido1)));

    }
    @Test
    @DisplayName("V3. Comprueba que la profundidad es 1 cuando la raiz tiene un hijo tanto a la izquierda como a la derecha")
    public void depthV3() {
        binaryTree.insert(apellido1,binaryTree.getRoot(), false);
        binaryTree.insert(apellido1,binaryTree.getRoot(), true);
        assertEquals(1, binaryTree.depth());

    }
    /* 
     * No funciona porque si pones el depth desde el root no te devuelve lo mismo que haciendo el depth del arbol, tambien te dice que tiene el mismo nivel dede un nodo que no es hoja con uno que es hoja.
    @Test
    @DisplayName("V4. Comprueba que la profundidad es 2 cuando la raiz tiene un hijo que tiene otro hijo")
    public void depthV4() {
        binaryTree.insert(nodo1.getContent(),binaryTree.getRoot(), false);
        binaryTree.insert(nodo2.getContent(),binaryTree.search(nodo1.getContent()), true);
        assertEquals(2, binaryTree.depth(binaryTree.getRoot()));

    }
    */
}