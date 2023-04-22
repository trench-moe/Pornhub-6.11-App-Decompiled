package com.google.android.material.datepicker;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class w extends LinearLayoutManager {

    /* loaded from: classes.dex */
    public class a extends androidx.recyclerview.widget.r {
        public a(w wVar, Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.r
        public float i(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }
    }

    public w(Context context, int i10, boolean z10) {
        super(i10, z10);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.l
    public void J0(RecyclerView recyclerView, RecyclerView.w wVar, int i10) {
        a aVar = new a(this, recyclerView.getContext());
        aVar.f2853a = i10;
        K0(aVar);
    }
}
