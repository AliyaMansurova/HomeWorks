package Task6;
import java.util.ArrayList;
import java.util.List;
/**
 * Created by User on 29.12.2016.
 */
public class Notebook {
    List<Entry> records=new ArrayList<Entry>();

    public static void main(String[] args) {
        Notebook notebook=new Notebook();
        notebook.addEntry("First mark");
        notebook.addEntry("Second mark");
        notebook.addEntry("Third mark");

        notebook.edit(0,"First mark changed");
        notebook.delete(2);
        notebook.showAll();
    }

    public Notebook() {
        new Notebook(this.records);
    }

    public Notebook(List<Entry> records) {
        this.records = records;
    }
    /**Adds an entry in the notebook*/
    public void addEntry(String mark) {
        Entry record = new Entry(mark);
        this.records.add(record);
    }
    /**Removes an entry from the notepad
     * @param id indicates the record to be deleted*/
    public void delete(int id){
        this.records.remove(id);
    }
    /**Edit the entry in the notebook on the index
     * @param id indicates the record to be edited
     * @param mark indicates a new recording mark*/
    public void edit(int id,String mark){
        this.records.get(id).setMark(mark);
    }
    /**Displays all entries from the notepad*/
    public void showAll() {
        for (Entry record : this.records) {
            System.out.println("Entry{" + "mark=" +record.getMark() + "}");

        }
    }

}