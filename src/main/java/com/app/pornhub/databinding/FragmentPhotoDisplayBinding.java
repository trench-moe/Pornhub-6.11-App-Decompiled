package com.app.pornhub.databinding;

import a0.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.app.pornhub.R;
import com.github.chrisbanes.photoview.PhotoView;
import x1.a;

/* loaded from: classes.dex */
public final class FragmentPhotoDisplayBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final RelativeLayout f4640a;

    /* renamed from: b  reason: collision with root package name */
    public final PhotoView f4641b;

    /* renamed from: c  reason: collision with root package name */
    public final IncludeErrorBinding f4642c;
    public final ProgressBar d;

    public FragmentPhotoDisplayBinding(RelativeLayout relativeLayout, PhotoView photoView, IncludeErrorBinding includeErrorBinding, ProgressBar progressBar) {
        this.f4640a = relativeLayout;
        this.f4641b = photoView;
        this.f4642c = includeErrorBinding;
        this.d = progressBar;
    }

    public static FragmentPhotoDisplayBinding bind(View view) {
        int i10 = R.id.photo;
        PhotoView photoView = (PhotoView) b.t(view, R.id.photo);
        if (photoView != null) {
            i10 = R.id.photoDisplayErrorLayout;
            View t2 = b.t(view, R.id.photoDisplayErrorLayout);
            if (t2 != null) {
                IncludeErrorBinding bind = IncludeErrorBinding.bind(t2);
                ProgressBar progressBar = (ProgressBar) b.t(view, R.id.progressBar);
                if (progressBar != null) {
                    return new FragmentPhotoDisplayBinding((RelativeLayout) view, photoView, bind, progressBar);
                }
                i10 = R.id.progressBar;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentPhotoDisplayBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_photo_display, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4640a;
    }
}
