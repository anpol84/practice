package practice21_22;

public class CreateTextDocument implements ICreateDocument{
    @Override
    public IDocument createNew() {
        System.out.println("New Document");
        return new TextDocument();
    }

    @Override
    public IDocument createOpen() {
        System.out.println("Open Document");
        return new TextDocument();
    }
}
