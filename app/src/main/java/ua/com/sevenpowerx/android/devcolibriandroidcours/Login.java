package ua.com.sevenpowerx.android.devcolibriandroidcours;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Лавринюк Андрей User notebook acer  on 08.02.2018.
 */

public class Login extends Activity {
    private TextView txtLogin;
    private TextView txtPass;

    private EditText login;
    private EditText password;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        txtLogin = findViewById(R.id.txt_login);
        txtPass = findViewById(R.id.txt_pass);

        login = findViewById(R.id.login);
        password = findViewById(R.id.password);

        login.setText("ваш логин");
        password.setText("qwertyuiop");
        if (getIntent().getStringExtra("log") != null) {
            txtLogin.setText(getIntent().getStringExtra("log"));
            txtPass.setText(getIntent().getStringExtra("pass"));
        } else {
            txtLogin.setText("логин пустой");
            txtPass.setText("пароль пустой");
        }
//Todo: реализовать возврат данных в MainActivity
    }
}
