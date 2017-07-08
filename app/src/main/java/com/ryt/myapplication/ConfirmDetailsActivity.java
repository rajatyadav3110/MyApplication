package com.ryt.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.TextView;

import java.util.Set;

public class ConfirmDetailsActivity extends AppCompatActivity {

    public static final String TAG = "RYTech";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_details);

        Bundle bundle = getIntent().getExtras();

        try {

            if (bundle != null) {

                ((TextView) findViewById(R.id.name)).setText(bundle.get("name").toString());
                ((TextView) findViewById(R.id.dob)).setText(bundle.get("dob").toString());
                ((TextView) findViewById(R.id.gender)).setText(bundle.get("gender").toString());
                ((TextView) findViewById(R.id.fatherName)).setText(bundle.get("fatherName").toString());
                ((TextView) findViewById(R.id.motherName)).setText(bundle.get("motherName").toString());
                ((TextView) findViewById(R.id.mobile)).setText(bundle.get("mobile").toString());
                ((TextView) findViewById(R.id.email)).setText(bundle.get("email").toString());
                ((TextView) findViewById(R.id.address)).setText(bundle.get("address").toString());

            }

        } catch (Exception e) {
            Log.e(TAG, "Error", e);
        }

    }
}
