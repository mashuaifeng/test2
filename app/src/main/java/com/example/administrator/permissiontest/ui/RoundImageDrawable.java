package com.example.administrator.permissiontest.ui;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PixelFormat;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/**圆角imageview
 * Created by Administrator on 2017/1/19.
 */
public class RoundImageDrawable extends Drawable{

    private Paint mPaint;
    private Bitmap mBitmap;
    private RectF rectF;
    private int radius;

    public RoundImageDrawable(Bitmap bitmap) {
        mBitmap = bitmap;
        BitmapShader bitmapShader = new BitmapShader(mBitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
        mPaint = new Paint();
        mPaint.setAntiAlias(true);
        mPaint.setShader(bitmapShader);
        radius = Math.min(mBitmap.getHeight(),mBitmap.getWidth());

    }

    @Override
    public int getIntrinsicHeight() {
        //return mBitmap.getHeight();
        return radius;
    }

    @Override
    public int getIntrinsicWidth() {
        //return mBitmap.getWidth();
        return radius;
    }

    @Override
    public void setBounds(int left, int top, int right, int bottom) {
        super.setBounds(left, top, right, bottom);
        rectF = new RectF(left,top,right,bottom);
    }

    @Override
    public void draw(Canvas canvas) {
       // canvas.drawRoundRect(rectF,30,30,mPaint);
        canvas.drawCircle(radius/2,radius/2,radius/2,mPaint);
    }

    @Override
    public void setAlpha(int alpha) {
        mPaint.setAlpha(alpha);
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        mPaint.setColorFilter(colorFilter);
    }

    @Override
    public int getOpacity() {
        return PixelFormat.TRANSLUCENT;
    }
}
