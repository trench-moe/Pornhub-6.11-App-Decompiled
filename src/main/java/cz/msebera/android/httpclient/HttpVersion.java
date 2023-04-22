package cz.msebera.android.httpclient;

/* loaded from: classes.dex */
public final class HttpVersion extends ProtocolVersion {

    /* renamed from: c  reason: collision with root package name */
    public static final HttpVersion f8580c = new HttpVersion(0, 9);

    /* renamed from: f  reason: collision with root package name */
    public static final HttpVersion f8581f = new HttpVersion(1, 0);

    /* renamed from: j  reason: collision with root package name */
    public static final HttpVersion f8582j = new HttpVersion(1, 1);
    private static final long serialVersionUID = -5856653513894415344L;

    public HttpVersion(int i10, int i11) {
        super("HTTP", i10, i11);
    }

    @Override // cz.msebera.android.httpclient.ProtocolVersion
    public ProtocolVersion a(int i10, int i11) {
        if (i10 == this.major && i11 == this.minor) {
            return this;
        }
        if (i10 == 1) {
            if (i11 == 0) {
                return f8581f;
            }
            if (i11 == 1) {
                return f8582j;
            }
        }
        return (i10 == 0 && i11 == 9) ? f8580c : new HttpVersion(i10, i11);
    }
}
