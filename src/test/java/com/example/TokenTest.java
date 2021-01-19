package com.example;

import static org.junit.Assert.assertEquals;

import javax.ws.rs.core.Application;

import com.example.resources.Token;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;
import org.junit.Test;

public class TokenTest extends JerseyTest {

    @Override
    protected Application configure() {
        return new ResourceConfig(Token.class);
    }

    /**
     * Test to see that the message "Got it!" is sent in the response.
     */
    @Test
    public void test9() {
        final String result = target().path("token").path("getToken").request().get(String.class);

        System.out.println("Response = "+result);
        assertEquals("oAaaTsBYbE9Y2xFNuh3n", result);

    }

    @Test
    public void test0() {
        final String result2 = target().path("token").path("getToken").request().get(String.class);
        assertEquals("oAaaTsBYbE9Y2xFNuh3n", result2);
    }


    @Test
    public void testMax() {
        final String result = target().path("token").path("getToken").request().get(String.class);
        System.out.println("Response = "+result);
        assertEquals("oAaaTsBYbE9Y2xFNuh3n", result);
    }
}
