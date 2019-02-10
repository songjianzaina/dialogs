package com.insworks.indialog.one;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.insworks.indialog.R;
import com.uuch.adlibrary.AdConstant;
import com.uuch.adlibrary.AdManager;
import com.uuch.adlibrary.bean.AdInfo;
import com.uuch.adlibrary.transformer.DepthPageTransformer;

import java.util.ArrayList;

/***
 * 该页面张展示广告弹窗的使用  需要关联adlibrary包
 */
public class FirstDialogActivity extends AppCompatActivity {

    protected ArrayList<AdInfo> advList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_dialog);
        initData();

        /**
         * 创建广告活动管理对象
         */
        AdManager adManager = new AdManager(this, advList);
        adManager.setOverScreen(true)
                .setPageTransformer(new DepthPageTransformer());
/**
 * 执行弹窗的显示操作
 */
        adManager.showAdDialog(AdConstant.ANIM_DOWN_TO_UP);
    }
    /**
     * 初始化数据
     */
    private void initData() {
        advList = new ArrayList<>();
        AdInfo adInfo = new AdInfo();
        adInfo.setActivityImg("https://raw.githubusercontent.com/yipianfengye/android-adDialog/master/images/testImage1.png");
        advList.add(adInfo);

        adInfo = new AdInfo();
        adInfo.setActivityImg("https://raw.githubusercontent.com/yipianfengye/android-adDialog/master/images/testImage2.png");
        advList.add(adInfo);
    }
}
