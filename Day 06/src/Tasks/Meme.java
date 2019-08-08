package Tasks;

import java.util.ArrayList;
import java.util.List;

public class Meme {
    private String name;
    private String imageUrl;
    private String description;
    private boolean favorite;

    public Meme(String name, String imageUrl, String description, boolean favorite) {
        this.name = name;
        setImageUrl(imageUrl);
        this.description = description;
        this.favorite = favorite;
    }

    public String getString(){
        return name+" "+imageUrl+" "+description+" "+favorite;
    }

    public String getName() {
        return name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getDescription() {
        return description;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImageUrl(String imageUrl) {
        if (imageUrl.contains("http://") || imageUrl.contains("https://") || imageUrl.contains("ftp://")) {
            this.imageUrl = imageUrl;
        } else {
            System.out.println("Nieprwidłowy URL");
        }

    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }
    public String toString(){
        return getString();
    }

    public static void main(String[] args) {
        Meme first = new Meme(
                "don't need Java",
                "https://images.app.goo.gl/cV8C2absPLvexuru9",
                "Technically you don't need JAVA, you can open jar files just like regular archives",
                true);
        Meme second = new Meme(
                "i don't need to update Jave",
                "https://images.app.goo.gl/Utj4YNAGSMjmkjPdA",
                "I don't need to update Java. Oh wait, yes I do",
                false);
        System.out.println(first.getString());
        System.out.println(first.toString());
        System.out.println(first);


        List<Meme> mems = new ArrayList<>();
        mems.add(new Meme(
                "O programistach",
                "https://images.app.goo.gl/Utj4YNAGSMjmkjPdA",
                "super",
                true));
        mems.add(new Meme(
                "O mezczyznach",
                "https://images.app.goo.gl/Utj4YNAGSMjmkjPdA",
                "super",
                false));
        mems.add(new Meme(
                "O blondynkach",
                "www://images.app.goo.gl/Utj4YNAGSMjmkjPdA",
                "super mem",
                true));
        mems.add(new Meme(
                "O programistach",
                "https://images.app.goo.gl/Utj4YNAGSMjmkjPdA",
                "super",
                true));

        for (Meme mem : mems) {
            if(mem.isFavorite()){
                System.out.println(mem);
            }
        }
    }
}
