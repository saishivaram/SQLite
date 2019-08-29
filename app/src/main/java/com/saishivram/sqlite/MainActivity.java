package com.saishivram.sqlite;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText editRollno,editName,editMarks;
    Button btnAdd,btnDelete,btnModify,btnView,btnViewAll,btnShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SQLiteDatabase db;
        editRollno=findViewById(R.id.editRollno1);
        editName=findViewById(R.id.editRollno2);
        editMarks=findViewById(R.id.editRollno3);

        btnAdd=findViewById(R.id.button7);
        btnDelete=findViewById(R.id.button8);
        btnModify=findViewById(R.id.button9);
        btnView=findViewById(R.id.button10);
        btnViewAll=findViewById(R.id.button11);
        btnShow=findViewById(R.id.button12);




        btnAdd.setOnClickListener(this);
        btnDelete.setOnClickListener(this);
        btnModify.setOnClickListener(this);
        btnView.setOnClickListener(this);
        btnViewAll.setOnClickListener(this);
        btnShow.setOnClickListener(this);
       // db=openOrCreateDatabase("student db",MODE_PRIVATE,null);
       // db.execSQL("CREATE TABLE IF NOT EXISTS STUDENTS(rollno varchar(20),name varchar(20),marks varchar);");
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.button7:
                Toast.makeText(this, "Add Button", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button8:
                Toast.makeText(this, "Delete Button", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button9:
                Toast.makeText(this, "Modify Button", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button10:
                Toast.makeText(this, "View Button", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button11:
                Toast.makeText(this, "ViewAll Button", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button12:
                Toast.makeText(this, "Show Button", Toast.LENGTH_SHORT).show();
                break;


        }
    }
}
