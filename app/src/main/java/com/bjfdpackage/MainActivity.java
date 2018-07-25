package com.bjfdpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    VideoView myVideoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //  全屏
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN , WindowManager.LayoutParams.FLAG_FULLSCREEN);
        myVideoView= (VideoView) findViewById(R.id.vodioView);  //视频播放器  控件
        String videoPath= Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.landing).toString(); //视频路径  加载本地 视频
        myVideoView.setVideoPath(videoPath);
        myVideoView.start();  //播放视频。
        //postDelayed 实现3秒定时器
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, MainActivity.class);
                startActivity(intent);
//                在startActivity后，调用overridePendingTransition方法，例如，实现淡入淡出的效果如下
                overridePendingTransition(R.anim.in,R.anim.out);
                //实现左右
                //  overridePendingTransition(android.R.anim.slide_in_left,android.R.anim.slide_out_right);
                finish(); //一般用于页面跳转，跳转新页面在按返回键，不需要回到原Activity ，使用 finish();
            }
        }, 3000);
    }
}
