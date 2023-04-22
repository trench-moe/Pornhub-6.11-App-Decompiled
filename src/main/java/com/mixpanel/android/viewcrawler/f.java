package com.mixpanel.android.viewcrawler;

import android.view.View;
import com.mixpanel.android.viewcrawler.e;
import java.util.Comparator;

/* loaded from: classes.dex */
public class f implements Comparator<View> {
    public f(e.h hVar) {
    }

    @Override // java.util.Comparator
    public int compare(View view, View view2) {
        View view3 = view;
        View view4 = view2;
        if (view3 == view4) {
            return 0;
        }
        if (view3 == null) {
            return -1;
        }
        if (view4 == null) {
            return 1;
        }
        return view4.hashCode() - view3.hashCode();
    }
}
