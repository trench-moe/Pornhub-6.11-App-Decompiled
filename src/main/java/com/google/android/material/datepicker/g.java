package com.google.android.material.datepicker;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Calendar;

/* loaded from: classes.dex */
public class g extends RecyclerView.k {

    /* renamed from: a  reason: collision with root package name */
    public final Calendar f7378a = y.e();

    /* renamed from: b  reason: collision with root package name */
    public final Calendar f7379b = y.e();

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ MaterialCalendar f7380c;

    public g(MaterialCalendar materialCalendar) {
        this.f7380c = materialCalendar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.k
    public void e(Canvas canvas, RecyclerView recyclerView, RecyclerView.w wVar) {
        if ((recyclerView.getAdapter() instanceof a0) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            a0 a0Var = (a0) recyclerView.getAdapter();
            GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
            for (m0.b<Long, Long> bVar : this.f7380c.f7334p0.w()) {
                Long l10 = bVar.f12856a;
                if (l10 != null && bVar.f12857b != null) {
                    this.f7378a.setTimeInMillis(l10.longValue());
                    this.f7379b.setTimeInMillis(bVar.f12857b.longValue());
                    int m10 = a0Var.m(this.f7378a.get(1));
                    int m11 = a0Var.m(this.f7379b.get(1));
                    View s10 = gridLayoutManager.s(m10);
                    View s11 = gridLayoutManager.s(m11);
                    int i10 = gridLayoutManager.F;
                    int i11 = m10 / i10;
                    int i12 = m11 / i10;
                    for (int i13 = i11; i13 <= i12; i13++) {
                        View s12 = gridLayoutManager.s(gridLayoutManager.F * i13);
                        if (s12 != null) {
                            int top = s12.getTop() + this.f7380c.f7338t0.d.f7361a.top;
                            int bottom = s12.getBottom() - this.f7380c.f7338t0.d.f7361a.bottom;
                            canvas.drawRect(i13 == i11 ? (s10.getWidth() / 2) + s10.getLeft() : 0, top, i13 == i12 ? (s11.getWidth() / 2) + s11.getLeft() : recyclerView.getWidth(), bottom, this.f7380c.f7338t0.f7372h);
                        }
                    }
                }
            }
        }
    }
}
