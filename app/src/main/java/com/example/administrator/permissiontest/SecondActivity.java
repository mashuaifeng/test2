package com.example.administrator.permissiontest;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.administrator.permissiontest.ui.RoundImageDrawable;

/**
 * Created by Administrator on 2017/1/19.
 */
public class SecondActivity extends Activity {

    private ImageView imageview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(new BitmapShaderView(this));
        setContentView(R.layout.second);
        imageview = (ImageView) findViewById(R.id.imageview);
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.drawable.hh);
        imageview.setImageDrawable(new RoundImageDrawable(bitmap));
    }
}
