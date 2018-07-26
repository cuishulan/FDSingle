package com.bjfdpackage.singleActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.bjfdpackage.MainActivity;
import com.bjfdpackage.R;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class RegsterAcivity extends AppCompatActivity {

    @Bind(R.id.regster_fanhui)
    ImageView regsterFanhui;
    @Bind(R.id.regster_usename)
    EditText regsterUsename;
    @Bind(R.id.login_usepassword)
    EditText loginUsepassword;
    @Bind(R.id.regster)
    Button regster;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_regster_acivity);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.regster_fanhui, R.id.regster})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.regster_fanhui:
                finish();
                break;
            case R.id.regster:
                /**
                 *  当我们点击注册的时候，把你的用户名和密码记住，存入数据库
                 *  如果下一次在进行注册的时候这个时候呢，我们需要判断输入的用户名有没有被注册过（
                 *  也就是判断输入的内容在数据库里面有没有，如果有的话提示用户已被注册，这个时候不能
                 *  在注册，需要更换用户名，如果没有注册，那么注册成功，把数据（用户名和密码）保存）
                 *
                 *
                 *
                 * */
                Intent intent1=new Intent(this, LoginActivity.class);
                Toast.makeText(this, "注册成功，请登录",Toast.LENGTH_LONG).show();
                startActivity(intent1);
                overridePendingTransition(R.anim.in, R.anim.out);
                break;
        }
    }
}
