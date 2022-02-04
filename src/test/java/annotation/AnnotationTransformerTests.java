package annotation;

import org.testng.annotations.Test;

public class AnnotationTransformerTests {

    @Test(alwaysRun=true)
    public void test1()
    {
        System.out.println("This is my first test whose behaviour would get changed while executing");
    }

    @Test
    public void test2()
    {
        System.out.println("This is my second test executing");
    }
}
