package cn.edu.gdmec.s07150808.onclicktest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn=(Button)findViewById(R.id.button);
        btn.setOnClickListener(new innerClass());
    }
    class innerClass implements View.OnClickListener {
        public void onClick(View v){
            Toast.makeText(MainActivity.this,"第一招式，内部类实现",Toast.LENGTH_SHORT).show();

        }
    }
}
