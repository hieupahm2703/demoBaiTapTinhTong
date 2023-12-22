package com.example.baitaptinhtong.tuan3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.baitaptinhtong.R;

public class tuan3MainActivity extends AppCompatActivity {

    //Khai bao cac control
    EditText txt1, txt2;

    Button btn1;

    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan3_main);

        //Anh xa cac control
        txt1=findViewById(R.id.demo11txt1);
        txt2=findViewById(R.id.demo11txt2);
        btn1=findViewById(R.id.demo11btn1);
        tv1=findViewById(R.id.demo11tv1);

        //Xu ly su kien
        btn1.setOnClickListener(v->{
            //Goi ham tinh tong
            tinhTong();
        });
    }
    //Dinh nghia ham tinh tong
    private void tinhTong() {
        //Lay du lieu nhap vao tu edittext1
        String str1=txt1.getText().toString();
        float so1=Float.parseFloat(str1); //Chuyen du lieu sang so
        //Lay du lieu nhap vao tu edittext2
        String str2=txt2.getText().toString();
        float so2=Float.parseFloat(str2);
        //Tinh Tong
        float tong=so1+so2;
        //In ket qua ra man hinh
        tv1.setText(String.valueOf(tong));

    }
}