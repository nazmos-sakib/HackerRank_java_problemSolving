package OOP.ch59_Visitor_Pattern;

import java.util.ArrayList;

public abstract class RootedTree {
    private int value;
    private int color;
    private int depth;

    private int nodeIndexingU;

    private int parentIndexV;

    private ArrayList<Tree> children;

    private Tree parent;


    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public int getNodeIndexingU() {
        return nodeIndexingU;
    }

    public void setNodeIndexingU(int nodeIndexingU) {
        this.nodeIndexingU = nodeIndexingU;
    }

    public int getParentIndexV() {
        return parentIndexV;
    }

    public void setParentIndexV(int parentIndexV) {
        this.parentIndexV = parentIndexV;
    }

    public abstract void accept(Visitor visitor);
}
