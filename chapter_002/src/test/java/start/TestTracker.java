package start;

import models.Comment;
import models.Item;
import org.junit.Test;

import java.util.List;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * TestTracker.
 * @author Dmitrij Gribovskij
 * @since 16.12.2016
 */
public class TestTracker {
    /**
     * Test class.
     */
    /**
     * Создание объекта Tracker.
     */
    private Tracker tracker = new Tracker();
    /**
     * Создание массива заявок items.
     */
    private List<Item> items = tracker.getAll();
    /**
     * Создание объекта item.
     */
    private Item item = new Item();
    /**
     * Test method add.
     */
    @Test
    public void whenItemThenItems() {
        tracker.add(item);
        assertEquals(items.get(0), item);
    }
    /**
     * Test method findByIdTrue.
     */
    @Test
    public void whenIdThenFindByIdTrue() {
        tracker.add(item);
        tracker.add(new Item());
        items.get(0).setId("5");
        items.get(1).setId("6");
        assertTrue(tracker.findById("5").equals(item));
    }
    /**
     * Test method findByIdFalse.
     */
    @Test
    public void whenIdThenFindByIdFalse() {
        tracker.add(item);
        tracker.add(new Item());
        items.get(0).setId("5");
        items.get(1).setId("6");
        assertFalse(tracker.findById("6").equals(item));
    }
    /**
     * Test method findNameTrue.
     */
    @Test
    public void whenNameThenFindItemTrue() {
        tracker.add(item);
        tracker.add(new Item());
        items.get(0).setName("First");
        items.get(1).setName("Second");
        assertTrue(tracker.findName("First").get(0).equals(item));
    }
    /**
     * Test method findNameFalse.
     */
    @Test
    public void whenNameThenFindItemFalse() {
        tracker.add(item);
        tracker.add(new Item());
        items.get(0).setName("First");
        items.get(1).setName("Second");
        assertFalse(tracker.findName("Second").get(0).equals(item));
    }
    /**
     * Test method findDescription.
     */
    @Test
    public void whenDescripThenFindItem() {
        tracker.add(item);
        tracker.add(new Item());
        items.get(0).setDescription("first description");
        items.get(1).setDescription("second description");
        assertTrue(tracker.findDescription("firs").get(0).equals(item));
    }
    /**
     * Test method deleteItem.
     */
    @Test
    public void whenItemThenDeleteThisItem() {
        tracker.add(item);
        tracker.add(new Item());
        items.get(0).setId("5");
        Item result = items.get(1);
        result.setId("6");
        tracker.deleteItem(item);
        assertTrue(items.get(0).equals(result));
    }
    /**
     * Test method addComment.
     */
    @Test
    public void whenItemAndCommentThenAddComments() {
        tracker.add(item);
        items.get(0).setComments(new Comment("first comment"));
        tracker.addComment(item, new Comment("second comment"));
        String result = "[first comment, second comment]";
        assertTrue(items.get(0).getComments().toString().equals(result));
    }
    /**
     * Test method addComment.
     */
    @Test
    public void whenItemThenEditThisItem() {
        tracker.add(item);
        Item result = new Item();
        result.setId(item.getId());
        tracker.editItem(result);
        assertTrue(items.get(0).equals(result));
    }
}