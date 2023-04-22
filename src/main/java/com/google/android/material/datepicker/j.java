package com.google.android.material.datepicker;

import android.view.View;
import com.google.android.material.datepicker.MaterialCalendar;

/* loaded from: classes.dex */
public class j implements View.OnClickListener {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ MaterialCalendar f7384c;

    public j(MaterialCalendar materialCalendar) {
        this.f7384c = materialCalendar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        MaterialCalendar materialCalendar = this.f7384c;
        MaterialCalendar.CalendarSelector calendarSelector = MaterialCalendar.CalendarSelector.DAY;
        MaterialCalendar.CalendarSelector calendarSelector2 = materialCalendar.f7337s0;
        MaterialCalendar.CalendarSelector calendarSelector3 = MaterialCalendar.CalendarSelector.YEAR;
        if (calendarSelector2 == calendarSelector3) {
            materialCalendar.O0(calendarSelector);
        } else if (calendarSelector2 == calendarSelector) {
            materialCalendar.O0(calendarSelector3);
        }
    }
}
