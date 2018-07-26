package com.bjfdpackage;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;

import com.bjfdpackage.singleActivity.StoragemanagementAcivity;
import com.bjfdpackage.singleActivity.WarehousemanagementAcivity;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    @Bind(R.id.main_in)
    RelativeLayout mainIn;
    @Bind(R.id.main_on)
    RelativeLayout mainOn;

    //    @Bind(R.id.mdrawerLayout)
//    DrawerLayout mdrawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initdata();
    }

    private void initdata() {


    }

    @OnClick({R.id.main_in, R.id.main_on})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.main_in:
                //点击跳转到入库管理页面

                Intent intent=new Intent(this, StoragemanagementAcivity.class);
                startActivity(intent);
                break;
            case R.id.main_on:
                //点击跳转到出库管理页面
                Intent intent1=new Intent(this, WarehousemanagementAcivity.class);
                startActivity(intent1);

                break;
        }
    }
//    private void initdata() {
//        mdrawerLayout.addDrawerListener(new DrawerLayout.SimpleDrawerListener() {
//            //当侧滑菜单正在滑动时触发的方法
//            /**
//             第一个参数：正在滑动的侧滑菜单
//             第二个参数：菜单滑动的宽度的百分比
//             **/
//            @Override
//            public void onDrawerSlide(View drawerView, float slideOffset) {
//                super.onDrawerSlide(drawerView, slideOffset);
////获得侧滑菜单的宽度
//                int drawerViewWidth = drawerView.getMeasuredWidth();
////根据滑动百分比计算内容部分应该向右边移动的距离
//                int marginLeft = (int)(drawerViewWidth * slideOffset) ;
////获得内容部分的View对象（内容View对象是第一个，所以是0）
//                LinearLayout childAt = (LinearLayout) mdrawerLayout.getChildAt(0);
////修改内容部分的左边距
//                childAt.setLeft(marginLeft);
//            }
//        });
}
