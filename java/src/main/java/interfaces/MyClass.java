package interfaces;

public class MyClass implements MyInterface {
    
    private int b = 0;
    
    @Override
    public void testDefault() {
        String a = "123456";
        System.out.println(a + b);
    }
}