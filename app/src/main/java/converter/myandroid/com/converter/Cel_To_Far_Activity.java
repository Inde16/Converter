package converter.myandroid.com.converter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Cel_To_Far_Activity extends AppCompatActivity {


    /*
        Formulas (from wikipedia)
        [C] = ([F] - 32) 5/9 -----> From Fahrenheit to Celsius
        [F] = ([C] * 9/5 + 32 -----> From Celsius to Fahrenheit

     */


    private EditText tempEditText;
    private Button celBut;
    private Button faBut;
    private TextView tempResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cel__to__far_);

        //Cast our values in our activity objects
        tempEditText = (EditText) findViewById(R.id.editText);
        celBut = (Button) findViewById(R.id.btnCelsiusID);
        faBut = (Button) findViewById(R.id.btnFarhenaitID);
        tempResult = (TextView) findViewById(R.id.ResultView);

        //Setup the Button for Farenait to Celcius
        celBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //We pass our data to a String value so we can use the user data
                String editTextValue = tempEditText.getText().toString();

                if (editTextValue.isEmpty()){

                    //A message to tell the user that something went wrong
                    Toast.makeText(getApplicationContext(),"Enter a Value" , Toast.LENGTH_LONG).show();

                }
                else{
                    //here we pass our string value into a double value with the method of parseDouble
                    double DoubleEditText = Double.parseDouble(editTextValue);
                    // put the returned value into a variable so we can use it (make things organized)
                    double convertedValue = convertToCelsius(DoubleEditText);
                    //use the String.valueOf() method to convert our double value into it's corresponding string format so we can out put it
                    String stringResult = String.valueOf(convertedValue) + " \u2103";
                    tempResult.setText(stringResult);


                }

            }
        });


        //Setup the button for Celcius to Farenait
        faBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String editTextValue = tempEditText.getText().toString();

                if(editTextValue.isEmpty()){

                    Toast.makeText(getApplicationContext(),"Enter Value",Toast.LENGTH_LONG).show();
                }
                else {

                    double DoubleEditText = Double.parseDouble(editTextValue);

                    double convertedValue = conveetToFarenait(DoubleEditText);

                    String stringResult = String.valueOf(convertedValue)+ " \u2109";
                    tempResult.setText(stringResult);

                }


            }
        });

    }

    public double convertToCelsius(double far){

        double resultCel;

        resultCel = ( far - 32) * 5/9;

        return resultCel;
    }

    public double conveetToFarenait(double cel){

        double resultFar;

        resultFar = (cel * 9/5 + 32);

        return resultFar;

    }

}
