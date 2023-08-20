package OOP.ch59_Visitor_Pattern;


class Tree extends RootedTree{

    public Tree(int value, int color, int depth) {
        this.setValue(value);
        this.setColor(color);
        this.setDepth(depth);
    }
    public Tree(){}


    @Override
    public void accept(Visitor visitor) {
        visitor.visitNode(this);
    }
}