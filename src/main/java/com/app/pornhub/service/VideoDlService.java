package com.app.pornhub.service;

import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.widget.Toast;
import b0.l;
import com.app.pornhub.R;
import com.app.pornhub.domain.model.video.Video;
import com.app.pornhub.domain.model.video.VideoMetaData;
import com.app.pornhub.rx.QueuedVideoProducer;
import dagger.android.DispatchingAndroidInjector;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import io.realm.Case;
import io.realm.ImportFlag;
import io.realm.RealmQuery;
import io.realm.internal.RealmNotifier;
import io.realm.o;
import io.realm.p;
import io.realm.s;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import o3.g;
import r3.d;
import s3.b;
import wd.a;
import x2.c;
import x2.e;
import x2.j;

/* loaded from: classes.dex */
public class VideoDlService extends Service implements a {
    public static final /* synthetic */ int C = 0;
    public int A;
    public boolean B;

    /* renamed from: c  reason: collision with root package name */
    public DispatchingAndroidInjector<Object> f4913c;

    /* renamed from: f  reason: collision with root package name */
    public g f4914f;

    /* renamed from: j  reason: collision with root package name */
    public NotificationManager f4915j;

    /* renamed from: m  reason: collision with root package name */
    public l f4916m;
    public QueuedVideoProducer<VideoMetaData> n;

    /* renamed from: t  reason: collision with root package name */
    public Disposable f4917t;

    /* renamed from: u  reason: collision with root package name */
    public Disposable f4918u;

    /* renamed from: w  reason: collision with root package name */
    public p f4919w;
    public Set<String> y;

    /* renamed from: z  reason: collision with root package name */
    public String f4920z;

    public static Intent c(Context context, Video video) {
        Intent intent = new Intent(context, VideoDlService.class);
        intent.setAction("download");
        intent.putExtra("fvideo", video.getVideoMetaData());
        intent.putExtra("vidurl", video.getUrlVideo());
        return intent;
    }

    public final void a(VideoMetaData videoMetaData) {
        p pVar = this.f4919w;
        RealmQuery h10 = a0.a.h(pVar, pVar, d.class);
        String vkey = videoMetaData.getVkey();
        Case r22 = Case.SENSITIVE;
        h10.f10812a.e();
        h10.c("vkey", vkey, r22);
        d dVar = (d) h10.e();
        this.f4919w.a();
        if (dVar != null) {
            dVar.G("queued");
        } else {
            d dVar2 = new d(videoMetaData, videoMetaData.getPreviewUrl());
            dVar2.n = "queued";
            dVar2.f14653p = System.currentTimeMillis();
            this.f4919w.s(dVar2, new ImportFlag[0]);
        }
        this.f4919w.f();
        this.y.add(videoMetaData.getVkey());
        k();
        this.f4915j.notify(7676, this.f4916m.b());
    }

    public final PendingIntent b() {
        Intent intent = new Intent(this, VideoDlService.class);
        intent.setAction("cancel");
        return PendingIntent.getService(this, 11, intent, Build.VERSION.SDK_INT >= 23 ? 201326592 : 134217728);
    }

    @Override // wd.a
    public dagger.android.a<Object> d() {
        return this.f4913c;
    }

    public final void e() {
        this.f4916m.e(getString(R.string.cancelling_));
        this.f4915j.notify(7676, this.f4916m.b());
    }

