package essths.li3.tp4.naoures.greenbite;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import essths.li3.tp4.naoures.greenbite.databinding.ActivityIntroBinding;

public class IntroActivity extends AppCompatActivity {
    IntroActivity binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = IntroActivity.inflate(getLayoutInflater());  // Corrected typo
        setContentView(binding.getRoot());

        setVariable();
    }

    private void setVariable() {
        ImageButton nextButton = binding.nextButton;  // Access the button using the binding
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle next button click
                Intent intent = new Intent(IntroActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();  // Close IntroActivity to remove it from the back stack
            }
        });
    }
}
