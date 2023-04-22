package vd;

import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f16196a = md.b.f13085c;

    static {
        Charset charset = md.b.f13084b;
    }

    public static boolean a(char c10) {
        if (c10 != ' ' && c10 != '\t' && c10 != '\r') {
            if (c10 != '\n') {
                return false;
            }
        }
        return true;
    }
}
