package jmx;

public interface HelloMXBean {
    public void sayHello();
    
    public int add(int x, int y);
    
    public String getName();
    
    public int getCacheSize();
    
    public void setCacheSize(int size);
    
    public Book getBook();
    public void addBook(Book book);
}
