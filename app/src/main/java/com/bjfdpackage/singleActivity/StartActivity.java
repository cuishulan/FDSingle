package com.bjfdpackage.singleActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;
import android.widget.VideoView;

import com.bjfdpackage.MainActivity;
import com.bjfdpackage.R;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by cuishu on 2018/7/25.
 */

public class StartActivity extends AppCompatActivity {
    @Bind(R.id.vodioView)
    VideoView vodioView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        ButterKnife.bind(this);
      getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        vodioView = (VideoView) findViewById(R.id.vodioView);  //视频播放器  控件
        String videoPath = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.landing).toString(); //视频路径  加载本地 视频
        vodioView.setVideoPath(videoPath);
        vodioView.start();  //播放视频。
        //postDelayed 实现3秒定时器
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(StartActivity.this, MainActivity.class);
                startActivity(intent);
//                在startActivity后，调用overridePendingTransition方法，例如，实现淡入淡出的效果如下
                overridePendingTransition(R.anim.in, R.anim.out);
                //实现左右
                //  overridePendingTransition(android.R.anim.slide_in_left,android.R.anim.slide_out_right);
                finish(); //一般用于页面跳转，跳转新页面在按返回键，不需要回到原Activity ，使用 finish();
            }
        }, 3000);
    }
}
