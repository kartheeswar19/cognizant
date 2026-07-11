package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MyServiceTest {

    @Test
    public void testFetchDataWithStubbedMock() {
        // Mock creation: create a mock for the external dependency.
        ExternalApi mockApi = mock(ExternalApi.class);

        // Stubbing: define what the mock should return.
        when(mockApi.getData()).thenReturn("Mock Data");

        MyService service = new MyService(mockApi);

        // Act: call the method under test.
        String result = service.fetchData();

        // Assertion: verify the returned value.
        assertEquals("Mock Data", result);
    }
}
