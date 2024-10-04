public class LetterCreator extends DocumentCreator{
    @Override
    Document createDocument() {
        return new Letter();
    }
}
