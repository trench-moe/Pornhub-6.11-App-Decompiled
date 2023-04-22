package okhttp3.logging;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.logging.HttpLoggingInterceptor;
import xe.h;

/* loaded from: classes3.dex */
public final class a implements HttpLoggingInterceptor.a {
    @Override // okhttp3.logging.HttpLoggingInterceptor.a
    public void a(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        h.a aVar = h.f18380c;
        h.j(h.f18378a, message, 0, null, 6, null);
    }
}
