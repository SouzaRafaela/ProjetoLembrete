package co.rafaelasouza.beberagua;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TimePicker;

public class MainActivity<button> extends AppCompatActivity {

    private button btnNotify;
    private EditText editMinute;
    private TimePicker timePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

}