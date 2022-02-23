package com.sibaamap.demoedittext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    TextView text2;
    Button button;
    EditText name,pass,pass1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();


    }
    void init(){
        text2 = findViewById(R.id.text2);
        button = findViewById(R.id.button);
        name = findViewById(R.id.name);
        pass = findViewById(R.id.pass);
        pass1 = findViewById(R.id.pass1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ten = name.getText().toString();
                String mk = pass.getText().toString();
                String mk1 = pass1.getText().toString();


                if(ten.isEmpty()){
                    text2.setText("ten chua dang nhap");
                    name.requestFocus();
                    return;
                }
                if(mk.isEmpty()){
                    pass.setError("chưa nhập mật khẩu");
                    pass.requestFocus();
                }
                if (mk1.isEmpty()){
                    pass1.setError("chưa nhập lại mật khẩu");
                    pass1.requestFocus();

                }
                if(mk.compareTo(mk1)==0){
                    text2.setText("Đăng kí thành công");
                }
                else{
                    text2.setText("Mật khẩu không trùng khớp");

                }

            }

        });


    }
}