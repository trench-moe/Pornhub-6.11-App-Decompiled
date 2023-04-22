package com.app.pornhub.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.b;
import androidx.databinding.d;
import com.app.pornhub.R;
import com.app.pornhub.domain.model.playlist.Playlist;
import com.app.pornhub.view.playlistdetails.PlaylistDetailsActivity;
import com.app.pornhub.view.playlistdetails.PlaylistDetailsViewModel;

/* loaded from: classes.dex */
public abstract class ActivityPlaylistDetailsBinding extends ViewDataBinding {

    /* renamed from: l  reason: collision with root package name */
    public final IncludeErrorBinding f4452l;

    /* renamed from: m  reason: collision with root package name */
    public final ImageView f4453m;
    public final ImageView n;

    /* renamed from: o  reason: collision with root package name */
    public final ImageView f4454o;

    /* renamed from: p  reason: collision with root package name */
    public final ImageView f4455p;

    /* renamed from: q  reason: collision with root package name */
    public final TextView f4456q;

    /* renamed from: r  reason: collision with root package name */
    public final TextView f4457r;

    /* renamed from: s  reason: collision with root package name */
    public final TextView f4458s;

    /* renamed from: t  reason: collision with root package name */
    public final TextView f4459t;

    /* renamed from: u  reason: collision with root package name */
    public final FrameLayout f4460u;

    /* renamed from: v  reason: collision with root package name */
    public PlaylistDetailsViewModel f4461v;

    /* renamed from: w  reason: collision with root package name */
    public PlaylistDetailsActivity.a f4462w;

    /* renamed from: x  reason: collision with root package name */
    public Playlist f4463x;

    public ActivityPlaylistDetailsBinding(Object obj, View view, int i10, IncludeErrorBinding includeErrorBinding, Guideline guideline, Guideline guideline2, ImageView imageView, View view2, ImageView imageView2, ImageView imageView3, ImageView imageView4, TextView textView, TextView textView2, TextView textView3, TextView textView4, FrameLayout frameLayout) {
        super(obj, view, i10);
        this.f4452l = includeErrorBinding;
        this.f4453m = imageView;
        this.n = imageView2;
        this.f4454o = imageView3;
        this.f4455p = imageView4;
        this.f4456q = textView;
        this.f4457r = textView2;
        this.f4458s = textView3;
        this.f4459t = textView4;
        this.f4460u = frameLayout;
    }

    public static ActivityPlaylistDetailsBinding bind(View view) {
        b bVar = d.f1907a;
        return (ActivityPlaylistDetailsBinding) ViewDataBinding.c(null, view, R.layout.activity_playlist_details);
    }

    public static ActivityPlaylistDetailsBinding inflate(LayoutInflater layoutInflater) {
        b bVar = d.f1907a;
        return (ActivityPlaylistDetailsBinding) ViewDataBinding.h(layoutInflater, R.layout.activity_playlist_details, null, false, null);
    }

    public abstract void n(PlaylistDetailsActivity.a aVar);

    public abstract void o(Playlist playlist);

    public abstract void p(PlaylistDetailsViewModel playlistDetailsViewModel);
}
