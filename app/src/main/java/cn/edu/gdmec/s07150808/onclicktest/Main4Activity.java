package cn.edu.gdmec.s07150808.onclicktest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity implements OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Button btn4=(Button)findViewById(R.id.button4);
        btn4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this,"第四招,自身监听",Toast.LENGTH_SHORT).show();
    }
}
