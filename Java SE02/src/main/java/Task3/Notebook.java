package Task3;

import Task2.Stationary;

/**
 * Created by User on 26.01.2017.
 */
public class Notebook extends Stationary {
    private int pages;
    public Notebook() {
        this.setName("Notebook");
        this.setPrice(0);
        this.setPages(0);
    }

    public Notebook(double price,int pages) {
        this.setName("Notebook");
        this.setPrice(price);
        this.setPages(pages);

    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "pages=" + pages +
                '}';
    }
}
