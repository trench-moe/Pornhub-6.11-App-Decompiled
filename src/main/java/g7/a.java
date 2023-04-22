package g7;

import android.util.Log;
import b7.k;
import c7.h;
import c7.i;
import c7.j;
import c7.u;
import c7.w;
import com.google.android.exoplayer2.ParserException;
import g7.b;
import j7.g;
import java.util.Objects;
import k8.c0;
import k8.t;
import o7.a;
import org.xmlpull.v1.XmlPullParserException;
import w6.y;

/* loaded from: classes2.dex */
public final class a implements h {

    /* renamed from: b  reason: collision with root package name */
    public j f9852b;

    /* renamed from: c  reason: collision with root package name */
    public int f9853c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public int f9854e;

    /* renamed from: g  reason: collision with root package name */
    public u7.b f9856g;

    /* renamed from: h  reason: collision with root package name */
    public i f9857h;

    /* renamed from: i  reason: collision with root package name */
    public c f9858i;

    /* renamed from: j  reason: collision with root package name */
    public g f9859j;

    /* renamed from: a  reason: collision with root package name */
    public final t f9851a = new t(6);

    /* renamed from: f  reason: collision with root package name */
    public long f9855f = -1;

    @Override // c7.h
    public void a() {
        g gVar = this.f9859j;
        if (gVar != null) {
            Objects.requireNonNull(gVar);
        }
    }

    public final void b() {
        d(new a.b[0]);
        j jVar = this.f9852b;
        Objects.requireNonNull(jVar);
        jVar.l();
        this.f9852b.g(new u.b(-9223372036854775807L, 0L));
        this.f9853c = 6;
    }

    @Override // c7.h
    public void c(j jVar) {
        this.f9852b = jVar;
    }

    public final void d(a.b... bVarArr) {
        j jVar = this.f9852b;
        Objects.requireNonNull(jVar);
        w r10 = jVar.r(1024, 4);
        y.b bVar = new y.b();
        bVar.f16878j = "image/jpeg";
        bVar.f16877i = new o7.a(bVarArr);
        r10.d(bVar.a());
    }

    public final int e(i iVar) {
        this.f9851a.z(2);
        iVar.o(this.f9851a.f12009a, 0, 2);
        return this.f9851a.x();
    }

    @Override // c7.h
    public boolean f(i iVar) {
        if (e(iVar) != 65496) {
            return false;
        }
        int e10 = e(iVar);
        this.d = e10;
        if (e10 == 65504) {
            this.f9851a.z(2);
            iVar.o(this.f9851a.f12009a, 0, 2);
            iVar.g(this.f9851a.x() - 2);
            this.d = e(iVar);
        }
        if (this.d != 65505) {
            return false;
        }
        iVar.g(2);
        this.f9851a.z(6);
        iVar.o(this.f9851a.f12009a, 0, 6);
        return this.f9851a.t() == 1165519206 && this.f9851a.x() == 0;
    }

    @Override // c7.h
    public void g(long j10, long j11) {
        if (j10 == 0) {
            this.f9853c = 0;
            this.f9859j = null;
            return;
        }
        if (this.f9853c == 5) {
            g gVar = this.f9859j;
            Objects.requireNonNull(gVar);
            gVar.g(j10, j11);
        }
    }

