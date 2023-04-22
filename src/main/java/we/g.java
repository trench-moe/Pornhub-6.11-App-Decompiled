package we;

import java.io.IOException;
import java.util.List;
import okhttp3.internal.http2.ErrorCode;

/* loaded from: classes3.dex */
public final class g extends se.a {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ d f17536e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f17537f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ List f17538g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ boolean f17539h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(String str, boolean z10, String str2, boolean z11, d dVar, int i10, List list, boolean z12) {
        super(str2, z11);
        this.f17536e = dVar;
        this.f17537f = i10;
        this.f17538g = list;
        this.f17539h = z12;
    }

    @Override // se.a
    public long a() {
        boolean b10 = this.f17536e.B.b(this.f17537f, this.f17538g, this.f17539h);
        if (b10) {
            try {
                this.f17536e.P.i(this.f17537f, ErrorCode.CANCEL);
            } catch (IOException unused) {
                return -1L;
            }
        }
        if (b10 || this.f17539h) {
            synchronized (this.f17536e) {
                this.f17536e.R.remove(Integer.valueOf(this.f17537f));
            }
            return -1L;
        }
        return -1L;
    }
}
