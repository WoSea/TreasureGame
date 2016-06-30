package per.app.mrsau.treasuregame;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import android.widget.TextView;

/**
 * Created by phams on 03/01/2016.
 */
public class HelloActivity extends Activity{


    TextView tvhello;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);
        tvhello=(TextView)findViewById(R.id.textViewhello);
        Thread time =new Thread(){
            public  void run(){
                try{

                    sleep(2000);
                }catch (Exception e){

                }finally {
                    Intent activity2=
                            new Intent("per.app.mrsau.treasuregame.MainActivity");
                    startActivity(activity2);
                }
            }
        };
        time.start();
    }

    protected void OnPause(){
        super.onPause();
        finish();
    }


}

