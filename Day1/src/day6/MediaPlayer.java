package day6;

import java.util.ArrayList;
import java.util.List;

public class MediaPlayer {
    public void myPlayList(List<? extends Media> myplaylist)         //wild card operator (?)
    {
//        myplaylist.add(new Video());                               // Now this can add only the Song type data in the list
                                                                        //can not modify the list
        for(Media m : myplaylist)
        {
            m.play();
        }
    }

    public static void main(String[] args) {
        MediaPlayer media = new MediaPlayer();
        List<Song> lis1 = new ArrayList<>();
        lis1.add(new Song(123,"hbak"));
        lis1.add(new Song(456,"kasgb"));
        lis1.add(new Song(789,"dad"));
//        lis1.add(new Video());

        media.myPlayList(lis1);
    }
}
