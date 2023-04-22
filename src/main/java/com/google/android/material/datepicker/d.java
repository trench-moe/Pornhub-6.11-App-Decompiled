package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Collection;

/* loaded from: classes.dex */
public interface d<S> extends Parcelable {
    View P(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, a aVar, u<S> uVar);

    int X(Context context);

    boolean Z();

    Collection<Long> c0();

    S f0();

    void j0(long j10);

    String s(Context context);

    Collection<m0.b<Long, Long>> w();
}
