package com.app.pornhub.databinding;

import a0.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.app.pornhub.R;
import com.app.pornhub.view.common.widget.CategoryImageViewCustom;
import x1.a;

/* loaded from: classes.dex */
public final class FragmentCategoriesGridItemBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final LinearLayout f4561a;

    public FragmentCategoriesGridItemBinding(LinearLayout linearLayout, CategoryImageViewCustom categoryImageViewCustom, LinearLayout linearLayout2, ImageView imageView, TextView textView, TextView textView2, ImageView imageView2) {
        this.f4561a = linearLayout;
    }

    public static FragmentCategoriesGridItemBinding bind(View view) {
        int i10 = R.id.categoryImage;
        CategoryImageViewCustom categoryImageViewCustom = (CategoryImageViewCustom) b.t(view, R.id.categoryImage);
        if (categoryImageViewCustom != null) {
            i10 = R.id.categorySelectionContainer;
            LinearLayout linearLayout = (LinearLayout) b.t(view, R.id.categorySelectionContainer);
            if (linearLayout != null) {
                i10 = R.id.categorySelectionImage;
                ImageView imageView = (ImageView) b.t(view, R.id.categorySelectionImage);
                if (imageView != null) {
                    i10 = R.id.categorySelectionText;
                    TextView textView = (TextView) b.t(view, R.id.categorySelectionText);
                    if (textView != null) {
                        i10 = R.id.categoryTitle;
                        TextView textView2 = (TextView) b.t(view, R.id.categoryTitle);
                        if (textView2 != null) {
                            i10 = R.id.icVerified;
                            ImageView imageView2 = (ImageView) b.t(view, R.id.icVerified);
                            if (imageView2 != null) {
                                return new FragmentCategoriesGridItemBinding((LinearLayout) view, categoryImageViewCustom, linearLayout, imageView, textView, textView2, imageView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentCategoriesGridItemBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_categories_grid_item, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4561a;
    }
}
