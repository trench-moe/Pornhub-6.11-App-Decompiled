package com.app.pornhub.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.app.pornhub.R;
import java.util.Objects;
import x1.a;

/* loaded from: classes.dex */
public final class SpinnerVideoFilterItemBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f4892a;

    public SpinnerVideoFilterItemBinding(TextView textView, TextView textView2) {
        this.f4892a = textView;
    }

    public static SpinnerVideoFilterItemBinding bind(View view) {
        Objects.requireNonNull(view, "rootView");
        TextView textView = (TextView) view;
        return new SpinnerVideoFilterItemBinding(textView, textView);
    }

    public static SpinnerVideoFilterItemBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.spinner_video_filter_item, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4892a;
    }
}
