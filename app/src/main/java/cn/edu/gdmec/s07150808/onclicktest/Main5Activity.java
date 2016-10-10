package cn.edu.gdmec.s07150808.onclicktest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main5Activity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

    }
    public void MyClick(View v){
            Toast.makeText(this, "第四招，使用Button的属性onClick", Toast.LENGTH_SHORT).show();

    }
}
