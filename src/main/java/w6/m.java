package w6;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.provider.Settings;
import com.google.android.exoplayer2.audio.AudioProcessor;
import com.google.android.exoplayer2.audio.e;
import java.util.ArrayList;
import y6.e;

/* loaded from: classes2.dex */
public class m implements t0 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f16676a;

    /* renamed from: b  reason: collision with root package name */
    public com.google.android.exoplayer2.mediacodec.d f16677b = android.support.v4.media.b.f382a;

    public m(Context context) {
        this.f16676a = context;
    }

    public q0[] a(Handler handler, l8.r rVar, com.google.android.exoplayer2.audio.a aVar, y7.i iVar, o7.e eVar) {
        boolean z10;
        ArrayList arrayList = new ArrayList();
        l8.g gVar = new l8.g(this.f16676a, this.f16677b, 5000L, false, handler, rVar, 50);
        gVar.O0 = false;
        gVar.P0 = false;
        gVar.Q0 = false;
        arrayList.add(gVar);
        Context context = this.f16676a;
        y6.e eVar2 = y6.e.f18443c;
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
        int i10 = k8.c0.f11939a;
        if (i10 >= 17) {
            String str = k8.c0.f11941c;
            if ("Amazon".equals(str) || "Xiaomi".equals(str)) {
                z10 = true;
                com.google.android.exoplayer2.audio.g gVar2 = new com.google.android.exoplayer2.audio.g(this.f16676a, this.f16677b, false, handler, aVar, new com.google.android.exoplayer2.audio.e((z10 || Settings.Global.getInt(context.getContentResolver(), "external_surround_sound_enabled", 0) != 1) ? (i10 >= 29 || !k8.c0.z(context)) ? (registerReceiver != null || registerReceiver.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 0) ? y6.e.f18443c : new y6.e(registerReceiver.getIntArrayExtra("android.media.extra.ENCODINGS"), registerReceiver.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8)) : new y6.e(e.a.a(), 8) : y6.e.d, new e.d(new AudioProcessor[0]), false, false, 0));
                gVar2.O0 = false;
                gVar2.P0 = false;
                gVar2.Q0 = false;
                arrayList.add(gVar2);
                arrayList.add(new y7.j(iVar, handler.getLooper()));
                arrayList.add(new o7.f(eVar, handler.getLooper()));
                arrayList.add(new m8.b());
                return (q0[]) arrayList.toArray(new q0[0]);
            }
        }
        z10 = false;
        com.google.android.exoplayer2.audio.g gVar22 = new com.google.android.exoplayer2.audio.g(this.f16676a, this.f16677b, false, handler, aVar, new com.google.android.exoplayer2.audio.e((z10 || Settings.Global.getInt(context.getContentResolver(), "external_surround_sound_enabled", 0) != 1) ? (i10 >= 29 || !k8.c0.z(context)) ? (registerReceiver != null || registerReceiver.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 0) ? y6.e.f18443c : new y6.e(registerReceiver.getIntArrayExtra("android.media.extra.ENCODINGS"), registerReceiver.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8)) : new y6.e(e.a.a(), 8) : y6.e.d, new e.d(new AudioProcessor[0]), false, false, 0));
        gVar22.O0 = false;
        gVar22.P0 = false;
        gVar22.Q0 = false;
        arrayList.add(gVar22);
        arrayList.add(new y7.j(iVar, handler.getLooper()));
        arrayList.add(new o7.f(eVar, handler.getLooper()));
        arrayList.add(new m8.b());
        return (q0[]) arrayList.toArray(new q0[0]);
    }
}
