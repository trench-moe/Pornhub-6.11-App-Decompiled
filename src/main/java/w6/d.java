package w6;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import java.util.Objects;
import w6.d;
import w6.v0;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final AudioManager f16503a;

    /* renamed from: b  reason: collision with root package name */
    public final a f16504b;

    /* renamed from: c  reason: collision with root package name */
    public b f16505c;
    public y6.d d;

    /* renamed from: e  reason: collision with root package name */
    public int f16506e;

    /* renamed from: f  reason: collision with root package name */
    public int f16507f;

    /* renamed from: g  reason: collision with root package name */
    public float f16508g = 1.0f;

    /* renamed from: h  reason: collision with root package name */
    public AudioFocusRequest f16509h;

    /* loaded from: classes2.dex */
    public class a implements AudioManager.OnAudioFocusChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public final Handler f16510a;

        public a(Handler handler) {
            this.f16510a = handler;
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(final int i10) {
            this.f16510a.post(new Runnable() { // from class: w6.c
                @Override // java.lang.Runnable
                public final void run() {
                    d.a aVar = d.a.this;
                    int i11 = i10;
                    d dVar = d.this;
                    Objects.requireNonNull(dVar);
                    boolean z10 = true;
                    if (i11 == -3 || i11 == -2) {
                        if (i11 != -2) {
                            y6.d dVar2 = dVar.d;
                            if (!((dVar2 == null || dVar2.f18439a != 1) ? false : false)) {
                                dVar.d(3);
                                return;
                            }
                        }
                        dVar.b(0);
                        dVar.d(2);
                    } else if (i11 == -1) {
                        dVar.b(-1);
                        dVar.a();
                    } else if (i11 != 1) {
                        a0.a.p(38, "Unknown focus change type: ", i11, "AudioFocusManager");
                    } else {
                        dVar.d(1);
                        dVar.b(1);
                    }
                }
            });
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
    }

    public d(Context context, Handler handler, b bVar) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        Objects.requireNonNull(audioManager);
        this.f16503a = audioManager;
        this.f16505c = bVar;
        this.f16504b = new a(handler);
        this.f16506e = 0;
    }

    public final void a() {
        if (this.f16506e == 0) {
            return;
        }
        if (k8.c0.f11939a >= 26) {
            AudioFocusRequest audioFocusRequest = this.f16509h;
            if (audioFocusRequest != null) {
                this.f16503a.abandonAudioFocusRequest(audioFocusRequest);
                d(0);
            }
        } else {
            this.f16503a.abandonAudioFocus(this.f16504b);
        }
        d(0);
    }

    public final void b(int i10) {
        b bVar = this.f16505c;
        if (bVar != null) {
            v0.c cVar = (v0.c) bVar;
            boolean k10 = v0.this.k();
            v0.this.r0(k10, i10, v0.i0(k10, i10));
        }
    }

    public void c(y6.d dVar) {
        if (!k8.c0.a(this.d, null)) {
            this.d = null;
            this.f16507f = 0;
        }
    }

    public final void d(int i10) {
        if (this.f16506e == i10) {
            return;
        }
        this.f16506e = i10;
        float f10 = i10 == 3 ? 0.2f : 1.0f;
        if (this.f16508g == f10) {
            return;
        }
        this.f16508g = f10;
        b bVar = this.f16505c;
        if (bVar != null) {
            v0 v0Var = v0.this;
            v0Var.m0(1, 2, Float.valueOf(v0Var.E * v0Var.n.f16508g));
        }
    }

    public int e(boolean z10, int i10) {
        int requestAudioFocus;
        int i11 = 1;
        int i12 = -1;
        if (i10 == 1 || this.f16507f != 1) {
            a();
            return z10 ? 1 : -1;
        }
        if (z10) {
            if (this.f16506e != 1) {
                if (k8.c0.f11939a >= 26) {
                    AudioFocusRequest audioFocusRequest = this.f16509h;
                    if (audioFocusRequest == null) {
                        AudioFocusRequest.Builder builder = audioFocusRequest == null ? new AudioFocusRequest.Builder(this.f16507f) : new AudioFocusRequest.Builder(this.f16509h);
                        y6.d dVar = this.d;
                        boolean z11 = dVar != null && dVar.f18439a == 1;
                        Objects.requireNonNull(dVar);
                        this.f16509h = builder.setAudioAttributes(dVar.a()).setWillPauseWhenDucked(z11).setOnAudioFocusChangeListener(this.f16504b).build();
                    }
                    requestAudioFocus = this.f16503a.requestAudioFocus(this.f16509h);
                } else {
                    AudioManager audioManager = this.f16503a;
                    a aVar = this.f16504b;
                    y6.d dVar2 = this.d;
                    Objects.requireNonNull(dVar2);
                    requestAudioFocus = audioManager.requestAudioFocus(aVar, k8.c0.s(dVar2.f18441c), this.f16507f);
                }
                if (requestAudioFocus == 1) {
                    d(1);
                } else {
                    d(0);
                    i11 = -1;
                }
            }
            i12 = i11;
        }
        return i12;
    }
}
