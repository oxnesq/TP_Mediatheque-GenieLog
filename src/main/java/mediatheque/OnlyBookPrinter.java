package mediatheque;

public class OnlyBookPrinter implements MediathequeVisitor{

    @Override
    public void visit(Book book) {
        book.print();
    }

    @Override
    public void visit(CD cd) {
    }
}
