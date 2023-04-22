package com.app.pornhub.databinding;

import a0.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.app.pornhub.R;
import x1.a;

/* loaded from: classes.dex */
public final class ActivityPreferencesBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final LinearLayout f4465a;

    public ActivityPreferencesBinding(LinearLayout linearLayout, Toolbar toolbar, TextView textView) {
        this.f4465a = linearLayout;
    }

    public static ActivityPreferencesBinding bind(View view) {
        int i10 = R.id.toolbar;
        Toolbar toolbar = (Toolbar) b.t(view, R.id.toolbar);
        if (toolbar != null) {
            i10 = R.id.toolbar_title;
            TextView textView = (TextView) b.t(view, R.id.toolbar_title);
            if (textView != null) {
                return new ActivityPreferencesBinding((LinearLayout) view, toolbar, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ActivityPreferencesBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.activity_preferences, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4465a;
    }
}
