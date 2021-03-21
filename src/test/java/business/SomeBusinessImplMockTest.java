package business;

import data.SomeDataService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class SomeBusinessImplMockTest {

    @InjectMocks
    SomeBusinessImpl business;

    @Mock
    SomeDataService dataServiceMock;

    @Test
    public void calculateSumUsingDataService_basic(){
        //Arrange
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {1,2,3});
        //Act
        int actualResult = business.calculateSumUsingDataService();
        int expectedResult = 6;
        //Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void calculateSumUsingDataService_empty(){
        //Arrange
        when(dataServiceMock.retrieveAllData()).thenReturn(new int [] { });
        //Act
        int actualResult = business.calculateSumUsingDataService(); //new int[] { }
        int expectedResult = 0;
        //Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void calculateSumUsingDataService_oneValue(){
        //Arrange
        when(dataServiceMock.retrieveAllData()).thenReturn(new int [] {5});
        //Act
        int actualResult = business.calculateSumUsingDataService();//new int[] {5}
        int expectedResult = 5;
        //Assert
        assertEquals(expectedResult, actualResult);
    }
}
