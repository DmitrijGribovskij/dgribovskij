package start;

import models.Comment;
import models.Item;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Class Tracker.
 * @author  Gribovskij.
 * @since 13.12.2016.
 */
public class Tracker {
    /**
     * Private items ссылка на массив объектов класса Item.
     */
    private List<Item> items = new ArrayList<>();
    /**
     * raN ссылка на объект класса Random.
     */
    private static Random raN = new Random();
    /**
     * Meтод add в который бередаются ссылки на объекты Item и заносятся в массив items.
     * @param item - заявка.
     */
    public void add(Item item) {
        item.setId(generateId());
        this.items.add(item);
    }
    /**
     * Метод generateId  в котором генерируется ID объекта Item.
     * @return - Id Item.
     */
    private String generateId() {
        return String.valueOf(System.currentTimeMillis() + raN.nextInt());
    }
    /**
     * Метод в который в качестве параметра передается  ID, а возвращается объект  Item, которому данный ID принадлежит.
     * @param id - id объекта Item.
     * @return - объект Item.
     */
    protected Item findById(String id) {
        Item result = null;
        for (Item item: this.items) {
            if (item.getId().equals(id)) {
                result = item;
                break;
            }
        }
        return result;
    }
    /**
     * Метод в который в качестве параметра передается имя объекта Item, а возвращается объект  Item, которому данное имя принадлежит.
     * @param name - имя заявки.
     * @return - объект Item.
     */
    protected List<Item> findName(String name) {
        List<Item> result = new ArrayList<>();
        for (Item item: this.items) {
            if (item.getName().equals(name)) {
                result.add(item);
                break;
            }
        }
        return result;
    }
    /**
     * Метод в который в качестве параметра передается описание заявки Item, а возвращается  список объектов  Item в
     * которых данное описание встречается.
     * @param description - описание заявки.
     * @return -  List<Item> - список заявок.
     */
    protected List<Item> findDescription(String description) {
        List<Item> result = new ArrayList<>();
        for (Item item: this.items) {
            if (item.getDescription().contains(description)) {
                result.add(item);
            }
        }
        return result;
    }
    /**
     * Метод возвращает весь список объектов Item.
     * @return -  List<Item> - список заявок.
     */
    public List<Item> getAll() {
        return this.items;

    }

    /**
     * Метод находит в списке  List<Item> переданный объект Item и удаляет его из списка.
     * @param item - заявка.
     */
    public void deleteItem(Item item) {
        for (int i = 0; i < this.items.size(); i++) {
            if (this.items.get(i).getId().equals(item.getId())) {
                this.items.remove(i);
            }
        }
    }
    /**
     * Метод добавляет комментарии в переданный объект Item.
     * @param item - объект Item
     * @param comment - объект Comment.
     */
    public void addComment(Item item, Comment comment) {
        item.setComments(comment);
    }
    /**
     * Метод находит в списке  List<Item> переданный объект item и обновляет его.
     * @param item - объект Item.
     */
    public void editItem(Item item) {
        for (int i = 0; i < this.items.size(); i++) {
            if (this.items.get(i).getId() == item.getId()) {
                this.items.set(i, item);
                break;
            }
        }
    }
}
