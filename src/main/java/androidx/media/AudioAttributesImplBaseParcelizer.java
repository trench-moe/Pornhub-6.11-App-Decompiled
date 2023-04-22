package androidx.media;

import java.util.Objects;
import w1.a;

/* loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(a aVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f2426a = aVar.k(audioAttributesImplBase.f2426a, 1);
        audioAttributesImplBase.f2427b = aVar.k(audioAttributesImplBase.f2427b, 2);
        audioAttributesImplBase.f2428c = aVar.k(audioAttributesImplBase.f2428c, 3);
        audioAttributesImplBase.d = aVar.k(audioAttributesImplBase.d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, a aVar) {
        Objects.requireNonNull(aVar);
        int i10 = audioAttributesImplBase.f2426a;
        aVar.p(1);
        aVar.t(i10);
        int i11 = audioAttributesImplBase.f2427b;
        aVar.p(2);
        aVar.t(i11);
        int i12 = audioAttributesImplBase.f2428c;
        aVar.p(3);
        aVar.t(i12);
        int i13 = audioAttributesImplBase.d;
        aVar.p(4);
        aVar.t(i13);
    }
}
