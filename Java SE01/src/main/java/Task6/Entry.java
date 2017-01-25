package Task6;

/**
 * created by Aliya Mansurova
 */
public class Entry {
    private String mark;

    public Entry() {
        this.mark = "empty";
    }
    public Entry(String mark) {
        this.mark = mark;
    }
    /**Returns the value of the mark in the record notebook*/
    public String getMark() {
        return mark;
    }
    /**Sets a mark in a notebook entry*/
    public void setMark(String mark) {
        this.mark = mark;
    }
}
