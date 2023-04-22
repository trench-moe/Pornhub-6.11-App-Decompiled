package y5;

import a9.i;
import a9.y;
import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.util.Log;
import com.app.pornhub.R;
import com.google.android.gms.internal.measurement.zzbl;
import e9.l;
import e9.p;
import ea.g;
import ea.h;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import t9.v;
import w9.b0;
import w9.o;
import w9.u;
import w9.w;
import w9.x;
import w9.z;

/* loaded from: classes2.dex */
public class c implements l, ea.c {

    /* renamed from: c  reason: collision with root package name */
    public final Object f18414c;

    /* renamed from: f  reason: collision with root package name */
    public final Object f18415f;

    public c(int i10) {
        if (i10 != 4) {
            this.f18414c = new AtomicReference();
            this.f18415f = new p.a();
            return;
        }
        this.f18414c = new HashMap();
        this.f18415f = new z(1);
        e(new u(0));
        e(new w(0));
        e(new x());
        e(new z(0));
        e(new b0());
        e(new u(1));
        e(new w(1));
    }

    public c(Context context) {
        Objects.requireNonNull(context, "null reference");
        Resources resources = context.getResources();
        this.f18414c = resources;
        this.f18415f = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
    }

    public /* synthetic */ c(p pVar, h hVar) {
        this.f18415f = pVar;
        this.f18414c = hVar;
    }

    public /* synthetic */ c(Object obj, Object obj2) {
        this.f18414c = obj;
        this.f18415f = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0052 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x004a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static y5.c a(android.content.Context r8, java.lang.String r9) {
        /*
            r4 = r8
            r0 = 0
            java.lang.String r7 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
            r6 = 5
            java.io.File r1 = new java.io.File     // Catch: java.nio.channels.OverlappingFileLockException -> L37 java.lang.Error -> L39 java.io.IOException -> L3b
            r6 = 6
            java.io.File r6 = r4.getFilesDir()     // Catch: java.nio.channels.OverlappingFileLockException -> L37 java.lang.Error -> L39 java.io.IOException -> L3b
            r4 = r6
            r1.<init>(r4, r9)     // Catch: java.nio.channels.OverlappingFileLockException -> L37 java.lang.Error -> L39 java.io.IOException -> L3b
            r7 = 2
            java.io.RandomAccessFile r4 = new java.io.RandomAccessFile     // Catch: java.nio.channels.OverlappingFileLockException -> L37 java.lang.Error -> L39 java.io.IOException -> L3b
            java.lang.String r7 = "rw"
            r9 = r7
            r4.<init>(r1, r9)     // Catch: java.nio.channels.OverlappingFileLockException -> L37 java.lang.Error -> L39 java.io.IOException -> L3b
            java.nio.channels.FileChannel r4 = r4.getChannel()     // Catch: java.nio.channels.OverlappingFileLockException -> L37 java.lang.Error -> L39 java.io.IOException -> L3b
            r6 = 1
            java.nio.channels.FileLock r7 = r4.lock()     // Catch: java.nio.channels.OverlappingFileLockException -> L2f java.lang.Error -> L31 java.io.IOException -> L33
            r9 = r7
            y5.c r1 = new y5.c     // Catch: java.nio.channels.OverlappingFileLockException -> L29 java.lang.Error -> L2b java.io.IOException -> L2d
            r1.<init>(r4, r9)     // Catch: java.nio.channels.OverlappingFileLockException -> L29 java.lang.Error -> L2b java.io.IOException -> L2d
            return r1
        L29:
            r1 = move-exception
            goto L3f
        L2b:
            r1 = move-exception
            goto L3f
        L2d:
            r1 = move-exception
            goto L3f
        L2f:
            r9 = move-exception
            goto L34
        L31:
            r9 = move-exception
            goto L34
        L33:
            r9 = move-exception
        L34:
            r1 = r9
            r9 = r0
            goto L3f
        L37:
            r4 = move-exception
            goto L3c
        L39:
            r4 = move-exception
            goto L3c
        L3b:
            r4 = move-exception
        L3c:
            r1 = r4
            r4 = r0
            r9 = r4
        L3f:
            java.lang.String r6 = "CrossProcessLock"
            r2 = r6
            java.lang.String r3 = "encountered error while creating and acquiring the lock, ignoring"
            r7 = 5
            android.util.Log.e(r2, r3, r1)
            if (r9 == 0) goto L4f
            r9.release()     // Catch: java.io.IOException -> L4e
            goto L50
        L4e:
        L4f:
            r6 = 1
        L50:
            if (r4 == 0) goto L56
            r6 = 6
            r4.close()     // Catch: java.io.IOException -> L56
        L56:
            r7 = 7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: y5.c.a(android.content.Context, java.lang.String):y5.c");
    }

    @Override // e9.l
    public void accept(Object obj, Object obj2) {
        a9.u uVar = new a9.u((h) obj2);
        i iVar = (i) ((y) obj).getService();
        Parcel a12 = iVar.a1();
        v.d(a12, uVar);
        a12.writeStringArray((String[]) this.f18415f);
        iVar.d1(5, a12);
    }

    public String b(String str) {
        int identifier = ((Resources) this.f18414c).getIdentifier(str, "string", (String) this.f18415f);
        if (identifier == 0) {
            return null;
        }
        return ((Resources) this.f18414c).getString(identifier);
    }

    public void c() {
        try {
            ((FileLock) this.f18415f).release();
            ((FileChannel) this.f18414c).close();
        } catch (IOException e10) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e10);
        }
    }

    public o d(h2.h hVar, o oVar) {
        a0.b.p0(hVar);
        if (oVar instanceof w9.p) {
            w9.p pVar = (w9.p) oVar;
            ArrayList arrayList = pVar.f17269f;
            String str = pVar.f17268c;
            return (((Map) this.f18414c).containsKey(str) ? (w9.v) ((Map) this.f18414c).get(str) : (z) this.f18415f).a(str, hVar, arrayList);
        }
        return oVar;
    }

    public void e(w9.v vVar) {
        for (zzbl zzblVar : vVar.f17332a) {
            ((Map) this.f18414c).put(zzblVar.b().toString(), vVar);
        }
    }

    @Override // ea.c
    public void g(g gVar) {
        ((p) this.f18415f).f9235b.remove((h) this.f18414c);
    }
}
