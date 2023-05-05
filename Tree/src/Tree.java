import java.awt.*;

public class Tree {
    double height;
    double trunkDiameter;
    TreeType treeType;
    static Color trunkColor = new Color(56, 38, 9);

    Tree(double height, double trunkDiameter, TreeType treeType) {
        this.height = height;
        this.trunkDiameter = trunkDiameter;
        this.treeType = treeType;
    }
    void grow() {
        this.height = this.height + 10;
        this.trunkDiameter = this.trunkDiameter + 1;
    }

    static void color() {
        System.out.println(trunkColor + " is the trunk color.");
    }
    void tallerTree() {
        if(this.height > 100) {
            System.out.println(this.treeType + " is a big tree");
        }else {
            System.out.println(this.treeType + " is a small tree");
        }
    }
}
