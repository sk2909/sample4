package com.example.app12;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    TextView tv1,tv2;
    ProgressBar p1;
    Button b1;
    private int ps=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        tv1=(TextView)findViewById(R.id.textView);
        tv2=(TextView)findViewById(R.id.textView2);
        p1=(ProgressBar)findViewById(R.id.progressBar);
        b1=(Button)findViewById(R.id.button);
        Handler handler=new Handler();
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setVisibility(View.VISIBLE);
                tv2.setVisibility(View.VISIBLE);
                p1.setVisibility(View.VISIBLE);
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        while(ps<100)
                        {
                            ps+=1;
                            handler.post(new Runnable() {
                                @Override
                                public void run() {
                                    p1.setProgress(ps);
                                    tv1.setText(ps+"/"+p1.getMax());
                                }
                            });
                            try {
                                Thread.sleep(10);
                            }
                            catch (InterruptedException e){
                                e.printStackTrace();
                            }
                        }tv2.setText("File Downloaded");
                    }
                }).start();
            }
        });

    }
}
