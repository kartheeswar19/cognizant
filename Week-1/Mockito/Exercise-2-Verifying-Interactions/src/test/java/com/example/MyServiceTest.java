package com.example;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class MyServiceTest {

    @Test
    public void testFetchDataInvokesDependency() {
        // Mock creation: create a mock for the external dependency.
        ExternalApi mockApi = mock(ExternalApi.class);

        MyService service = new MyService(mockApi);

        // Method invocation: call the service method under test.
        service.fetchData();

        // Verification: ensure the dependency method was called.
        verify(mockApi).getData();
    }
}
