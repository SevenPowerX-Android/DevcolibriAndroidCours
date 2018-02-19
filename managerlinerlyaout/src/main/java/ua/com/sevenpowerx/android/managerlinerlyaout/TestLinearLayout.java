package ua.com.sevenpowerx.android.managerlinerlyaout;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Toast;

/**
 * Created by Лавринюк Андрей User notebook acer  on 18.02.2018.
 */

@SuppressLint("Registered")
public class TestLinearLayout extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_linear_layout);

    }

    public void onClickBack(View view) {
        Intent intent = new Intent(TestLinearLayout.this, MainActivity.class);
        startActivity(intent);
    }

    public void onClickButtonCenterToastMessage(View view) {
        Toast.makeText(TestLinearLayout.this,"Hello this \nis a button_2!!!",Toast.LENGTH_SHORT).show();
    }
}
