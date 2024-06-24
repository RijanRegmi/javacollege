public class InterFaceTask{
    public static void main(String[] args) {
        Spotify spotify = new Spotify("Song A", 3.5);
        AppleMusic appleMusic = new AppleMusic("Song B", 4.0);

        spotify.play();
        spotify.pause();
        spotify.next();
        spotify.previous();
        System.out.println(spotify.nowPlaying());
        System.out.println("Spotify song size: " + spotify.size() + " MB");
        System.out.println("Spotify remaining size: " + spotify.remaining(1.5) + " MB");
        spotify.download();

        appleMusic.play();
        appleMusic.pause();
        appleMusic.next();
        appleMusic.previous();
        System.out.println(appleMusic.nowPlaying());
        System.out.println("Apple Music song size: " + appleMusic.size() + " MB");
        System.out.println("Apple Music remaining size: " + appleMusic.remaining(2.0) + " MB");
        appleMusic.download();
    }
}

/*
 * Task
 * Make an interface Media
 * make the following functions
 * void play()
 * void pause()
 * void next()
 * void previous()
 * String nowPlaying()
 * 
 * Make an interface DigitalMedia extending Media
 * make the following functions
 * double size()
 * double remaining(double current)
 * 
 * Make an interface OnlineAsset
 * make the following functions
 * void download()
 * 
 * Make a class Spotify and implement DigitalMedia and OnlineAsset
 * Make a class AppleMusic and implement DigitalMedia and OnlineAsset
 * Make one object of Spotify and one object of AppleMusic
 */ 

 interface MediaInterface{
    public void play();
    public void pause();
    public void next();
    public void previous();
    public String nowPlaying();
 }

 interface DigitalMedia extends MediaInterface{
    public double size();
    public double remaining(double current);
 }
interface OnlineAsset {
    void download();
}

class Spotify implements DigitalMedia, OnlineAsset {
    private String currentSong;
    private double fileSize;

    public Spotify(String currentSong, double fileSize) {
        this.currentSong = currentSong;
        this.fileSize = fileSize;
    }

    @Override
    public void play() {
        System.out.println("Spotify is playing " + currentSong);
    }

    @Override
    public void pause() {
        System.out.println("Spotify is paused.");
    }

    @Override
    public void next() {
        System.out.println("Spotify is playing the next song.");
    }

    @Override
    public void previous() {
        System.out.println("Spotify is playing the previous song.");
    }

    @Override
    public String nowPlaying() {
        return "Spotify is now playing: " + currentSong;
    }

    @Override
    public double size() {
        return fileSize;
    }

    @Override
    public double remaining(double current) {
        return fileSize - current;
    }

    @Override
    public void download() {
        System.out.println("Spotify is downloading the song.");
    }
}

class AppleMusic implements DigitalMedia, OnlineAsset {
    private String currentSong;
    private double fileSize;

    public AppleMusic(String currentSong, double fileSize) {
        this.currentSong = currentSong;
        this.fileSize = fileSize;
    }

    @Override
    public void play() {
        System.out.println("Apple Music is playing " + currentSong);
    }

    @Override
    public void pause() {
        System.out.println("Apple Music is paused.");
    }

    @Override
    public void next() {
        System.out.println("Apple Music is playing the next song.");
    }

    @Override
    public void previous() {
        System.out.println("Apple Music is playing the previous song.");
    }

    @Override
    public String nowPlaying() {
        return "Apple Music is now playing: " + currentSong;
    }

    @Override
    public double size() {
        return fileSize;
    }

    @Override
    public double remaining(double current) {
        return fileSize - current;
    }

    @Override
    public void download() {
        System.out.println("Apple Music is downloading the song.");
    }
}