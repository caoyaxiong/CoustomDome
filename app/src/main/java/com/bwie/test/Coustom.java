package com.bwie.test;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

/**
 * 1. 类的用途
 * 2. @author dell
 * 3. @date 2017/2/28 14:03
 */

public class Coustom extends View {
    private String TAG=Coustom.class.getCanonicalName();
    private Paint paint=new Paint();
    public Coustom(Context context) {
        super(context);
    }

    public Coustom(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public Coustom(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

//    public Coustom(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
//        super(context, attrs, defStyleAttr, defStyleRes);
//    }


    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        Log.e(TAG,"onMeasure");
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        Log.e(TAG,"onLayout");
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Log.e(TAG,"onDraw");
        //设置抗锯齿
        paint.setAntiAlias(true);
        //设置画笔线宽
        paint.setStrokeWidth(10);
        //设置画笔颜色
        paint.setColor(Color.RED);
        //设置画板的背景
        canvas.drawColor(Color.YELLOW);
        //划线(左上右下)
        canvas.drawLine(50,50,350,50,paint);
        //绘制矩形（左上右下）
        canvas.drawRect(50,100,150,400,paint);
        //绘制圆形（圆心X坐标，圆心Y坐标，半径）
        canvas.drawCircle(220,180,50,paint);
        //绘制图形（左上）
        canvas.drawBitmap(BitmapFactory.decodeResource(getResources(),R.mipmap.ic_launcher),200,300,paint);
        //绘制弧形（左上右下，半径起始位置，半径扫描角度）
       // canvas.drawArc(200,500,400,700,0,180,true,paint);
    }
}
