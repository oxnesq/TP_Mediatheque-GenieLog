package mediatheque;

public class CatalogPrinter implements MediathequeVisitor{
    @Override
    public void visit(Book book) {
        book.print();
    }

    @Override
    public void visit(CD cd) {
        cd.print();
    }
}
