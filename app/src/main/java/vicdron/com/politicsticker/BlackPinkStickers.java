package vicdron.com.politicsticker;

import android.app.Application;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.google.android.gms.ads.AdView;

public class BlackPinkStickers extends Application {


    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);
    }
}
