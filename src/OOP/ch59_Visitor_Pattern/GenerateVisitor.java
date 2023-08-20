package OOP.ch59_Visitor_Pattern;

public class GenerateVisitor<T> implements Visitor<T> {


    public int getResult() {
        return 0;
    }

    public void visitNode(Tree node) {

    }
    @Override
    public void visitLeaf(Tree leaf) {

    }
}
