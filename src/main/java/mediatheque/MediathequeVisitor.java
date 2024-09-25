package mediatheque;

public interface MediathequeVisitor {
    void visit(Book book);
    void visit(CD cd);
}
