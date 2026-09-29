package com.xworkz.fortisapp.spotify;

import com.xworkz.fortisapp.spotify.song.Song;

public class Spotify {

     public  Song[] songs=new Song[21];
    int index;
    public boolean addSong(Song songs) {
        boolean isSongIdValid = false;
        boolean isSongNameValid = false;
        boolean isMainArtistValid = false;
        boolean isComposerValid = false;
        boolean isLyricist = false;
        boolean isSongsAdded = false;

        if (songs.getSongId() > 0) {
            isSongIdValid = true;
        }
        if (songs.getSongName() != null && !songs.getSongName().isEmpty()) {
            isSongNameValid = true;
        }
        if (songs.getMainArtist() != null & !songs.getMainArtist().isEmpty()) {
            isMainArtistValid = true;
        }
        if (songs.getComposer() != null && !songs.getComposer().isEmpty()) {
            isComposerValid = true;
        }
        if (!songs.getLyricist().isEmpty() && songs.getLyricist() != null) {
            isLyricist = true;
        }
        if (songs.getPlayBackSinger() != null && !songs.getPlayBackSinger().isEmpty()) {

        }
        if (isSongIdValid && isSongNameValid && isLyricist && isMainArtistValid  && isComposerValid) {
            this.songs[index++] = songs;
            isSongsAdded = true;
        }
        return isSongsAdded;
    }
    public void getAllSongs(){

        for(Song songs1:songs){

            System.out.println("get all songs : "+songs1);
        }
    }
}
