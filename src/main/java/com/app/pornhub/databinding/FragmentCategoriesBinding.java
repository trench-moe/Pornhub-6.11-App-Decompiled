package com.app.pornhub.databinding;

import a0.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.app.pornhub.R;
import x1.a;

/* loaded from: classes.dex */
public final class FragmentCategoriesBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final ConstraintLayout f4560a;

    public FragmentCategoriesBinding(ConstraintLayout constraintLayout, LinearLayout linearLayout, ProgressBar progressBar, RecyclerView recyclerView, LinearLayout linearLayout2, TextView textView, TextView textView2) {
        this.f4560a = constraintLayout;
    }

    public static FragmentCategoriesBinding bind(View view) {
        int i10 = R.id.categoriesBottomContainer;
        LinearLayout linearLayout = (LinearLayout) b.t(view, R.id.categoriesBottomContainer);
        if (linearLayout != null) {
            i10 = R.id.categoriesProgressBar;
            ProgressBar progressBar = (ProgressBar) b.t(view, R.id.categoriesProgressBar);
            if (progressBar != null) {
                i10 = R.id.categoriesRecyclerView;
                RecyclerView recyclerView = (RecyclerView) b.t(view, R.id.categoriesRecyclerView);
                if (recyclerView != null) {
                    i10 = R.id.fragment_category_list_llyApplyAndGo;
                    LinearLayout linearLayout2 = (LinearLayout) b.t(view, R.id.fragment_category_list_llyApplyAndGo);
                    if (linearLayout2 != null) {
                        i10 = R.id.fragment_category_list_txtClear;
                        TextView textView = (TextView) b.t(view, R.id.fragment_category_list_txtClear);
                        if (textView != null) {
                            i10 = R.id.fragment_category_list_txtCount;
                            TextView textView2 = (TextView) b.t(view, R.id.fragment_category_list_txtCount);
                            if (textView2 != null) {
                                return new FragmentCategoriesBinding((ConstraintLayout) view, linearLayout, progressBar, recyclerView, linearLayout2, textView, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentCategoriesBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_categories, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4560a;
    }
}
