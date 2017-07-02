package com.billionman.com.assignment_12_2;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    SharedPreferences preferences = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        preferences = getSharedPreferences("BM",MODE_PRIVATE);
    }

    public void saveDetails(View view) {
        EditText name = (EditText) findViewById(R.id.editText1);
        String nameVal = name.getText().toString();
        preferences.edit().putString("username",nameVal).commit();
        name = (EditText) findViewById(R.id.editText2);
        nameVal = name.getText().toString();
        preferences.edit().putString("age",nameVal).commit();
        name = (EditText) findViewById(R.id.editText3);
        nameVal = name.getText().toString();
        preferences.edit().putString("phone",nameVal).commit();
        name = (EditText) findViewById(R.id.editText4);
        nameVal = name.getText().toString();
        preferences.edit().putString("city",nameVal).commit();
    }

    public void fetchDetails(View view) {
        StringBuilder sb = new StringBuilder();
        sb.append(preferences.getString("username",null)).append('\n');
        sb.append(preferences.getString("age",null)).append('\n');
        sb.append(preferences.getString("phone",null)).append('\n');
        sb.append(preferences.getString("city",null)).append('\n');
        Toast.makeText(this,sb,Toast.LENGTH_LONG).show();
    }
}
