package androidx.core.mh;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.i;
import androidx.lifecycle.k;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
final class ImmLeaksCleaner implements i {

    /* renamed from: b  reason: collision with root package name */
    public static int f1838b;

    /* renamed from: c  reason: collision with root package name */
    public static Field f1839c;
    public static Field d;

    /* renamed from: e  reason: collision with root package name */
    public static Field f1840e;

    /* renamed from: a  reason: collision with root package name */
    public Activity f1841a;

    public ImmLeaksCleaner(Activity activity) {
        this.f1841a = activity;
    }

    @Override // androidx.lifecycle.i
    public void c(k kVar, Lifecycle.Event event) {
        if (event != Lifecycle.Event.ON_DESTROY) {
            return;
        }
        if (f1838b == 0) {
            try {
                f1838b = 2;
                Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
                d = declaredField;
                declaredField.setAccessible(true);
                Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
                f1840e = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
                f1839c = declaredField3;
                declaredField3.setAccessible(true);
                f1838b = 1;
            } catch (NoSuchFieldException unused) {
            }
        }
        if (f1838b == 1) {
            InputMethodManager inputMethodManager = (InputMethodManager) this.f1841a.getSystemService("input_method");
            try {
                Object obj = f1839c.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        try {
                            View view = (View) d.get(inputMethodManager);
                            if (view == null) {
                                return;
                            }
                            if (view.isAttachedToWindow()) {
                                return;
                            }
                            try {
                                f1840e.set(inputMethodManager, null);
                                inputMethodManager.isActive();
                            } catch (IllegalAccessException unused2) {
                            }
                        } catch (ClassCastException unused3) {
                        } catch (IllegalAccessException unused4) {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (IllegalAccessException unused5) {
            }
        }
    }
}
