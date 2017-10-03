import org.junit.Test
import org.junit.Assert.assertEquals

class HelloWorldTest
{
    @Test fun testReturnNum1()
    {
        assertEquals(1, returnNum(1))
    }

    @Test fun testReturnNum2()
    {
        assertEquals(100, returnNum(100))
    }

    @Test fun testCalcSum1(){
        assertEquals(10, calcSum(1, 9))
    }
}