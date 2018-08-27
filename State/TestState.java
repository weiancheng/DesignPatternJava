public class TestState {
    public static void main(String [] arg) {
        System.out.println("This is State Pattern");

        MusicPlayer player = new MusicPlayer();

        if (!player.stop()) {
            System.out.println("stop music player failed");
        }

        if (!player.play("test music")) {
            System.out.println("play music player failed");
        }

        if (!player.pause()) {
            System.out.println("pause music player failed");
        }

        if (!player.stop()) {
            System.out.println("stop music player failed");
        }
    }
}