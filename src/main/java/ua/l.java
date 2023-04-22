package ua;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* loaded from: classes2.dex */
public final class l implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f15818c;

    public l(View view) {
        this.f15818c = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        ((InputMethodManager) this.f15818c.getContext().getSystemService("input_method")).showSoftInput(this.f15818c, 1);
    }
}
