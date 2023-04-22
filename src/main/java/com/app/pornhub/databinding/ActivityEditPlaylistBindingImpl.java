package com.app.pornhub.databinding;

import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.c;
import com.app.pornhub.R;

/* loaded from: classes.dex */
public class ActivityEditPlaylistBindingImpl extends ActivityEditPlaylistBinding {

    /* renamed from: l  reason: collision with root package name */
    public long f4377l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityEditPlaylistBindingImpl(c cVar, View view) {
        super(cVar, view, 0);
        Object[] k10 = ViewDataBinding.k(cVar, view, 1, null);
        this.f4377l = -1L;
        ((LinearLayout) k10[0]).setTag(null);
        view.setTag(R.id.dataBinding, this);
        synchronized (this) {
            this.f4377l = 1L;
        }
        m();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void e() {
        synchronized (this) {
            this.f4377l = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean g() {
        synchronized (this) {
            return this.f4377l != 0;
        }
    }
}
