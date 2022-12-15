package com.practica.cajanegra;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import com.binarytree.*;

/*
Clases aceptables -> Árbol con un solo nodo,
                     árbol con dos o más nodos,
                     desde un nodo que se encuentra en el árbol.
 */

public class DepthTest {
    private BinaryTree<String> binaryTree;
    String nombre = "Test1", apellido1 = "Test2", apellido2="Test3";
    @BeforeEach
    void setUp() throws Exception {
        binaryTree = new BinaryTree<String>(nombre);

    }

    @Test
    @DisplayName("V1. Comprueba que la profundidad es 0 cuando solo esta la raiz")
    public void depthV1() {
        assertEquals(0, binaryTree.depth());

    }
    @Test
    @DisplayName("V2. Comprueba que la profundidad es 1 cuando hay un hijo o más en la misma profundidad")
    public void depthV2() {
        binaryTree.insert(apellido1,binaryTree.getRoot(), false);
        assertEquals(1, binaryTree.depth());

    }
    @Test
    @DisplayName("V3. Comprueba que la profundidad es 1 cuando la raiz tiene un hijo tanto a la izquierda como a la derecha")
    public void depthV3() {
        binaryTree.insert(apellido1,binaryTree.getRoot(), false);
        binaryTree.insert(apellido1,binaryTree.getRoot(), true);
        assertEquals(1, binaryTree.depth());

    }
    @Test
    @DisplayName("V4. Comprueba que la profundidad es 2 cuando la raiz tiene un hijo que tiene otro hijo")
    public void depthV4() {
        binaryTree.insert(apellido1,binaryTree.getRoot(), false);
        binaryTree.insert(apellido1,binaryTree.search(apellido1), true);
        assertEquals(2, binaryTree.depth());

    }
}