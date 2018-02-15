package ua.com.sevenpowerx.android.devcalibry.activityresultexam.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import ua.com.sevenpowerx.android.devcalibry.activityresultexam.R;
import ua.com.sevenpowerx.android.devcalibry.activityresultexam.util.Language;

/**
 * Created by Лавринюк Андрей User notebook acer  on 15.02.2018.
 */

public class LanguageActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.language_activity);
    }

    public void onSelectedLanguage(View v) {
        Intent intent = new Intent();
        switch (v.getId()) {
            case R.id.buttEng:
                intent.putExtra("language", Language.ENGLISH.getLanguage());
                setResult(RESULT_OK,intent);
                finish();
                break;
            case R.id.buttRus:
                intent.putExtra("language", Language.RUSSIAN.getLanguage());
                setResult(RESULT_OK,intent);
                finish();
                break;
            case R.id.buttUa:
                intent.putExtra("language", Language.UKRAINE.getLanguage());
                setResult(RESULT_OK,intent);
                finish();
                break;

        }
    }
}
