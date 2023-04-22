package e9;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* loaded from: classes.dex */
public interface f {
    void d(String str, LifecycleCallback lifecycleCallback);

    <T extends LifecycleCallback> T f(String str, Class<T> cls);

    Activity g();

    void startActivityForResult(Intent intent, int i10);
}
