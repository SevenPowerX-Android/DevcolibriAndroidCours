package ua.com.sevenpowerx.android.alertdialogexampl;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showDialog(View v) {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);

       /* builder.setTitle("SevenPowerX 20018");
        builder.setMessage("Привет!!!");*/


        builder.setTitle("SevenPowerX 20018.").
                setMessage("Привет!!!")
                .setCancelable(true)
                .setIcon(R.drawable.ic_launcher_foreground)
                .setNegativeButton("Нет", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(), "You not !!!", Toast.LENGTH_SHORT);
                    }
                })
                .setPositiveButton("Да", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(), "Вы согласны !!!", Toast.LENGTH_SHORT);
                    }
                })
                .setOnCancelListener(new DialogInterface.OnCancelListener() {
                    @Override
                    public void onCancel(DialogInterface dialog) {
                        Toast.makeText(getApplicationContext(), "Вы проигнорировали нас!!!", Toast.LENGTH_SHORT);
                    }
                });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();

    }
}
