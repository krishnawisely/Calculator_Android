package com.example.calculator;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.Menu;
import android.view.TextureView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

@SuppressLint("UseValueOf") public class MainActivity extends Activity {
	EditText val1,val2;;
	TextureView result;
	Button addbutton;
	int num1,num2,sum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addbutton =(Button) findViewById(R.id.button1);
        val1 = (EditText) findViewById(R.id.editText1);
        val2 = (EditText) findViewById(R.id.editText2);
        result = (TextureView) findViewById(R.id.textView4);
        addbutton.setOnClickListener(new View.OnClickListener() {
			
			@SuppressLint("UseValueOf") @Override
			public void onClick(View a) {
				num1 = new Integer(val1.getText().toString());
				num2 = new Integer(val2.getText().toString());
				sum = num1+num2;
				result.setText(Integer.toString(sum));
			
			}
		});
    }
}
