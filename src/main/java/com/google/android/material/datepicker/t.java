package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.app.pornhub.R;
import com.google.android.material.datepicker.MaterialCalendar;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class t extends RecyclerView.Adapter<a> {
    public final Context d;

    /* renamed from: e  reason: collision with root package name */
    public final com.google.android.material.datepicker.a f7410e;

    /* renamed from: f  reason: collision with root package name */
    public final d<?> f7411f;

    /* renamed from: g  reason: collision with root package name */
    public final MaterialCalendar.e f7412g;

    /* renamed from: h  reason: collision with root package name */
    public final int f7413h;

    /* loaded from: classes.dex */
    public static class a extends RecyclerView.z {

        /* renamed from: u  reason: collision with root package name */
        public final TextView f7414u;

        /* renamed from: v  reason: collision with root package name */
        public final MaterialCalendarGridView f7415v;

        public a(LinearLayout linearLayout, boolean z10) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
            this.f7414u = textView;
            WeakHashMap<View, n0.a0> weakHashMap = n0.x.f13156a;
            new n0.w(R.id.tag_accessibility_heading, Boolean.class, 28).e(textView, Boolean.TRUE);
            this.f7415v = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
            if (z10) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    public t(Context context, d<?> dVar, com.google.android.material.datepicker.a aVar, MaterialCalendar.e eVar) {
        q qVar = aVar.f7350c;
        q qVar2 = aVar.f7351f;
        q qVar3 = aVar.f7353m;
        if (qVar.compareTo(qVar3) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (qVar3.compareTo(qVar2) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        int i10 = r.f7403t;
        int i11 = MaterialCalendar.f7332y0;
        int dimensionPixelSize = i10 * context.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height);
        int dimensionPixelSize2 = m.T0(context) ? context.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0;
        this.d = context;
        this.f7413h = dimensionPixelSize + dimensionPixelSize2;
        this.f7410e = aVar;
        this.f7411f = dVar;
        this.f7412g = eVar;
        if (this.f2802a.a()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.f2803b = true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int a() {
        return this.f7410e.f7354t;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long b(int i10) {
        return this.f7410e.f7350c.g(i10).f7397c.getTimeInMillis();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void h(a aVar, int i10) {
        a aVar2 = aVar;
        q g10 = this.f7410e.f7350c.g(i10);
        aVar2.f7414u.setText(g10.f(aVar2.f2885a.getContext()));
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) aVar2.f7415v.findViewById(R.id.month_grid);
        if (materialCalendarGridView.getAdapter2() == null || !g10.equals(materialCalendarGridView.getAdapter2().f7404c)) {
            r rVar = new r(g10, this.f7411f, this.f7410e);
            materialCalendarGridView.setNumColumns(g10.f7400m);
            materialCalendarGridView.setAdapter((ListAdapter) rVar);
        } else {
            materialCalendarGridView.invalidate();
            r adapter2 = materialCalendarGridView.getAdapter2();
            for (Long l10 : adapter2.f7406j) {
                adapter2.f(materialCalendarGridView, l10.longValue());
            }
            d<?> dVar = adapter2.f7405f;
            if (dVar != null) {
                for (Long l11 : dVar.c0()) {
                    adapter2.f(materialCalendarGridView, l11.longValue());
                }
                adapter2.f7406j = adapter2.f7405f.c0();
                materialCalendarGridView.setOnItemClickListener(new s(this, materialCalendarGridView));
            }
        }
        materialCalendarGridView.setOnItemClickListener(new s(this, materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public a i(ViewGroup viewGroup, int i10) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (m.T0(viewGroup.getContext())) {
            linearLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, this.f7413h));
            return new a(linearLayout, true);
        }
        return new a(linearLayout, false);
    }

    public q m(int i10) {
        return this.f7410e.f7350c.g(i10);
    }

    public int n(q qVar) {
        return this.f7410e.f7350c.h(qVar);
    }
}
