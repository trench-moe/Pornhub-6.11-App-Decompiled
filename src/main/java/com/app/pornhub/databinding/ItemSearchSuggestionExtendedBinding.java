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
public final class ItemSearchSuggestionExtendedBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final ConstraintLayout f4789a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f4790b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f4791c;

    public ItemSearchSuggestionExtendedBinding(ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.f4789a = constraintLayout;
        this.f4790b = textView3;
        this.f4791c = textView4;
    }

    public static ItemSearchSuggestionExtendedBinding a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.item_search_suggestion_extended, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemSearchSuggestionExtendedBinding bind(View view) {
        int i10 = R.id.labelDivider;
        TextView textView = (TextView) b.t(view, R.id.labelDivider);
        if (textView != null) {
            i10 = R.id.labelRank;
            TextView textView2 = (TextView) b.t(view, R.id.labelRank);
            if (textView2 != null) {
                i10 = R.id.text;
                TextView textView3 = (TextView) b.t(view, R.id.text);
                if (textView3 != null) {
                    i10 = R.id.textRank;
                    TextView textView4 = (TextView) b.t(view, R.id.textRank);
                    if (textView4 != null) {
                        return new ItemSearchSuggestionExtendedBinding((ConstraintLayout) view, textView, textView2, textView3, textView4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ItemSearchSuggestionExtendedBinding inflate(LayoutInflater layoutInflater) {
        return a(layoutInflater, null, false);
    }

    @Override // x1.a
    public View b() {
        return this.f4789a;
    }
}
