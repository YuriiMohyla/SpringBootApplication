package model;

import java.util.ArrayList;

public class LastFmObject {
    Album AlbumObject;

    public Album getAlbum() {
        return AlbumObject;
    }

    public void setAlbum(Album albumObject) {
        this.AlbumObject = albumObject;
    }

    @Override
    public String toString() {
        return "LastFmObject{" +
                "AlbumObject=" + AlbumObject +
                '}';
    }

    public LastFmObject() {}
}
class Album {
    private String name;
    private String artist;
    private String mbid;
    private String url;
    ArrayList< Object > image = new ArrayList <> ();
    private String listeners;
    private String playcount;
    Tracks TracksObject;
    Tags TagsObject;
    Wiki WikiObject;


    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist;
    }

    public String getMbid() {
        return mbid;
    }

    public String getUrl() {
        return url;
    }

    public String getListeners() {
        return listeners;
    }

    public String getPlaycount() {
        return playcount;
    }

    public Tracks getTracks() {
        return TracksObject;
    }

    public Tags getTags() {
        return TagsObject;
    }

    public Wiki getWiki() {
        return WikiObject;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setMbid(String mbid) {
        this.mbid = mbid;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setListeners(String listeners) {
        this.listeners = listeners;
    }

    public void setPlaycount(String playcount) {
        this.playcount = playcount;
    }

    public void setTracks(Tracks tracksObject) {
        this.TracksObject = tracksObject;
    }

    public void setTags(Tags tagsObject) {
        this.TagsObject = tagsObject;
    }

    public void setWiki(Wiki wikiObject) {
        this.WikiObject = wikiObject;
    }

    @Override
    public String toString() {
        return "Albume{" +
                "name='" + name + '\'' +
                ", artist='" + artist + '\'' +
                ", mbid='" + mbid + '\'' +
                ", url='" + url + '\'' +
                ", image=" + image +
                ", listeners='" + listeners + '\'' +
                ", playcount='" + playcount + '\'' +
                ", TracksObject=" + TracksObject +
                ", TagsObject=" + TagsObject +
                ", WikiObject=" + WikiObject +
                '}';
    }
}
class Wiki {
    private String published;
    private String summary;
    private String content;


    public String getPublished() {
        return published;
    }

    public String getSummary() {
        return summary;
    }

    public String getContent() {
        return content;
    }

    public void setPublished(String published) {
        this.published = published;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Wiki{" +
                "published='" + published + '\'' +
                ", summary='" + summary + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
class Tags {
    ArrayList < Object > tag = new ArrayList < Object > ();

    @Override
    public String toString() {
        return "Tags{" +
                "tag=" + tag +
                '}';
    }
}
class Tracks {
    ArrayList < Object > track = new ArrayList < Object > ();

    @Override
    public String toString() {
        return "Tracks{" +
                "track=" + track +
                '}';
    }
}
