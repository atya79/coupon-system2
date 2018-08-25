package com.testng.hsenid;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyConcatenatorTest {
    @Test
    public void testConcatanate() throws Exception {
        String concatenated = MyConcatenator.concatanate("one", "two", "three", "four");
        System.out.println("concatenated = " + concatenated);
        Assert.assertEquals("one,two,three,four", concatenated);

    }
}