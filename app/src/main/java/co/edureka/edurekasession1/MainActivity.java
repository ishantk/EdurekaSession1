package co.edureka.edurekasession1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Date;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    Button btnSubmit;

    LinearLayout linearLayout;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /*linearLayout = new LinearLayout(this);
        txt = new TextView(this);
        txt.setText("This is Awesome");

        linearLayout.addView(txt);

        setContentView(linearLayout);*/

        setContentView(R.layout.activity_main); // Binding the Layout of Activity

        // After view is set on Activity, we must initialize the variables
        btnSubmit = findViewById(R.id.button);
        btnSubmit.setOnClickListener(this);

        Log.i("MainActivity","onCreate");
        Toast.makeText(this,"MainActivity - onCreate",Toast.LENGTH_LONG).show();
        //System.out.println("This is onCreate of MainActivity");

    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.i("MainActivity","onStart");
        Toast.makeText(this,"MainActivity - onStart",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("MainActivity","onResume");
        Toast.makeText(this,"MainActivity - onResume",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("MainActivity","onPause");
        Toast.makeText(this,"MainActivity - onPause",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("MainActivity","onStop");
        Toast.makeText(this,"MainActivity - onStop",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("MainActivity","onDestroy");
        Toast.makeText(this,"MainActivity - onDestroy",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("MainActivity","onRestart");
        Toast.makeText(this,"MainActivity - onRestart",Toast.LENGTH_LONG).show();
    }

    public void clickHandler(View view){

        Date date = new Date();

        String dateTime = date.toString();

        // Toast is a Dialog which will come and go automatically
        Toast.makeText(this,"This is Awesome \nIts: "+dateTime,Toast.LENGTH_LONG).show();
    }

    @Override
    public void onClick(View view) {
        Date date = new Date();

        String dateTime = date.toString();

        // Toast is a Dialog which will come and go automatically
        Toast.makeText(this,"This is Amazingly Awesome \nIts: "+dateTime,Toast.LENGTH_LONG).show();
    }
}
