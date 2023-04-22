package j7;

import android.util.Log;
import k8.t;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f11485a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    public static t7.e a(int i10, t tVar) {
        int f10 = tVar.f();
        if (tVar.f() == 1684108385) {
            tVar.E(8);
            String o10 = tVar.o(f10 - 16);
            return new t7.e("und", o10, o10);
        }
        String valueOf = String.valueOf(a.a(i10));
        Log.w("MetadataUtil", valueOf.length() != 0 ? "Failed to parse comment attribute: ".concat(valueOf) : new String("Failed to parse comment attribute: "));
        return null;
    }

    public static t7.a b(t tVar) {
        int f10 = tVar.f();
        if (tVar.f() != 1684108385) {
            Log.w("MetadataUtil", "Failed to parse cover art attribute");
            return null;
        }
        int f11 = tVar.f() & 16777215;
        String str = f11 == 13 ? "image/jpeg" : f11 == 14 ? "image/png" : null;
        if (str == null) {
            a0.a.p(41, "Unrecognized cover art flags: ", f11, "MetadataUtil");
            return null;
        }
        tVar.E(4);
        int i10 = f10 - 16;
        byte[] bArr = new byte[i10];
        System.arraycopy(tVar.f12009a, tVar.f12010b, bArr, 0, i10);
        tVar.f12010b += i10;
        return new t7.a(str, null, 3, bArr);
    }

    public static t7.l c(int i10, String str, t tVar) {
        int f10 = tVar.f();
        if (tVar.f() == 1684108385 && f10 >= 22) {
            tVar.E(10);
            int x10 = tVar.x();
            if (x10 > 0) {
                StringBuilder sb2 = new StringBuilder(11);
                sb2.append(x10);
                String sb3 = sb2.toString();
                int x11 = tVar.x();
                if (x11 > 0) {
                    String valueOf = String.valueOf(sb3);
                    StringBuilder sb4 = new StringBuilder(valueOf.length() + 12);
                    sb4.append(valueOf);
                    sb4.append("/");
                    sb4.append(x11);
                    sb3 = sb4.toString();
                }
                return new t7.l(str, null, sb3);
            }
        }
        String valueOf2 = String.valueOf(a.a(i10));
        Log.w("MetadataUtil", valueOf2.length() != 0 ? "Failed to parse index/count attribute: ".concat(valueOf2) : new String("Failed to parse index/count attribute: "));
        return null;
    }

    public static t7.l d(int i10, String str, t tVar) {
        int f10 = tVar.f();
        if (tVar.f() == 1684108385) {
            tVar.E(8);
            return new t7.l(str, null, tVar.o(f10 - 16));
        }
        String valueOf = String.valueOf(a.a(i10));
        Log.w("MetadataUtil", valueOf.length() != 0 ? "Failed to parse text attribute: ".concat(valueOf) : new String("Failed to parse text attribute: "));
        return null;
    }

    public static t7.h e(int i10, String str, t tVar, boolean z10, boolean z11) {
        int f10 = f(tVar);
        if (z11) {
            f10 = Math.min(1, f10);
        }
        if (f10 >= 0) {
            return z10 ? new t7.l(str, null, Integer.toString(f10)) : new t7.e("und", str, Integer.toString(f10));
        }
        String valueOf = String.valueOf(a.a(i10));
        Log.w("MetadataUtil", valueOf.length() != 0 ? "Failed to parse uint8 attribute: ".concat(valueOf) : new String("Failed to parse uint8 attribute: "));
        return null;
    }

    public static int f(t tVar) {
        tVar.E(4);
        if (tVar.f() == 1684108385) {
            tVar.E(8);
            return tVar.s();
        }
        Log.w("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }
}
