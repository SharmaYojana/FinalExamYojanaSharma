package nyc.c4q.yojana.finalexamyojanasharma;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by yojanasharma on 2/12/17.
 */

public class LoginActivity extends AppCompatActivity {
    private EditText userName;
    private EditText passWord;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        userName = (EditText) findViewById(R.id.user_name);
        passWord = (EditText) findViewById(R.id.pass_word);
        button = (Button) findViewById(R.id.login_button);

    }

    public void loginButton(View view) {
        if (userName.length() <= 0) {
            Toast.makeText(this, "Enter a username", Toast.LENGTH_SHORT).show();
        }
        if (passWord.length() <= 0) {
            Toast.makeText(this, "Enter a password", Toast.LENGTH_SHORT).show();
        }
        if (userName.length() <= 0 && passWord.length() <= 0 || (userName.length() > 0 && passWord.length() > 0)) {
            Intent intent = new Intent(LoginActivity.this, ProfileActivity.class);
            startActivity(intent);
            finish();

        }
    }
}

