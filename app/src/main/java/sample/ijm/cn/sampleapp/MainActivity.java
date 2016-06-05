package sample.ijm.cn.sampleapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.MyClass;

import sample.ijm.cn.mylibrary.TestLibrary;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new TestLibrary().test();

        

        new MyClass().testClass();
    }
}
