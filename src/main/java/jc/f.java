package jc;

import com.google.firebase.encoders.EncodingException;
import gc.g;

/* loaded from: classes2.dex */
public class f implements g {

    /* renamed from: a  reason: collision with root package name */
    public boolean f11680a = false;

    /* renamed from: b  reason: collision with root package name */
    public boolean f11681b = false;

    /* renamed from: c  reason: collision with root package name */
    public gc.c f11682c;
    public final com.google.firebase.encoders.proto.b d;

    public f(com.google.firebase.encoders.proto.b bVar) {
        this.d = bVar;
    }

    @Override // gc.g
    public g d(String str) {
        if (this.f11680a) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f11680a = true;
        this.d.g(this.f11682c, str, this.f11681b);
        return this;
    }

    @Override // gc.g
    public g e(boolean z10) {
        if (this.f11680a) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f11680a = true;
        this.d.d(this.f11682c, z10 ? 1 : 0, this.f11681b);
        return this;
    }
}
