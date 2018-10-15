package converter.myandroid.com.converter;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Euro_To_Dollars_Activity extends AppCompatActivity {

    // 1 USD = 0.848384 EUR
    // 1 EUR = 1.17871 USD


    EditText amountEditText;
    Button eurButton;
    Button dollButton;
    TextView ResultText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_euro__to__dollars_);

        amountEditText = (EditText) findViewById(R.id.editText);
        eurButton = (Button) findViewById(R.id.btnEurId);
        dollButton = (Button) findViewById(R.id.btnUsdId);
        ResultText = (TextView) findViewById(R.id.ResultViewId);

        eurButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String editTextValue = amountEditText.getText().toString();

                if(editTextValue.isEmpty()){
                    Toast.makeText(getApplicationContext(),"Enter an Amount" , Toast.LENGTH_LONG).show();

                }else{

                    double DoubleEditText = Double.parseDouble(editTextValue);

                    double convertedAmount = convertToEuro(DoubleEditText);

                    String result = String.valueOf(convertedAmount) + "€";

                    ResultText.setText(result);
                }


            }
        });


        dollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String editTextValue = amountEditText.getText().toString();

                if(editTextValue.isEmpty()){
                    Toast.makeText(getApplicationContext(),"Enter an Amount" , Toast.LENGTH_LONG).show();
                }else{

                    double DoubleEditText = Double.parseDouble(editTextValue);

                    double convertedAmount = convertToUsd(DoubleEditText);

                    String result = String.valueOf(convertedAmount) + "$";

                    ResultText.setText(result);

                }


            }
        });



    }


    public double convertToEuro(double usd){

        double resultAmount;

        resultAmount = usd * 0.848384;

        return resultAmount;


    }

    public double convertToUsd(double eur){

        double resultAmount;

        resultAmount = eur * 1.17817;


        return resultAmount;
    }


}
