package w8;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.Status;
import e9.m;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import org.json.JSONObject;
import u8.e;
import u8.e1;

/* loaded from: classes2.dex */
public class g implements e.d {

    /* renamed from: k  reason: collision with root package name */
    public static final /* synthetic */ int f17007k = 0;

    /* renamed from: c  reason: collision with root package name */
    public final a9.m f17010c;
    public final t d;
    @NotOnlyInitialized

    /* renamed from: e  reason: collision with root package name */
    public final w8.d f17011e;

    /* renamed from: f  reason: collision with root package name */
    public e1 f17012f;

    /* renamed from: g  reason: collision with root package name */
    public final List<b> f17013g = new CopyOnWriteArrayList();

    /* renamed from: h  reason: collision with root package name */
    public final List<a> f17014h = new CopyOnWriteArrayList();

    /* renamed from: i  reason: collision with root package name */
    public final Map<d, c0> f17015i = new ConcurrentHashMap();

    /* renamed from: j  reason: collision with root package name */
    public final Map<Long, c0> f17016j = new ConcurrentHashMap();

    /* renamed from: a  reason: collision with root package name */
    public final Object f17008a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final Handler f17009b = new t9.x(Looper.getMainLooper());

    /* loaded from: classes.dex */
    public static abstract class a {
        public void a() {
        }

        public void b() {
        }

        public void c() {
        }

        public void d() {
        }

        public void e(int[] iArr) {
        }

        public void f(int[] iArr, int i10) {
        }

        public void g(u8.m[] mVarArr) {
        }

        public void h(int[] iArr) {
        }

        public void i(List<Integer> list, List<Integer> list2, int i10) {
        }

        public void j(int[] iArr) {
        }

        public void k() {
        }
    }

    @Deprecated
    /* loaded from: classes2.dex */
    public interface b {
        void b();

        void c();

        void d();

        void i();

        void m();

        void o();
    }

    /* loaded from: classes2.dex */
    public interface c extends d9.f {
    }

    /* loaded from: classes.dex */
    public interface d {
        void a(long j10, long j11);
    }

    static {
        String str = a9.m.f282x;
    }

    public g(a9.m mVar) {
        t tVar = new t(this);
        this.d = tVar;
        this.f17010c = mVar;
        mVar.f286h = new a0(this);
        mVar.f311c = tVar;
        this.f17011e = new w8.d(this, 20);
    }

    public static final y D(y yVar) {
        try {
            yVar.c();
        } catch (IllegalArgumentException e10) {
            throw e10;
        } catch (Throwable unused) {
            yVar.setResult(new x(new Status(2100, null)));
        }
        return yVar;
    }

    public static d9.d<c> w(int i10, String str) {
        v vVar = new v();
        vVar.setResult(new u(new Status(i10, null)));
        return vVar;
    }

    public final boolean A() {
        h9.o.d("Must be called from the main thread.");
        if (l()) {
            u8.o g10 = g();
            if (g10 == null) {
                return false;
            }
            return g10.r0(2L) && g10.K != null;
        }
        return true;
    }

