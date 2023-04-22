package com.app.pornhub.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.b;
import androidx.databinding.d;
import com.app.pornhub.R;
import com.app.pornhub.domain.model.playlist.Playlist;

/* loaded from: classes.dex */
public abstract class ItemPlaylistBindingBinding extends ViewDataBinding {

    /* renamed from: l  reason: collision with root package name */
    public final ImageView f4747l;

    /* renamed from: m  reason: collision with root package name */
    public final ImageView f4748m;
    public final ImageView n;

    /* renamed from: o  reason: collision with root package name */
    public final TextView f4749o;

    /* renamed from: p  reason: collision with root package name */
    public final TextView f4750p;

    /* renamed from: q  reason: collision with root package name */
    public final View f4751q;

    /* renamed from: r  reason: collision with root package name */
    public final TextView f4752r;

    /* renamed from: s  reason: collision with root package name */
    public final ImageView f4753s;

    /* renamed from: t  reason: collision with root package name */
    public final TextView f4754t;

    /* renamed from: u  reason: collision with root package name */
    public final TextView f4755u;

    /* renamed from: v  reason: collision with root package name */
    public final TextView f4756v;

    /* renamed from: w  reason: collision with root package name */
    public final TextView f4757w;

    /* renamed from: x  reason: collision with root package name */
    public Playlist f4758x;

    public ItemPlaylistBindingBinding(Object obj, View view, int i10, Guideline guideline, Guideline guideline2, ImageView imageView, ImageView imageView2, ImageView imageView3, TextView textView, TextView textView2, ImageView imageView4, TextView textView3, Space space, Space space2, View view2, TextView textView4, ImageView imageView5, TextView textView5, TextView textView6, TextView textView7, TextView textView8) {
        super(obj, view, i10);
        this.f4747l = imageView;
        this.f4748m = imageView2;
        this.n = imageView3;
        this.f4749o = textView;
        this.f4750p = textView3;
        this.f4751q = view2;
        this.f4752r = textView4;
        this.f4753s = imageView5;
        this.f4754t = textView5;
        this.f4755u = textView6;
        this.f4756v = textView7;
        this.f4757w = textView8;
    }

    public static ItemPlaylistBindingBinding bind(View view) {
        b bVar = d.f1907a;
        return (ItemPlaylistBindingBinding) ViewDataBinding.c(null, view, R.layout.item_playlist_binding);
    }

    public static ItemPlaylistBindingBinding inflate(LayoutInflater layoutInflater) {
        b bVar = d.f1907a;
        return (ItemPlaylistBindingBinding) ViewDataBinding.h(layoutInflater, R.layout.item_playlist_binding, null, false, null);
    }

    public abstract void n(Playlist playlist);
}
