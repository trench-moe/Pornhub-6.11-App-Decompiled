package h7;

import c7.i;
import java.util.ArrayDeque;
import kotlin.UByte;

/* loaded from: classes2.dex */
public final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f10154a = new byte[8];

    /* renamed from: b  reason: collision with root package name */
    public final ArrayDeque<b> f10155b = new ArrayDeque<>();

    /* renamed from: c  reason: collision with root package name */
    public final f f10156c = new f();
    public h7.b d;

    /* renamed from: e  reason: collision with root package name */
    public int f10157e;

    /* renamed from: f  reason: collision with root package name */
    public int f10158f;

    /* renamed from: g  reason: collision with root package name */
    public long f10159g;

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f10160a;

        /* renamed from: b  reason: collision with root package name */
        public final long f10161b;

        public b(int i10, long j10, C0144a c0144a) {
            this.f10160a = i10;
            this.f10161b = j10;
        }
    }

    public final long a(i iVar, int i10) {
        iVar.readFully(this.f10154a, 0, i10);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = (j10 << 8) | (this.f10154a[i11] & UByte.MAX_VALUE);
        }
        return j10;
    }
}
