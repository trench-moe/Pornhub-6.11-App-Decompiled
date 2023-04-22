package com.app.pornhub.databinding;

import a0.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.app.pornhub.R;
import x1.a;

/* loaded from: classes.dex */
public final class ItemSearchSuggestionLineDividerBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final ConstraintLayout f4794a;

    public ItemSearchSuggestionLineDividerBinding(ConstraintLayout constraintLayout, View view) {
        this.f4794a = constraintLayout;
    }

    public static ItemSearchSuggestionLineDividerBinding bind(View view) {
        View t2 = b.t(view, R.id.line);
        if (t2 != null) {
            return new ItemSearchSuggestionLineDividerBinding((ConstraintLayout) view, t2);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.line)));
    }

    public static ItemSearchSuggestionLineDividerBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.item_search_suggestion_line_divider, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4794a;
    }
}
