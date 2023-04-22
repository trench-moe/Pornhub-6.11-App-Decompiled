package com.app.pornhub.databinding;

import android.view.LayoutInflater;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.b;
import androidx.databinding.d;
import com.app.pornhub.R;

/* loaded from: classes.dex */
public abstract class ActivityEditPlaylistBinding extends ViewDataBinding {
    public ActivityEditPlaylistBinding(Object obj, View view, int i10) {
        super(obj, view, i10);
    }

    public static ActivityEditPlaylistBinding bind(View view) {
        b bVar = d.f1907a;
        return (ActivityEditPlaylistBinding) ViewDataBinding.c(null, view, R.layout.activity_edit_playlist);
    }

    public static ActivityEditPlaylistBinding inflate(LayoutInflater layoutInflater) {
        b bVar = d.f1907a;
        return (ActivityEditPlaylistBinding) ViewDataBinding.h(layoutInflater, R.layout.activity_edit_playlist, null, false, null);
    }
}
