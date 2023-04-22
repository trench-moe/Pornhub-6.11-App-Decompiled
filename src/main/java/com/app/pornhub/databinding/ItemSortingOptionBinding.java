package com.app.pornhub.databinding;

import a0.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.app.pornhub.R;
import x1.a;

/* loaded from: classes.dex */
public final class ItemSortingOptionBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final ConstraintLayout f4795a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f4796b;

    public ItemSortingOptionBinding(ConstraintLayout constraintLayout, TextView textView) {
        this.f4795a = constraintLayout;
        this.f4796b = textView;
    }

    public static ItemSortingOptionBinding bind(View view) {
        TextView textView = (TextView) b.t(view, R.id.text);
        if (textView != null) {
            return new ItemSortingOptionBinding((ConstraintLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.text)));
    }

    public static ItemSortingOptionBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.item_sorting_option, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4795a;
    }
}
