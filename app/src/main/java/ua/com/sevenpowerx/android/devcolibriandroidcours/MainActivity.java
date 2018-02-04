package ua.com.sevenpowerx.android.devcolibriandroidcours;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Button button_hello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textView = findViewById(R.id.textView);
        button_hello = findViewById(R.id.button);
        button_hello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Привет способом номер Два!!!");
            }
        });

    }

    public void sayHello(View view) {
        textView.setText("Привет способ Первый!!!");
    }
}
