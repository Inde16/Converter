package converter.myandroid.com.converter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Lbs_To_Klilos_Activity extends AppCompatActivity {

    //  1 kilogram = 2.20462262 pounds
    //  1 pound = 0.45359237 kilograms

    Button kgButton,lbsButton;
    EditText weightEditText;
    TextView resultText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lbs__to__klilos_);

        kgButton = (Button) findViewById(R.id.btnKgId);
        lbsButton = (Button)  findViewById(R.id.btnLbsId);
        weightEditText = (EditText) findViewById(R.id.editWeight);
        resultText = (TextView) findViewById(R.id.ResultWeightId);

        kgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String editWeightValue = weightEditText.getText().toString();

                if(editWeightValue.isEmpty()){

                    Toast.makeText(getApplicationContext(),"Enter a weight",Toast.LENGTH_LONG).show();
                }else{

                    double DoubleEditWeight = Double.parseDouble(editWeightValue);
                    double ConvertedAmount = ConvertToKg(DoubleEditWeight);

                    String result = String.valueOf(ConvertedAmount)+" kg";

                    resultText.setText(result);


                }

            }
        });


        lbsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String editWeightValue = weightEditText.getText().toString();

                if (editWeightValue.isEmpty()){
                    Toast.makeText(getApplicationContext(),"Enter a weight",Toast.LENGTH_LONG).show();
                }else{

                    double DoubleEditWeight = Double.parseDouble(editWeightValue);
                    double ConvertedWeight = ConvertToLbs(DoubleEditWeight);

                    String result = String.valueOf(ConvertedWeight)+ " lbs";

                    resultText.setText(result);

                }

            }
        });



    }

    public double ConvertToKg(double lbs){

        double result;

        result = lbs * 0.45359237;


        return result;
    }

    public double ConvertToLbs(double kg){

        double result;

        result = kg * 2.20462262;

        return result;

    }

}
