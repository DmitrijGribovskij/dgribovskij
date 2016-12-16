package models;

/**
 * Class Comment.
 * @author Dmitrij Gribovskij.
 * @since  13.12.2016.
 */
public class Comment {
    /**
     * Создаём приватную ссылочную переменную comment.
     */
    private String comment;
    /**
     * Default конструктор класса Comment без параметров.
     */
    public Comment() { }
    /**
     * Конструктор класса Comment с параметром comment.
     * @param comment - комментарии.
     */
    public Comment(String comment) {
        this.comment = comment;
    }



    /**
     * Setter for comment.
     * @param comment - комментарии
     */
    public void setComment(String comment) {
        this.comment = comment; }
    /**
     * Getter for comment.
     * @return comment - комментарии
     */
    private String getComment() {
        return this.comment; }
    /**
     *
     * @return - getComment.
     */
    @Override
    public String toString() {
        return getComment();
    }
}
