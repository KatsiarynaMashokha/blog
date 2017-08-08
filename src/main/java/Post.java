import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 * Created by Guest on 8/8/17.
 */
public class Post {
    private String content;
    private boolean published;
    private LocalDateTime createdAt;
    private static ArrayList<Post> instances = new ArrayList<>();
    private int id;

    public Post(String content) {
        this.content = content;
        this.published = false;
        this.createdAt = LocalDateTime.now();
        instances.add(this);
        this.id = instances.size();
    }

    public static Post findById(int id){
        return instances.get(id-1); //why minus 1? See if you can figure it out.
    }

    public String getContent() {
        return content;
    }

    public static ArrayList<Post> getAll() {
        return instances;
    }

    public boolean getPublished(){ //new too
        return this.published;
    }

    public static void clear(){
        instances.clear();
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public int getId() {
        return id;
    }
}
