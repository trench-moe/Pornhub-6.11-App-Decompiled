package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class y {

    /* renamed from: a  reason: collision with root package name */
    public static AtomicReference<x> f7420a = new AtomicReference<>();

    public static long a(long j10) {
        Calendar e10 = e();
        e10.setTimeInMillis(j10);
        return b(e10).getTimeInMillis();
    }

    public static Calendar b(Calendar calendar) {
        Calendar f10 = f(calendar);
        Calendar e10 = e();
        e10.set(f10.get(1), f10.get(2), f10.get(5));
        return e10;
    }

    public static TimeZone c() {
        return TimeZone.getTimeZone("UTC");
    }

    public static Calendar d() {
        x xVar = f7420a.get();
        if (xVar == null) {
            xVar = x.f7417c;
        }
        TimeZone timeZone = xVar.f7419b;
        Calendar calendar = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l10 = xVar.f7418a;
        if (l10 != null) {
            calendar.setTimeInMillis(l10.longValue());
        }
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.setTimeZone(c());
        return calendar;
    }

    public static Calendar e() {
        return f(null);
    }

    public static Calendar f(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(c());
        if (calendar == null) {
            calendar2.clear();
        } else {
            calendar2.setTimeInMillis(calendar.getTimeInMillis());
        }
        return calendar2;
    }
}
