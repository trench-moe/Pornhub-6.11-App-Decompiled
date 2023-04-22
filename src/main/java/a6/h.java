package a6;

import android.content.Context;
import android.graphics.Point;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.app.pornhub.R;
import com.bumptech.glide.request.SingleRequest;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

@Deprecated
/* loaded from: classes.dex */
public abstract class h<T extends View, Z> extends a6.a<Z> {

    /* renamed from: c  reason: collision with root package name */
    public final T f195c;

    /* renamed from: f  reason: collision with root package name */
    public final a f196f;

    /* loaded from: classes.dex */
    public static final class a {
        public static Integer d;

        /* renamed from: a  reason: collision with root package name */
        public final View f197a;

        /* renamed from: b  reason: collision with root package name */
        public final List<f> f198b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        public ViewTreeObserver$OnPreDrawListenerC0006a f199c;

        /* renamed from: a6.h$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class ViewTreeObserver$OnPreDrawListenerC0006a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: c  reason: collision with root package name */
            public final WeakReference<a> f200c;

            public ViewTreeObserver$OnPreDrawListenerC0006a(a aVar) {
                this.f200c = new WeakReference<>(aVar);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (Log.isLoggable("ViewTarget", 2)) {
                    Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                a aVar = this.f200c.get();
                if (aVar != null) {
                    if (!aVar.f198b.isEmpty()) {
                        int d = aVar.d();
                        int c10 = aVar.c();
                        if (aVar.e(d, c10)) {
                            Iterator it = new ArrayList(aVar.f198b).iterator();
                            while (it.hasNext()) {
                                ((f) it.next()).b(d, c10);
                            }
                            aVar.a();
                        }
                    }
                    return true;
                }
                return true;
            }
        }

        public a(View view) {
            this.f197a = view;
        }

        public void a() {
            ViewTreeObserver viewTreeObserver = this.f197a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f199c);
            }
            this.f199c = null;
            this.f198b.clear();
        }

        public final int b(int i10, int i11, int i12) {
            int i13 = i11 - i12;
            if (i13 > 0) {
                return i13;
            }
            int i14 = i10 - i12;
            if (i14 > 0) {
                return i14;
            }
            if (this.f197a.isLayoutRequested() || i11 != -2) {
                return 0;
            }
            if (Log.isLoggable("ViewTarget", 4)) {
                Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            Context context = this.f197a.getContext();
            if (d == null) {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                Objects.requireNonNull(windowManager, "Argument must not be null");
                Display defaultDisplay = windowManager.getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                d = Integer.valueOf(Math.max(point.x, point.y));
            }
            return d.intValue();
        }

        public final int c() {
            int paddingBottom = this.f197a.getPaddingBottom() + this.f197a.getPaddingTop();
            ViewGroup.LayoutParams layoutParams = this.f197a.getLayoutParams();
            return b(this.f197a.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingBottom);
        }

        public final int d() {
            int paddingRight = this.f197a.getPaddingRight() + this.f197a.getPaddingLeft();
            ViewGroup.LayoutParams layoutParams = this.f197a.getLayoutParams();
            return b(this.f197a.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0022  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean e(int r8, int r9) {
            /*
                r7 = this;
                r3 = 1
                r0 = r3
                r1 = 0
                r3 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r3
                if (r8 > 0) goto Le
                r6 = 5
                if (r8 != r2) goto Lc
                goto Le
            Lc:
                r8 = 0
                goto L10
            Le:
                r3 = 1
                r8 = r3
            L10:
                if (r8 == 0) goto L24
                r4 = 2
                if (r9 > 0) goto L1d
                r5 = 5
                if (r9 != r2) goto L1a
                r6 = 4
                goto L1e
            L1a:
                r3 = 0
                r8 = r3
                goto L20
            L1d:
                r5 = 2
            L1e:
                r3 = 1
                r8 = r3
            L20:
                if (r8 == 0) goto L24
                r4 = 1
                goto L27
            L24:
                r4 = 2
                r3 = 0
                r0 = r3
            L27:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: a6.h.a.e(int, int):boolean");
        }
    }

    public h(T t2) {
        Objects.requireNonNull(t2, "Argument must not be null");
        this.f195c = t2;
        this.f196f = new a(t2);
    }

    @Override // a6.g
    public void a(f fVar) {
        this.f196f.f198b.remove(fVar);
    }

    @Override // a6.g
    public void c(f fVar) {
        a aVar = this.f196f;
        int d = aVar.d();
        int c10 = aVar.c();
        if (aVar.e(d, c10)) {
            ((SingleRequest) fVar).b(d, c10);
            return;
        }
        if (!aVar.f198b.contains(fVar)) {
            aVar.f198b.add(fVar);
        }
        if (aVar.f199c == null) {
            ViewTreeObserver viewTreeObserver = aVar.f197a.getViewTreeObserver();
            a.ViewTreeObserver$OnPreDrawListenerC0006a viewTreeObserver$OnPreDrawListenerC0006a = new a.ViewTreeObserver$OnPreDrawListenerC0006a(aVar);
            aVar.f199c = viewTreeObserver$OnPreDrawListenerC0006a;
            viewTreeObserver.addOnPreDrawListener(viewTreeObserver$OnPreDrawListenerC0006a);
        }
    }

    @Override // a6.g
    public void h(z5.c cVar) {
        this.f195c.setTag(R.id.glide_custom_view_target_tag, cVar);
    }

    @Override // a6.g
    public z5.c j() {
        Object tag = this.f195c.getTag(R.id.glide_custom_view_target_tag);
        if (tag != null) {
            if (tag instanceof z5.c) {
                return (z5.c) tag;
            }
            throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
        }
        return null;
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("Target for: ");
        m10.append(this.f195c);
        return m10.toString();
    }
}
