package com.app.pornhub.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.app.pornhub.R;
import java.util.Objects;
import x1.a;

/* loaded from: classes.dex */
public final class IncludeDialogFavoriteBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f4697a;

    public IncludeDialogFavoriteBinding(TextView textView, TextView textView2) {
        this.f4697a = textView;
    }

    public static IncludeDialogFavoriteBinding bind(View view) {
        Objects.requireNonNull(view, "rootView");
        TextView textView = (TextView) view;
        return new IncludeDialogFavoriteBinding(textView, textView);
    }

    public static IncludeDialogFavoriteBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.include_dialog_favorite, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4697a;
    }
}
