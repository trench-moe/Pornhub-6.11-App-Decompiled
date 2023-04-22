package we;

import java.io.IOException;
import okhttp3.internal.http2.ErrorCode;

/* loaded from: classes3.dex */
public final class f extends se.a {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ d f17531e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f17532f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ bf.f f17533g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ int f17534h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ boolean f17535i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(String str, boolean z10, String str2, boolean z11, d dVar, int i10, bf.f fVar, int i11, boolean z12) {
        super(str2, z11);
        this.f17531e = dVar;
        this.f17532f = i10;
        this.f17533g = fVar;
        this.f17534h = i11;
        this.f17535i = z12;
    }

    @Override // se.a
    public long a() {
        try {
            boolean d = this.f17531e.B.d(this.f17532f, this.f17533g, this.f17534h, this.f17535i);
            if (d) {
                this.f17531e.P.i(this.f17532f, ErrorCode.CANCEL);
            }
            if (d || this.f17535i) {
                synchronized (this.f17531e) {
                    this.f17531e.R.remove(Integer.valueOf(this.f17532f));
                }
                return -1L;
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
