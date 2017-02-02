package manish.subjectchooser.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import manish.subjectchooser.R;

public class Details extends AppCompatActivity {
    public static final String BUNDLE_EXTRAS="BUNDLE_EXTRAS";
    public  static final String EXTRA_ATT="EXTRA_ATT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Bundle extras=getIntent().getBundleExtra(BUNDLE_EXTRAS);

        Toast.makeText(this,extras.getString(EXTRA_ATT),Toast.LENGTH_LONG).show();
    }
}
