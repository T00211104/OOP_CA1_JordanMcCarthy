package assessment;

import javax.swing.*;

//This class organises the data for testAlbum ie shuffle()
public class Album {
    private String name;
    private Song[] tracks;
    private String producer;
    private int releaseYear;

    public Album(){
        String name = "No name specified" ;
        Song[] tracks;
        String producer = "No name specified";
        int releaseYear;
    }

    public Album(String name,Song[] tracks,String producer,int releaseYear){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Song[] getTracks() {
        return tracks;
    }

    public void setTracks(Song[] tracks) {
        this.tracks = tracks;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
    public int getReleaseYear(){
        return releaseYear;
        }

    public void setReleaseYear(int releaseYear){
        this.releaseYear = releaseYear;
    }

    public int getNumberOfTracks(int numberOfTracks, Song[] tracks){
        if(tracks.length>0)
        numberOfTracks++;
        return numberOfTracks;
    }

    public int getPlayingTime( int Song){
        int playingTime;
        if(Song!=null)
            playingTime += Song;
        return playingTime;
    }

    public getPlayTrack(int value){
        if(value>=1 && value<=5)

        else{

        }

    public getShuffle(){
        Math.random(*5+1);
        }
    }

    public String toString(){
            return "Album: " + getName() + "Tracks: " + getTracks() +
                   "Producer: " + getProducer() + "Release Year: " + getReleaseYear();}

}
