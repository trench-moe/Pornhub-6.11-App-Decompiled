package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.animation.Interpolator;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
final class OverlayListView extends ListView {

    /* renamed from: c  reason: collision with root package name */
    public final List<a> f2458c;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public BitmapDrawable f2459a;

        /* renamed from: c  reason: collision with root package name */
        public Rect f2461c;
        public Interpolator d;

        /* renamed from: e  reason: collision with root package name */
        public long f2462e;

        /* renamed from: f  reason: collision with root package name */
        public Rect f2463f;

        /* renamed from: g  reason: collision with root package name */
        public int f2464g;

        /* renamed from: j  reason: collision with root package name */
        public long f2467j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f2468k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f2469l;

        /* renamed from: m  reason: collision with root package name */
        public InterfaceC0032a f2470m;

        /* renamed from: b  reason: collision with root package name */
        public float f2460b = 1.0f;

        /* renamed from: h  reason: collision with root package name */
        public float f2465h = 1.0f;

        /* renamed from: i  reason: collision with root package name */
        public float f2466i = 1.0f;

        /* renamed from: androidx.mediarouter.app.OverlayListView$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public interface InterfaceC0032a {
        }

        public a(BitmapDrawable bitmapDrawable, Rect rect) {
            this.f2459a = bitmapDrawable;
            this.f2463f = rect;
            this.f2461c = new Rect(rect);
            BitmapDrawable bitmapDrawable2 = this.f2459a;
            if (bitmapDrawable2 != null) {
                bitmapDrawable2.setAlpha((int) (this.f2460b * 255.0f));
                this.f2459a.setBounds(this.f2461c);
            }
        }
    }

    public OverlayListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2458c = new ArrayList();
    }

    public OverlayListView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f2458c = new ArrayList();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        boolean z10;
        super.onDraw(canvas);
        if (this.f2458c.size() > 0) {
            Iterator<a> it = this.f2458c.iterator();
            while (it.hasNext()) {
                a next = it.next();
                BitmapDrawable bitmapDrawable = next.f2459a;
                if (bitmapDrawable != null) {
                    bitmapDrawable.draw(canvas);
                }
                long drawingTime = getDrawingTime();
                if (next.f2469l) {
                    z10 = false;
                } else {
                    float f10 = 0.0f;
                    float max = Math.max(0.0f, Math.min(1.0f, ((float) (drawingTime - next.f2467j)) / ((float) next.f2462e)));
                    if (next.f2468k) {
                        f10 = max;
                    }
                    Interpolator interpolator = next.d;
                    float interpolation = interpolator == null ? f10 : interpolator.getInterpolation(f10);
                    int i10 = (int) (next.f2464g * interpolation);
                    Rect rect = next.f2461c;
                    Rect rect2 = next.f2463f;
                    rect.top = rect2.top + i10;
                    rect.bottom = rect2.bottom + i10;
                    float f11 = next.f2465h;
                    float b10 = a0.a.b(next.f2466i, f11, interpolation, f11);
                    next.f2460b = b10;
                    BitmapDrawable bitmapDrawable2 = next.f2459a;
                    if (bitmapDrawable2 != null) {
                        bitmapDrawable2.setAlpha((int) (b10 * 255.0f));
                        next.f2459a.setBounds(next.f2461c);
                    }
                    if (next.f2468k && f10 >= 1.0f) {
                        next.f2469l = true;
                        a.InterfaceC0032a interfaceC0032a = next.f2470m;
                        if (interfaceC0032a != null) {
                            c cVar = (c) interfaceC0032a;
                            cVar.f2485b.V.remove(cVar.f2484a);
                            cVar.f2485b.R.notifyDataSetChanged();
                        }
                    }
                    z10 = !next.f2469l;
                }
                if (!z10) {
                    it.remove();
                }
            }
        }
    }
}
