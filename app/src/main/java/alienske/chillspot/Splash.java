package alienske.chillspot;

/**
 * Created by njerry on 7/21/15.
 */
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;

public class Splash extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        Thread timerThread = new Thread() {
         public void run (){
             try {
                 sleep(3000);
             }
             catch(InterruptedException e) {
                 e.printStackTrace();
                 }
             finally {
                 Intent i = new Intent(getBaseContext(), MainActivity.class);
                 startActivity(i);
             }
         }
        };
        timerThread.start();
    }
@Override
    protected void onPause() {
    super.onPause();
    finish();
}

}

