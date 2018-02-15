package ua.com.sevenpowerx.android.devcalibry.activityresultexam.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.EditText;

import ua.com.sevenpowerx.android.devcalibry.activityresultexam.R;

/**
 * Created by Лавринюк Андрей User notebook acer  on 15.02.2018.
 */

public class PresentedActivity extends Activity {

    private EditText editName;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.presented_activity);

        editName = findViewById(R.id.editName);

    }

    public void onPresented(View v) {
        Intent intent = new Intent();
        intent.putExtra("name", editName.getText().toString());
        setResult(RESULT_OK,intent);
        finish();
    }
}
