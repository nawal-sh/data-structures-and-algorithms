/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package trees;

import trees.structure.BinarySearchTree;
import trees.structure.BinaryTree;

public class Library {
    public boolean someLibraryMethod() {
        return true;
    }

  public static void main(String[] args) {
    BinarySearchTree<Integer> bt = new BinarySearchTree<>();
    bt.add(5);
    bt.add(9);
    bt.add(15);
    bt.add(88);
    bt.add(45);
    System.out.println(bt.maximum());
  }
}
