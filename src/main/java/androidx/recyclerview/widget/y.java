package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes.dex */
public abstract class y {

    /* renamed from: a  reason: collision with root package name */
    public final RecyclerView.l f3121a;

    /* renamed from: b  reason: collision with root package name */
    public int f3122b = IntCompanionObject.MIN_VALUE;

    /* renamed from: c  reason: collision with root package name */
    public final Rect f3123c = new Rect();

    public y(RecyclerView.l lVar, w wVar) {
        this.f3121a = lVar;
    }

    public static y a(RecyclerView.l lVar, int i10) {
        if (i10 != 0) {
            if (i10 == 1) {
                return new x(lVar);
            }
            throw new IllegalArgumentException("invalid orientation");
        }
        return new w(lVar);
    }

    public abstract int b(View view);

    public abstract int c(View view);

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public int m() {
        if (Integer.MIN_VALUE == this.f3122b) {
            return 0;
        }
        return l() - this.f3122b;
    }

    public abstract int n(View view);

    public abstract int o(View view);

    public abstract void p(int i10);
}
