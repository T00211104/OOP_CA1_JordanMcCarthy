package assessment;

public class Song {
    int trackID;
    int trackNumber;
    String title;
    String artist;
    String genre;
    int duration;
    int releaseYear;

    public Song(String title, String artist, String genre, int duration, int releaseYear) {

    }



    public int getTrackNumber() {
        return trackNumber++;
    }

    public void setTrackNumber(int trackNumber) {
        this.trackNumber = trackNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;

    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
    public String toString(){
            return "Title: " + getTitle() + "Artist: " + getArtist() +
                   "Genre " + getGenre() + "Duration: " + getDuration() +
                   " Year Released " + getReleaseYear();}
}