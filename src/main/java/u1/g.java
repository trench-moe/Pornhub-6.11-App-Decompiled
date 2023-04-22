package u1;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.app.pornhub.R;
import java.util.WeakHashMap;
import n0.x;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public class g extends ViewGroup implements d {

    /* renamed from: u  reason: collision with root package name */
    public static final /* synthetic */ int f15478u = 0;

    /* renamed from: c  reason: collision with root package name */
    public ViewGroup f15479c;

    /* renamed from: f  reason: collision with root package name */
    public View f15480f;

    /* renamed from: j  reason: collision with root package name */
    public final View f15481j;

    /* renamed from: m  reason: collision with root package name */
    public int f15482m;
    public Matrix n;

    /* renamed from: t  reason: collision with root package name */
    public final ViewTreeObserver.OnPreDrawListener f15483t;

    /* loaded from: classes2.dex */
    public class a implements ViewTreeObserver.OnPreDrawListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            View view;
            g gVar = g.this;
            WeakHashMap<View, n0.a0> weakHashMap = n0.x.f13156a;
            x.d.k(gVar);
            g gVar2 = g.this;
            ViewGroup viewGroup = gVar2.f15479c;
            if (viewGroup != null && (view = gVar2.f15480f) != null) {
                viewGroup.endViewTransition(view);
                x.d.k(g.this.f15479c);
                g gVar3 = g.this;
                gVar3.f15479c = null;
                gVar3.f15480f = null;
            }
            return true;
        }
    }

    public g(View view) {
        super(view.getContext());
        this.f15483t = new a();
        this.f15481j = view;
        setWillNotDraw(false);
        setLayerType(2, null);
    }

    public static void b(View view, View view2) {
        u.b(view2, view2.getLeft(), view2.getTop(), view.getWidth() + view2.getLeft(), view.getHeight() + view2.getTop());
    }

    public static g c(View view) {
        return (g) view.getTag(R.id.ghost_view);
    }

    @Override // u1.d
    public void a(ViewGroup viewGroup, View view) {
        this.f15479c = viewGroup;
        this.f15480f = view;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f15481j.setTag(R.id.ghost_view, this);
        this.f15481j.getViewTreeObserver().addOnPreDrawListener(this.f15483t);
        u.f15511a.h(this.f15481j, 4);
        if (this.f15481j.getParent() != null) {
            ((View) this.f15481j.getParent()).invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.f15481j.getViewTreeObserver().removeOnPreDrawListener(this.f15483t);
        u.f15511a.h(this.f15481j, 0);
        this.f15481j.setTag(R.id.ghost_view, null);
        if (this.f15481j.getParent() != null) {
            ((View) this.f15481j.getParent()).invalidate();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        u1.a.a(canvas, true);
        canvas.setMatrix(this.n);
        View view = this.f15481j;
        mb.a aVar = u.f15511a;
        aVar.h(view, 0);
        this.f15481j.invalidate();
        aVar.h(this.f15481j, 4);
        drawChild(canvas, this.f15481j, getDrawingTime());
        u1.a.a(canvas, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.View, u1.d
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        if (c(this.f15481j) == this) {
            u.f15511a.h(this.f15481j, i10 == 0 ? 4 : 0);
        }
    }
}
