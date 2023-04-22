package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendar;
import java.util.Iterator;

/* loaded from: classes.dex */
public class s implements AdapterView.OnItemClickListener {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ MaterialCalendarGridView f7408c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ t f7409f;

    public s(t tVar, MaterialCalendarGridView materialCalendarGridView) {
        this.f7409f = tVar;
        this.f7408c = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
        r adapter2 = this.f7408c.getAdapter2();
        if (i10 >= adapter2.b() && i10 <= adapter2.d()) {
            MaterialCalendar.e eVar = this.f7409f.f7412g;
            long longValue = this.f7408c.getAdapter2().getItem(i10).longValue();
            MaterialCalendar.d dVar = (MaterialCalendar.d) eVar;
            if (MaterialCalendar.this.f7335q0.f7352j.Y(longValue)) {
                MaterialCalendar.this.f7334p0.j0(longValue);
                Iterator it = MaterialCalendar.this.f7416n0.iterator();
                while (it.hasNext()) {
                    ((u) it.next()).a(MaterialCalendar.this.f7334p0.f0());
                }
                MaterialCalendar.this.f7340v0.getAdapter().f2802a.b();
                RecyclerView recyclerView = MaterialCalendar.this.f7339u0;
                if (recyclerView != null) {
                    recyclerView.getAdapter().f2802a.b();
                }
            }
        }
    }
}
