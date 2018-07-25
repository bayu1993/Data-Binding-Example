package io.github.bayu1993.databindingexample;

import android.databinding.BindingAdapter;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;

import io.github.bayu1993.databindingexample.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    Timer timer;
    int i = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        //create object pojo
        final Data data = new Data("Android Marshmallow","Android 6",R.drawable.img_android6);
        //get data from pojo
        binding.setData(data);

        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        if (i==0){
                            Data data1 = new Data("Android Lollipop","Android 5",R.drawable.img_android5);
                            binding.setData(data1);
                            i=1;
                        }else {
                            Data data2 = new Data("Android Marshmellow","Android 6",R.drawable.img_android6);
                            binding.setData(data2);
                            i=0;
                        }
                    }
                });
            }
        },3000,3000);
    }
    @BindingAdapter({"android:src"})
    public static void setImageViewResource(ImageView imageView, int resource){
        imageView.setImageResource(resource);
    }
}
