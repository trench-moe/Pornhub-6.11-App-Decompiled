package tc;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f15408a;

    /* renamed from: b  reason: collision with root package name */
    public int f15409b;

    /* renamed from: c  reason: collision with root package name */
    public int f15410c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public int f15411e;

    /* renamed from: f  reason: collision with root package name */
    public int f15412f;

    /* renamed from: g  reason: collision with root package name */
    public int f15413g = IntCompanionObject.MAX_VALUE;

    public a(byte[] bArr, int i10, int i11) {
        this.f15408a = bArr;
        this.f15409b = i10;
        this.f15410c = i11 + i10;
        this.f15411e = i10;
    }

    public int a(int i10) {
        if (i10 >= 0) {
            int i11 = i10 + this.f15411e;
            int i12 = this.f15413g;
            if (i11 <= i12) {
                this.f15413g = i11;
                h();
                return i12;
            }
            throw InvalidProtocolBufferNanoException.b();
        }
        throw InvalidProtocolBufferNanoException.a();
    }

    public float b() {
        return Float.intBitsToFloat(d());
    }

    public byte c() {
        int i10 = this.f15411e;
        if (i10 != this.f15410c) {
            byte[] bArr = this.f15408a;
            this.f15411e = i10 + 1;
            return bArr[i10];
        }
        throw InvalidProtocolBufferNanoException.b();
    }

    public int d() {
        return (c() & UByte.MAX_VALUE) | ((c() & UByte.MAX_VALUE) << 8) | ((c() & UByte.MAX_VALUE) << 16) | ((c() & UByte.MAX_VALUE) << 24);
    }

    public int e() {
        int i10;
        byte c10 = c();
        if (c10 >= 0) {
            return c10;
        }
        int i11 = c10 & ByteCompanionObject.MAX_VALUE;
        byte c11 = c();
        if (c11 >= 0) {
            i10 = c11 << 7;
        } else {
            i11 |= (c11 & ByteCompanionObject.MAX_VALUE) << 7;
            byte c12 = c();
            if (c12 >= 0) {
                i10 = c12 << 14;
            } else {
                i11 |= (c12 & ByteCompanionObject.MAX_VALUE) << 14;
                byte c13 = c();
                if (c13 < 0) {
                    int i12 = i11 | ((c13 & ByteCompanionObject.MAX_VALUE) << 21);
                    byte c14 = c();
                    int i13 = i12 | (c14 << 28);
                    if (c14 < 0) {
                        for (int i14 = 0; i14 < 5; i14++) {
                            if (c() >= 0) {
                                return i13;
                            }
                        }
                        throw new InvalidProtocolBufferNanoException("CodedInputStream encountered a malformed varint.");
                    }
                    return i13;
                }
                i10 = c13 << 21;
            }
        }
        return i11 | i10;
    }

    public String f() {
        int e10 = e();
        int i10 = this.f15410c;
        int i11 = this.f15411e;
        if (e10 <= i10 - i11 && e10 > 0) {
            String str = new String(this.f15408a, i11, e10, "UTF-8");
            this.f15411e += e10;
            return str;
        } else if (e10 >= 0) {
            int i12 = i11 + e10;
            int i13 = this.f15413g;
            if (i12 > i13) {
                j(i13 - i11);
                throw InvalidProtocolBufferNanoException.b();
            } else if (e10 <= i10 - i11) {
                byte[] bArr = new byte[e10];
                System.arraycopy(this.f15408a, i11, bArr, 0, e10);
                this.f15411e += e10;
                return new String(bArr, "UTF-8");
            } else {
                throw InvalidProtocolBufferNanoException.b();
            }
        } else {
            throw InvalidProtocolBufferNanoException.a();
        }
    }

    public int g() {
        if (this.f15411e == this.f15410c) {
            this.f15412f = 0;
            return 0;
        }
        int e10 = e();
        this.f15412f = e10;
        if (e10 != 0) {
            return e10;
        }
        throw new InvalidProtocolBufferNanoException("Protocol message contained an invalid tag (zero).");
    }

    public final void h() {
        int i10 = this.f15410c + this.d;
        this.f15410c = i10;
        int i11 = this.f15413g;
        if (i10 <= i11) {
            this.d = 0;
            return;
        }
        int i12 = i10 - i11;
        this.d = i12;
        this.f15410c = i10 - i12;
    }

    public boolean i(int i10) {
        int g10;
        int i11 = i10 & 7;
        if (i11 == 0) {
            e();
            return true;
        } else if (i11 == 1) {
            c();
            c();
            c();
            c();
            c();
            c();
            c();
            c();
            return true;
        } else if (i11 == 2) {
            j(e());
            return true;
        } else if (i11 != 3) {
            if (i11 != 4) {
                if (i11 == 5) {
                    d();
                    return true;
                }
                throw new InvalidProtocolBufferNanoException("Protocol message tag had invalid wire type.");
            }
            return false;
        } else {
            do {
                g10 = g();
                if (g10 == 0) {
                    break;
                }
            } while (i(g10));
            if (this.f15412f == (((i10 >>> 3) << 3) | 4)) {
                return true;
            }
            throw new InvalidProtocolBufferNanoException("Protocol message end-group tag did not match expected tag.");
        }
    }

    public void j(int i10) {
        if (i10 < 0) {
            throw InvalidProtocolBufferNanoException.a();
        }
        int i11 = this.f15411e;
        int i12 = i11 + i10;
        int i13 = this.f15413g;
        if (i12 > i13) {
            j(i13 - i11);
            throw InvalidProtocolBufferNanoException.b();
        } else if (i10 > this.f15410c - i11) {
            throw InvalidProtocolBufferNanoException.b();
        } else {
            this.f15411e = i11 + i10;
        }
    }
}
