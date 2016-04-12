package com.amap.navi.demo.activity;

import android.os.Bundle;
import android.util.Log;

import com.amap.api.maps.model.LatLng;
import com.amap.api.navi.AMapNaviView;
import com.amap.api.navi.model.NaviLatLng;
import com.amap.navi.demo.R;

/**
 * 间：16/1/15 15:19
 * 项目名称：newNaviDemo
 *
 * @author lingxiang.wang
 * @email lingxiang.wang@alibaba-inc.com
 * 类说明：
 */

public class ParallelRoadActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_basic_navi);
        mAMapNaviView = (AMapNaviView) findViewById(R.id.navi_view);
        mAMapNaviView.onCreate(savedInstanceState);
        mAMapNaviView.setAMapNaviViewListener(this);


        mStartLatlng = new NaviLatLng(39.923835, 116.43412277777777);
        mEndLatlng = new NaviLatLng(38.925846, 116.432765);

    }


    @Override
    public void notifyParallelRoad(int i) {
        super.notifyParallelRoad(i);

        if (i == 0) {
            Log.d("wlx", "当前在主辅路过渡");
            return;
        }
        if (i == 1) {
            Log.d("wlx", "当前在主路");
            return;
        }
        if (i == 2) {
            Log.d("wlx", "当前在辅路");
        }

//        在GPS导航下，可以使用以下方法切换主辅路
//        mAMapNavi.switchParallelRoad();
    }
}
