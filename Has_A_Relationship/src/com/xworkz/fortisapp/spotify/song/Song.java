package com.xworkz.fortisapp.spotify.song;

public class Song {

    public int songId;
    public String songName;
    public String mainArtist;
    public String composer;
    public String lyricist;
    public String producer;
    public String playBackSinger;

    public void setSongId(int songId) {
        this.songId = songId;
    }

    public int getSongId() {
        return this.songId;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getSongName() {
        return this.songName;
    }

    public void setMainArtist(String mainArtist) {
        this.mainArtist = mainArtist;
    }

    public String getMainArtist() {
        return this.mainArtist;
    }

    public void setComposer(String composer) {
        this.composer = composer;
    }

    public String getComposer() {
        return this.composer;
    }

    public void setLyricist(String lyricist) {
        this.lyricist = lyricist;
    }

    public String getLyricist() {
        return this.lyricist;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getProducer() {
        return this.producer;
    }

    public void setPlayBackSinger(String playBackSinger) {
        this.playBackSinger = playBackSinger;
    }

    public String getPlayBackSinger() {
        return this.playBackSinger;
    }

    public String toString() {
        return "Song ={songId :" + this.songId +
                "song_name : " + this.songName +
                "main_artist : " + this.mainArtist +
                "composer : " + this.composer +
                "lyricist : " + this.lyricist +
                "Producer : " + producer +
                "playBackSinger : " + playBackSinger;
    }

}

