package com.amap.navi.demo.activity;

import android.os.Bundle;
import android.view.View;

import com.amap.api.navi.AMapNaviView;
import com.amap.api.navi.AMapNaviViewOptions;
import com.amap.navi.demo.R;

/**
 * 创建时间：15/12/22 15:29
 * 项目名称：newNaviDemo
 *
 * @author lingxiang.wang
 * @email lingxiang.wang@alibaba-inc.com
 * 类说明：
 */

public class NorthModeActivity extends BaseActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_north_mode);
        mAMapNaviView = (AMapNaviView) findViewById(R.id.navi_view);
        mAMapNaviView.onCreate(savedInstanceState);
        mAMapNaviView.setAMapNaviViewListener(this);

        AMapNaviViewOptions options = mAMapNaviView.getViewOptions();
        options.setLayoutVisible(false);
        mAMapNaviView.setViewOptions(options);
    }

    public void northUp(View view) {
        mAMapNaviView.setNaviMode(AMapNaviView.NORTH_UP_MODE);
    }

    public void carUp(View view) {
        mAMapNaviView.setNaviMode(AMapNaviView.CAR_UP_MODE);
    }
}
