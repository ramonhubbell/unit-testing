package business;

import data.SomeDataService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SomeDataServiceStub implements SomeDataService {

    @Override
    public int[] retrieveAllData() {
        return new int[]{1, 2, 3};
    }
}
class SomeDataServiceEmptyStub implements SomeDataService{
    @Override
    public int[] retrieveAllData() {
        return new int[] { };
    }
}

class SomeDataServiceOneElementStub implements SomeDataService{
    @Override
    public int[] retrieveAllData() {
        return new int[] {5};
    }
}



public class SomeBusinessImplStubTest {

    @Test
    public void calculateSumUsingDataService_basic(){
        //Arrange
        SomeBusinessImpl business = new SomeBusinessImpl();
        business.setSomeDataService(new SomeDataServiceStub());
        //Act
        int actualResult = business.calculateSumUsingDataService();
        int expectedResult = 6;
        //Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void calculateSumUsingDataService_empty(){
        //Arrange
        SomeBusinessImpl business = new SomeBusinessImpl();
        business.setSomeDataService(new SomeDataServiceEmptyStub());
        //Act
        int actualResult = business.calculateSumUsingDataService(); //new int[] { }
        int expectedResult = 0;
        //Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void calculateSumUsingDataService_oneValue(){
        //Arrange
        SomeBusinessImpl business = new SomeBusinessImpl();
        business.setSomeDataService(new SomeDataServiceOneElementStub());
        //Act
        int actualResult = business.calculateSumUsingDataService();//new int[] {5}
        int expectedResult = 5;
        //Assert
        assertEquals(expectedResult, actualResult);
    }
}