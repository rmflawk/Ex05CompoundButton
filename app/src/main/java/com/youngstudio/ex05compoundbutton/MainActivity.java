package com.youngstudio.ex05compoundbutton;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    //뷰들의 참조변수 : 멤버변수
    EditText et_name;
    RadioGroup rg_gender,rg_city;
    EditText et01,et02,et03;
    CheckBox cb_email,cb_phone,cb_visit,cb_sms;
    Button btn_registration;
    TextView tv;

    String s="";
    CheckBox cb1,cb2,cb3,cb4;
    RadioButton rb;
    RadioButton rb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn_registration= findViewById(R.id.btn_registration);

        et01= findViewById(R.id.et01);
        et02= findViewById(R.id.et02);
        et03= findViewById(R.id.et03);

        cb_email= findViewById(R.id.cb_email);
        cb_phone= findViewById(R.id.cb_phone);
        cb_visit= findViewById(R.id.cb_visit);
        cb_sms= findViewById(R.id.cb_sms);

        et_name= findViewById(R.id.et_name);

        rg_gender= findViewById(R.id.rg_gender);
        rg_city= findViewById(R.id.rg_city);


        tv= findViewById(R.id.tv);

        //버튼 클릭하는 것에 반응하기!!
        btn_registration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //텍스트뷰 글씨 변경하기!!
                Editable editable = et01.getText();
                Editable editable1 = et02.getText();
                Editable editable2 = et03.getText();
                Editable editable3 = et_name.getText();


                s += editable3.toString() + " ";
                s +=rb.getText().toString() + " ";
                s +=rb2.getText().toString() + " ";
                s += editable.toString() + " ";
                s += editable1.toString() + " ";
                s += editable2.toString() + " ";
                s += cb1.getText().toString() +" ";
                s += cb2.getText().toString() + " ";
//                s += cb3.getText().toString() + " ";
//                s += cb4.getText().toString()+ " \n";

                tv.setText(s + "\n");
            }
        });


        rg_gender.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
//                RadioButton rb = findViewById(checkedId);
//                tv.setText(rb.getText().toString());
                rb = findViewById(checkedId);
               // tv.setText(s);
            }
        });



        rg_city.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
//                RadioButton rb = findViewById(checkedId);
//                tv.setText(rb.getText().toString());
                  rb2 = findViewById(checkedId);
                  //tv.setText(s);
            }
        });

        cb_email.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                cb1 = (CheckBox) findViewById(R.id.cb_email);
                //s += cb1.getText();

            }
        });

        cb_phone.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                cb2 = (CheckBox) findViewById(R.id.cb_phone);
                //s += cb2.getText();

            }
        });

        cb_visit.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                cb3 = (CheckBox) findViewById(R.id.cb_visit);
                //s += cb2.getText();

            }
        });

        cb_sms.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                cb4 = (CheckBox) findViewById(R.id.cb_sms);
                //s += cb2.getText();

            }
        });



    }//onCreate

    //onClick속성이 부여된 View가 클릭되면
    //자동으로 실행되는 콜백메소드
    public void clickBtn(View v){
        //체크박스의 체크상태가 변경되는 것을 듣는 리스너객체 생성 및 추가
        CompoundButton.OnCheckedChangeListener changeListener= new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                //선택된 CheckBox의 글씨 얻어오기

//                if(cb_email.isChecked()) s+= cb_email.getText().toString();
//                if(cb_phone.isChecked()) s+= cb_phone.getText().toString();
//                if(cb_visit.isChecked()) s+= cb_visit.getText().toString();
//                if(cb_sms.isChecked()) s+= cb_sms.getText().toString();
            }
        };

//        cb_email.setOnCheckedChangeListener(changeListener);
//        cb_phone.setOnCheckedChangeListener(changeListener);
//        cb_visit.setOnCheckedChangeListener(changeListener);
//        cb_sms.setOnCheckedChangeListener(changeListener);


    }
}



