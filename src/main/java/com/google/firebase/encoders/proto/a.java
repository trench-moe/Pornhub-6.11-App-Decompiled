package com.google.firebase.encoders.proto;

import com.google.firebase.encoders.proto.Protobuf;
import java.lang.annotation.Annotation;
import java.util.Objects;

/* loaded from: classes.dex */
public final class a implements Protobuf {

    /* renamed from: a  reason: collision with root package name */
    public final int f8030a;

    public a(int i10, Protobuf.IntEncoding intEncoding) {
        this.f8030a = i10;
    }

    @Override // java.lang.annotation.Annotation
    public Class<? extends Annotation> annotationType() {
        return Protobuf.class;
    }

    @Override // java.lang.annotation.Annotation
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Protobuf) {
            a aVar = (a) ((Protobuf) obj);
            if (this.f8030a == aVar.f8030a) {
                Protobuf.IntEncoding intEncoding = Protobuf.IntEncoding.DEFAULT;
                Objects.requireNonNull(aVar);
                if (intEncoding.equals(intEncoding)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // java.lang.annotation.Annotation
    public int hashCode() {
        return (this.f8030a ^ 14552422) + (Protobuf.IntEncoding.DEFAULT.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f8030a + "intEncoding=" + Protobuf.IntEncoding.DEFAULT + ')';
    }
}
