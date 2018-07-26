package com.bjfdpackage.singleActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.bjfdpackage.MainActivity;
import com.bjfdpackage.R;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity {

    @Bind(R.id.login_rester)
    TextView loginRester;
    @Bind(R.id.login_usename)
    EditText loginUsename;
    @Bind(R.id.login_usepassword)
    EditText loginUsepassword;
    @Bind(R.id.login)
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.login_rester, R.id.login})
    public void onClick(View view) {
        switch (view.getId()) {
            //点击注册跳转到注册页面
            case R.id.login_rester:
                Intent intent=new Intent(this, RegsterAcivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.in, R.anim.out);
                break;
        //点击登录跳转到主页面
            case R.id.login:
                Intent intent1=new Intent(this, MainActivity.class);
                startActivity(intent1);
                overridePendingTransition(R.anim.in, R.anim.out);
                break;
        }
    }
}
