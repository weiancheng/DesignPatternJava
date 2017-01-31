abstract class BaseMediaFormat {
    abstract public void Play();
    abstract public void Stop();
    abstract public void Pause();
}

class MediaAVI extends BaseMediaFormat {
    public void Play() {
        System.out.println("avi: start to play.");
    }
    
    public void Stop() {
        System.out.println("avi: stop to play.");
    }
    
    public void Pause() {
        System.out.println("avi: pause to play.");
    }
}

class MediaMKV extends BaseMediaFormat {
    public void Play() {
        System.out.println("mkv: start to play");
    }
    
    public void Stop() {
        System.out.println("mkv: stop to play");
    }
    
    public void Pause() {
        System.out.println("mkv: pause to play");
    }
}

class MediaRMVB extends BaseMediaFormat {
    public void Play() {
        System.out.println("rmvb: start to play");
    }
    
    public void Stop() {
        System.out.println("rmvb: stop to play");
    }
    
    public void Pause() {
        System.out.println("rmvb: pause to play");
    }
}

class MediaPlayer {
    private BaseMediaFormat mFormat;
    
    public MediaPlayer(BaseMediaFormat format) {
        mFormat = format;
    } 
    
    public void Play() {
        mFormat.Play();
    }
    
    public void Stop() {
        mFormat.Stop();
    }
    
    public void Pause() {
        mFormat.Pause();
    }
}

class StrategyPattern
{
    public static void main (String[] args) throws java.lang.Exception
    {
        MediaPlayer player = new MediaPlayer(new MediaRMVB());
        player.Play();
        player.Pause();
        player.Play();
        player.Stop();
    }
}