package com.example.firebasedatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.firebasedatabase.Database.FirebaseHelper;
import com.example.firebasedatabase.Model.Student;

public class MainActivity extends AppCompatActivity {
    Student student;
    FirebaseHelper firebase;
    EditText name, age, number;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.nameField);
        age=findViewById(R.id.ageField);
       number=findViewById(R.id.numberField);
        student = new Student(); // Initialize student object
        firebase = new FirebaseHelper();
    }

    public void addStudent(View view) {

        try {
            String Name=name.getText().toString();
            int Number=Integer.parseInt(number.getText().toString());
            int Age=Integer.parseInt(age.getText().toString());

            student.setAge(Age);
            student.setName(Name);
            student.setNumber(Number);

            Boolean isSuccess=firebase.addStudent(student);

            if(isSuccess){
                Toast.makeText(this,"Added sussesfully",Toast.LENGTH_SHORT).show();;
            } else{
                Toast.makeText(this,"Error while Adding",Toast.LENGTH_SHORT).show();;
            }
        } catch (Exception e){
            Toast.makeText(this,e.getMessage(),Toast.LENGTH_SHORT).show();;
            Log.d("tag","mesd"+e.getMessage());
        }
    }

    public void ReadStudent(View view) {
    }

    public void updateStudent(View view) {
    }

    public void DeleteStudent(View view) {
    }
}