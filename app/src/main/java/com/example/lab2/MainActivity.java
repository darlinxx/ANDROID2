package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("Lab2", "metoda OnCreate");
        Toast.makeText(this, "metoda onCreate", Toast.LENGTH_SHORT).show();

       // button=(Button)findViewById(R.id.button);
       // button.setOnClickListener(new View.OnClickListener(){
       //     @Override
       //     public void onClick(View v){
       //         openActivity2();
       //     };
       // });
    }

    //public void openActivity2(){
    //    Intent intent = new Intent(this,Main2Activity.class);
    //    startActivity(intent);
    //}



    @Override
    protected void onResume() {
        super.onResume();
        setContentView(R.layout.activity_main);

        Log.d("Lab2","metoda OnResume");
        Toast.makeText(this, "metoda onResume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        setContentView(R.layout.activity_main);

        Log.d("Lab2","metoda OnStart");
        Toast.makeText(this, "metoda onStart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        setContentView(R.layout.activity_main);

        Log.d("Lab2","metoda OnStop");
        Toast.makeText(this, "metoda onStop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {  //jest wzywana, gdy Activity jest widoczna dla użytkownika
        super.onPause();
        setContentView(R.layout.activity_main);

        Log.d("Lab2","metoda OnPause");
        Toast.makeText(this, "metoda onPause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        setContentView(R.layout.activity_main);

        Log.d("Lab2","metoda OnRestart");
        Toast.makeText(this, "metoda onRestart", Toast.LENGTH_SHORT).show();
    }

}
