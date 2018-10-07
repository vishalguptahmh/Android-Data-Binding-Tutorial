package com.vishalguptahmh.com.databindingexample;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.vishalguptahmh.com.databindingexample.Model.CustomModel;
import com.vishalguptahmh.com.databindingexample.databinding.ActivityMainBinding;




public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*
*
* To work with data binding first add below code to gradle file
*
    dataBinding {
        enabled = true
    }


* Then wrap layout with <layout></layout> tag
*
*
* Then work in Main activity
*
*
* */


        //Generate Binding with layout to Java file

        binding= DataBindingUtil.setContentView(this,R.layout.activity_main);


        //Here we are creating a model to set in Layout
        CustomModel customModel=new CustomModel();
        customModel.setName("Vishal Gupta");
        customModel.setEmail("vishalguptahmh@gmail.com");
        binding.setModel(customModel);


        //On Click Example
        binding.btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Hey you clicked Submit",Toast.LENGTH_SHORT).show();
            }
        });


        //change value in textview
        binding.btnChangeName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.name.setText("Jolly Gupta");
            }
        });

    }
}
