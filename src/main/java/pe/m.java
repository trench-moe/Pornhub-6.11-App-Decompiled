package pe;

import java.io.IOException;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class m {
    @JvmField

    /* renamed from: a  reason: collision with root package name */
    public static final m f13975a = new a();

    /* loaded from: classes3.dex */
    public static final class a extends m {
    }

    /* loaded from: classes3.dex */
    public interface b {
        m a(d dVar);
    }

    public void a(d call, g connection) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(connection, "connection");
    }

    public void b(d call, IOException ioe) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
    }

    public void c(d call, IOException ioe) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
    }
}
