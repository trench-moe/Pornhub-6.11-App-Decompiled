package c6;

import d6.l;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class a implements h5.b {

    /* renamed from: b  reason: collision with root package name */
    public final int f3761b;

    /* renamed from: c  reason: collision with root package name */
    public final h5.b f3762c;

    public a(int i10, h5.b bVar) {
        this.f3761b = i10;
        this.f3762c = bVar;
    }

    @Override // h5.b
    public void b(MessageDigest messageDigest) {
        this.f3762c.b(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f3761b).array());
    }

    @Override // h5.b
    public boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            return this.f3761b == aVar.f3761b && this.f3762c.equals(aVar.f3762c);
        }
        return false;
    }

    @Override // h5.b
    public int hashCode() {
        return l.g(this.f3762c, this.f3761b);
    }
}
