package ar.fiuba.tdd.template;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTests {

    private CustomQueue<Integer> customQueue;

    @Before
    public void setUp() {
        customQueue = new CustomQueue<>();
    }

    @Test
    public void testCreateEmptyQueue() {
        Assert.assertEquals(0, customQueue.size());

    }

    @Test
    public void testAddElementsToQueue() {
        customQueue.add(2);
        customQueue.add(2);
        customQueue.add(2);
        customQueue.add(2);
        Assert.assertEquals(4, customQueue.size());

    }

    @Test
    public void testRemoveItem() {
        customQueue.add(2);
        Assert.assertEquals(1, customQueue.size());
        customQueue.remove();
        Assert.assertEquals(0, customQueue.size());
    }


    @Test
    public void testGetTop() {
        customQueue.add(2);
        customQueue.add(3);
        customQueue.add(5);
        Assert.assertEquals(Integer.valueOf(2), customQueue.top());
    }


    @Test
    public void testAddAndRemoveInQueue() {
        customQueue.add(2);
        customQueue.add(3);
        customQueue.add(5);
        Assert.assertEquals(customQueue.size(), 3);
        customQueue.remove();
        customQueue.remove();
        Assert.assertEquals(customQueue.size(), 1);
    }


    @Test(expected = AssertionError.class)
    public void testNotPosibleToRemoveInEmptyQueue() {
        customQueue.remove();
    }

    @Test(expected = AssertionError.class)
    public void testNotPosibleToTopInEmptyQueue() {
        customQueue.top();
    }

    @Test
    public void testTopAfterAddAndRemoveItems() {
        customQueue.add(2);
        customQueue.add(3);
        customQueue.add(5);
        Assert.assertEquals(customQueue.top(), Integer.valueOf(2));
        customQueue.remove();
        customQueue.remove();
        Assert.assertEquals(customQueue.top(), Integer.valueOf(5));
        customQueue.add(10);
        customQueue.remove();
        customQueue.add(15);
        customQueue.remove();
        Assert.assertEquals(customQueue.top(), Integer.valueOf(15));


    }
}
