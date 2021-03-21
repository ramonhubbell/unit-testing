package business;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SomeBusinessImplTest {

    @Test
    public void calculateSum_basic(){
        //Arrange
        SomeBusinessImpl business = new SomeBusinessImpl();
        //Act
        int actualResult = business.calculateSum(new int[] {1, 2, 3});
        int expectedResult = 6;
        //Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void calculateSum_empty(){
        //Arrange
        SomeBusinessImpl business = new SomeBusinessImpl();
        //Act
        int actualResult = business.calculateSum(new int[] { });
        int expectedResult = 0;
        //Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void calculateSum_oneValue(){
        //Arrange
        SomeBusinessImpl business = new SomeBusinessImpl();
        //Act
        int actualResult = business.calculateSum(new int[] {5});
        int expectedResult = 5;
        //Assert
        assertEquals(expectedResult, actualResult);
    }
}