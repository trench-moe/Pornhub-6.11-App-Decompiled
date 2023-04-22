package e;

import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.internal.cast.g1;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class p implements h5.a, ea.e, ea.d {

    /* renamed from: c  reason: collision with root package name */
    public Object f8949c;

    public p(int i10) {
        if (i10 == 1) {
            this.f8949c = new HashMap();
        } else if (i10 != 8) {
            this.f8949c = new ArrayDeque();
        } else {
            this.f8949c = new HashSet();
        }
    }

    public /* synthetic */ p(b3.j photosRepository) {
        Intrinsics.checkNotNullParameter(photosRepository, "photosRepository");
        this.f8949c = photosRepository;
    }

    public /* synthetic */ p(b3.m updateRepository) {
        Intrinsics.checkNotNullParameter(updateRepository, "updateRepository");
        this.f8949c = updateRepository;
    }

    public /* synthetic */ p(Object obj) {
        this.f8949c = obj;
    }

    public Set a() {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            return Collections.unmodifiableSet((Set) this.f8949c);
        }
        throw new RuntimeException("Can't remove an activity when not on the UI thread");
    }

    public float b(Object obj, String str, int i10) {
        HashMap hashMap;
        float[] fArr;
        if (((HashMap) this.f8949c).containsKey(obj) && (hashMap = (HashMap) ((HashMap) this.f8949c).get(obj)) != null && hashMap.containsKey(str) && (fArr = (float[]) hashMap.get(str)) != null && fArr.length > i10) {
            return fArr[i10];
        }
        return Float.NaN;
    }

    @Override // h5.a
    public boolean d(Object obj, File file, h5.d dVar) {
        FileOutputStream fileOutputStream;
        InputStream inputStream = (InputStream) obj;
        byte[] bArr = (byte[]) ((k5.b) this.f8949c).e(65536, byte[].class);
        boolean z10 = false;
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                try {
                    fileOutputStream = new FileOutputStream(file);
                    while (true) {
                        try {
                            int read = inputStream.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            fileOutputStream.write(bArr, 0, read);
                        } catch (IOException e10) {
                            e = e10;
                            fileOutputStream2 = fileOutputStream;
                            if (Log.isLoggable("StreamEncoder", 3)) {
                                Log.d("StreamEncoder", "Failed to encode data onto the OutputStream", e);
                            }
                            if (fileOutputStream2 != null) {
                                fileOutputStream2.close();
                            }
                            ((k5.b) this.f8949c).d(bArr);
                            return z10;
                        } catch (Throwable th) {
                            th = th;
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException unused) {
                                }
                            }
                            ((k5.b) this.f8949c).d(bArr);
                            throw th;
                        }
                    }
                    fileOutputStream.close();
                    z10 = true;
                    fileOutputStream.close();
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = fileOutputStream2;
                }
            } catch (IOException e11) {
                e = e11;
            }
        } catch (IOException unused2) {
        }
        ((k5.b) this.f8949c).d(bArr);
        return z10;
    }

    public JSONObject e() {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        FileInputStream fileInputStream2 = null;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Checking for cached settings...", null);
        }
        try {
            try {
                File file = (File) this.f8949c;
                if (file.exists()) {
                    fileInputStream = new FileInputStream(file);
                    try {
                        jSONObject = new JSONObject(CommonUtils.m(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e10) {
                        e = e10;
                        Log.e("FirebaseCrashlytics", "Failed to fetch cached settings", e);
                        CommonUtils.a(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } else {
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Settings file does not exist.", null);
                    }
                    jSONObject = null;
                }
                CommonUtils.a(fileInputStream2, "Error while closing settings cache file.");
                return jSONObject;
            } catch (Exception e11) {
                e = e11;
                fileInputStream = null;
            } catch (Throwable th) {
                th = th;
                CommonUtils.a(fileInputStream2, "Error while closing settings cache file.");
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = null;
            CommonUtils.a(fileInputStream2, "Error while closing settings cache file.");
            throw th;
        }
    }

    @Override // ea.e
    public void onSuccess(Object obj) {
        Objects.requireNonNull((v8.b) this.f8949c);
        new o3.d((Bundle) obj);
    }

    @Override // ea.d
    public void q(Exception exc) {
        a9.b bVar = t9.g.f15212f;
        Log.w(bVar.f254a, bVar.e("Error storing session", new Object[0]), exc);
        g1<Void> g1Var = ((t9.g) this.f8949c).d;
        if (g1Var != null) {
            g1Var.cancel(false);
        }
    }
}
