package com.google.android.material.tabs;

import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes.dex */
public class b implements View.OnLayoutChangeListener {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f7742c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ TabLayout.i f7743f;

    public b(TabLayout.i iVar, View view) {
        this.f7743f = iVar;
        this.f7742c = view;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        if (this.f7742c.getVisibility() == 0) {
            this.f7743f.e(this.f7742c);
        }
    }
}
