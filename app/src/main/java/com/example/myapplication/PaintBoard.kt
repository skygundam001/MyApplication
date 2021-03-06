package com.example.myapplication

import android.content.Context
import android.content.res.Resources
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View
import java.util.jar.Attributes

class PaintBoard(context:Context,attribute:AttributeSet) :View(context,attribute){

    private var painter:Paint
    private var bmap :Bitmap
    private var ncanvas:Canvas
    init {

        val width = Resources.getSystem().displayMetrics.widthPixels
        val height = Resources.getSystem().displayMetrics.heightPixels
        bmap = Bitmap.createBitmap(width,height, Bitmap.Config.ARGB_8888)

        ncanvas = Canvas(bmap)
        ncanvas.drawColor(Color.blue())

        painter = Paint()
        painter.setColor(Color.BLACK)
        painter.setStrokeWidth(10f)
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        if (canvas != null) {
            canvas.drawBitmap(bmap,0f,0f,painter)
        }

    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        return super.onTouchEvent(event)
    }
}