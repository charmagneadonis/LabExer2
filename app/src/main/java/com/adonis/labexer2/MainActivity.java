package com.adonis.labexer2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox course1, course2, course3, course4, course5, course6, course7, course8;
    EditText comments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        course1 = findViewById(R.id.checkBox);
        course2 = findViewById(R.id.checkBox2);
        course3 = findViewById(R.id.checkBox3);
        course4 = findViewById(R.id.checkBox4);
        course5 = findViewById(R.id.checkBox5);
        course6 = findViewById(R.id.checkBox6);
        course7 = findViewById(R.id.checkBox7);
        course8 = findViewById(R.id.checkBox8);
        comments = findViewById(R.id.editText);
    }

    public void NextPage(View view){
        Intent intent = new Intent(this, SecondPage.class);
        startActivity(intent);
    }

    public void saveData(View v){
        SharedPreferences sp = getSharedPreferences("myData", MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        String c1 = course1.getText().toString();
        String c2 = course2.getText().toString();
        String c3 = course3.getText().toString();
        String c4 = course4.getText().toString();
        String c5 = course5.getText().toString();
        String c6 = course6.getText().toString();
        String c7 = course7.getText().toString();
        String c8 = course8.getText().toString();
        String comm = comments.getText().toString();
        editor.putString("course1",c1);
        editor.putString("course2",c2);
        editor.putString("course3",c3);
        editor.putString("course4",c4);
        editor.putString("course5",c5);
        editor.putString("course6",c6);
        editor.putString("course7",c7);
        editor.putString("course8",c8);
        editor.putString("comments", comm);
        editor.commit();
        Toast.makeText(this, "Data Was Saved", Toast.LENGTH_LONG).show();
    }
}
