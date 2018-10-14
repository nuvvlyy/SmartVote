package com.example.smartvote;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class nextpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nextpage);
        final EditText pasanalid = findViewById(R.id.persanalid);
        Button b1 = findViewById(R.id.accpt);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = pasanalid.getText().toString();
                if(str.length() != 13){
                    Toast T1 = Toast.makeText(nextpage.this,"กรุณากรอกหมายเลขบัตรประชาชน 13 หลัก",Toast.LENGTH_SHORT);
                    T1.show();
                }else{
                    if(str.equals("1111111111111") || str.equals("2222222222222")){
                        AlertDialog.Builder b = new AlertDialog.Builder(nextpage.this);
                        b.setTitle("ผลตรวจสอบสิทธิเลือกตั้ง");
                        b.setMessage("คุณเป็นผู้มีสิทธิเลือกตั้ง");
                        b.setCancelable(false); //กดภายนอกไม่ได้
                        b.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();

                            }
                        });
                        b.show();
                    }else{
                        AlertDialog.Builder b = new AlertDialog.Builder(nextpage.this);
                        b.setTitle("ผลตรวจสอบสิทธิเลือกตั้ง");
                        b.setMessage("คุณไม่มีสิทธิเลือกตั้ง");
                        b.setCancelable(false); //กดภายนอกไม่ได้
                        b.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();

                            }
                        });
                        b.show();
                    }
                }



            }
        });

    }

}
