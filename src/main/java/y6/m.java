package y6;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import k8.c0;

/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final a f18465a;

    /* renamed from: b  reason: collision with root package name */
    public int f18466b;

    /* renamed from: c  reason: collision with root package name */
    public long f18467c;
    public long d;

    /* renamed from: e  reason: collision with root package name */
    public long f18468e;

    /* renamed from: f  reason: collision with root package name */
    public long f18469f;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final AudioTrack f18470a;

        /* renamed from: b  reason: collision with root package name */
        public final AudioTimestamp f18471b = new AudioTimestamp();

        /* renamed from: c  reason: collision with root package name */
        public long f18472c;
        public long d;

        /* renamed from: e  reason: collision with root package name */
        public long f18473e;

        public a(AudioTrack audioTrack) {
            this.f18470a = audioTrack;
        }
    }

    public m(AudioTrack audioTrack) {
        if (c0.f11939a >= 19) {
            this.f18465a = new a(audioTrack);
            a();
            return;
        }
        this.f18465a = null;
        b(3);
    }

    public void a() {
        if (this.f18465a != null) {
            b(0);
        }
    }

    public final void b(int i10) {
        this.f18466b = i10;
        if (i10 == 0) {
            this.f18468e = 0L;
            this.f18469f = -1L;
            this.f18467c = System.nanoTime() / 1000;
            this.d = 10000L;
        } else if (i10 == 1) {
            this.d = 10000L;
        } else if (i10 == 2 || i10 == 3) {
            this.d = 10000000L;
        } else if (i10 != 4) {
            throw new IllegalStateException();
        } else {
            this.d = 500000L;
        }
    }
}
