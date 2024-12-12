package essths.li3.tp4.naoures.greenbite;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup); // Replace with your XML layout

        // Initialize UI elements
        EditText usernameField = findViewById(R.id.usernameField);
        EditText phoneField = findViewById(R.id.phoneField);
        EditText emailField = findViewById(R.id.emailField);
        EditText passwordField = findViewById(R.id.passwordField);
        Button signUpButton = findViewById(R.id.signupButton);

        // Set OnClickListener for the SignUp button
        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get input data
                String username = usernameField.getText().toString();
                String phone = phoneField.getText().toString();
                String email = emailField.getText().toString();
                String password = passwordField.getText().toString();

                // Simple input validation (add more as needed)
                if (username.isEmpty() || phone.isEmpty() || email.isEmpty() || password.isEmpty()) {
                    Toast.makeText(SignUpActivity.this, "Please fill all fields", Toast.LENGTH_SHORT).show();
                    return; // Stop further execution
                }

                // If validation passes, navigate to MainActivity
                Intent intent = new Intent(SignUpActivity.this, MainActivity.class);
                startActivity(intent);

                // Optionally finish the current activity to prevent going back to the sign-up screen
                finish();
            }
        });
    }
}
