import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Album implements Serializable {
   private String name;
   private String artist;


    public String getName() {
        return name;
    }

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
    }

    public Album() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    @Override
    public String toString() {
        return "Album{" +
                "name='" + name + '\'' +
                ", artist='" + artist + '\'' +
                '}';
    }
}
