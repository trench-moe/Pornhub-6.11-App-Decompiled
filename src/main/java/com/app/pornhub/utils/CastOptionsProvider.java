package com.app.pornhub.utils;

import android.content.Context;
import com.app.pornhub.view.videodetails.VideoDetailsActivity;
import com.google.android.gms.cast.framework.media.MediaIntentReceiver;
import com.google.android.gms.internal.cast.zzdf;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import u8.g;
import u8.j;
import v8.e;
import v8.i;
import w8.c;
import w8.f;

/* loaded from: classes.dex */
public class CastOptionsProvider implements e {

    /* loaded from: classes.dex */
    public static class b extends c {
        public b(a aVar) {
        }

        @Override // w8.c
        public g9.a a(j jVar, int i10) {
            if (jVar != null && jVar.r0()) {
                List<g9.a> list = jVar.f15693c;
                if (list.size() != 1 && i10 != 0) {
                    return list.get(1);
                }
                return list.get(0);
            }
            return null;
        }
    }

    @Override // v8.e
    public List<i> getAdditionalSessionProviders(Context context) {
        return null;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [w8.i0, android.os.IBinder] */
    @Override // v8.e
    public v8.c getCastOptions(Context context) {
        f.a aVar = new f.a();
        List asList = Arrays.asList(MediaIntentReceiver.ACTION_REWIND, MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK, MediaIntentReceiver.ACTION_DISCONNECT, MediaIntentReceiver.ACTION_FORWARD);
        int[] iArr = {0, 1, 2, 3};
        if (asList != null) {
            if (asList != null) {
                int size = asList.size();
                if (4 > size) {
                    throw new IllegalArgumentException(String.format(Locale.ROOT, "Invalid number of compat actions: %d > %d.", 4, Integer.valueOf(size)));
                }
                for (int i10 = 0; i10 < 4; i10++) {
                    int i11 = iArr[i10];
                    if (i11 < 0 || i11 >= size) {
                        throw new IllegalArgumentException(String.format(Locale.ROOT, "Index %d in compatActionIndices out of range: [0, %d]", Integer.valueOf(i11), Integer.valueOf(size - 1)));
                    }
                }
                aVar.f16991b = new ArrayList(asList);
                aVar.f16992c = Arrays.copyOf(iArr, 4);
            } else {
                aVar.f16991b = f.W;
                aVar.f16992c = f.X;
            }
            aVar.f17004q = 10000L;
            aVar.f16990a = VideoDetailsActivity.class.getName();
            f a10 = aVar.a();
            new f.a().a();
            w8.a aVar2 = new w8.a("com.google.android.gms.cast.framework.media.MediaIntentReceiver", VideoDetailsActivity.class.getName(), new b(null).f16958a, a10, false, true);
            ArrayList arrayList = new ArrayList();
            g gVar = new g();
            zzdf b10 = zzdf.b(aVar2);
            return new v8.c("CC1AD845", arrayList, false, gVar, true, (w8.a) (b10 != null ? b10.a() : new w8.a("com.google.android.gms.cast.framework.media.MediaIntentReceiver", null, null, new f.a().a(), false, true)), true, 0.05000000074505806d, false, false, false);
        }
        throw new IllegalArgumentException("When setting actions to null, you must also set compatActionIndices to null.");
    }
}
