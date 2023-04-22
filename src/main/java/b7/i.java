package b7;

import java.util.UUID;
import k8.c0;

/* loaded from: classes.dex */
public final class i implements h {

    /* renamed from: m  reason: collision with root package name */
    public static final boolean f3590m;

    /* renamed from: c  reason: collision with root package name */
    public final UUID f3591c;

    /* renamed from: f  reason: collision with root package name */
    public final byte[] f3592f;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f3593j;

    static {
        boolean z10;
        if ("Amazon".equals(c0.f11941c)) {
            String str = c0.d;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z10 = true;
                f3590m = z10;
            }
        }
        z10 = false;
        f3590m = z10;
    }

    public i(UUID uuid, byte[] bArr, boolean z10) {
        this.f3591c = uuid;
        this.f3592f = bArr;
        this.f3593j = z10;
    }
}
