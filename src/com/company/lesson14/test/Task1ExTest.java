package com.company.lesson14.test;

import com.company.lesson14.main.Task1;
import org.junit.Before;
import org.junit.Test;

public class Task1ExTest {
    private Task1 task1;

    @Before
    public void startTest() {
        task1 = new Task1();
    }

    @Test(expected = RuntimeException.class)
    public void testAfterLast4Ex() {
        Task1.AfterLast4(new int[]{0, 3, 7, 5, 0, 0, 3, 2});
    }
}
