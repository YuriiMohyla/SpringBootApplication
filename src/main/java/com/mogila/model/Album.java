package com.mogila.model;

import java.util.ArrayList;

public class Album {
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

    public Album() {
    }

    public Album(String name, String artist, String mbid, String url, ArrayList<Object> image, String listeners, String playcount, Tracks tracksObject, Tags tagsObject, Wiki wikiObject) {
        this.name = name;
        this.artist = artist;
        this.mbid = mbid;
        this.url = url;
        this.image = image;
        this.listeners = listeners;
        this.playcount = playcount;
        TracksObject = tracksObject;
        TagsObject = tagsObject;
        WikiObject = wikiObject;
    }

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
        return "Album{" +
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
