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
public final class ItemSearchSuggestionBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final ConstraintLayout f4787a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f4788b;

    public ItemSearchSuggestionBinding(ConstraintLayout constraintLayout, TextView textView) {
        this.f4787a = constraintLayout;
        this.f4788b = textView;
    }

    public static ItemSearchSuggestionBinding bind(View view) {
        TextView textView = (TextView) b.t(view, R.id.text);
        if (textView != null) {
            return new ItemSearchSuggestionBinding((ConstraintLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.text)));
    }

    public static ItemSearchSuggestionBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.item_search_suggestion, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4787a;
    }
}
