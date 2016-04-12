package com.amap.navi.demo.activity;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.amap.api.navi.AMapNavi;
import com.amap.navi.demo.R;

/**
 * 首页面
 */
public class IndexActivity extends Activity {


    private AdapterView.OnItemClickListener mItemClickListener = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            if (position == 0) {
                startActivity(new Intent(IndexActivity.this, BasicNaviActivity.class));
            } else if (position == 1) {
                startActivity(new Intent(IndexActivity.this, CustomRouteActivity.class));
            } else if (position == 2) {
                startActivity(new Intent(IndexActivity.this, CustomEnlargedCrossDisplayActivity.class));
            } else if (position == 3) {
                startActivity(new Intent(IndexActivity.this, CustomDriveWayViewActivity.class));
            } else if (position == 4) {
                startActivity(new Intent(IndexActivity.this, HudDisplayActivity.class));
            } else if (position == 5) {
                startActivity(new Intent(IndexActivity.this, IntelligentBroadcastActivity.class));
            } else if (position == 6) {
                startActivity(new Intent(IndexActivity.this, RoutePlanningActivity.class));
            } else if (position == 7) {
                startActivity(new Intent(IndexActivity.this, GPSNaviActivity.class));
            } else if (position == 8) {
                startActivity(new Intent(IndexActivity.this, CustomTrafficBarActivity.class));
            } else if (position == 9) {
                startActivity(new Intent(IndexActivity.this, MultipleRoutePlanningActivity.class));
            } else if (position == 10) {
                startActivity(new Intent(IndexActivity.this, GetNaviStepsAndLinksActivity.class));
            } else if (position == 11) {
                startActivity(new Intent(IndexActivity.this, NorthModeActivity.class));
            } else if (position == 12) {
                startActivity(new Intent(IndexActivity.this, OverviewModeActivity.class));
            } else if (position == 13) {
                startActivity(new Intent(IndexActivity.this, BasicWalkNaviActivity.class));
            } else if (position == 14) {
                startActivity(new Intent(IndexActivity.this, ParallelRoadActivity.class));
            } else if (position == 15) {
                startActivity(new Intent(IndexActivity.this, UseExtraGpsDataActivity.class));
            }
        }
    };
    private String[] examples = new String[]

            {
                    "基本导航页", "自定义路段", "自定义路口放大图", "自定义道路选择", "HUD显示", "智能播报", "路径规划", "实时导航", "自定义路况蚯蚓线", "多路径规划", "展示导航路径详情", "正北模式", "查看全览", "步行导航", "主辅路", "使用外部GPS数据"
            };


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);


        initView();

        Toast.makeText(this, "demo数量:" + examples.length, Toast.LENGTH_SHORT).show();

    }

    private void initView() {
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, examples));
        setTitle("导航SDK " + AMapNavi.getVersion());
        listView.setOnItemClickListener(mItemClickListener);
    }


    /**
     * 返回键处理事件
     */
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {

        if (keyCode == KeyEvent.KEYCODE_BACK) {
            finish();
            System.exit(0);// 退出程序
        }
        return super.onKeyDown(keyCode, event);
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
    }

}
