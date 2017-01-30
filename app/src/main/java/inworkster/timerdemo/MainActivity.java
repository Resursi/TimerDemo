package inworkster.timerdemo;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        new CountDownTimer(10000, 1000){

            @Override
            public void onTick(long l) {
                Log.i("Second left", String.valueOf(l/1000));
            }

            @Override
            public void onFinish() {
                Log.i("Done!!", "Countdown finished");
            }
        }.start();


        /*final Handler handler = new Handler();
        Runnable run = new Runnable() {
            @Override
            public void run() {

                Log.i("Runnable has run", "a second passed" );
                handler.postDelayed(this, 1000);

            }
        };

        handler.post(run);*/
    }
}
