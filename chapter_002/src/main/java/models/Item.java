package models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/**
 * Class Item.
 * @author Dmitrij Gribovskij.
 * @since 13.12.2016.
 */
public class Item {
    /**
     * Имя заявки.
     */
    private String name;
    /**
     * Описание заявки.
     */
    private String description;
    /**
     * Дата создания заявки.
     */
    private Date dateCreat;
    /**
     * Массив комментариев к заявке.
     */
    private List<Comment> comments = new ArrayList<Comment>();
    /**
     * ID заявки.
     */
    private String id;
    /**
     * Default constructor for class Item.
     */
    public Item() { }
    /**
     * Constructor for class Item.
     * @param name - имя заявки
     * @param description - описание заявки.
     * @param dateCreat - дата создания заявки.
     * @param comments - комментарии к заявке.
     */
    public Item(String name, String description, Date dateCreat, Comment comments) {
        this.comments.add(comments);
        this.dateCreat = dateCreat;
        this.description = description;
        this.name = name;
    }
    /**
     * Setter for name.
     * @param name - имя заявки.
     */
    public void setName(String name) {
        this.name = name; }
    /**
     * Getter for name.
     * @return - имя заявки.
     */
    public String getName() {
        return this.name;
    }
    /**
     * Setter for Description.
     * @param description - описание заявки.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    /**
     * Getter for description.
     * @return - описание заявки.
     */
    public String getDescription() {
        return this.description;
    }
    /**
     * Setter for dateCreat.
     * @param date - дата создания.
     */
    public void setDateCreat(Date date) {
        this.dateCreat = date;
    }
    /**
     * Getter for dateCreat.
     * @return - дата создания.
     */
    public Date getDateCreat() {
        return this.dateCreat;
    }
    /**
     * Setter for Comments.
     * @param comments - комментарии.
     */
    public void setComments(Comment comments) {
        this.comments.add(comments);
    }
    /**
     * Getter for comments.
     * @return - комментарии.
     */
    public List<Comment> getComments() {
        return this.comments;
    }
    /**
     * Setter ID.
     * @param id - ID заявки.
     */
    public void setId(String id) {
        this.id = id;
    }
    /**
     * Getter ID.
     * @return - ID заявки.
     */
    public String getId() {
        return this.id;
    }
    /**
     * Переопределённый метод toSting.
     * @return - Item.
     */
    @Override
    public String toString() {
        return "Name: " + getName() + " Id: " + getId() + " Description: " + getDescription() + " Date: " + getDateCreat() + "\n"
                + "Comments: " + getComments();
    }
}
