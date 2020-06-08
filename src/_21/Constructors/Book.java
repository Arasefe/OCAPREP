package _21.Constructors;

public class Book {
    private String title;
    private String topic;
    private int numberOfPages;

    public Book(String title, String topic, int numberOfPages) {
        this.title = title;
        this.topic = topic;
        this.numberOfPages = numberOfPages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
}
