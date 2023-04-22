package com.google.android.material.datepicker;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.app.pornhub.R;
import java.util.Calendar;
import java.util.Locale;

/* loaded from: classes.dex */
public class f extends BaseAdapter {

    /* renamed from: m  reason: collision with root package name */
    public static final int f7374m;

    /* renamed from: c  reason: collision with root package name */
    public final Calendar f7375c;

    /* renamed from: f  reason: collision with root package name */
    public final int f7376f;

    /* renamed from: j  reason: collision with root package name */
    public final int f7377j;

    static {
        f7374m = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public f() {
        Calendar e10 = y.e();
        this.f7375c = e10;
        this.f7376f = e10.getMaximum(7);
        this.f7377j = e10.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f7376f;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i10) {
        int i11 = this.f7376f;
        if (i10 >= i11) {
            return null;
        }
        int i12 = i10 + this.f7377j;
        if (i12 > i11) {
            i12 -= i11;
        }
        return Integer.valueOf(i12);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return 0L;
    }

    @Override // android.widget.Adapter
    @SuppressLint({"WrongConstant"})
    public View getView(int i10, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        Calendar calendar = this.f7375c;
        int i11 = i10 + this.f7377j;
        int i12 = this.f7376f;
        if (i11 > i12) {
            i11 -= i12;
        }
        calendar.set(7, i11);
        textView.setText(this.f7375c.getDisplayName(7, f7374m, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), this.f7375c.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }
}
