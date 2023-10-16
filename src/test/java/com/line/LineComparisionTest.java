package com.line;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LineComparisionTest {

    @Test
    public void testCompareLengthEqual() {
        LineComparision line1 = new LineComparision(2, 4, 4, 2);
        LineComparision line2 = new LineComparision(2, 4, 4, 2);

        String length1 = line1.toString();
        String length2 = line2.toString();

        boolean ifEqual = length1.equals(length2);

        assertTrue(ifEqual);
    }

    @Test
    public void testCompareLengthNotEqual() {
        LineComparision line1 = new LineComparision(2, 4, 4, 2);
        LineComparision line2 = new LineComparision(1, 3, 5, 7);

        String length1 = line1.toString();
        String length2 = line2.toString();

        boolean ifEqual = length1.equals(length2);

        assertFalse( ifEqual);
    }

    
}
