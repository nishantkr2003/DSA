public class interface{
    public static void main(String[] args){

        interface MusicPlayer {
            void play();
            void pause();
            void stop();
        }
        
    }
}

class Mobile{
    public static void main(String[] args) {
        Spotify spot = new Spotify();
        spot.play();
        spot.stop();
        spot.change();
        
    }
}