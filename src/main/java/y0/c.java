package y0;

import java.nio.ByteBuffer;
import t9.j0;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public int f18381a;

    /* renamed from: b  reason: collision with root package name */
    public ByteBuffer f18382b;

    /* renamed from: c  reason: collision with root package name */
    public int f18383c;
    public int d;

    public c() {
        if (j0.f15264f0 == null) {
            j0.f15264f0 = new j0();
        }
    }

    public int a(int i10) {
        if (i10 < this.d) {
            return this.f18382b.getShort(this.f18383c + i10);
        }
        return 0;
    }

    public void b(int i10, ByteBuffer byteBuffer) {
        this.f18382b = byteBuffer;
        if (byteBuffer == null) {
            this.f18381a = 0;
            this.f18383c = 0;
            this.d = 0;
            return;
        }
        this.f18381a = i10;
        int i11 = i10 - byteBuffer.getInt(i10);
        this.f18383c = i11;
        this.d = this.f18382b.getShort(i11);
    }
}
