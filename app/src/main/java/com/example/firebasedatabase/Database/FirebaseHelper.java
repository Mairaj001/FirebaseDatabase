package com.example.firebasedatabase.Database;


import android.util.Log;

import com.example.firebasedatabase.Model.Student;
import com.google.firebase.database.DatabaseException;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Objects;

public class FirebaseHelper {
    public DatabaseReference studentsRef;
    public  FirebaseHelper(){
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        studentsRef = database.getReference().child("students");
    }

    public Boolean addStudent(Student student) {
        try {

            String studentId = studentsRef.push().getKey();

            DatabaseReference studentRef = studentsRef.child(studentId);
            studentRef.child("name").setValue(student.getName());
            studentRef.child("age").setValue(student.getAge());
            studentRef.child("number").setValue(student.getNumber());

            return true;
        } catch (DatabaseException e) {
            System.err.println("Error adding student to database: " + e.getMessage());
            Log.d("mairajkhoso", Objects.requireNonNull(e.getMessage()));

        } catch (Exception e) {
            System.err.println("Unexpected error: " + e.getMessage());
        }
        return false;
    }

    public boolean updateStudent(String studentId, Student student) {
        try {
            studentsRef.child(studentId).setValue(student);
            return true;
        } catch (DatabaseException e) {
            return false;
        }
    }
}