    public final void B(Set<d> set) {
        MediaInfo mediaInfo;
        HashSet hashSet = new HashSet(set);
        if (!o() && !n() && !k() && !z()) {
            if (!m()) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((d) it.next()).a(0L, 0L);
                }
                return;
            }
            u8.m e10 = e();
            if (e10 == null || (mediaInfo = e10.f15726c) == null) {
                return;
            }
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                ((d) it2.next()).a(0L, mediaInfo.n);
            }
            return;
        }
        Iterator it3 = hashSet.iterator();
        while (it3.hasNext()) {
            ((d) it3.next()).a(c(), i());
        }
    }

    public final boolean C() {
        return this.f17012f != null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03ce A[Catch: JSONException -> 0x0479, TryCatch #0 {JSONException -> 0x0479, blocks: (B:3:0x0015, B:41:0x00ac, B:43:0x00b5, B:45:0x00bf, B:47:0x00c5, B:48:0x00d2, B:50:0x00de, B:51:0x00ec, B:53:0x00f2, B:55:0x00ff, B:57:0x0109, B:60:0x0110, B:61:0x0117, B:62:0x0118, B:64:0x0120, B:66:0x0128, B:68:0x012e, B:69:0x0133, B:70:0x013a, B:71:0x013b, B:72:0x0142, B:73:0x0143, B:74:0x014a, B:75:0x014b, B:76:0x0157, B:78:0x015d, B:79:0x0167, B:81:0x0173, B:83:0x0187, B:106:0x01c8, B:108:0x01dd, B:109:0x01fe, B:111:0x0204, B:112:0x020e, B:113:0x0217, B:114:0x0223, B:116:0x0229, B:117:0x0233, B:118:0x023f, B:120:0x0245, B:121:0x024f, B:122:0x025b, B:124:0x0261, B:125:0x026b, B:127:0x0277, B:129:0x0281, B:130:0x028a, B:131:0x0290, B:133:0x0296, B:134:0x02a4, B:137:0x02aa, B:138:0x02b9, B:140:0x02bf, B:141:0x02c9, B:142:0x02de, B:144:0x02e4, B:145:0x02f4, B:146:0x0303, B:147:0x030e, B:148:0x0323, B:150:0x0329, B:151:0x0337, B:153:0x0343, B:155:0x0355, B:164:0x0372, B:167:0x0377, B:169:0x03ca, B:171:0x03ce, B:172:0x03db, B:174:0x03df, B:175:0x03e8, B:177:0x03ec, B:178:0x03f2, B:180:0x03f6, B:181:0x03f9, B:183:0x03fd, B:184:0x0400, B:186:0x0404, B:187:0x0407, B:189:0x040b, B:191:0x0415, B:192:0x041f, B:194:0x0425, B:195:0x042f, B:196:0x0437, B:198:0x043d, B:199:0x0447, B:201:0x044b, B:203:0x0463, B:204:0x0469, B:206:0x046f, B:168:0x037c, B:157:0x035d, B:159:0x0365, B:202:0x0455), top: B:211:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03df A[Catch: JSONException -> 0x0479, TryCatch #0 {JSONException -> 0x0479, blocks: (B:3:0x0015, B:41:0x00ac, B:43:0x00b5, B:45:0x00bf, B:47:0x00c5, B:48:0x00d2, B:50:0x00de, B:51:0x00ec, B:53:0x00f2, B:55:0x00ff, B:57:0x0109, B:60:0x0110, B:61:0x0117, B:62:0x0118, B:64:0x0120, B:66:0x0128, B:68:0x012e, B:69:0x0133, B:70:0x013a, B:71:0x013b, B:72:0x0142, B:73:0x0143, B:74:0x014a, B:75:0x014b, B:76:0x0157, B:78:0x015d, B:79:0x0167, B:81:0x0173, B:83:0x0187, B:106:0x01c8, B:108:0x01dd, B:109:0x01fe, B:111:0x0204, B:112:0x020e, B:113:0x0217, B:114:0x0223, B:116:0x0229, B:117:0x0233, B:118:0x023f, B:120:0x0245, B:121:0x024f, B:122:0x025b, B:124:0x0261, B:125:0x026b, B:127:0x0277, B:129:0x0281, B:130:0x028a, B:131:0x0290, B:133:0x0296, B:134:0x02a4, B:137:0x02aa, B:138:0x02b9, B:140:0x02bf, B:141:0x02c9, B:142:0x02de, B:144:0x02e4, B:145:0x02f4, B:146:0x0303, B:147:0x030e, B:148:0x0323, B:150:0x0329, B:151:0x0337, B:153:0x0343, B:155:0x0355, B:164:0x0372, B:167:0x0377, B:169:0x03ca, B:171:0x03ce, B:172:0x03db, B:174:0x03df, B:175:0x03e8, B:177:0x03ec, B:178:0x03f2, B:180:0x03f6, B:181:0x03f9, B:183:0x03fd, B:184:0x0400, B:186:0x0404, B:187:0x0407, B:189:0x040b, B:191:0x0415, B:192:0x041f, B:194:0x0425, B:195:0x042f, B:196:0x0437, B:198:0x043d, B:199:0x0447, B:201:0x044b, B:203:0x0463, B:204:0x0469, B:206:0x046f, B:168:0x037c, B:157:0x035d, B:159:0x0365, B:202:0x0455), top: B:211:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03ec A[Catch: JSONException -> 0x0479, TryCatch #0 {JSONException -> 0x0479, blocks: (B:3:0x0015, B:41:0x00ac, B:43:0x00b5, B:45:0x00bf, B:47:0x00c5, B:48:0x00d2, B:50:0x00de, B:51:0x00ec, B:53:0x00f2, B:55:0x00ff, B:57:0x0109, B:60:0x0110, B:61:0x0117, B:62:0x0118, B:64:0x0120, B:66:0x0128, B:68:0x012e, B:69:0x0133, B:70:0x013a, B:71:0x013b, B:72:0x0142, B:73:0x0143, B:74:0x014a, B:75:0x014b, B:76:0x0157, B:78:0x015d, B:79:0x0167, B:81:0x0173, B:83:0x0187, B:106:0x01c8, B:108:0x01dd, B:109:0x01fe, B:111:0x0204, B:112:0x020e, B:113:0x0217, B:114:0x0223, B:116:0x0229, B:117:0x0233, B:118:0x023f, B:120:0x0245, B:121:0x024f, B:122:0x025b, B:124:0x0261, B:125:0x026b, B:127:0x0277, B:129:0x0281, B:130:0x028a, B:131:0x0290, B:133:0x0296, B:134:0x02a4, B:137:0x02aa, B:138:0x02b9, B:140:0x02bf, B:141:0x02c9, B:142:0x02de, B:144:0x02e4, B:145:0x02f4, B:146:0x0303, B:147:0x030e, B:148:0x0323, B:150:0x0329, B:151:0x0337, B:153:0x0343, B:155:0x0355, B:164:0x0372, B:167:0x0377, B:169:0x03ca, B:171:0x03ce, B:172:0x03db, B:174:0x03df, B:175:0x03e8, B:177:0x03ec, B:178:0x03f2, B:180:0x03f6, B:181:0x03f9, B:183:0x03fd, B:184:0x0400, B:186:0x0404, B:187:0x0407, B:189:0x040b, B:191:0x0415, B:192:0x041f, B:194:0x0425, B:195:0x042f, B:196:0x0437, B:198:0x043d, B:199:0x0447, B:201:0x044b, B:203:0x0463, B:204:0x0469, B:206:0x046f, B:168:0x037c, B:157:0x035d, B:159:0x0365, B:202:0x0455), top: B:211:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03f6 A[Catch: JSONException -> 0x0479, TryCatch #0 {JSONException -> 0x0479, blocks: (B:3:0x0015, B:41:0x00ac, B:43:0x00b5, B:45:0x00bf, B:47:0x00c5, B:48:0x00d2, B:50:0x00de, B:51:0x00ec, B:53:0x00f2, B:55:0x00ff, B:57:0x0109, B:60:0x0110, B:61:0x0117, B:62:0x0118, B:64:0x0120, B:66:0x0128, B:68:0x012e, B:69:0x0133, B:70:0x013a, B:71:0x013b, B:72:0x0142, B:73:0x0143, B:74:0x014a, B:75:0x014b, B:76:0x0157, B:78:0x015d, B:79:0x0167, B:81:0x0173, B:83:0x0187, B:106:0x01c8, B:108:0x01dd, B:109:0x01fe, B:111:0x0204, B:112:0x020e, B:113:0x0217, B:114:0x0223, B:116:0x0229, B:117:0x0233, B:118:0x023f, B:120:0x0245, B:121:0x024f, B:122:0x025b, B:124:0x0261, B:125:0x026b, B:127:0x0277, B:129:0x0281, B:130:0x028a, B:131:0x0290, B:133:0x0296, B:134:0x02a4, B:137:0x02aa, B:138:0x02b9, B:140:0x02bf, B:141:0x02c9, B:142:0x02de, B:144:0x02e4, B:145:0x02f4, B:146:0x0303, B:147:0x030e, B:148:0x0323, B:150:0x0329, B:151:0x0337, B:153:0x0343, B:155:0x0355, B:164:0x0372, B:167:0x0377, B:169:0x03ca, B:171:0x03ce, B:172:0x03db, B:174:0x03df, B:175:0x03e8, B:177:0x03ec, B:178:0x03f2, B:180:0x03f6, B:181:0x03f9, B:183:0x03fd, B:184:0x0400, B:186:0x0404, B:187:0x0407, B:189:0x040b, B:191:0x0415, B:192:0x041f, B:194:0x0425, B:195:0x042f, B:196:0x0437, B:198:0x043d, B:199:0x0447, B:201:0x044b, B:203:0x0463, B:204:0x0469, B:206:0x046f, B:168:0x037c, B:157:0x035d, B:159:0x0365, B:202:0x0455), top: B:211:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03fd A[Catch: JSONException -> 0x0479, TryCatch #0 {JSONException -> 0x0479, blocks: (B:3:0x0015, B:41:0x00ac, B:43:0x00b5, B:45:0x00bf, B:47:0x00c5, B:48:0x00d2, B:50:0x00de, B:51:0x00ec, B:53:0x00f2, B:55:0x00ff, B:57:0x0109, B:60:0x0110, B:61:0x0117, B:62:0x0118, B:64:0x0120, B:66:0x0128, B:68:0x012e, B:69:0x0133, B:70:0x013a, B:71:0x013b, B:72:0x0142, B:73:0x0143, B:74:0x014a, B:75:0x014b, B:76:0x0157, B:78:0x015d, B:79:0x0167, B:81:0x0173, B:83:0x0187, B:106:0x01c8, B:108:0x01dd, B:109:0x01fe, B:111:0x0204, B:112:0x020e, B:113:0x0217, B:114:0x0223, B:116:0x0229, B:117:0x0233, B:118:0x023f, B:120:0x0245, B:121:0x024f, B:122:0x025b, B:124:0x0261, B:125:0x026b, B:127:0x0277, B:129:0x0281, B:130:0x028a, B:131:0x0290, B:133:0x0296, B:134:0x02a4, B:137:0x02aa, B:138:0x02b9, B:140:0x02bf, B:141:0x02c9, B:142:0x02de, B:144:0x02e4, B:145:0x02f4, B:146:0x0303, B:147:0x030e, B:148:0x0323, B:150:0x0329, B:151:0x0337, B:153:0x0343, B:155:0x0355, B:164:0x0372, B:167:0x0377, B:169:0x03ca, B:171:0x03ce, B:172:0x03db, B:174:0x03df, B:175:0x03e8, B:177:0x03ec, B:178:0x03f2, B:180:0x03f6, B:181:0x03f9, B:183:0x03fd, B:184:0x0400, B:186:0x0404, B:187:0x0407, B:189:0x040b, B:191:0x0415, B:192:0x041f, B:194:0x0425, B:195:0x042f, B:196:0x0437, B:198:0x043d, B:199:0x0447, B:201:0x044b, B:203:0x0463, B:204:0x0469, B:206:0x046f, B:168:0x037c, B:157:0x035d, B:159:0x0365, B:202:0x0455), top: B:211:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0404 A[Catch: JSONException -> 0x0479, TryCatch #0 {JSONException -> 0x0479, blocks: (B:3:0x0015, B:41:0x00ac, B:43:0x00b5, B:45:0x00bf, B:47:0x00c5, B:48:0x00d2, B:50:0x00de, B:51:0x00ec, B:53:0x00f2, B:55:0x00ff, B:57:0x0109, B:60:0x0110, B:61:0x0117, B:62:0x0118, B:64:0x0120, B:66:0x0128, B:68:0x012e, B:69:0x0133, B:70:0x013a, B:71:0x013b, B:72:0x0142, B:73:0x0143, B:74:0x014a, B:75:0x014b, B:76:0x0157, B:78:0x015d, B:79:0x0167, B:81:0x0173, B:83:0x0187, B:106:0x01c8, B:108:0x01dd, B:109:0x01fe, B:111:0x0204, B:112:0x020e, B:113:0x0217, B:114:0x0223, B:116:0x0229, B:117:0x0233, B:118:0x023f, B:120:0x0245, B:121:0x024f, B:122:0x025b, B:124:0x0261, B:125:0x026b, B:127:0x0277, B:129:0x0281, B:130:0x028a, B:131:0x0290, B:133:0x0296, B:134:0x02a4, B:137:0x02aa, B:138:0x02b9, B:140:0x02bf, B:141:0x02c9, B:142:0x02de, B:144:0x02e4, B:145:0x02f4, B:146:0x0303, B:147:0x030e, B:148:0x0323, B:150:0x0329, B:151:0x0337, B:153:0x0343, B:155:0x0355, B:164:0x0372, B:167:0x0377, B:169:0x03ca, B:171:0x03ce, B:172:0x03db, B:174:0x03df, B:175:0x03e8, B:177:0x03ec, B:178:0x03f2, B:180:0x03f6, B:181:0x03f9, B:183:0x03fd, B:184:0x0400, B:186:0x0404, B:187:0x0407, B:189:0x040b, B:191:0x0415, B:192:0x041f, B:194:0x0425, B:195:0x042f, B:196:0x0437, B:198:0x043d, B:199:0x0447, B:201:0x044b, B:203:0x0463, B:204:0x0469, B:206:0x046f, B:168:0x037c, B:157:0x035d, B:159:0x0365, B:202:0x0455), top: B:211:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x040b A[Catch: JSONException -> 0x0479, TryCatch #0 {JSONException -> 0x0479, blocks: (B:3:0x0015, B:41:0x00ac, B:43:0x00b5, B:45:0x00bf, B:47:0x00c5, B:48:0x00d2, B:50:0x00de, B:51:0x00ec, B:53:0x00f2, B:55:0x00ff, B:57:0x0109, B:60:0x0110, B:61:0x0117, B:62:0x0118, B:64:0x0120, B:66:0x0128, B:68:0x012e, B:69:0x0133, B:70:0x013a, B:71:0x013b, B:72:0x0142, B:73:0x0143, B:74:0x014a, B:75:0x014b, B:76:0x0157, B:78:0x015d, B:79:0x0167, B:81:0x0173, B:83:0x0187, B:106:0x01c8, B:108:0x01dd, B:109:0x01fe, B:111:0x0204, B:112:0x020e, B:113:0x0217, B:114:0x0223, B:116:0x0229, B:117:0x0233, B:118:0x023f, B:120:0x0245, B:121:0x024f, B:122:0x025b, B:124:0x0261, B:125:0x026b, B:127:0x0277, B:129:0x0281, B:130:0x028a, B:131:0x0290, B:133:0x0296, B:134:0x02a4, B:137:0x02aa, B:138:0x02b9, B:140:0x02bf, B:141:0x02c9, B:142:0x02de, B:144:0x02e4, B:145:0x02f4, B:146:0x0303, B:147:0x030e, B:148:0x0323, B:150:0x0329, B:151:0x0337, B:153:0x0343, B:155:0x0355, B:164:0x0372, B:167:0x0377, B:169:0x03ca, B:171:0x03ce, B:172:0x03db, B:174:0x03df, B:175:0x03e8, B:177:0x03ec, B:178:0x03f2, B:180:0x03f6, B:181:0x03f9, B:183:0x03fd, B:184:0x0400, B:186:0x0404, B:187:0x0407, B:189:0x040b, B:191:0x0415, B:192:0x041f, B:194:0x0425, B:195:0x042f, B:196:0x0437, B:198:0x043d, B:199:0x0447, B:201:0x044b, B:203:0x0463, B:204:0x0469, B:206:0x046f, B:168:0x037c, B:157:0x035d, B:159:0x0365, B:202:0x0455), top: B:211:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x044b A[Catch: JSONException -> 0x0479, TryCatch #0 {JSONException -> 0x0479, blocks: (B:3:0x0015, B:41:0x00ac, B:43:0x00b5, B:45:0x00bf, B:47:0x00c5, B:48:0x00d2, B:50:0x00de, B:51:0x00ec, B:53:0x00f2, B:55:0x00ff, B:57:0x0109, B:60:0x0110, B:61:0x0117, B:62:0x0118, B:64:0x0120, B:66:0x0128, B:68:0x012e, B:69:0x0133, B:70:0x013a, B:71:0x013b, B:72:0x0142, B:73:0x0143, B:74:0x014a, B:75:0x014b, B:76:0x0157, B:78:0x015d, B:79:0x0167, B:81:0x0173, B:83:0x0187, B:106:0x01c8, B:108:0x01dd, B:109:0x01fe, B:111:0x0204, B:112:0x020e, B:113:0x0217, B:114:0x0223, B:116:0x0229, B:117:0x0233, B:118:0x023f, B:120:0x0245, B:121:0x024f, B:122:0x025b, B:124:0x0261, B:125:0x026b, B:127:0x0277, B:129:0x0281, B:130:0x028a, B:131:0x0290, B:133:0x0296, B:134:0x02a4, B:137:0x02aa, B:138:0x02b9, B:140:0x02bf, B:141:0x02c9, B:142:0x02de, B:144:0x02e4, B:145:0x02f4, B:146:0x0303, B:147:0x030e, B:148:0x0323, B:150:0x0329, B:151:0x0337, B:153:0x0343, B:155:0x0355, B:164:0x0372, B:167:0x0377, B:169:0x03ca, B:171:0x03ce, B:172:0x03db, B:174:0x03df, B:175:0x03e8, B:177:0x03ec, B:178:0x03f2, B:180:0x03f6, B:181:0x03f9, B:183:0x03fd, B:184:0x0400, B:186:0x0404, B:187:0x0407, B:189:0x040b, B:191:0x0415, B:192:0x041f, B:194:0x0425, B:195:0x042f, B:196:0x0437, B:198:0x043d, B:199:0x0447, B:201:0x044b, B:203:0x0463, B:204:0x0469, B:206:0x046f, B:168:0x037c, B:157:0x035d, B:159:0x0365, B:202:0x0455), top: B:211:0x0015 }] */
    @Override // u8.e.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(com.google.android.gms.cast.CastDevice r44, java.lang.String r45, java.lang.String r46) {
        /*
            Method dump skipped, instructions count: 1256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w8.g.a(com.google.android.gms.cast.CastDevice, java.lang.String, java.lang.String):void");
    }

    public boolean b(d dVar, long j10) {
        h9.o.d("Must be called from the main thread.");
        if (dVar != null && !this.f17015i.containsKey(dVar)) {
            Map<Long, c0> map = this.f17016j;
            Long valueOf = Long.valueOf(j10);
            c0 c0Var = map.get(valueOf);
            if (c0Var == null) {
                c0Var = new c0(this, j10);
                this.f17016j.put(valueOf, c0Var);
            }
            c0Var.f16959a.add(dVar);
            this.f17015i.put(dVar, c0Var);
            if (j()) {
                c0Var.a();
            }
            return true;
        }
        return false;
    }

    public long c() {
        long p10;
        synchronized (this.f17008a) {
            h9.o.d("Must be called from the main thread.");
            p10 = this.f17010c.p();
        }
        return p10;
    }

    public int d() {
        int i10;
        synchronized (this.f17008a) {
            h9.o.d("Must be called from the main thread.");
            u8.o g10 = g();
            i10 = g10 != null ? g10.f15740t : 0;
        }
        return i10;
    }

    public u8.m e() {
        h9.o.d("Must be called from the main thread.");
        u8.o g10 = g();
        if (g10 == null) {
            return null;
        }
        return g10.q0(g10.B);
    }

    public MediaInfo f() {
        MediaInfo d10;
        synchronized (this.f17008a) {
            h9.o.d("Must be called from the main thread.");
            d10 = this.f17010c.d();
        }
        return d10;
    }

    public u8.o g() {
        u8.o oVar;
        synchronized (this.f17008a) {
            h9.o.d("Must be called from the main thread.");
            oVar = this.f17010c.f284f;
        }
        return oVar;
    }

    public int h() {
        int i10;
        synchronized (this.f17008a) {
            try {
                h9.o.d("Must be called from the main thread.");
                u8.o g10 = g();
                i10 = g10 != null ? g10.n : 1;
            } catch (Throwable th) {
                throw th;
            }
        }
        return i10;
    }

    public long i() {
        long r10;
        synchronized (this.f17008a) {
            h9.o.d("Must be called from the main thread.");
            r10 = this.f17010c.r();
        }
        return r10;
    }

    public boolean j() {
        h9.o.d("Must be called from the main thread.");
        if (k() || z() || o() || n()) {
            return true;
        }
        return m();
    }

    public boolean k() {
        h9.o.d("Must be called from the main thread.");
        u8.o g10 = g();
        return g10 != null && g10.n == 4;
    }

    public boolean l() {
        h9.o.d("Must be called from the main thread.");
        MediaInfo f10 = f();
        return f10 != null && f10.f6795f == 2;
    }

    public boolean m() {
        h9.o.d("Must be called from the main thread.");
        u8.o g10 = g();
        return (g10 == null || g10.B == 0) ? false : true;
    }

    public boolean n() {
        h9.o.d("Must be called from the main thread.");
        u8.o g10 = g();
        if (g10 != null) {
            if (g10.n == 3) {
                return true;
            }
            if (l()) {
                if (d() == 2) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public boolean o() {
        h9.o.d("Must be called from the main thread.");
        u8.o g10 = g();
        return g10 != null && g10.n == 2;
    }

    public boolean p() {
        h9.o.d("Must be called from the main thread.");
        u8.o g10 = g();
        return g10 != null && g10.H;
    }

    public d9.d<c> q(JSONObject jSONObject) {
        h9.o.d("Must be called from the main thread.");
        if (C()) {
            n nVar = new n(this, null, 0);
            D(nVar);
            return nVar;
        }
        return w(17, null);
    }

    public d9.d<c> r(JSONObject jSONObject) {
        h9.o.d("Must be called from the main thread.");
        if (C()) {
            m mVar = new m(this, null, 0);
            D(mVar);
            return mVar;
        }
        return w(17, null);
    }

    public void s(d dVar) {
        h9.o.d("Must be called from the main thread.");
        c0 remove = this.f17015i.remove(dVar);
        if (remove != null) {
            remove.f16959a.remove(dVar);
            if (!remove.f16959a.isEmpty()) {
                return;
            }
            this.f17016j.remove(Long.valueOf(remove.f16960b));
            remove.f16962e.f17009b.removeCallbacks(remove.f16961c);
            remove.d = false;
        }
    }

    @Deprecated
    public d9.d<c> t(long j10) {
        return u(new u8.n(j10, 0, false, null));
    }

    public d9.d<c> u(u8.n nVar) {
        h9.o.d("Must be called from the main thread.");
        if (C()) {
            n nVar2 = new n(this, nVar, 1);
            D(nVar2);
            return nVar2;
        }
        return w(17, null);
    }

    public void v() {
        h9.o.d("Must be called from the main thread.");
        int h10 = h();
        if (h10 != 4 && h10 != 2) {
            h9.o.d("Must be called from the main thread.");
            if (C()) {
                D(new m(this, null, 1));
                return;
            } else {
                w(17, null);
                return;
            }
        }
        h9.o.d("Must be called from the main thread.");
        if (C()) {
            D(new l(this, null, 1));
        } else {
            w(17, null);
        }
    }

    public final void x() {
        e1 e1Var = this.f17012f;
        if (e1Var == null) {
            return;
        }
        h9.o.d("Must be called from the main thread.");
        String str = this.f17010c.f310b;
        u8.l0 l0Var = (u8.l0) e1Var;
        a9.a.e(str);
        synchronized (l0Var.C) {
            l0Var.C.put(str, this);
        }
        m.a aVar = new m.a();
        aVar.f9224a = new a2.c(l0Var, str, this);
        aVar.d = 8413;
        l0Var.b(1, aVar.a());
        h9.o.d("Must be called from the main thread.");
        if (C()) {
            D(new k(this));
        } else {
            w(17, null);
        }
    }

    /* JADX WARN: Finally extract failed */
    public final void y(e1 e1Var) {
        e.d remove;
        e1 e1Var2 = this.f17012f;
        if (e1Var2 == e1Var) {
            return;
        }
        if (e1Var2 != null) {
            this.f17010c.n();
            this.f17011e.c();
            h9.o.d("Must be called from the main thread.");
            String str = this.f17010c.f310b;
            u8.l0 l0Var = (u8.l0) e1Var2;
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Channel namespace cannot be null or empty");
            }
            synchronized (l0Var.C) {
                try {
                    remove = l0Var.C.remove(str);
                } catch (Throwable th) {
                    throw th;
                }
            }
            m.a aVar = new m.a();
            aVar.f9224a = new n2.c(l0Var, remove, str);
            aVar.d = 8414;
            l0Var.b(1, aVar.a());
            this.d.f17042a = null;
            this.f17009b.removeCallbacksAndMessages(null);
        }
        this.f17012f = e1Var;
        if (e1Var != null) {
            this.d.f17042a = e1Var;
        }
    }

    public final boolean z() {
        h9.o.d("Must be called from the main thread.");
        u8.o g10 = g();
        return g10 != null && g10.n == 5;
    }
}
