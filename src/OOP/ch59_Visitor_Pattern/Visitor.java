package OOP.ch59_Visitor_Pattern;

public interface Visitor<T> {
    int getResult();

    void visitNode(Tree node);

    void visitLeaf(Tree leaf);
}