    /* JADX WARN: Can't wrap try/catch for region: R(39:(3:2|3|4)|(3:273|274|(1:276)(6:277|278|72|(1:74)|77|78))|6|(3:9|10|7)|11|12|(2:14|(1:16)(2:17|18))|20|(5:255|256|257|258|259)(2:22|23)|24|25|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|(5:47|48|(3:52|53|54)|55|43)|168|(1:170)(1:178)|(1:172)|173|(2:177|151)|152|72|(0)|77|78|(2:(0)|(1:120))) */
    /* JADX WARN: Can't wrap try/catch for region: R(41:2|3|4|(3:273|274|(1:276)(6:277|278|72|(1:74)|77|78))|6|(3:9|10|7)|11|12|(2:14|(1:16)(2:17|18))|20|(5:255|256|257|258|259)(2:22|23)|24|25|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|(5:47|48|(3:52|53|54)|55|43)|168|(1:170)(1:178)|(1:172)|173|(2:177|151)|152|72|(0)|77|78|(2:(0)|(1:120))) */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x02c9, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x02ca, code lost:
        r10 = r6;
        r23 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x02ce, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x02d0, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x02d2, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x02d4, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x02d5, code lost:
        r10 = r6;
        r23 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x02d9, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x02db, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x02dc, code lost:
        r21 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x02df, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x02e1, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x02e3, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x02e5, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x02e6, code lost:
        r21 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x02e9, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x02ea, code lost:
        r20 = "vkey";
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x02ec, code lost:
        r10 = "broken";
        r4 = r0;
        r5 = r20;
        r3 = r5;
        r7 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x02fa, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x02fb, code lost:
        r20 = "vkey";
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x02fe, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0300, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0302, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0304, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0305, code lost:
        r20 = "vkey";
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0308, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0309, code lost:
        r19 = com.appsflyer.oaid.BuildConfig.FLAVOR;
        r20 = "vkey";
        r21 = r5;
        r10 = "broken";
        r3 = r0;
        r16 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0317, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0318, code lost:
        r19 = com.appsflyer.oaid.BuildConfig.FLAVOR;
        r20 = "vkey";
        r21 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x031f, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0321, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0323, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0329, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x032a, code lost:
        r19 = com.appsflyer.oaid.BuildConfig.FLAVOR;
        r20 = "vkey";
        r21 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0335, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0336, code lost:
        r19 = com.appsflyer.oaid.BuildConfig.FLAVOR;
        r20 = "vkey";
        r21 = r5;
        r10 = "broken";
        r3 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x033f, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0340, code lost:
        r19 = com.appsflyer.oaid.BuildConfig.FLAVOR;
        r20 = "vkey";
        r21 = r5;
        r10 = "broken";
        r3 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0349, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x034b, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x034d, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x034f, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0350, code lost:
        r19 = com.appsflyer.oaid.BuildConfig.FLAVOR;
        r20 = "vkey";
        r21 = r5;
        r10 = "broken";
        r3 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x035a, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x035b, code lost:
        r19 = com.appsflyer.oaid.BuildConfig.FLAVOR;
        r20 = "vkey";
        r21 = r5;
        r10 = "broken";
        r3 = r0;
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0365, code lost:
        r16 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0367, code lost:
        r4 = r3;
        r7 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0370, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0371, code lost:
        r19 = com.appsflyer.oaid.BuildConfig.FLAVOR;
        r20 = "vkey";
        r21 = r5;
        r10 = "broken";
        r3 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x037a, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x037c, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x037e, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0380, code lost:
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0381, code lost:
        r16 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x038f, code lost:
        r12.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0393, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0397, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0398, code lost:
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x039b, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x039c, code lost:
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x039f, code lost:
        r5 = r20;
        r3 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x03a7, code lost:
        r16.flush();
        r16.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x03bd, code lost:
        r11.a();
        r9.G(r10);
        r9.E(0);
        r11.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x03d7, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x03d8, code lost:
        r19 = com.appsflyer.oaid.BuildConfig.FLAVOR;
        r20 = "vkey";
        r21 = r5;
        r10 = "broken";
        r3 = r0;
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x03e1, code lost:
        r16 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x03ff, code lost:
        r12.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x0404, code lost:
        r16.flush();
        r16.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x041a, code lost:
        r11.a();
        r9.G(r10);
        r9.E(0);
        r11.f();
        r8.delete();
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x042c, code lost:
        r4 = r0;
        r2 = r19;
        r5 = r20;
        r3 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x0435, code lost:
        r5 = r20;
        r3 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x043b, code lost:
        r5 = r20;
        r3 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0463, code lost:
        if (r3.x() == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x0500, code lost:
        if (r3.x() == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x0541, code lost:
        if (r3.x() == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x0579, code lost:
        if (r3.x() == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x057b, code lost:
        r2.a();
        r3.G(r10);
        r3.E(0);
        r2.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x02c0, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x02c1, code lost:
        r10 = r6;
        r23 = r7;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 19, insn: 0x042d: MOVE  (r2 I:??[OBJECT, ARRAY]) = (r19 I:??[OBJECT, ARRAY]), block:B:213:0x042c */
    /* JADX WARN: Not initialized variable reg: 20, insn: 0x039f: MOVE  (r5 I:??[OBJECT, ARRAY]) = (r20 I:??[OBJECT, ARRAY]), block:B:186:0x039f */
    /* JADX WARN: Not initialized variable reg: 20, insn: 0x042f: MOVE  (r5 I:??[OBJECT, ARRAY]) = (r20 I:??[OBJECT, ARRAY]), block:B:213:0x042c */
    /* JADX WARN: Not initialized variable reg: 20, insn: 0x0435: MOVE  (r5 I:??[OBJECT, ARRAY]) = (r20 I:??[OBJECT, ARRAY]), block:B:214:0x0435 */
    /* JADX WARN: Not initialized variable reg: 20, insn: 0x043b: MOVE  (r5 I:??[OBJECT, ARRAY]) = (r20 I:??[OBJECT, ARRAY]), block:B:215:0x043b */
    /* JADX WARN: Not initialized variable reg: 21, insn: 0x03a1: MOVE  (r3 I:??[OBJECT, ARRAY]) = (r21 I:??[OBJECT, ARRAY]), block:B:186:0x039f */
    /* JADX WARN: Not initialized variable reg: 21, insn: 0x0431: MOVE  (r3 I:??[OBJECT, ARRAY]) = (r21 I:??[OBJECT, ARRAY]), block:B:213:0x042c */
    /* JADX WARN: Not initialized variable reg: 21, insn: 0x0437: MOVE  (r3 I:??[OBJECT, ARRAY]) = (r21 I:??[OBJECT, ARRAY]), block:B:214:0x0435 */
    /* JADX WARN: Not initialized variable reg: 21, insn: 0x043d: MOVE  (r3 I:??[OBJECT, ARRAY]) = (r21 I:??[OBJECT, ARRAY]), block:B:215:0x043b */
    /* JADX WARN: Removed duplicated region for block: B:179:0x038f A[Catch: all -> 0x0393, UnsupportedOperationException -> 0x0397, IOException -> 0x039b, InterruptedIOException -> 0x039f, TRY_ENTER, TryCatch #28 {InterruptedIOException -> 0x039f, blocks: (B:179:0x038f, B:188:0x03a7, B:189:0x03ad, B:191:0x03b3, B:193:0x03bd, B:84:0x02aa, B:194:0x03cc, B:204:0x03ff, B:206:0x0404, B:207:0x040a, B:209:0x0410, B:211:0x041a, B:216:0x0441, B:78:0x0284, B:79:0x0287, B:81:0x0293, B:83:0x029d), top: B:292:0x0172 }] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03a7 A[Catch: all -> 0x0393, UnsupportedOperationException -> 0x0397, IOException -> 0x039b, InterruptedIOException -> 0x039f, TryCatch #28 {InterruptedIOException -> 0x039f, blocks: (B:179:0x038f, B:188:0x03a7, B:189:0x03ad, B:191:0x03b3, B:193:0x03bd, B:84:0x02aa, B:194:0x03cc, B:204:0x03ff, B:206:0x0404, B:207:0x040a, B:209:0x0410, B:211:0x041a, B:216:0x0441, B:78:0x0284, B:79:0x0287, B:81:0x0293, B:83:0x029d), top: B:292:0x0172 }] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03b3 A[Catch: all -> 0x0393, UnsupportedOperationException -> 0x0397, IOException -> 0x039b, InterruptedIOException -> 0x039f, TryCatch #28 {InterruptedIOException -> 0x039f, blocks: (B:179:0x038f, B:188:0x03a7, B:189:0x03ad, B:191:0x03b3, B:193:0x03bd, B:84:0x02aa, B:194:0x03cc, B:204:0x03ff, B:206:0x0404, B:207:0x040a, B:209:0x0410, B:211:0x041a, B:216:0x0441, B:78:0x0284, B:79:0x0287, B:81:0x0293, B:83:0x029d), top: B:292:0x0172 }] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x03ff A[Catch: all -> 0x0393, UnsupportedOperationException -> 0x0397, IOException -> 0x039b, InterruptedIOException -> 0x039f, TRY_ENTER, TryCatch #28 {InterruptedIOException -> 0x039f, blocks: (B:179:0x038f, B:188:0x03a7, B:189:0x03ad, B:191:0x03b3, B:193:0x03bd, B:84:0x02aa, B:194:0x03cc, B:204:0x03ff, B:206:0x0404, B:207:0x040a, B:209:0x0410, B:211:0x041a, B:216:0x0441, B:78:0x0284, B:79:0x0287, B:81:0x0293, B:83:0x029d), top: B:292:0x0172 }] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0404 A[Catch: all -> 0x0393, UnsupportedOperationException -> 0x0397, IOException -> 0x039b, InterruptedIOException -> 0x039f, TRY_LEAVE, TryCatch #28 {InterruptedIOException -> 0x039f, blocks: (B:179:0x038f, B:188:0x03a7, B:189:0x03ad, B:191:0x03b3, B:193:0x03bd, B:84:0x02aa, B:194:0x03cc, B:204:0x03ff, B:206:0x0404, B:207:0x040a, B:209:0x0410, B:211:0x041a, B:216:0x0441, B:78:0x0284, B:79:0x0287, B:81:0x0293, B:83:0x029d), top: B:292:0x0172 }] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0410 A[Catch: all -> 0x0393, UnsupportedOperationException -> 0x0397, IOException -> 0x039b, InterruptedIOException -> 0x039f, TRY_ENTER, TryCatch #28 {InterruptedIOException -> 0x039f, blocks: (B:179:0x038f, B:188:0x03a7, B:189:0x03ad, B:191:0x03b3, B:193:0x03bd, B:84:0x02aa, B:194:0x03cc, B:204:0x03ff, B:206:0x0404, B:207:0x040a, B:209:0x0410, B:211:0x041a, B:216:0x0441, B:78:0x0284, B:79:0x0287, B:81:0x0293, B:83:0x029d), top: B:292:0x0172 }] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0491 A[Catch: UnsupportedOperationException -> 0x048b, IOException -> 0x048d, all -> 0x0544, InterruptedIOException -> 0x054e, TryCatch #18 {all -> 0x0544, blocks: (B:233:0x0487, B:239:0x0491, B:240:0x0497, B:242:0x049d, B:244:0x04a7, B:245:0x04b7, B:246:0x04ba, B:252:0x04cc, B:260:0x050c), top: B:289:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x049d A[Catch: UnsupportedOperationException -> 0x048b, IOException -> 0x048d, all -> 0x0544, InterruptedIOException -> 0x054e, TryCatch #18 {all -> 0x0544, blocks: (B:233:0x0487, B:239:0x0491, B:240:0x0497, B:242:0x049d, B:244:0x04a7, B:245:0x04b7, B:246:0x04ba, B:252:0x04cc, B:260:0x050c), top: B:289:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:255:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0575  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x05ac  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0487 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Class<r3.d>, java.lang.Class] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(com.app.pornhub.domain.model.video.VideoMetaData r26) {
        /*
            Method dump skipped, instructions count: 1477
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.pornhub.service.VideoDlService.f(com.app.pornhub.domain.model.video.VideoMetaData):void");
    }

    public final synchronized void g(Intent intent) {
        if (this.y.size() >= 3) {
            Toast.makeText(this, getString(R.string.dl_queue_full, new Object[]{Integer.toString(3)}), 0).show();
            return;
        }
        VideoMetaData videoMetaData = (VideoMetaData) intent.getSerializableExtra("fvideo");
        videoMetaData.setPreviewUrl(intent.getStringExtra("vidurl"));
        if (videoMetaData.getVkey().equals(this.f4920z)) {
            return;
        }
        QueuedVideoProducer<VideoMetaData> queuedVideoProducer = this.n;
        if (queuedVideoProducer == null) {
            startForeground(7676, this.f4916m.b());
            this.f4917t = Observable.create(new s3.a(this, videoMetaData, 0)).subscribeOn(Schedulers.io()).observeOn(Schedulers.io()).map(new e(this, 6)).subscribe(new c(this, 6));
        } else if (queuedVideoProducer.c(videoMetaData)) {
            kf.a.f12078a.a("Queue has accepted the video with vkey :::::::::::::::::::::::  %s", videoMetaData.getVkey());
            a(videoMetaData);
        } else {
            kf.a.f12078a.a("Queue has rejected the video with vkey  :::::::::::::::::::::::  %s", videoMetaData.getVkey());
        }
    }

    public final void h(String str) {
        this.y.remove(str);
        p pVar = this.f4919w;
        b bVar = new b(this, str);
        pVar.e();
        if (pVar.m()) {
            throw new IllegalStateException("Write transactions on a frozen Realm is not allowed.");
        }
        boolean a10 = ((be.a) pVar.n.capabilities).a();
        s sVar = pVar.f10823j;
        RealmNotifier realmNotifier = pVar.n.realmNotifier;
        ce.c cVar = io.realm.a.y;
        o oVar = new o(pVar, sVar, bVar, a10, null, realmNotifier, null);
        Objects.requireNonNull(cVar);
        cVar.submit(new ce.a(oVar));
        k();
        this.f4915j.notify(7676, this.f4916m.b());
    }

    public final void i(List<String> list) {
        Disposable disposable = this.f4918u;
        if (disposable == null || disposable.isDisposed()) {
            this.f4918u = Observable.fromIterable(list).subscribeOn(Schedulers.io()).concatMap(new j(this, 4)).observeOn(AndroidSchedulers.mainThread()).subscribe(new x2.a(this, 4));
            return;
        }
        kf.a.f12078a.a("Restarting downloads already in progress", new Object[0]);
    }

    public final void j(String str) {
        new Handler(Looper.getMainLooper()).post(new k0.b(this, str, 1));
    }

    public final void k() {
        if (this.y.isEmpty()) {
            this.f4916m.e(getString(R.string.downloading_));
            this.f4916m.f3417b.clear();
            this.f4916m.a(0, getString(R.string.cancel), b());
            return;
        }
        this.f4916m.e(getString(R.string.downloading_d_queued, new Object[]{Integer.valueOf(this.y.size())}));
        this.f4916m.f3417b.clear();
        this.f4916m.a(0, getString(R.string.cancel), b());
        l lVar = this.f4916m;
        String string = getString(R.string.cancel_all);
        Intent intent = new Intent(this, VideoDlService.class);
        intent.setAction("cancel_all");
        lVar.a(0, string, PendingIntent.getService(this, 12, intent, Build.VERSION.SDK_INT >= 23 ? 201326592 : 134217728));
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        Application application = getApplication();
        if (!(application instanceof a)) {
            throw new RuntimeException(String.format("%s does not implement %s", application.getClass().getCanonicalName(), a.class.getCanonicalName()));
        }
        a aVar = (a) application;
        dagger.android.a<Object> d = aVar.d();
        m9.a.m(d, "%s.androidInjector() returned null", aVar.getClass());
        d.a(this);
        this.f4919w = p.t();
        this.f4915j = (NotificationManager) getSystemService("notification");
        this.y = new HashSet();
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = this.f4915j.getNotificationChannel("com.app.pornhub.VDOWNLOADS");
            if (notificationChannel != null) {
                if (!notificationChannel.getName().equals(getString(R.string.video_downloads))) {
                }
            }
            NotificationChannel notificationChannel2 = new NotificationChannel("com.app.pornhub.VDOWNLOADS", getString(R.string.video_downloads), 2);
            notificationChannel2.setDescription(getString(R.string.video_downloads));
            notificationChannel2.enableLights(false);
            notificationChannel2.enableVibration(false);
            this.f4915j.createNotificationChannel(notificationChannel2);
        }
        l lVar = new l(this, "com.app.pornhub.VDOWNLOADS");
        lVar.f3434u.icon = R.drawable.ic_camera_white;
        lVar.e(getString(R.string.downloading_));
        lVar.f3430q = c0.a.b(this, R.color.orange);
        lVar.a(0, getString(R.string.cancel), b());
        this.f4916m = lVar;
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        Disposable disposable = this.f4917t;
        if (disposable != null) {
            disposable.dispose();
        }
        Disposable disposable2 = this.f4918u;
        if (disposable2 != null) {
            disposable2.dispose();
        }
        if (this.A > 0) {
            String format = String.format(getResources().getQuantityString(R.plurals.downloaded_videos, this.A), Integer.valueOf(this.A));
            l lVar = new l(this, "com.app.pornhub.VDOWNLOADS");
            lVar.f3434u.icon = R.drawable.ic_camera_white;
            lVar.e(getString(R.string.download_complete));
            lVar.d(format);
            lVar.f3430q = c0.a.b(this, R.color.orange);
            this.f4915j.notify(6767, lVar.b());
        }
        this.f4919w.close();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0065, code lost:
        if (r7.equals("cancel_queued") == false) goto L69;
     */
    @Override // android.app.Service
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int onStartCommand(android.content.Intent r10, int r11, int r12) {
        /*
            Method dump skipped, instructions count: 642
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.pornhub.service.VideoDlService.onStartCommand(android.content.Intent, int, int):int");
    }
}
