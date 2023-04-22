package bf;

import kotlin.jvm.JvmName;
import okio.ByteString;

@JvmName(name = "-Base64")
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f3656a;

    static {
        ByteString.a aVar = ByteString.f13728m;
        f3656a = aVar.c("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").e();
        aVar.c("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
    }
}
