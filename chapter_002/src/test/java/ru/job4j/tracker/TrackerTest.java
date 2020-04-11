package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    @Test
    public void whenFindAllThenReturnAll() {
        Item[] expected = new Item[3];
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        expected[0] = item;
        item = new Item("test2");
        tracker.add(item);
        expected[1] = item;
        item = new Item("test3");
        tracker.add(item);
        expected[2] = item;
        Item[] result = tracker.findAll();
        assertThat(result, is(expected));
    }

    @Test
    public void whenFindByNameThenReturnWithSameName() {
        Item[] expected = new Item[2];
        Tracker tracker = new Tracker();
        Item item = new Item("google");
        tracker.add(item);
        expected[0] = item;
        item = new Item("google");
        tracker.add(item);
        expected[1] = item;
        item = new Item("test3");
        tracker.add(item);
        Item[] result = tracker.findByName("google");
        assertThat(result, is(expected));
    }

    @Test
    public void whenFindtemById() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }
}
