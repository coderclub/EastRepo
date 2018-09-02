import org.testng.Assert;

public class TestCalculator {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        int result1 = cal.addition(10, 15);
        Assert.assertEquals(25, result1);


        int result2 = cal.substruction(25, 15);
        Assert.assertEquals(10, result2);
    }
}
