package com.ryt.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import common.Utility;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "RYTech";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*Button submitButton = (Button) findViewById(R.id.button);

        submitButton.setOnClickListener(

                new Button.OnClickListener(){

                    public void onClick(View v){

                        checkAndConfirmRegistrationDetails(v);

                    }

                }
        );*/
    }

    public void checkAndConfirmRegistrationDetails(View v){

        String name = ((EditText)findViewById(R.id.name)).getText().toString();
        String dob = ((EditText)findViewById(R.id.dob)).getText().toString();
        String gender = ((EditText)findViewById(R.id.gender)).getText().toString();
        String fatherName = ((EditText)findViewById(R.id.fatherName)).getText().toString();
        String motherName = ((EditText)findViewById(R.id.motherName)).getText().toString();
        String mobile = ((EditText)findViewById(R.id.mobile)).getText().toString();
        String email = ((EditText)findViewById(R.id.email)).getText().toString();
        String address = ((EditText)findViewById(R.id.address)).getText().toString();

        boolean validation = Boolean.TRUE;
        String validationMsg = null;

        if(!Utility.validateMadatoryString(name)) {
            validation = Boolean.FALSE;
            validationMsg = "Name is mandatory.";
        }


        if(validation){
            Intent intent = new Intent(this, ConfirmDetailsActivity.class);

            intent.putExtra("name", name);
            intent.putExtra("dob", dob);
            intent.putExtra("gender", gender);
            intent.putExtra("fatherName", fatherName);
            intent.putExtra("motherName", motherName);
            intent.putExtra("email", mobile);
            intent.putExtra("email", email);
            intent.putExtra("address", address);


            startActivity(intent);
        } else {
            Toast.makeText(getApplicationContext(), validationMsg, Toast.LENGTH_SHORT).show();
        }






    }


}
