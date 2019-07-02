package debug;

import android.app.Application;



/**
 *
 */

public class LoginApplication extends Application {
    public static LoginApplication loginApplication;

    @Override
    public void onCreate() {
        super.onCreate();
        loginApplication = this;
        init();
    }

    public void init(){

    }
}
