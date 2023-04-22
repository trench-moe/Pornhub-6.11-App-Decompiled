package com.google.android.material.datepicker;

import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public class r extends BaseAdapter {

    /* renamed from: t  reason: collision with root package name */
    public static final int f7403t = y.e().getMaximum(4);

    /* renamed from: c  reason: collision with root package name */
    public final q f7404c;

    /* renamed from: f  reason: collision with root package name */
    public final d<?> f7405f;

    /* renamed from: j  reason: collision with root package name */
    public Collection<Long> f7406j;

    /* renamed from: m  reason: collision with root package name */
    public c f7407m;
    public final a n;

    public r(q qVar, d<?> dVar, a aVar) {
        this.f7404c = qVar;
        this.f7405f = dVar;
        this.n = aVar;
        this.f7406j = dVar.c0();
    }

    public int a(int i10) {
        return b() + (i10 - 1);
    }

    public int b() {
        return this.f7404c.e();
    }

    @Override // android.widget.Adapter
    /* renamed from: c */
    public Long getItem(int i10) {
        if (i10 < this.f7404c.e() || i10 > d()) {
            return null;
        }
        q qVar = this.f7404c;
        Calendar b10 = y.b(qVar.f7397c);
        b10.set(5, (i10 - qVar.e()) + 1);
        return Long.valueOf(b10.getTimeInMillis());
    }

    public int d() {
        return (this.f7404c.e() + this.f7404c.n) - 1;
    }

    public final void e(TextView textView, long j10) {
        b bVar;
        if (textView == null) {
            return;
        }
        boolean z10 = false;
        if (this.n.f7352j.Y(j10)) {
            textView.setEnabled(true);
            Iterator<Long> it = this.f7405f.c0().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (y.a(j10) == y.a(it.next().longValue())) {
                    z10 = true;
                    break;
                }
            }
            bVar = z10 ? this.f7407m.f7367b : y.d().getTimeInMillis() == j10 ? this.f7407m.f7368c : this.f7407m.f7366a;
        } else {
            textView.setEnabled(false);
            bVar = this.f7407m.f7371g;
        }
        bVar.b(textView);
    }

    public final void f(MaterialCalendarGridView materialCalendarGridView, long j10) {
        if (q.d(j10).equals(this.f7404c)) {
            Calendar b10 = y.b(this.f7404c.f7397c);
            b10.setTimeInMillis(j10);
            e((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter2().a(b10.get(5)) - materialCalendarGridView.getFirstVisiblePosition()), j10);
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return b() + this.f7404c.n;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10 / this.f7404c.f7400m;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x014e  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View getView(int r13, android.view.View r14, android.view.ViewGroup r15) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.r.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }
}
