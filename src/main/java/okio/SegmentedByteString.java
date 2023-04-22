package okio;

import bf.b;
import bf.f;
import bf.u;
import java.security.MessageDigest;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import m9.a;

@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002¨\u0006\u0004"}, d2 = {"Lokio/SegmentedByteString;", "Lokio/ByteString;", "Ljava/lang/Object;", "writeReplace", "okio"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes3.dex */
public final class SegmentedByteString extends ByteString {
    public final transient byte[][] n;

    /* renamed from: t  reason: collision with root package name */
    public final transient int[] f13731t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SegmentedByteString(byte[][] segments, int[] directory) {
        super(ByteString.f13727j.e());
        Intrinsics.checkNotNullParameter(segments, "segments");
        Intrinsics.checkNotNullParameter(directory, "directory");
        this.n = segments;
        this.f13731t = directory;
    }

    private final Object writeReplace() {
        return p();
    }

    @Override // okio.ByteString
    public String b() {
        return p().b();
    }

    @Override // okio.ByteString
    public ByteString c(String algorithm) {
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        int length = this.n.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int[] iArr = this.f13731t;
            int i12 = iArr[length + i10];
            int i13 = iArr[i10];
            messageDigest.update(this.n[i10], i12, i13 - i11);
            i10++;
            i11 = i13;
        }
        byte[] digestBytes = messageDigest.digest();
        Intrinsics.checkNotNullExpressionValue(digestBytes, "digestBytes");
        return new ByteString(digestBytes);
    }

    @Override // okio.ByteString
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.f() == f() && j(0, byteString, 0, f())) {
                return true;
            }
        }
        return false;
    }

    @Override // okio.ByteString
    public int f() {
        return this.f13731t[this.n.length - 1];
    }

    @Override // okio.ByteString
    public String g() {
        return p().g();
    }

    @Override // okio.ByteString
    public byte[] h() {
        return o();
    }

    @Override // okio.ByteString
    public int hashCode() {
        int i10 = this.f13729c;
        if (i10 != 0) {
            return i10;
        }
        int length = this.n.length;
        int i11 = 0;
        int i12 = 1;
        int i13 = 0;
        while (i11 < length) {
            int[] iArr = this.f13731t;
            int i14 = iArr[length + i11];
            int i15 = iArr[i11];
            byte[] bArr = this.n[i11];
            int i16 = (i15 - i13) + i14;
            while (i14 < i16) {
                i12 = (i12 * 31) + bArr[i14];
                i14++;
            }
            i11++;
            i13 = i15;
        }
        this.f13729c = i12;
        return i12;
    }

    @Override // okio.ByteString
    public byte i(int i10) {
        b.b(this.f13731t[this.n.length - 1], i10, 1L);
        int B = a.B(this, i10);
        int i11 = B == 0 ? 0 : this.f13731t[B - 1];
        int[] iArr = this.f13731t;
        byte[][] bArr = this.n;
        return bArr[B][(i10 - i11) + iArr[bArr.length + B]];
    }

    @Override // okio.ByteString
    public boolean j(int i10, ByteString other, int i11, int i12) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (i10 < 0 || i10 > f() - i12) {
            return false;
        }
        int i13 = i12 + i10;
        int B = a.B(this, i10);
        while (i10 < i13) {
            int i14 = B == 0 ? 0 : this.f13731t[B - 1];
            int[] iArr = this.f13731t;
            int i15 = iArr[this.n.length + B];
            int min = Math.min(i13, (iArr[B] - i14) + i14) - i10;
            if (!other.k(i11, this.n[B], (i10 - i14) + i15, min)) {
                return false;
            }
            i11 += min;
            i10 += min;
            B++;
        }
        return true;
    }

    @Override // okio.ByteString
    public boolean k(int i10, byte[] other, int i11, int i12) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (i10 < 0 || i10 > f() - i12 || i11 < 0 || i11 > other.length - i12) {
            return false;
        }
        int i13 = i12 + i10;
        int B = a.B(this, i10);
        while (i10 < i13) {
            int i14 = B == 0 ? 0 : this.f13731t[B - 1];
            int[] iArr = this.f13731t;
            int i15 = iArr[this.n.length + B];
            int min = Math.min(i13, (iArr[B] - i14) + i14) - i10;
            if (!b.a(this.n[B], (i10 - i14) + i15, other, i11, min)) {
                return false;
            }
            i11 += min;
            i10 += min;
            B++;
        }
        return true;
    }

    @Override // okio.ByteString
    public ByteString l() {
        return p().l();
    }

    @Override // okio.ByteString
    public void n(f buffer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        int i12 = i10 + i11;
        int B = a.B(this, i10);
        while (i10 < i12) {
            int i13 = B == 0 ? 0 : this.f13731t[B - 1];
            int[] iArr = this.f13731t;
            int i14 = iArr[this.n.length + B];
            int min = Math.min(i12, (iArr[B] - i13) + i13) - i10;
            int i15 = (i10 - i13) + i14;
            u uVar = new u(this.n[B], i15, i15 + min, true, false);
            u uVar2 = buffer.f3668c;
            if (uVar2 == null) {
                uVar.f3707g = uVar;
                uVar.f3706f = uVar;
                buffer.f3668c = uVar;
            } else {
                Intrinsics.checkNotNull(uVar2);
                u uVar3 = uVar2.f3707g;
                Intrinsics.checkNotNull(uVar3);
                uVar3.b(uVar);
            }
            i10 += min;
            B++;
        }
        buffer.f3669f += i11;
    }

    public byte[] o() {
        byte[] bArr = new byte[f()];
        int length = this.n.length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < length) {
            int[] iArr = this.f13731t;
            int i13 = iArr[length + i10];
            int i14 = iArr[i10];
            int i15 = i14 - i11;
            ArraysKt.copyInto(this.n[i10], bArr, i12, i13, i13 + i15);
            i12 += i15;
            i10++;
            i11 = i14;
        }
        return bArr;
    }

    public final ByteString p() {
        return new ByteString(o());
    }

    @Override // okio.ByteString
    public String toString() {
        return p().toString();
    }
}