    @Override // c7.h
    public int h(i iVar, c7.t tVar) {
        int i10;
        String m10;
        String m11;
        b bVar;
        long j10;
        int i11 = this.f9853c;
        if (i11 == 0) {
            this.f9851a.z(2);
            iVar.readFully(this.f9851a.f12009a, 0, 2);
            int x10 = this.f9851a.x();
            this.d = x10;
            if (x10 == 65498) {
                if (this.f9855f != -1) {
                    this.f9853c = 4;
                } else {
                    b();
                }
            } else if ((x10 < 65488 || x10 > 65497) && x10 != 65281) {
                this.f9853c = 1;
            }
            return 0;
        } else if (i11 == 1) {
            this.f9851a.z(2);
            iVar.readFully(this.f9851a.f12009a, 0, 2);
            this.f9854e = this.f9851a.x() - 2;
            this.f9853c = 2;
            return 0;
        } else if (i11 != 2) {
            if (i11 != 4) {
                if (i11 != 5) {
                    if (i11 == 6) {
                        return -1;
                    }
                    throw new IllegalStateException();
                }
                if (this.f9858i == null || iVar != this.f9857h) {
                    this.f9857h = iVar;
                    this.f9858i = new c(iVar, this.f9855f);
                }
                g gVar = this.f9859j;
                Objects.requireNonNull(gVar);
                int h10 = gVar.h(this.f9858i, tVar);
                if (h10 == 1) {
                    tVar.f3828a += this.f9855f;
                }
                return h10;
            }
            long position = iVar.getPosition();
            long j11 = this.f9855f;
            if (position != j11) {
                tVar.f3828a = j11;
                return 1;
            }
            if (iVar.e(this.f9851a.f12009a, 0, 1, true)) {
                iVar.l();
                if (this.f9859j == null) {
                    this.f9859j = new g(0);
                }
                c cVar = new c(iVar, this.f9855f);
                this.f9858i = cVar;
                if (k.d(cVar, false, (this.f9859j.f11486a & 2) != 0)) {
                    g gVar2 = this.f9859j;
                    long j12 = this.f9855f;
                    j jVar = this.f9852b;
                    Objects.requireNonNull(jVar);
                    gVar2.f11501r = new d(j12, jVar);
                    u7.b bVar2 = this.f9856g;
                    Objects.requireNonNull(bVar2);
                    d(bVar2);
                    this.f9853c = 5;
                } else {
                    b();
                }
            } else {
                b();
            }
            return 0;
        } else {
            if (this.d == 65505) {
                int i12 = this.f9854e;
                byte[] bArr = new byte[i12];
                iVar.readFully(bArr, 0, i12);
                if (this.f9856g == null) {
                    u7.b bVar3 = null;
                    if (i12 + 0 == 0) {
                        m10 = null;
                        i10 = 0;
                    } else {
                        i10 = 0;
                        while (i10 < i12 && bArr[i10] != 0) {
                            i10++;
                        }
                        m10 = c0.m(bArr, 0, i10 + 0);
                        if (i10 < i12) {
                            i10++;
                        }
                    }
                    if ("http://ns.adobe.com/xap/1.0/".equals(m10)) {
                        if (i12 - i10 == 0) {
                            m11 = null;
                        } else {
                            int i13 = i10;
                            while (i13 < i12 && bArr[i13] != 0) {
                                i13++;
                            }
                            m11 = c0.m(bArr, i10, i13 - i10);
                        }
                        if (m11 != null) {
                            long b10 = iVar.b();
                            if (b10 != -1) {
                                try {
                                    bVar = e.a(m11);
                                } catch (ParserException | NumberFormatException | XmlPullParserException unused) {
                                    Log.w("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
                                    bVar = null;
                                }
                                if (bVar != null && bVar.f9861b.size() >= 2) {
                                    long j13 = -1;
                                    long j14 = -1;
                                    long j15 = -1;
                                    long j16 = -1;
                                    boolean z10 = false;
                                    for (int size = bVar.f9861b.size() - 1; size >= 0; size--) {
                                        b.a aVar = bVar.f9861b.get(size);
                                        z10 |= "video/mp4".equals(aVar.f9862a);
                                        if (size == 0) {
                                            j10 = b10 - aVar.f9864c;
                                            b10 = 0;
                                        } else {
                                            long j17 = b10 - aVar.f9863b;
                                            j10 = b10;
                                            b10 = j17;
                                        }
                                        if (z10 && b10 != j10) {
                                            j16 = j10 - b10;
                                            j15 = b10;
                                            z10 = false;
                                        }
                                        if (size == 0) {
                                            j14 = j10;
                                            j13 = b10;
                                        }
                                    }
                                    if (j15 != -1 && j16 != -1 && j13 != -1 && j14 != -1) {
                                        bVar3 = new u7.b(j13, j14, bVar.f9860a, j15, j16);
                                    }
                                }
                            }
                            this.f9856g = bVar3;
                            if (bVar3 != null) {
                                this.f9855f = bVar3.f15616m;
                            }
                        }
                    }
                }
            } else {
                iVar.m(this.f9854e);
            }
            this.f9853c = 0;
            return 0;
        }
    }
}
