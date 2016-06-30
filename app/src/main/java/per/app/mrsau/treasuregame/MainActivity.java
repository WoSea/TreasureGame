package per.app.mrsau.treasuregame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageButton ib_1;
    ImageButton ib_2;
    ImageButton ib_3;
    ImageButton ib_4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ib_1=(ImageButton)findViewById(R.id.imageButton);
        ib_2=(ImageButton)findViewById(R.id.imageButton2);
        ib_3=(ImageButton)findViewById(R.id.imageButton3);
        ib_4=(ImageButton)findViewById(R.id.imageButton4);


        ib_1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg0){
                Intent activity1=
                        new Intent("per.app.mrsau.treasuregame.ImageButtActivity");
                startActivity(activity1);
            }
        });

        ib_2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg0){
                Intent activity1=
                        new Intent("per.app.mrsau.treasuregame.ImageButtActivity");
                startActivity(activity1);
            }
        });

        ib_3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg0){
                Intent activity1=
                        new Intent("per.app.mrsau.treasuregame.ImageButtActivity");
                startActivity(activity1);
            }
        });

        ib_4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg0){
                Intent activity1=
                        new Intent("per.app.mrsau.treasuregame.ImageButtActivity");
                startActivity(activity1);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_help) {
            Toast.makeText(getApplicationContext(),"  Help",Toast.LENGTH_SHORT).show();


            // return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
