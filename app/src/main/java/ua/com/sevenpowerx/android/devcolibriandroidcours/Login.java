package ua.com.sevenpowerx.android.devcolibriandroidcours;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Лавринюк Андрей User notebook acer  on 08.02.2018.
 */

public class Login extends Activity {

    private TextView txtLogin;
    private TextView txtPass;

    private EditText login;
    private EditText password;

    private TextView showPass;
    private TextView showLogin;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        showLogin = findViewById(R.id.text_log_log);
        showPass = findViewById(R.id.text_pass_login);

        txtLogin = findViewById(R.id.txt_login);
        txtPass = findViewById(R.id.txt_pass);

        login = findViewById(R.id.login);
        password = findViewById(R.id.password);

     /*   login.setText("ваш логин");
        password.setText("qwertyuiop");*/
        if (true) {
            txtLogin.setText(getIntent().getStringExtra("log_main"));
            txtPass.setText(getIntent().getStringExtra("pass_main"));
        } else {
            txtLogin.setText("логин пустой");
            txtPass.setText("пароль пустой");
        }

    }

    public void showLoginAndPss(View view) {
        showLogin.setText(login.getText());
        showPass.setText(password.getText());
        String message = "Log: " + showLogin.getText().toString() +
                "\nPass: " + showPass.getText().toString();
        showToast(view, message);
    }

    public void login(View view) {
        Intent intent = new Intent(this, MainActivity.class);


        intent.putExtra("log_login", login.getText().toString());
        intent.putExtra("pass_login", password.getText().toString());

        /*
        String strLog = String.valueOf(login.getText());
        String strPass = String.valueOf(password.getText());

        intent.putExtra("log_login",strLog );
        intent.putExtra("pass_login", strPass);*/

        startActivity(intent);
    }

    public void showToast(View view, String message) {
        Toast toast = Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER, 0, 300);
        toast.show();
    }
}
