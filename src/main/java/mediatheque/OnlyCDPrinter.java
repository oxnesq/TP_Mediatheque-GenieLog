package mediatheque;

public class OnlyCDPrinter implements MediathequeVisitor{
    @Override
    public void visit(Book book) {
    }

    @Override
    public void visit(CD cd) {
        cd.print();
    }
}
