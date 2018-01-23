package com.aula.cursoandroid1.ui.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.aula.cursoandroid1.R;

public class HomeActivity extends BaseActivity {

    TextView mTxt;
    Button mBtn;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        mTxt = findViewById(R.id.textView);

        mBtn = findViewById(R.id.btn);

        mBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(mContext, "Me clicaram", Toast.LENGTH_SHORT).show();

            }
        });

    }
}
