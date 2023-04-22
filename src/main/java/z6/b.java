package z6;

import android.media.MediaCodec;
import k8.c0;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public byte[] f21801a;

    /* renamed from: b  reason: collision with root package name */
    public byte[] f21802b;

    /* renamed from: c  reason: collision with root package name */
    public int f21803c;
    public int[] d;

    /* renamed from: e  reason: collision with root package name */
    public int[] f21804e;

    /* renamed from: f  reason: collision with root package name */
    public int f21805f;

    /* renamed from: g  reason: collision with root package name */
    public int f21806g;

    /* renamed from: h  reason: collision with root package name */
    public int f21807h;

    /* renamed from: i  reason: collision with root package name */
    public final MediaCodec.CryptoInfo f21808i;

    /* renamed from: j  reason: collision with root package name */
    public final C0316b f21809j;

    /* renamed from: z6.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0316b {

        /* renamed from: a  reason: collision with root package name */
        public final MediaCodec.CryptoInfo f21810a;

        /* renamed from: b  reason: collision with root package name */
        public final MediaCodec.CryptoInfo.Pattern f21811b = new MediaCodec.CryptoInfo.Pattern(0, 0);

        public C0316b(MediaCodec.CryptoInfo cryptoInfo, a aVar) {
            this.f21810a = cryptoInfo;
        }
    }

    public b() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f21808i = cryptoInfo;
        this.f21809j = c0.f11939a >= 24 ? new C0316b(cryptoInfo, null) : null;
    }
}
