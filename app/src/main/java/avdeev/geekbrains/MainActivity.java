package avdeev.geekbrains;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.QuickContactBadge;
import android.widget.Toast;

import java.util.stream.Stream;

public class MainActivity extends AppCompatActivity {

//    private String name;
//    private String sername;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        setContentView(R.layout.my_layout);

//        Button finishBtn = findViewById(R.id.finishBtn);
//
//        finishBtn.setOnClickListener(v -> {
//            name =  ((EditText)findViewById(R.id.name)).getText().toString();
//            sername = ((EditText)findViewById(R.id.sername)).getText().toString();
//            String message = String.format("Hello %s %s", name, sername);
//            Toast.makeText(this, message, Toast.LENGTH_LONG ).show();
//        });

        Button btnConfirm = findViewById(R.id.confirm_button);
        btnConfirm.setOnClickListener(v -> {
            String pass1 = ((EditText)findViewById(R.id.password1)).getText().toString();
            String pass2 = ((EditText)findViewById(R.id.password2)).getText().toString();
            String message = "invalid password";

            if (pass1.equals(pass2)) {
                message = "login completed";
            }

            Toast.makeText(this, message, Toast.LENGTH_LONG ).show();
        });


    }


}