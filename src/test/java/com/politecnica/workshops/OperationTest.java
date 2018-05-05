package com.politecnica.workshops;



import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OperationTest {
    @Test
    public void sumGreaterThan10MustReturnSuccessfully(){
        //Given
        Operations operation = new Operations();

        //When
        int result = operation.suma(10, 20);

        //Then
        assertEquals("La suma debe ser 30", 30, result);
    }

    @Test(expected = RuntimeException.class)
    public void sumLessThan10MustReturnSuccessfully(){
        //Given
        Operations operation = new Operations();

        //When
        int result = operation.suma(1, 3);

        //Then
    }
}
