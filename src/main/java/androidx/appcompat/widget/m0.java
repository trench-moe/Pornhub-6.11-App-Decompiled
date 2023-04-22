package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;

/* loaded from: classes.dex */
public class m0 extends ContextWrapper {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f1041a = new Object();

    public static Context a(Context context) {
        if (!(context instanceof m0) && !(context.getResources() instanceof o0)) {
            context.getResources();
            int i10 = w0.f1139a;
        }
        return context;
    }
}
