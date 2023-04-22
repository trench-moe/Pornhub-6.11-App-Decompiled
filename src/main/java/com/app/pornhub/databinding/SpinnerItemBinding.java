package com.app.pornhub.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.app.pornhub.R;
import java.util.Objects;
import x1.a;

/* loaded from: classes.dex */
public final class SpinnerItemBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f4891a;

    public SpinnerItemBinding(TextView textView, TextView textView2) {
        this.f4891a = textView;
    }

    public static SpinnerItemBinding bind(View view) {
        Objects.requireNonNull(view, "rootView");
        TextView textView = (TextView) view;
        return new SpinnerItemBinding(textView, textView);
    }

    public static SpinnerItemBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.spinner_item, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4891a;
    }
}
