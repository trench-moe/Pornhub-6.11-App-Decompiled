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
public final class ItemSearchSuggestionHeaderBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final ConstraintLayout f4792a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f4793b;

    public ItemSearchSuggestionHeaderBinding(ConstraintLayout constraintLayout, TextView textView) {
        this.f4792a = constraintLayout;
        this.f4793b = textView;
    }

    public static ItemSearchSuggestionHeaderBinding bind(View view) {
        TextView textView = (TextView) b.t(view, R.id.text);
        if (textView != null) {
            return new ItemSearchSuggestionHeaderBinding((ConstraintLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.text)));
    }

    public static ItemSearchSuggestionHeaderBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.item_search_suggestion_header, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4792a;
    }
}
