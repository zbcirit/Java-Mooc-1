
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }
    
    @Override
    public boolean equals(Object compared) {
        // points to same address
        if (this == compared){
            return true;
        }
        
        //not same type
        if (!(compared instanceof Song)) {
            return false;
        }
        
        // compare fields
        Song comparedSong = (Song) compared;
        return (this.artist.equals(comparedSong.artist) &&
                this.name.equals(comparedSong.name) &&
                this.durationInSeconds == comparedSong.durationInSeconds);
    }


}
