package info.kategwengispert.improvedlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvName;
    TextView tvAge;
    ImageView imgPhoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cardview);

        tvName = (TextView) findViewById(R.id.lblName);
        tvAge = (TextView) findViewById(R.id.lblAge);
        imgPhoto = (ImageView) findViewById(R.id.imgPhoto);

        tvName.setText("Brother Bear");
        tvAge.setText("23");
        imgPhoto.setImageResource(R.drawable.bear);

    }
}
