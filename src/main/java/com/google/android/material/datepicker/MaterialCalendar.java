package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.app.pornhub.R;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes.dex */
public final class MaterialCalendar<S> extends v<S> {

    /* renamed from: y0  reason: collision with root package name */
    public static final /* synthetic */ int f7332y0 = 0;

    /* renamed from: o0  reason: collision with root package name */
    public int f7333o0;

    /* renamed from: p0  reason: collision with root package name */
    public com.google.android.material.datepicker.d<S> f7334p0;

    /* renamed from: q0  reason: collision with root package name */
    public com.google.android.material.datepicker.a f7335q0;

    /* renamed from: r0  reason: collision with root package name */
    public q f7336r0;

    /* renamed from: s0  reason: collision with root package name */
    public CalendarSelector f7337s0;

    /* renamed from: t0  reason: collision with root package name */
    public com.google.android.material.datepicker.c f7338t0;

    /* renamed from: u0  reason: collision with root package name */
    public RecyclerView f7339u0;

    /* renamed from: v0  reason: collision with root package name */
    public RecyclerView f7340v0;
    public View w0;

    /* renamed from: x0  reason: collision with root package name */
    public View f7341x0;

    /* loaded from: classes.dex */
    public enum CalendarSelector {
        DAY,
        YEAR
    }

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ int f7345c;

        public a(int i10) {
            this.f7345c = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            MaterialCalendar.this.f7340v0.l0(this.f7345c);
        }
    }

    /* loaded from: classes.dex */
    public class b extends n0.a {
        public b(MaterialCalendar materialCalendar) {
        }

        @Override // n0.a
        public void d(View view, o0.b bVar) {
            this.f13090a.onInitializeAccessibilityNodeInfo(view, bVar.f13479a);
            bVar.q(null);
        }
    }

    /* loaded from: classes.dex */
    public class c extends w {
        public final /* synthetic */ int E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context, int i10, boolean z10, int i11) {
            super(context, i10, z10);
            this.E = i11;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public void M0(RecyclerView.w wVar, int[] iArr) {
            if (this.E == 0) {
                iArr[0] = MaterialCalendar.this.f7340v0.getWidth();
                iArr[1] = MaterialCalendar.this.f7340v0.getWidth();
                return;
            }
            iArr[0] = MaterialCalendar.this.f7340v0.getHeight();
            iArr[1] = MaterialCalendar.this.f7340v0.getHeight();
        }
    }

    /* loaded from: classes.dex */
    public class d implements e {
        public d() {
        }
    }

    /* loaded from: classes.dex */
    public interface e {
    }

    @Override // com.google.android.material.datepicker.v
    public boolean K0(u<S> uVar) {
        return this.f7416n0.add(uVar);
    }

    public LinearLayoutManager L0() {
        return (LinearLayoutManager) this.f7340v0.getLayoutManager();
    }

    public final void M0(int i10) {
        this.f7340v0.post(new a(i10));
    }

    public void N0(q qVar) {
        t tVar = (t) this.f7340v0.getAdapter();
        int h10 = tVar.f7410e.f7350c.h(qVar);
        int n = h10 - tVar.n(this.f7336r0);
        boolean z10 = Math.abs(n) > 3;
        boolean z11 = n > 0;
        this.f7336r0 = qVar;
        if (z10 && z11) {
            this.f7340v0.g0(h10 - 3);
            M0(h10);
        } else if (!z10) {
            M0(h10);
        } else {
            this.f7340v0.g0(h10 + 3);
            M0(h10);
        }
    }

    public void O0(CalendarSelector calendarSelector) {
        this.f7337s0 = calendarSelector;
        if (calendarSelector == CalendarSelector.YEAR) {
            this.f7339u0.getLayoutManager().y0(((a0) this.f7339u0.getAdapter()).m(this.f7336r0.f7399j));
            this.w0.setVisibility(0);
            this.f7341x0.setVisibility(8);
            return;
        }
        if (calendarSelector == CalendarSelector.DAY) {
            this.w0.setVisibility(8);
            this.f7341x0.setVisibility(0);
            N0(this.f7336r0);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void U(Bundle bundle) {
        super.U(bundle);
        if (bundle == null) {
            bundle = this.f2019u;
        }
        this.f7333o0 = bundle.getInt("THEME_RES_ID_KEY");
        this.f7334p0 = (com.google.android.material.datepicker.d) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.f7335q0 = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f7336r0 = (q) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public View W(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10;
        int i11;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(q(), this.f7333o0);
        this.f7338t0 = new com.google.android.material.datepicker.c(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        q qVar = this.f7335q0.f7350c;
        if (m.T0(contextThemeWrapper)) {
            i10 = R.layout.mtrl_calendar_vertical;
            i11 = 1;
        } else {
            i10 = R.layout.mtrl_calendar_horizontal;
            i11 = 0;
        }
        View inflate = cloneInContext.inflate(i10, viewGroup, false);
        Resources resources = u0().getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_top_padding) + dimensionPixelSize;
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_days_of_week_height);
        int i12 = r.f7403t;
        int i13 = dimensionPixelOffset + dimensionPixelSize2;
        inflate.setMinimumHeight(i13 + (resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_vertical_padding) * (i12 - 1)) + (resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * i12) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) inflate.findViewById(R.id.mtrl_calendar_days_of_week);
        n0.x.v(gridView, new b(this));
        gridView.setAdapter((ListAdapter) new f());
        gridView.setNumColumns(qVar.f7400m);
        gridView.setEnabled(false);
        this.f7340v0 = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_months);
        this.f7340v0.setLayoutManager(new c(q(), i11, false, i11));
        this.f7340v0.setTag("MONTHS_VIEW_GROUP_TAG");
        t tVar = new t(contextThemeWrapper, this.f7334p0, this.f7335q0, new d());
        this.f7340v0.setAdapter(tVar);
        int integer = contextThemeWrapper.getResources().getInteger(R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
        this.f7339u0 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f7339u0.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.f7339u0.setAdapter(new a0(this));
            this.f7339u0.g(new g(this));
        }
        if (inflate.findViewById(R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(R.id.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            n0.x.v(materialButton, new h(this));
            MaterialButton materialButton2 = (MaterialButton) inflate.findViewById(R.id.month_navigation_previous);
            materialButton2.setTag("NAVIGATION_PREV_TAG");
            MaterialButton materialButton3 = (MaterialButton) inflate.findViewById(R.id.month_navigation_next);
            materialButton3.setTag("NAVIGATION_NEXT_TAG");
            this.w0 = inflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
            this.f7341x0 = inflate.findViewById(R.id.mtrl_calendar_day_selector_frame);
            O0(CalendarSelector.DAY);
            materialButton.setText(this.f7336r0.f(inflate.getContext()));
            this.f7340v0.h(new i(this, tVar, materialButton));
            materialButton.setOnClickListener(new j(this));
            materialButton3.setOnClickListener(new k(this, tVar));
            materialButton2.setOnClickListener(new l(this, tVar));
        }
        if (!m.T0(contextThemeWrapper)) {
            new androidx.recyclerview.widget.z().a(this.f7340v0);
        }
        this.f7340v0.g0(tVar.n(this.f7336r0));
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void h0(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f7333o0);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f7334p0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f7335q0);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f7336r0);
    }
}
