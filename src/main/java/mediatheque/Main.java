package mediatheque;

public class Main {
    public static void main(String[] args) {
        Mediatheque mediatheque = new Mediatheque();
        mediatheque.addItem( new Book("J.R.R. Tolkien", "Le seigneur des anneaux"));
        mediatheque.addItem( new Book("Sarah Rivens", "Lakestone"));
        mediatheque.addItem( new CD(10, "Life in Cartoon Motion" ));
        mediatheque.addItem( new CD(12, "NQNT2" ));

        MediathequeVisitor med = new CatalogPrinter();
        mediatheque.accept(med);



    }
}
