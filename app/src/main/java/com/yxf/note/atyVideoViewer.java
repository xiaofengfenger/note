package com.yxf.note;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.VideoView;

/**
 * Created by 雪锋 on 2017/5/25.
 */

public class atyVideoViewer extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        vv=new VideoView(this);
        setContentView(vv);
        String path=getIntent().getStringExtra(EXTRA_PATH);
        if(path!=null){
            vv.setVideoPath(path);
        }
        else{
            finish();
        }
    }
    private VideoView vv;
    public static final String EXTRA_PATH="path";
}
