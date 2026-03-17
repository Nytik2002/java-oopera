public class MusicalShow extends Show {
    String musicAuthor; //автор музыки
    String librettoText; //текст либретто

    public MusicalShow(String title, int duration, Director director, String musicAuthor, String librettoText) {
        super(title, duration, director);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public void libretto() {
        System.out.println(librettoText);
    }
}