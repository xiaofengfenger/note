package com.yxf.note;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ImageView;

import java.io.File;

/**
 * Created by 雪锋 on 2017/5/25.
 */

public class atyPhotoViewer extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        iv=new ImageView(this);
        setContentView(iv);
        String path=getIntent().getStringExtra(EXTRA_PATH);
        if(path!=null){
            iv.setImageURI(Uri.fromFile(new File(path)));
        }
        else{
            finish();
        }
    }

    private ImageView iv;
    public static final String EXTRA_PATH="path";
}
