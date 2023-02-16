import Calc_OOP.Operation;
import org.junit.Assert;
import org.junit.Test;


public class UniTests {

    Operation operation = new Operation();

    @Test
    public void testSum() {
        operation.setFirstOperand(2.9991);
        operation.setSecondOperand(7.0009);
        operation.setArifznak("+");
        //Проверка с помощью метода
        Assert.assertEquals("Сумма 2,9991 и 7.0009 не равна 10", 10, operation.result(), 0.1);

    }

    @Test
    public void testRaznosti() {
        operation.setFirstOperand(5.53);
        operation.setSecondOperand(1.45);
        operation.setArifznak("-");
        //Проверка с помощью метода
        Assert.assertEquals("Разность 5.53 1.45 не равна 4.08", 4.08, operation.result(), 0);
    }

    @Test
    public void testMultyplay() {
        operation.setFirstOperand(1.25);
        operation.setSecondOperand(1.25);
        operation.setArifznak("*");
        operation.result();
        //Проверка с помощью переменной результата
        Assert.assertEquals("Разность = 1.5625", 1.5625, operation.getResultat(), 0);
    }

    @Test
    public void testDeleniya() {
        operation.setFirstOperand(6.66);
        operation.setSecondOperand(3.33);
        operation.setArifznak("/");
        operation.result();
        //Проверка с помощью переменной результата
        Assert.assertEquals("Разность = 2", 2, operation.getResultat(), 0);
    }

    @Test(expected = ArithmeticException.class)
    public void testDeleniyaNaNoll() throws ArithmeticException {

        operation.setFirstOperand(5);
        operation.setSecondOperand(0);
        operation.setArifznak("/");
        operation.result();

    }

    @Test
    public void testNeFormatArifznak() {
        operation.setArifznak("+");
        Assert.assertEquals("Неверный формат ввода. Заданный Знак + не равен + ", "+", operation.getArifznak());

    }
}
