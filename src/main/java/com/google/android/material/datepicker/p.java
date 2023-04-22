package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class p<S> extends v<S> {

    /* renamed from: o0  reason: collision with root package name */
    public int f7393o0;

    /* renamed from: p0  reason: collision with root package name */
    public d<S> f7394p0;

    /* renamed from: q0  reason: collision with root package name */
    public com.google.android.material.datepicker.a f7395q0;

    /* loaded from: classes.dex */
    public class a extends u<S> {
        public a() {
        }

        @Override // com.google.android.material.datepicker.u
        public void a(S s10) {
            Iterator<u<S>> it = p.this.f7416n0.iterator();
            while (it.hasNext()) {
                it.next().a(s10);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void U(Bundle bundle) {
        super.U(bundle);
        if (bundle == null) {
            bundle = this.f2019u;
        }
        this.f7393o0 = bundle.getInt("THEME_RES_ID_KEY");
        this.f7394p0 = (d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f7395q0 = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public View W(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.f7394p0.P(layoutInflater.cloneInContext(new ContextThemeWrapper(q(), this.f7393o0)), viewGroup, bundle, this.f7395q0, new a());
    }

    @Override // androidx.fragment.app.Fragment
    public void h0(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f7393o0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f7394p0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f7395q0);
    }
}
