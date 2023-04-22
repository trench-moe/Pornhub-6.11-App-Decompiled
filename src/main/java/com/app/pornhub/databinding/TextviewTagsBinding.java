package com.app.pornhub.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.app.pornhub.R;
import java.util.Objects;
import x1.a;

/* loaded from: classes.dex */
public final class TextviewTagsBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f4894a;

    public TextviewTagsBinding(TextView textView) {
        this.f4894a = textView;
    }

    public static TextviewTagsBinding bind(View view) {
        Objects.requireNonNull(view, "rootView");
        return new TextviewTagsBinding((TextView) view);
    }

    public static TextviewTagsBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.textview_tags, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4894a;
    }
}
