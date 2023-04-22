package dd;

import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public class b implements View.OnTouchListener {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f8910c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ GradientDrawable f8911f;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ cd.b f8912j;

    public b(d dVar, int i10, GradientDrawable gradientDrawable, cd.b bVar) {
        this.f8910c = i10;
        this.f8911f = gradientDrawable;
        this.f8912j = bVar;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f8911f.setColor(this.f8910c);
        } else {
            this.f8911f.setColor(this.f8912j.f4030m);
        }
        return false;
    }
}
