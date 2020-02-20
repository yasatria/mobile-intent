package id.ac.polinema.intent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class BundleActivity extends AppCompatActivity {

    public static final String USERNAME_KEY = "username";
    public static final String USERNAME_KEY = "name";
    public static final String USERNAME_KEY = "age";
    private EditText usernameInput;
    private EditText nameInput;
    private EditText ageInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bundle);
        usernameInput = findViewById(R.id.input_username);
        nameInput = findViewById(R.id.input_name);
        ageInput = findViewById(R.id.input_age);
        Bundle extras = getIntent().getExtras();

    }

    public void handleSubmit(View view) {
        Intent intent = new Intent(this, ProfileBundleActivity.class);

        String username = usernameInput.getText().toString();
        intent.putExtra( username: "USERNAME_KEY", username);

        String name = nameInput.getText().toString();
        intent.putExtra( name: "NAME_KEY", name);

        String age = ageInput.getText().toString();
        intent.putExtra( age: "AGE_KEY", age);

        String name = nameInput.getText().toString();
        int age = Integer.parseInt(ageInput.getText().toString());

    }

}
