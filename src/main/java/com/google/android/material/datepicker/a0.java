package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.app.pornhub.R;
import java.util.Calendar;
import java.util.Locale;

/* loaded from: classes.dex */
public class a0 extends RecyclerView.Adapter<a> {
    public final MaterialCalendar<?> d;

    /* loaded from: classes.dex */
    public static class a extends RecyclerView.z {

        /* renamed from: u  reason: collision with root package name */
        public final TextView f7360u;

        public a(TextView textView) {
            super(textView);
            this.f7360u = textView;
        }
    }

    public a0(MaterialCalendar<?> materialCalendar) {
        this.d = materialCalendar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int a() {
        return this.d.f7335q0.n;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void h(a aVar, int i10) {
        a aVar2 = aVar;
        int i11 = this.d.f7335q0.f7350c.f7399j + i10;
        String string = aVar2.f7360u.getContext().getString(R.string.mtrl_picker_navigate_to_year_description);
        aVar2.f7360u.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i11)));
        aVar2.f7360u.setContentDescription(String.format(string, Integer.valueOf(i11)));
        c cVar = this.d.f7338t0;
        Calendar d = y.d();
        b bVar = d.get(1) == i11 ? cVar.f7370f : cVar.d;
        for (Long l10 : this.d.f7334p0.c0()) {
            d.setTimeInMillis(l10.longValue());
            if (d.get(1) == i11) {
                bVar = cVar.f7369e;
            }
        }
        bVar.b(aVar2.f7360u);
        aVar2.f7360u.setOnClickListener(new z(this, i11));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public a i(ViewGroup viewGroup, int i10) {
        return new a((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }

    public int m(int i10) {
        return i10 - this.d.f7335q0.f7350c.f7399j;
    }
}
