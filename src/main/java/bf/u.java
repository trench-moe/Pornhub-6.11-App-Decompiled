package bf;

import kotlin.collections.ArraysKt;
import kotlin.io.ConstantsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class u {
    @JvmField

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f3702a;
    @JvmField

    /* renamed from: b  reason: collision with root package name */
    public int f3703b;
    @JvmField

    /* renamed from: c  reason: collision with root package name */
    public int f3704c;
    @JvmField
    public boolean d;
    @JvmField

    /* renamed from: e  reason: collision with root package name */
    public boolean f3705e;
    @JvmField

    /* renamed from: f  reason: collision with root package name */
    public u f3706f;
    @JvmField

    /* renamed from: g  reason: collision with root package name */
    public u f3707g;

    public u() {
        this.f3702a = new byte[ConstantsKt.DEFAULT_BUFFER_SIZE];
        this.f3705e = true;
        this.d = false;
    }

    public u(byte[] data, int i10, int i11, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f3702a = data;
        this.f3703b = i10;
        this.f3704c = i11;
        this.d = z10;
        this.f3705e = z11;
    }

    public final u a() {
        u uVar = this.f3706f;
        if (uVar == this) {
            uVar = null;
        }
        u uVar2 = this.f3707g;
        Intrinsics.checkNotNull(uVar2);
        uVar2.f3706f = this.f3706f;
        u uVar3 = this.f3706f;
        Intrinsics.checkNotNull(uVar3);
        uVar3.f3707g = this.f3707g;
        this.f3706f = null;
        this.f3707g = null;
        return uVar;
    }

    public final u b(u segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        segment.f3707g = this;
        segment.f3706f = this.f3706f;
        u uVar = this.f3706f;
        Intrinsics.checkNotNull(uVar);
        uVar.f3707g = segment;
        this.f3706f = segment;
        return segment;
    }

    public final u c() {
        this.d = true;
        return new u(this.f3702a, this.f3703b, this.f3704c, true, false);
    }

    public final void d(u sink, int i10) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (!sink.f3705e) {
            throw new IllegalStateException("only owner can write".toString());
        }
        int i11 = sink.f3704c;
        if (i11 + i10 > 8192) {
            if (sink.d) {
                throw new IllegalArgumentException();
            }
            int i12 = sink.f3703b;
            if ((i11 + i10) - i12 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = sink.f3702a;
            ArraysKt.copyInto$default(bArr, bArr, 0, i12, i11, 2, (Object) null);
            sink.f3704c -= sink.f3703b;
            sink.f3703b = 0;
        }
        byte[] bArr2 = this.f3702a;
        byte[] bArr3 = sink.f3702a;
        int i13 = sink.f3704c;
        int i14 = this.f3703b;
        ArraysKt.copyInto(bArr2, bArr3, i13, i14, i14 + i10);
        sink.f3704c += i10;
        this.f3703b += i10;
    }
}
