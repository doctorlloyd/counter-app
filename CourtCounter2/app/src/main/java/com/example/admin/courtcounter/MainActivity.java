package com.example.admin.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btnThreeA,btnTwoA,btnFreeThrowA;
    private Button btnThreeB,btnTwoB,btnFreeThrowB;
    private TextView tvScoreA, tvScoreB;
    int scoreA,scoreB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnFreeThrowA = (Button)findViewById(R.id.btnFreeThrowA);
        btnFreeThrowB = (Button)findViewById(R.id.btnFreeThrowB);
        btnTwoA = (Button)findViewById(R.id.btnAdd2A);
        btnTwoB = (Button)findViewById(R.id.btnAdd2B);
        btnThreeA = (Button)findViewById(R.id.btnAdd3A);
        btnThreeB = (Button)findViewById(R.id.btnAdd3B);
        scoreA = 0;
        scoreB = 0;
        tvScoreA = (TextView)findViewById(R.id.tvScoreA);
        tvScoreB = (TextView)findViewById(R.id.tvScoreB);

        btnFreeThrowA.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View view)
            {
                scoreA += 1;
                tvScoreA.setText(""+scoreA);
            }
        });
        btnFreeThrowB.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View view)
            {
                scoreB += 1;
                tvScoreB.setText(""+scoreB);
            }
        });
        btnTwoA.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View view)
            {
                scoreA += 2;
                tvScoreA.setText(""+scoreA);
            }
        });
        btnTwoB.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View view)
            {
                scoreB += 2;
                tvScoreB.setText(""+scoreB);
            }
        });
        btnThreeA.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View view)
            {
                scoreA += 3;
                tvScoreA.setText(""+scoreA);
            }
        });
        btnThreeB.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View view)
            {
                scoreB += 3;
                tvScoreB.setText(""+scoreB);
            }
        });
    }
    public void reset(View v)
    {
        tvScoreA.setText("0");
        tvScoreB.setText("0");
    }

}
