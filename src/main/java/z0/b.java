package z0;

import android.annotation.SuppressLint;
import android.text.Editable;
import androidx.emoji2.text.n;

/* loaded from: classes2.dex */
public final class b extends Editable.Factory {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f18669a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static volatile Editable.Factory f18670b;

    /* renamed from: c  reason: collision with root package name */
    public static Class<?> f18671c;

    @SuppressLint({"PrivateApi"})
    public b() {
        try {
            f18671c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, b.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    @Override // android.text.Editable.Factory
    public Editable newEditable(CharSequence charSequence) {
        Class<?> cls = f18671c;
        return cls != null ? new n(cls, charSequence) : super.newEditable(charSequence);
    }
}
