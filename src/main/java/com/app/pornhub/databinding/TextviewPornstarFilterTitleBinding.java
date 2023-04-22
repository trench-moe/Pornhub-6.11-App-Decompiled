package com.app.pornhub.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.app.pornhub.R;
import java.util.Objects;
import x1.a;

/* loaded from: classes.dex */
public final class TextviewPornstarFilterTitleBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f4893a;

    public TextviewPornstarFilterTitleBinding(TextView textView) {
        this.f4893a = textView;
    }

    public static TextviewPornstarFilterTitleBinding bind(View view) {
        Objects.requireNonNull(view, "rootView");
        return new TextviewPornstarFilterTitleBinding((TextView) view);
    }

    public static TextviewPornstarFilterTitleBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.textview_pornstar_filter_title, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4893a;
    }
}
