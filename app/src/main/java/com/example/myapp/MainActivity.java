package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btn ;
    private ImageView imgView ;
    private TextView textView ;
    private RadioGroup radioGroup ;
    private EditText editText ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgView = findViewById(R.id.image1);
        textView = findViewById(R.id.text1);
        radioGroup = findViewById(R.id.group1);
        editText = findViewById(R.id.edit1);
        btn = findViewById(R.id.button1);
        Log.d("log_tag","ok");
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tail, pre;
                pre = editText.getText().toString();
                if (pre.isEmpty())
                    pre = "logo";
                if(radioGroup.getCheckedRadioButtonId() == R.id.ch_blue){
                    tail = "蓝色的" + pre;
                    textView.setText(tail);
                    imgView.setImageResource(R.drawable.lg);
                }else if(radioGroup.getCheckedRadioButtonId() == R.id.ch_grey){
                    tail = "灰色的" + pre;
                    textView.setText(tail);
                    imgView.setImageResource(R.drawable.logo);
                }else{
                    Toast.makeText(getApplicationContext(),"请选择主题颜色", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
