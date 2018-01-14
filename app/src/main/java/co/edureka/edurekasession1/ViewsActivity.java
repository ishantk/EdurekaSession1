package co.edureka.edurekasession1;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class ViewsActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener,AdapterView.OnItemSelectedListener{


    CheckBox cbCpp, cbJava, cbPython;
    RadioButton rbMale, rbFemale;

    Spinner spinner;
    ArrayAdapter<String> adapter;

    AutoCompleteTextView autoCompleteTextView;
    ArrayAdapter<String> autoAdapter;

    TextView txtDateTime;
    Button btnDateTime;

    DatePickerDialog datePickerDialog;
    DatePickerDialog.OnDateSetListener dateSetListener;

    TimePickerDialog timePickerDialog;
    TimePickerDialog.OnTimeSetListener timeSetListener;

    void showDatePicker(){

        dateSetListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int yy, int mm, int dd) {
                txtDateTime.setText(yy+"/"+(mm+1)+"/"+dd);
            }
        };

        Calendar calendar = Calendar.getInstance(); // JAVA API
        int yy = calendar.get(Calendar.YEAR);
        int mm = calendar.get(Calendar.MONTH);
        int dd = calendar.get(Calendar.DAY_OF_MONTH);

        datePickerDialog = new DatePickerDialog(this,dateSetListener,yy,mm,dd);
        datePickerDialog.show();

    }

    void showTimePicker(){
        timeSetListener = new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker timePicker, int hh, int mm) {
                txtDateTime.setText(hh+" : "+mm);
            }
        };

        Calendar calendar = Calendar.getInstance(); // JAVA API
        int hh = calendar.get(Calendar.HOUR_OF_DAY);
        int mm = calendar.get(Calendar.MINUTE);


        timePickerDialog = new TimePickerDialog(this,timeSetListener,hh,mm,true);
        timePickerDialog.show();
    }

    void initAutoComplete(){

        autoCompleteTextView = findViewById(R.id.autoCompleteTextView);

        autoAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1);
        autoAdapter.add("HandBags");
        autoAdapter.add("Handkerchiefs");
        autoAdapter.add("Glasses");
        autoAdapter.add("Wallet");
        autoAdapter.add("Chocolate");
        autoAdapter.add("Laptop");
        autoAdapter.add("Mobile");

        autoCompleteTextView.setAdapter(autoAdapter);
        autoCompleteTextView.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                String selection = autoAdapter.getItem(position);
                Toast.makeText(ViewsActivity.this,"You Now Selected : "+selection,Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    void initSpinner(){

        spinner = findViewById(R.id.spinner);

        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1);
        adapter.add("--Select City--");
        adapter.add("Chandigarh");
        adapter.add("Pune");
        adapter.add("Hyderabad");
        adapter.add("Bengaluru");
        adapter.add("Chennai");

        spinner.setAdapter(adapter);
        //spinner.setOnItemSelectedListener(this);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                String selection = adapter.getItem(position);
                Toast.makeText(ViewsActivity.this,"You Now Selected : "+selection,Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }


    void initViews(){
        cbCpp = findViewById(R.id.checkBoxCpp);
        cbJava = findViewById(R.id.checkBoxJava);
        cbPython = findViewById(R.id.checkBoxPython);

        rbMale = findViewById(R.id.radioButtonMale);
        rbFemale = findViewById(R.id.radioButtonFemale);

        cbCpp.setOnCheckedChangeListener(this);
        cbJava.setOnCheckedChangeListener(this);
        cbPython.setOnCheckedChangeListener(this);

        rbMale.setOnCheckedChangeListener(this);
        rbFemale.setOnCheckedChangeListener(this);

        txtDateTime = findViewById(R.id.textViewDateTime);
        btnDateTime = findViewById(R.id.buttonDateTime);

        btnDateTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //showDatePicker();
                showTimePicker();
            }
        });

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_views);
        initViews();
        initSpinner();
        initAutoComplete();
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

        int id = compoundButton.getId(); // Obtain the id of the view with which user is interacting

        switch (id){
            case R.id.checkBoxCpp:

                if(b){
                    Toast.makeText(this,"You Checked CPP",Toast.LENGTH_LONG).show();
                }else {
                    Toast.makeText(this,"You UnChecked CPP",Toast.LENGTH_LONG).show();
                }

                break;

            case R.id.checkBoxJava:

                if(b){
                    Toast.makeText(this,"You Checked Java",Toast.LENGTH_LONG).show();
                }else {
                    Toast.makeText(this,"You UnChecked Java",Toast.LENGTH_LONG).show();
                }

                break;

            case R.id.checkBoxPython:

                if(b){
                    Toast.makeText(this,"You Checked Python",Toast.LENGTH_LONG).show();
                }else {
                    Toast.makeText(this,"You UnChecked Python",Toast.LENGTH_SHORT).show();
                }

                break;

            case R.id.radioButtonMale:

                if(b){
                    Toast.makeText(this,"You Selected Male",Toast.LENGTH_LONG).show();
                }else {
                    Toast.makeText(this,"You UnSelected Male",Toast.LENGTH_LONG).show();
                }

                break;

            case R.id.radioButtonFemale:

                if(b){
                    Toast.makeText(this,"You Selected FeMale",Toast.LENGTH_LONG).show();
                }else {
                    Toast.makeText(this,"You UnSelected FeMale",Toast.LENGTH_LONG).show();
                }

                break;
        }

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {

        /*int id = adapterView.getId();
        switch (id){

        }*/

        String selection = adapter.getItem(position);
        Toast.makeText(this,"You Selected : "+selection,Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
