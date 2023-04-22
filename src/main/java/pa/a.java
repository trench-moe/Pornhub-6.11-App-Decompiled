package pa;

import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* loaded from: classes2.dex */
public class a implements View.OnTouchListener {

    /* renamed from: c  reason: collision with root package name */
    public final Dialog f13882c;

    /* renamed from: f  reason: collision with root package name */
    public final int f13883f;

    /* renamed from: j  reason: collision with root package name */
    public final int f13884j;

    /* renamed from: m  reason: collision with root package name */
    public final int f13885m;

    public a(Dialog dialog, Rect rect) {
        this.f13882c = dialog;
        this.f13883f = rect.left;
        this.f13884j = rect.top;
        this.f13885m = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(16908290);
        int left = findViewById.getLeft() + this.f13883f;
        int width = findViewById.getWidth() + left;
        int top = findViewById.getTop() + this.f13884j;
        if (new RectF(left, top, width, findViewById.getHeight() + top).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i10 = this.f13885m;
            obtain.setLocation((-i10) - 1, (-i10) - 1);
        }
        view.performClick();
        return this.f13882c.onTouchEvent(obtain);
    }
}
