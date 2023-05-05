import java.awt.*;

public class Main {

    public static void main(String[] args) {

        Tree myTree = new Tree(72, 19, TreeType.Oak);

        myTree.tallerTree();

        myTree.grow();
        myTree.grow();
        myTree.grow();

        myTree.tallerTree();

        Tree.color();

    }
}
