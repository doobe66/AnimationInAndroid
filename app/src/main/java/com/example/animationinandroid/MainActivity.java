package com.example.animationinandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txtHelloWorld;
    private TextView txtHiWorld;
    private TextView txtAndroid;
    private ImageView imgCup;
    private ImageView imgLion;
    private Button btnUi;

    private boolean isHelloWorldShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtHelloWorld = findViewById(R.id.txtHelloWorld);
        txtHiWorld = findViewById(R.id.txtHiWorld);
        txtAndroid = findViewById(R.id.txtAndroid);
        imgLion = findViewById(R.id.imgLion);
        imgCup = findViewById(R.id.imgCup);
        btnUi = findViewById(R.id.btnUi);

        txtHelloWorld.setX(2000);
        txtHiWorld.setX(-2000);
        txtAndroid.setY(-3000);

        txtHelloWorld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Log.i("MyTag", "Hello World");
//                txtHelloWorld.animate().alpha(0f).setDuration(3000);
//                txtHelloWorld.animate().alpha(0).setDuration(3000);
//                txtHiWorld.animate().alpha(1).setDuration(3000);



                if (isHelloWorldShow){
                    txtHelloWorld.animate().alpha(0).setDuration(3000);
                    txtHiWorld.animate().alpha(1).setDuration(3000);
                   imgCup.animate().alpha(1).setDuration(3000);
                   imgLion.animate().alpha(0).setDuration(3000);
                    isHelloWorldShow = false;
                }else if (!isHelloWorldShow){
                    txtHelloWorld.animate().alpha(1).setDuration(3000);
                    txtHiWorld.animate().alpha(0).setDuration(3000);
                    imgCup.animate().alpha(0).setDuration(3000);
                   imgLion.animate().alpha(1).setDuration(3000);
                    isHelloWorldShow = true;
                }
            }
        });

        txtAndroid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                txtAndroid.animate().translationX(-3000).setDuration(2000);
//                txtAndroid.animate().translationY(3000).setDuration(2000);
//                txtAndroid.animate().translationXBy(200).setDuration(5000);
//                txtAndroid.animate().rotation(180).setDuration(3000);
//                txtAndroid.animate().rotationBy(30).setDuration(4000);
//                txtAndroid.animate().rotationX(400).translationY(2000).setDuration(5000);
                txtAndroid.animate().scaleX(0.2f).scaleY(0.2f).setDuration(3000);

            }
        });

        btnUi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtHelloWorld.animate().translationXBy(-2000).rotation(1000).setDuration(3000);
                txtHiWorld.animate().translationXBy(2000).scaleX(200).setDuration(2000);
                txtAndroid.animate().translationYBy(3000).alpha(0.7f).setDuration(2000);
            }
        });


    }
}
