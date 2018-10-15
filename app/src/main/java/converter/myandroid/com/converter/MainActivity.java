package converter.myandroid.com.converter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button Cel_Far,Eur_Doll,Lbs_Kilos,m_Ft;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Cel_Far = (Button) findViewById(R.id.btn_conv_cel_to_far_id);

        Eur_Doll = (Button) findViewById(R.id.btn_conv_eur_to_usd);

        Lbs_Kilos = (Button) findViewById(R.id.btn_lbs_to_kilos);

        m_Ft = (Button) findViewById(R.id.btn_metre_ti_feet);

        Cel_Far.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (MainActivity.this, Cel_To_Far_Activity.class);
                startActivity(intent);
            }
        });

        Eur_Doll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent2 = new Intent(MainActivity.this,  Euro_To_Dollars_Activity.class);
                startActivity(intent2);

            }
        });


        Lbs_Kilos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent3 = new Intent(MainActivity.this, Lbs_To_Klilos_Activity.class);
                startActivity(intent3);

            }
        });

        m_Ft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(MainActivity.this , Metre_To_Feet_Activity.class);
                startActivity(intent4);
            }
        });
    }
}
