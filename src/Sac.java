import java.util.ArrayList;
import java.util.List;

public class Sac {
    private List<Element> content;
    private int capacity;

    public Sac(List<Element> content, int capacity) {
        this.content = content;
        this.capacity = capacity;
    }

    public Sac(int capacity){

        this.capacity= capacity;
        this.content = new ArrayList<Element>();
    }

    public List<Element> getContent() {
        return content;
    }

    public int getCapacity() {
        return capacity;
    }

    public void addContent(Element element){
        content.add(element);
    }

}
