package com.mogila.model;

public class LastFmObject {
    Album albumObject;

    public Album getAlbum() {
        return albumObject;
    }

    public void setAlbum(Album albumObject) {
        this.albumObject = albumObject;
    }

    public LastFmObject(Album albumObject) {
        this.albumObject = albumObject;
    }

    @Override
    public String toString() {
        return "LastFmObject{" +
                "AlbumObject=" + albumObject +
                '}';
    }

    public LastFmObject() {}
}

