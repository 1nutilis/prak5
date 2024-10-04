public class InvoiceCreator extends DocumentCreator{
    @Override
    Document createDocument() {
        return new Invoice();
    }
}
