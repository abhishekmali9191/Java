package day6;

public class Song extends Media{
    private int srno;
    private String title;
    public Song(int srno, String title)
    {
        this.srno=srno;
        this.title=title;
    }

    @Override
    public String toString() {
        return "Song [sr no = "+ srno+", title = "+title+" ]";
    }

    @Override
    public void play() {
        System.out.println("Playing Song...");
    }
}
