package ua.com.sevenpowerx.android.devcolibriandroidcours;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textView = findViewById(R.id.textView);

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

    }

    public void sayHello(View view) {
        textView.setText(R.string.message_sayHello);
    }

    public void goToNewActivity(View view){
        Intent intent = new Intent(MainActivity.this,LastActivity.class);
        startActivity(intent);
    }
}
