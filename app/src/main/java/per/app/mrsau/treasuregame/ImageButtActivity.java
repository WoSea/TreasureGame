package per.app.mrsau.treasuregame;

import android.support.v7.app.AlertDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by phams on 03/02/2016.
 */
public class ImageButtActivity extends AppCompatActivity {


    Button bt_1;
    Button bt_2;
    Button bt_3;
    Button bt_4;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imb);



        bt_1=(Button)findViewById(R.id.button);
        bt_2=(Button)findViewById(R.id.button2);
        bt_3=(Button)findViewById(R.id.button3);
        bt_4=(Button)findViewById(R.id.button4);

        bt_1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                DialogHint();

            }
        });

        bt_2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                DialogHint();

            }
        });

        bt_3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                DialogHint();

            }
        });

        bt_4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                DialogHint();
            }
        });

    }


public void DialogHint()
{
    AlertDialog.Builder builder = new AlertDialog.Builder(ImageButtActivity.this);
    builder.setTitle("HINT FOR YOU");
    builder.setCancelable(true);
    builder.setMessage(getResources().getString(R.string.dialoghint));
    builder.setNegativeButton("GOT IT", null);
    builder.show();
}



}
