package alienske.chillspot;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntroFragment;


public class MyIntro extends AppIntro {

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_my_intro);
//    }

    @Override
    public void init(Bundle savedInstanceState) {
        addSlide(AppIntroFragment.newInstance("Drinks Poster", "The app that sends drinks to your friends....\nWherever they are", R.drawable.jack, R.color.material_deep_teal_500));
        addSlide(AppIntroFragment.newInstance("Drinks Poster", "Just push a button and share the love...", R.drawable.jack2, R.color.material_deep_teal_500));
        addSlide(AppIntroFragment.newInstance("Drinks Poster", "Enjoy...", R.drawable.jack3, R.color.material_deep_teal_500));


        setBarColor(Color.parseColor("#3F51B5"));
        setSeparatorColor(Color.parseColor("#2196F3"));

        showSkipButton(true);
        showDoneButton(true);

        setVibrate(true);
        setVibrateIntensity(40);
    }

    private void loadMainActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    @Override
    public void onSkipPressed() {
        loadMainActivity();
    }

    @Override
    public void onDonePressed() {
        loadMainActivity();
    }

    public void getStarted(View v) {
        loadMainActivity();
    }

   }
