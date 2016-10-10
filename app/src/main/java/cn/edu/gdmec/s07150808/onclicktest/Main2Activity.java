package cn.edu.gdmec.s07150808.onclicktest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button btn2=(Button)findViewById(R.id.button2);
        btn2.setOnClickListener(new ClickAction(this));

    }
}
class ClickAction implements View.OnClickListener{


    private AppCompatActivity act;
    ClickAction (AppCompatActivity activity){
        act = activity;
    }
    @Override
    public void onClick(View v) {
        Toast.makeText(act,"，第二招，通过外部类实现",Toast.LENGTH_SHORT).show();
    }
}