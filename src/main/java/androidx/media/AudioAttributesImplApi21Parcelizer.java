package androidx.media;

import android.media.AudioAttributes;
import java.util.Objects;
import w1.a;

/* loaded from: classes.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(a aVar) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f2424a = (AudioAttributes) aVar.m(audioAttributesImplApi21.f2424a, 1);
        audioAttributesImplApi21.f2425b = aVar.k(audioAttributesImplApi21.f2425b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, a aVar) {
        Objects.requireNonNull(aVar);
        AudioAttributes audioAttributes = audioAttributesImplApi21.f2424a;
        aVar.p(1);
        aVar.u(audioAttributes);
        int i10 = audioAttributesImplApi21.f2425b;
        aVar.p(2);
        aVar.t(i10);
    }
}
