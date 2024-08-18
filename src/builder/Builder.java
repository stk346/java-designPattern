package builder;

public abstract class Builder {

    public abstract void makeTitle(String title);

    public abstract void makeString(String st);
    public abstract void makeItems(String[] items);
    public abstract void close();
}
