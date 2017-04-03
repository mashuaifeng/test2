package com.example.administrator.permissiontest.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.view.View;

import com.example.administrator.permissiontest.R;

/**
 * Created by Administrator on 2017/1/19.
 */
public class BitmapShaderView extends View {

    private Bitmap bitmap;
    private BitmapShader bitmapShader;
    private ShapeDrawable shapeDrawable;

    private int bitmapWidth;
    private int bitmapHeight;

    public BitmapShaderView(Context context) {
        super(context);
        bitmap = ((BitmapDrawable)(getResources().getDrawable(R.drawable.hh))).getBitmap();
        bitmapWidth = bitmap.getWidth();
        bitmapHeight = bitmap.getHeight();
        //构造渲染器BitmapShader
        bitmapShader = new BitmapShader(bitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        shapeDrawable = new ShapeDrawable(new RectShape());
        shapeDrawable.getPaint().setShader(bitmapShader);
        shapeDrawable.setBounds(20,20,bitmapWidth+300,bitmapHeight+600);
        shapeDrawable.draw(canvas);
    }
}
