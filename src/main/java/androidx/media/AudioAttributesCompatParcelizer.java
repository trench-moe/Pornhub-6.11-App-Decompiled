package androidx.media;

import java.util.Objects;
import w1.a;
import w1.c;

/* loaded from: classes.dex */
public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(a aVar) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        c cVar = audioAttributesCompat.f2423a;
        if (aVar.i(1)) {
            cVar = aVar.o();
        }
        audioAttributesCompat.f2423a = (AudioAttributesImpl) cVar;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, a aVar) {
        Objects.requireNonNull(aVar);
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.f2423a;
        aVar.p(1);
        aVar.w(audioAttributesImpl);
    }
}
