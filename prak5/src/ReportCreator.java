public class ReportCreator extends DocumentCreator {
    @Override
    Document createDocument() {
        return new Report();
    }
}