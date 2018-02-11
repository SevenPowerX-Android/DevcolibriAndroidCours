package ua.com.sevenpowerx.android.devcolibriandroidcours;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;

    private EditText login;
    private EditText password;

    private TextView txtLogin;
    private TextView txtPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textView = (TextView) findViewById(R.id.textView);

        Button button_hello = findViewById(R.id.button_var1_listener);
        Button button_hello_v2 = findViewById(R.id.button_var2_listener);


        button_hello_v2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(R.string.message_b2_ock_listener);
            }
        });

        button_hello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(R.string.message_b1_ock_listener);
            }
        });
        login = (EditText)findViewById(R.id.login);
        password = (EditText)findViewById(R.id.password);

        txtLogin = (TextView)findViewById(R.id.text_login);
        txtPass = (TextView)findViewById(R.id.text_pass);


        txtLogin.setText(getIntent().getStringExtra("log_login"));
        txtPass.setText(getIntent().getStringExtra("pass_login"));
    }

    public void sayHello(View view) {
        textView.setText(R.string.message_sayHello);
    }

    public void goToNewActivity(View view) {
        Intent intent = new Intent(MainActivity.this, LastActivity.class);
        startActivity(intent);
    }

    public void goToFirstActivity(View view) {
        Intent intent = new Intent(this, FirstActivity.class);
        startActivity(intent);
    }

    public void goToLogin(View view) {
        Intent intent = new Intent(this, Login.class);

//        intent.putExtra("log","main login");
//        intent.putExtra("pass", "main password");
             intent.putExtra("log_main",txtLogin.getText());
           intent.putExtra("pass_main", txtPass.getText());

        startActivity(intent);
    }
}
