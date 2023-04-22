package com.app.pornhub.databinding;

import a0.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.app.pornhub.R;
import x1.a;

/* loaded from: classes.dex */
public final class ExploreItemBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final ConstraintLayout f4512a;

    /* renamed from: b  reason: collision with root package name */
    public final ImageView f4513b;

    /* renamed from: c  reason: collision with root package name */
    public final RecyclerView f4514c;
    public final TextView d;

    /* renamed from: e  reason: collision with root package name */
    public final TextView f4515e;

    public ExploreItemBinding(ConstraintLayout constraintLayout, ImageView imageView, RecyclerView recyclerView, TextView textView, TextView textView2) {
        this.f4512a = constraintLayout;
        this.f4513b = imageView;
        this.f4514c = recyclerView;
        this.d = textView;
        this.f4515e = textView2;
    }

    public static ExploreItemBinding bind(View view) {
        int i10 = R.id.imgFlag;
        ImageView imageView = (ImageView) b.t(view, R.id.imgFlag);
        if (imageView != null) {
            i10 = R.id.recyclerViewItem;
            RecyclerView recyclerView = (RecyclerView) b.t(view, R.id.recyclerViewItem);
            if (recyclerView != null) {
                i10 = R.id.textViewSubtitle;
                TextView textView = (TextView) b.t(view, R.id.textViewSubtitle);
                if (textView != null) {
                    i10 = R.id.textViewTitle;
                    TextView textView2 = (TextView) b.t(view, R.id.textViewTitle);
                    if (textView2 != null) {
                        return new ExploreItemBinding((ConstraintLayout) view, imageView, recyclerView, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ExploreItemBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.explore_item, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4512a;
    }
}
