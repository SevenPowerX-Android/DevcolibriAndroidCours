package ua.com.sevenpowerx.android.devcalibry.activityresultexam.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import ua.com.sevenpowerx.android.devcalibry.activityresultexam.R;
import ua.com.sevenpowerx.android.devcalibry.activityresultexam.util.RequestCode;

public class MainActivity extends AppCompatActivity {

    private TextView textName;
    private TextView textHello;

    private TextView textLanguage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textName = findViewById(R.id.textNameMain);
        textHello = findViewById(R.id.textHello);
        textLanguage = findViewById(R.id.textEditLanguageMain);
    }

    public void onShow(View v) {
        Intent intent;
        switch (v.getId()) {

            case R.id.buttPresented:
                intent = new Intent(this, PresentedActivity.class);
                startActivityForResult(intent, RequestCode.REQUEST_CODE_PRESENTED);
            break;

            case R.id.buttLanguage:
                intent = new Intent(this, LanguageActivity.class);
                startActivityForResult(intent, RequestCode.REQUEST_CODE_LANGUAGE);
                break;

        }

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (resultCode == RESULT_OK) {

            switch (requestCode) {
                case RequestCode.REQUEST_CODE_PRESENTED:
                    String name = data.getStringExtra("name");
                    textHello.setText("Привет ");
                    textName.setText( name +"! \n Рад знакомству! ");
                    break;
                case RequestCode.REQUEST_CODE_LANGUAGE:
                    String language = data.getStringExtra("language");
                    textLanguage.setText(language);

            }
        } else {
            Toast.makeText(this, "Error!", Toast.LENGTH_SHORT);
        }
    }
}
