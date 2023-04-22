package com.app.pornhub.databinding;

import a0.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.app.pornhub.R;
import x1.a;

/* loaded from: classes.dex */
public final class SearchSuggestionsBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final LinearLayout f4889a;

    public SearchSuggestionsBinding(LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3) {
        this.f4889a = linearLayout;
    }

    public static SearchSuggestionsBinding bind(View view) {
        int i10 = R.id.text1;
        TextView textView = (TextView) b.t(view, R.id.text1);
        if (textView != null) {
            i10 = R.id.text2;
            TextView textView2 = (TextView) b.t(view, R.id.text2);
            if (textView2 != null) {
                i10 = R.id.text3;
                TextView textView3 = (TextView) b.t(view, R.id.text3);
                if (textView3 != null) {
                    return new SearchSuggestionsBinding((LinearLayout) view, textView, textView2, textView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static SearchSuggestionsBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.search_suggestions, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4889a;
    }
}
