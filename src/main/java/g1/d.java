package g1;

import android.media.VolumeProvider;
import android.os.Build;
import j1.l;
import j1.m;
import j1.n;
import j1.o;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public final int f9694a;

    /* renamed from: b  reason: collision with root package name */
    public final int f9695b;

    /* renamed from: c  reason: collision with root package name */
    public final String f9696c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public AbstractC0138d f9697e;

    /* renamed from: f  reason: collision with root package name */
    public VolumeProvider f9698f;

    /* loaded from: classes.dex */
    public class a extends VolumeProvider {
        public a(int i10, int i11, int i12, String str) {
            super(i10, i11, i12, str);
        }

        @Override // android.media.VolumeProvider
        public void onAdjustVolume(int i10) {
            o oVar = (o) d.this;
            l.e.this.f11292k.post(new n(oVar, i10));
        }

        @Override // android.media.VolumeProvider
        public void onSetVolumeTo(int i10) {
            o oVar = (o) d.this;
            l.e.this.f11292k.post(new m(oVar, i10));
        }
    }

    /* loaded from: classes.dex */
    public class b extends VolumeProvider {
        public b(int i10, int i11, int i12) {
            super(i10, i11, i12);
        }

        @Override // android.media.VolumeProvider
        public void onAdjustVolume(int i10) {
            o oVar = (o) d.this;
            l.e.this.f11292k.post(new n(oVar, i10));
        }

        @Override // android.media.VolumeProvider
        public void onSetVolumeTo(int i10) {
            o oVar = (o) d.this;
            l.e.this.f11292k.post(new m(oVar, i10));
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public static void a(VolumeProvider volumeProvider, int i10) {
            volumeProvider.setCurrentVolume(i10);
        }
    }

    /* renamed from: g1.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0138d {
    }

    public d(int i10, int i11, int i12, String str) {
        this.f9694a = i10;
        this.f9695b = i11;
        this.d = i12;
        this.f9696c = str;
    }

    public Object a() {
        if (this.f9698f == null) {
            if (Build.VERSION.SDK_INT >= 30) {
                this.f9698f = new a(this.f9694a, this.f9695b, this.d, this.f9696c);
            } else {
                this.f9698f = new b(this.f9694a, this.f9695b, this.d);
            }
        }
        return this.f9698f;
    }
}
