package com.google.android.material.datepicker;

import android.view.View;
import com.app.pornhub.R;

/* loaded from: classes.dex */
public class h extends n0.a {
    public final /* synthetic */ MaterialCalendar d;

    public h(MaterialCalendar materialCalendar) {
        this.d = materialCalendar;
    }

    @Override // n0.a
    public void d(View view, o0.b bVar) {
        this.f13090a.onInitializeAccessibilityNodeInfo(view, bVar.f13479a);
        bVar.s(this.d.f7341x0.getVisibility() == 0 ? this.d.I(R.string.mtrl_picker_toggle_to_year_selection) : this.d.I(R.string.mtrl_picker_toggle_to_day_selection));
    }
}
