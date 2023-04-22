package com.app.pornhub.carouselview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;
import o2.b;

/* loaded from: classes.dex */
public class CarouselViewPager extends ViewPager {
    public b A0;
    public float B0;
    public float C0;

    public CarouselViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.B0 = 0.0f;
        this.C0 = 5.0f;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.B0 = motionEvent.getX();
        } else if (action == 1) {
            if (Math.abs(this.B0 - motionEvent.getX()) < this.C0) {
                b bVar = this.A0;
                if (bVar != null) {
                    bVar.a(getCurrentItem());
                }
                return true;
            }
            this.B0 = 0.0f;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setImageClickListener(b bVar) {
        this.A0 = bVar;
    }
}
