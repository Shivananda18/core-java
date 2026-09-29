package com.xworkz.fortisapp.runner;

import com.xworkz.fortisapp.spotify.Spotify;
import com.xworkz.fortisapp.spotify.song.Song;

public class SpotifyRunner {
    public static void main(String[] args) {

        Spotify spotify=new Spotify();

        Song song1 = new Song();
        song1.setSongId(1);
        song1.setSongName("Lusiam");
        song1.setComposer("Ajaneesh Loknath");
        song1.setLyricist("Pawan Kumar");
        song1.setMainArtist("Siddharth");
        song1.setPlayBackSinger("Sanjith Hegde");
        song1.setProducer("Ashwini Puneeth Rajkumar");
        spotify.addSong(song1);

        Song song2 = new Song();
        song2.setSongId(2);
        song2.setSongName("Anisuthide Yaako Indu");
        song2.setComposer("V. Harikrishna");
        song2.setLyricist("Jayanth Kaikini");
        song2.setMainArtist("Ganesh");
        song2.setPlayBackSinger("Sonu Nigam");
        song2.setProducer("K. Manju");
        spotify.addSong(song2);

        Song song3 = new Song();
        song3.setSongId(3);
        song3.setSongName("Belageddu");
        song3.setComposer("V. Harikrishna");
        song3.setLyricist("Yogaraj Bhat");
        song3.setMainArtist("Puneeth Rajkumar");
        song3.setPlayBackSinger("Puneeth Rajkumar");
        song3.setProducer("K. Manju");
        spotify.addSong(song3);

        Song song4 = new Song();
        song4.setSongId(4);
        song4.setSongName("Jothe Jotheyali");
        song4.setComposer("V. Harikrishna");
        song4.setLyricist("Jayanth Kaikini");
        song4.setMainArtist("Darshan");
        song4.setPlayBackSinger("Sonu Nigam");
        song4.setProducer("Rockline Venkatesh");
        spotify.addSong(song4);

        Song song5 = new Song();
        song5.setSongId(5);
        song5.setSongName("Kannu Hodiyaka");
        song5.setComposer("V. Harikrishna");
        song5.setLyricist("Yogaraj Bhat");
        song5.setMainArtist("Sudeep");
        song5.setPlayBackSinger("Shreya Ghoshal");
        song5.setProducer("C. R. Manohar");
        spotify.addSong(song5);

        Song song6 = new Song();
        song6.setSongId(6);
        song6.setSongName("Karagida Baaninalli");
        song6.setComposer("Raghu Dixit");
        song6.setLyricist("Jayanth Kaikini");
        song6.setMainArtist("Rakshit Shetty");
        song6.setPlayBackSinger("Raghu Dixit");
        song6.setProducer("Pushkara Mallikarjunaiah");
        spotify.addSong(song6);

        Song song7 = new Song();
        song7.setSongId(7);
        song7.setSongName("Nooru Janmaku");
        song7.setComposer("V. Harikrishna");
        song7.setLyricist("Jayanth Kaikini");
        song7.setMainArtist("Ganesh");
        song7.setPlayBackSinger("Sonu Nigam");
        song7.setProducer("D. V. S. Rajendra Babu");
        spotify.addSong(song7);

        Song song8 = new Song();
        song8.setSongId(8);
        song8.setSongName("Minchagi Neenu Baralu");
        song8.setComposer("V. Harikrishna");
        song8.setLyricist("Jayanth Kaikini");
        song8.setMainArtist("Vijay Raghavendra");
        song8.setPlayBackSinger("Sonu Nigam");
        song8.setProducer("Suresh");
        spotify.addSong(song8);

        Song song9 = new Song();
        song9.setSongId(9);
        song9.setSongName("Ninnindale");
        song9.setComposer("Mano Murthy");
        song9.setLyricist("Kavithanjali");
        song9.setMainArtist("Puneeth Rajkumar");
        song9.setPlayBackSinger("Sonu Nigam");
        song9.setProducer("Hombale Films");
        spotify.addSong(song9);

        Song song10 = new Song();
        song10.setSongId(10);
        song10.setSongName("Hrudayake Hedarike");
        song10.setComposer("Mano Murthy");
        song10.setLyricist("Jayanth Kaikini");
        song10.setMainArtist("Ganesh");
        song10.setPlayBackSinger("Sonu Nigam");
        song10.setProducer("Suresh");
        spotify.addSong(song10);

        Song song11 = new Song();
        song11.setSongId(11);
        song11.setSongName("Nee Nanna Gellalare");
        song11.setComposer("Rajesh Ramanath");
        song11.setLyricist("Hamsalekha");
        song11.setMainArtist("Puneeth Rajkumar");
        song11.setPlayBackSinger("Shankar Mahadevan");
        song11.setProducer("Rockline Venkatesh");
        spotify.addSong(song11);

        Song song12 = new Song();
        song12.setSongId(12);
        song12.setSongName("Onde Usiru");
        song12.setComposer("V. Harikrishna");
        song12.setLyricist("Jayanth Kaikini");
        song12.setMainArtist("Darshan");
        song12.setPlayBackSinger("Sonu Nigam");
        song12.setProducer("Umapathy Srinivas");
        spotify.addSong(song12);

        Song song13 = new Song();
        song13.setSongId(13);
        song13.setSongName("Yaare Koogadali");
        song13.setComposer("V. Harikrishna");
        song13.setLyricist("Yogaraj Bhat");
        song13.setMainArtist("Puneeth Rajkumar");
        song13.setPlayBackSinger("Puneeth Rajkumar");
        song13.setProducer("K. Manju");
        spotify.addSong(song13);

        Song song14 = new Song();
        song14.setSongId(14);
        song14.setSongName("Kushiyagide");
        song14.setComposer("Arjun Janya");
        song14.setLyricist("Yogaraj Bhat");
        song14.setMainArtist("Rakshit Shetty");
        song14.setPlayBackSinger("Vijay Prakash");
        song14.setProducer("Pushkara Mallikarjunaiah");
        spotify.addSong(song14);

        Song song15 = new Song();
        song15.setSongId(15);
        song15.setSongName("Soul of Dia");
        song15.setComposer("B. Ajaneesh Loknath");
        song15.setLyricist("Dhananjaya Ranjan");
        song15.setMainArtist("Prithvi Ambaar");
        song15.setPlayBackSinger("Sanjith Hegde");
        song15.setProducer("K. S. Ashoka");
        spotify.addSong(song15);

        Song song16 = new Song();
        song16.setSongId(16);
        song16.setSongName("Dwapara");
        song16.setComposer("B. Ajaneesh Loknath");
        song16.setLyricist("Dhananjaya Ranjan");
        song16.setMainArtist("Darshan");
        song16.setPlayBackSinger("Jaskaran Singh");
        song16.setProducer("Rockline Venkatesh");
        spotify.addSong(song16);

        Song song17 = new Song();
        song17.setSongId(17);
        song17.setSongName("Tagaru Banthu Tagaru");
        song17.setComposer("Charan Raj");
        song17.setLyricist("Puneeth Rudranag");
        song17.setMainArtist("Shivarajkumar");
        song17.setPlayBackSinger("Anthony Daasan");
        song17.setProducer("K. P. Srikanth");
        spotify.addSong(song17);

        Song song18 = new Song();
        song18.setSongId(18);
        song18.setSongName("Kavalu Daari");
        song18.setComposer("Charan Raj");
        song18.setLyricist("Dhananjaya Ranjan");
        song18.setMainArtist("Rishi");
        song18.setPlayBackSinger("Vijay Prakash");
        song18.setProducer("Puneeth Rajkumar");
        spotify.addSong(song18);

        Song song19 = new Song();
        song19.setSongId(19);
        song19.setSongName("Marali Manasaagide");
        song19.setComposer("Vasuki Vaibhav");
        song19.setLyricist("Vasuki Vaibhav");
        song19.setMainArtist("Prajwal Devaraj");
        song19.setPlayBackSinger("Sanjith Hegde");
        song19.setProducer("D. S. Manjunath");
        spotify.addSong(song19);

        Song song20 = new Song();
        song20.setSongId(20);
        song20.setSongName("Usire Usire");
        song20.setComposer("V. Harikrishna");
        song20.setLyricist("Kavikumar");
        song20.setMainArtist("Shivarajkumar");
        song20.setPlayBackSinger("Sonu Nigam");
        song20.setProducer("D. K. Ramesh");
        spotify.addSong(song20);

        Song song21 = new Song();
        song21.setSongId(21);
        song21.setSongName("Huttidare Kannada Nadalli Huttabeku");
        song21.setComposer("Hamsalekha");
        song21.setLyricist("Hamsalekha");
        song21.setMainArtist("Vishnuvardhan");
        song21.setPlayBackSinger("Dr. Rajkumar");
        song21.setProducer("Parvathamma Rajkumar");
        spotify.addSong(song21);

        spotify.getAllSongs();


    }
}
