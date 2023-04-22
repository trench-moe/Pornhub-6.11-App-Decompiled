package v8;

import android.content.Context;
import java.util.Objects;

/* loaded from: classes2.dex */
public abstract class i {

    /* renamed from: a  reason: collision with root package name */
    public final Context f16098a;

    /* renamed from: b  reason: collision with root package name */
    public final String f16099b;

    /* renamed from: c  reason: collision with root package name */
    public final a0 f16100c = new a0(this);

    public i(Context context, String str) {
        Objects.requireNonNull(context, "null reference");
        this.f16098a = context.getApplicationContext();
        h9.o.e(str);
        this.f16099b = str;
    }

    public abstract f a(String str);

    public abstract boolean b();
}
