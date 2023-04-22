package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.AudioProcessor;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public abstract class c implements AudioProcessor {

    /* renamed from: b  reason: collision with root package name */
    public AudioProcessor.a f6014b;

    /* renamed from: c  reason: collision with root package name */
    public AudioProcessor.a f6015c;
    public AudioProcessor.a d;

    /* renamed from: e  reason: collision with root package name */
    public AudioProcessor.a f6016e;

    /* renamed from: f  reason: collision with root package name */
    public ByteBuffer f6017f;

    /* renamed from: g  reason: collision with root package name */
    public ByteBuffer f6018g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f6019h;

    public c() {
        ByteBuffer byteBuffer = AudioProcessor.f5984a;
        this.f6017f = byteBuffer;
        this.f6018g = byteBuffer;
        AudioProcessor.a aVar = AudioProcessor.a.f5985e;
        this.d = aVar;
        this.f6016e = aVar;
        this.f6014b = aVar;
        this.f6015c = aVar;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void a() {
        flush();
        this.f6017f = AudioProcessor.f5984a;
        AudioProcessor.a aVar = AudioProcessor.a.f5985e;
        this.d = aVar;
        this.f6016e = aVar;
        this.f6014b = aVar;
        this.f6015c = aVar;
        k();
    }

    public abstract AudioProcessor.a b(AudioProcessor.a aVar);

    public void c() {
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public boolean d() {
        return this.f6019h && this.f6018g == AudioProcessor.f5984a;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public boolean e() {
        return this.f6016e != AudioProcessor.a.f5985e;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public ByteBuffer f() {
        ByteBuffer byteBuffer = this.f6018g;
        this.f6018g = AudioProcessor.f5984a;
        return byteBuffer;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void flush() {
        this.f6018g = AudioProcessor.f5984a;
        this.f6019h = false;
        this.f6014b = this.d;
        this.f6015c = this.f6016e;
        c();
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final AudioProcessor.a h(AudioProcessor.a aVar) {
        this.d = aVar;
        this.f6016e = b(aVar);
        return e() ? this.f6016e : AudioProcessor.a.f5985e;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void i() {
        this.f6019h = true;
        j();
    }

    public void j() {
    }

    public void k() {
    }

    public final ByteBuffer l(int i10) {
        if (this.f6017f.capacity() < i10) {
            this.f6017f = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.f6017f.clear();
        }
        ByteBuffer byteBuffer = this.f6017f;
        this.f6018g = byteBuffer;
        return byteBuffer;
    }
}
