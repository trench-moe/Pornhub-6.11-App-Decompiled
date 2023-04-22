package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.i;
import com.app.pornhub.R;
import java.util.WeakHashMap;
import n0.a0;
import n0.x;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    public final Context f691a;

    /* renamed from: b  reason: collision with root package name */
    public final e f692b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f693c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public final int f694e;

    /* renamed from: f  reason: collision with root package name */
    public View f695f;

    /* renamed from: h  reason: collision with root package name */
    public boolean f697h;

    /* renamed from: i  reason: collision with root package name */
    public i.a f698i;

    /* renamed from: j  reason: collision with root package name */
    public k.d f699j;

    /* renamed from: k  reason: collision with root package name */
    public PopupWindow.OnDismissListener f700k;

    /* renamed from: g  reason: collision with root package name */
    public int f696g = 8388611;

    /* renamed from: l  reason: collision with root package name */
    public final PopupWindow.OnDismissListener f701l = new a();

    /* loaded from: classes.dex */
    public class a implements PopupWindow.OnDismissListener {
        public a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            h.this.c();
        }
    }

    public h(Context context, e eVar, View view, boolean z10, int i10, int i11) {
        this.f691a = context;
        this.f692b = eVar;
        this.f695f = view;
        this.f693c = z10;
        this.d = i10;
        this.f694e = i11;
    }

    public k.d a() {
        if (this.f699j == null) {
            Display defaultDisplay = ((WindowManager) this.f691a.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            k.d bVar = Math.min(point.x, point.y) >= this.f691a.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width) ? new b(this.f691a, this.f695f, this.d, this.f694e, this.f693c) : new k(this.f691a, this.f692b, this.f695f, this.d, this.f694e, this.f693c);
            bVar.o(this.f692b);
            bVar.u(this.f701l);
            bVar.q(this.f695f);
            bVar.i(this.f698i);
            bVar.r(this.f697h);
            bVar.s(this.f696g);
            this.f699j = bVar;
        }
        return this.f699j;
    }

    public boolean b() {
        k.d dVar = this.f699j;
        return dVar != null && dVar.b();
    }

    public void c() {
        this.f699j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f700k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void d(i.a aVar) {
        this.f698i = aVar;
        k.d dVar = this.f699j;
        if (dVar != null) {
            dVar.i(aVar);
        }
    }

    public final void e(int i10, int i11, boolean z10, boolean z11) {
        k.d a10 = a();
        a10.v(z11);
        if (z10) {
            int i12 = this.f696g;
            View view = this.f695f;
            WeakHashMap<View, a0> weakHashMap = x.f13156a;
            if ((Gravity.getAbsoluteGravity(i12, x.e.d(view)) & 7) == 5) {
                i10 -= this.f695f.getWidth();
            }
            a10.t(i10);
            a10.w(i11);
            int i13 = (int) ((this.f691a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a10.f11734c = new Rect(i10 - i13, i11 - i13, i10 + i13, i11 + i13);
        }
        a10.c();
    }

    public boolean f() {
        if (b()) {
            return true;
        }
        if (this.f695f == null) {
            return false;
        }
        e(0, 0, false, false);
        return true;
    }
}
