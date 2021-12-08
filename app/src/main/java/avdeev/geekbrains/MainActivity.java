package avdeev.geekbrains;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.QuickContactBadge;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String name;
    private String sername;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button finishBtn = findViewById(R.id.finishBtn);

        finishBtn.setOnClickListener(v -> {
            name =  ((EditText)findViewById(R.id.name)).getText().toString();
            sername = ((EditText)findViewById(R.id.sername)).getText().toString();
            String message = String.format("Hello %s %s", name, sername);
            Toast.makeText(this, message, Toast.LENGTH_LONG ).show();
        });

    }
}