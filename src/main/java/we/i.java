package we;

import kotlin.Unit;
import okhttp3.internal.http2.ErrorCode;

/* loaded from: classes3.dex */
public final class i extends se.a {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ d f17543e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f17544f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ ErrorCode f17545g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(String str, boolean z10, String str2, boolean z11, d dVar, int i10, ErrorCode errorCode) {
        super(str2, z11);
        this.f17543e = dVar;
        this.f17544f = i10;
        this.f17545g = errorCode;
    }

    @Override // se.a
    public long a() {
        this.f17543e.B.c(this.f17544f, this.f17545g);
        synchronized (this.f17543e) {
            this.f17543e.R.remove(Integer.valueOf(this.f17544f));
            Unit unit = Unit.INSTANCE;
        }
        return -1L;
    }
}
