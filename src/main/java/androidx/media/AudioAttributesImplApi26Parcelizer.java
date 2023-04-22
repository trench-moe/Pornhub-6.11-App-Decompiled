package androidx.media;

import android.media.AudioAttributes;
import java.util.Objects;
import w1.a;

/* loaded from: classes.dex */
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(a aVar) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.f2424a = (AudioAttributes) aVar.m(audioAttributesImplApi26.f2424a, 1);
        audioAttributesImplApi26.f2425b = aVar.k(audioAttributesImplApi26.f2425b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, a aVar) {
        Objects.requireNonNull(aVar);
        AudioAttributes audioAttributes = audioAttributesImplApi26.f2424a;
        aVar.p(1);
        aVar.u(audioAttributes);
        int i10 = audioAttributesImplApi26.f2425b;
        aVar.p(2);
        aVar.t(i10);
    }
}
