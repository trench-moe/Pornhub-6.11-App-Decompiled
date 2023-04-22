package we;

import java.io.IOException;
import java.util.List;
import okhttp3.internal.http2.ErrorCode;

/* loaded from: classes3.dex */
public final class h extends se.a {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ d f17540e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f17541f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ List f17542g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(String str, boolean z10, String str2, boolean z11, d dVar, int i10, List list) {
        super(str2, z11);
        this.f17540e = dVar;
        this.f17541f = i10;
        this.f17542g = list;
    }

    @Override // se.a
    public long a() {
        if (this.f17540e.B.a(this.f17541f, this.f17542g)) {
            try {
                this.f17540e.P.i(this.f17541f, ErrorCode.CANCEL);
                synchronized (this.f17540e) {
                    this.f17540e.R.remove(Integer.valueOf(this.f17541f));
                }
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
        return -1L;
    }
}
