package ua.com.sevenpowerx.android.managerlinerlyaout;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

/**
 * Created by Лавринюк Андрей User notebook acer  on 18.02.2018.
 */

@SuppressLint("Registered")
public class TestLinaerLayout extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_linear_layout);

    }

    public void onClickBack(View view) {
        Intent intent = new Intent(TestLinaerLayout.this, MainActivity.class);
        startActivity(intent);
    }
}
