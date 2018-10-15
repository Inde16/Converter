package converter.myandroid.com.converter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Metre_To_Feet_Activity extends AppCompatActivity {

    Button mButton, ftButton;
    EditText heightEditText;
    TextView ResultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metre__to__feet_);

        mButton = (Button) findViewById(R.id.btnMetre);
        ftButton = (Button) findViewById(R.id.btnFt);
        heightEditText = (EditText) findViewById(R.id.editHeight);
        ResultText = (TextView) findViewById(R.id.ResultViewId);


        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String editHeightString = heightEditText.getText().toString();

                if(editHeightString.isEmpty()){

                    Toast.makeText(getApplicationContext(),"Write a height",Toast.LENGTH_LONG).show();
                }
                else{

                    double editHeightDouble = Double.parseDouble(editHeightString);
                    double ConvertedHeight = ConvertToMetre(editHeightDouble);

                    String result = String.valueOf(ConvertedHeight) + "m";

                    ResultText.setText(result);

                }

            }
        });

        ftButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String editHeightString = heightEditText.getText().toString();

                if(editHeightString.isEmpty()){

                    Toast.makeText(getApplication(), "Write an height", Toast.LENGTH_LONG).show();
                }
                else{

                    double editHeightDouble = Double.parseDouble(editHeightString);
                    double convertedHeight = ConvertTFt(editHeightDouble);

                    String result = String.valueOf(convertedHeight) + "ft";

                    ResultText.setText(result);

                }


            }
        });




    }



    public double ConvertToMetre(double ft){

        double result;

        result = ft/3.2808;

        return result;
    }

    public  double ConvertTFt(double m){

        double result;

        result = m*3.2808;

        return result;
    }

}
