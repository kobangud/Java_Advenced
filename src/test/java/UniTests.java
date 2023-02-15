import Calc_OOP.Operation;
import org.junit.Assert;
import org.junit.Test;

import static java.lang.Double.NaN;


public class UniTests {

    Operation operation = new Operation();

    @Test
    public void FirstOperand() {
        Assert.assertEquals("Начальное значение первого операнда = 0", 0, operation.getFirstOperand(), 0);

    }

    @Test

    public void SecondOperand() {
        Assert.assertEquals("Начальное значение второго операнда = 0", 0, operation.getSecondOperand(), 0);

    }

    @Test
    public void testSum() {
        Assert.assertEquals("Сумма  = 0", 0, (operation.getFirstOperand() + operation.getSecondOperand()), 0);

    }

    @Test
    public void testRaznosti() {
        Assert.assertEquals("Разность = 0", 0, (operation.getFirstOperand() - operation.getSecondOperand()), 0);

    }

    @Test
    public void testMultyplay() {
        Assert.assertEquals("Умножение  = 0", 0, (operation.getFirstOperand() * operation.getSecondOperand()), 0);

    }

    @Test
    public void testDeleniya() {
        Assert.assertEquals("На ноль делить НЕЛЬЗЯ ", NaN, (operation.getFirstOperand() / operation.getSecondOperand()), 0);

    }

    @Test
    public void testNeFormatArifznak() {
        Assert.assertEquals("Неверный формат ввода", "[+]|-|[*]|/$", operation.getArifznak());

    }
}
