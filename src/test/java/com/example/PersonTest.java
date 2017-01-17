package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void testGetDisplayName() {
        Person person = new Person("Josh", "Hayden");
        String displayName = person.getDisplayName();
        assertEquals("Hayden, Josh", displayName);
    }

}